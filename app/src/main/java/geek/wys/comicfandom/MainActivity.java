package geek.wys.comicfandom;

import static geek.wys.comicfandom.NetworkConfig.Constants.TIMESTAMP;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import geek.wys.comicfandom.DataModels.MarvelResponse;
import geek.wys.comicfandom.NetworkConfig.ClientImpl;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Authored by @Shemwangi
 **
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //send call request upon first fire up
        listOfCharacters();
    }

    //Algorithm to generate hex values
    public static String  generateHex(String input) {
        //Generate timestamps to be used while making different calls
        System.out.println("TEMPEST:" + TIMESTAMP.substring(0, Math.min(TIMESTAMP.length(), 10)));
        try {
            //Encrypt private keys to hex 128-bit
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] msgDigest = messageDigest.digest(input.getBytes());
            BigInteger bigInteger = new BigInteger(1, msgDigest);
            StringBuilder hashText = new StringBuilder(bigInteger.toString(16));
            while (hashText.length() < 32) {
                hashText.insert(0, "0");
            } return hashText.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    //Make network call to remote Marvel APi
    public void listOfCharacters() {
        MarvelResponse marvelResponse = new MarvelResponse();
        try {
            String timestamp = TIMESTAMP.substring(0, Math.min(TIMESTAMP.length(), 10));
            String input = timestamp + BuildConfig.MARVEL_PRV_KEY + BuildConfig.MARVEL_PUB_KEY;
            System.out.println("HASHCODE GENERATED:: " + generateHex(input));
            Call<MarvelResponse> responseCall = ClientImpl.initService().getCharacters(timestamp, BuildConfig.MARVEL_PUB_KEY, generateHex(input));
            responseCall.enqueue(new Callback<MarvelResponse>() {
                @Override
                public void onResponse(@NonNull Call<MarvelResponse> call, @NonNull Response<MarvelResponse> response) {
                    if (response.isSuccessful()) {
                        System.out.println("STATUS CODE: " + marvelResponse.getCode());
                    }
                }

                @Override
                public void onFailure(@NonNull Call<MarvelResponse> call, @NonNull Throwable t) {
                    System.out.println("FAILED FETCHING: " + t.getMessage());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}