import Model.ModelNumber;
import Service.NetworkService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class GetData {
    void getResponse(){
        NetworkService.getNetworkService()
                .getAPI().getPrecautionary()
                .enqueue(new Callback<List<ModelNumber>>() {
                    @Override
                    public void onResponse(Call<List<ModelNumber>> call, Response<List<ModelNumber>> response) {
                        List<ModelNumber> modelNumbers = response.body();
                        printData(modelNumbers);
                    }

                    @Override
                    public void onFailure(Call<List<ModelNumber>> call, Throwable t) {

                    }
                });
    }


    private void printData(List<ModelNumber> modelNumbers){
        for (ModelNumber modelNumber : modelNumbers) {
            System.out.println(modelNumber.prime.toString());
        }
    }
}
