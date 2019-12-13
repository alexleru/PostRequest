package Service;

import Model.ModelGetNumber;
import Model.ModelSetNumber;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import java.util.List;

public interface APIService {
    @GET("getPrimes.php")
    Call<List<ModelGetNumber>> getPrecautionary();

    @Headers({ "Content-type: application/json" })
    @POST("setPrimes.php")
    Call<List<ModelGetNumber>> setPrecautionary(@Body List<ModelSetNumber> modelSetNumber);
}
