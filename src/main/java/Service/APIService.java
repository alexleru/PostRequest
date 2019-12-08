package Service;

import Model.ModelNumber;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

import java.util.List;

public interface APIService {
    @GET("getPrimes.php")
    Call<List<ModelNumber>> getPrecautionary();

    @POST("setPrimes.php")
    Call<List<ModelNumber>> setPrecautionary();
}
