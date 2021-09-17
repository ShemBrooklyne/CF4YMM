package geek.wys.comicfandom.NetworkConfig;

import static geek.wys.comicfandom.NetworkConfig.Constants.MARVEL_BASE_URL;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Authored by @Shemwangi
 **
 */
public class ClientImpl {

    public static Retrofit initRetrofit() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();


        return new Retrofit
                .Builder()
                .baseUrl(MARVEL_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }

    public static Service initService() {
        return initRetrofit().create(Service.class);
    }

}
