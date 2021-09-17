package geek.wys.comicfandom.NetworkConfig;

import geek.wys.comicfandom.DataModels.MarvelResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
* Authored by @Shemwangi
 **
*/

public interface Service {

    @GET("characters")
    Call<MarvelResponse> getCharacters(
            @Query("ts") String TimeStamp,
            @Query("apikey") String apikey,
            @Query("hash") String HashKey
    );

}
