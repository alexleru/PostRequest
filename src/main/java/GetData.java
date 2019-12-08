import Model.ModelGetNumber;
import Service.NetworkService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

class GetData {
    void getResponse() {
        NetworkService.getNetworkService()
                .getAPI().getPrecautionary()
                .enqueue(new Callback<List<ModelGetNumber>>() {
                    @Override
                    public void onResponse(Call<List<ModelGetNumber>> call, Response<List<ModelGetNumber>> response) {
                        List<ModelGetNumber> modelGetNumbers = response.body();
                        printData(modelGetNumbers);
                    }

                    @Override
                    public void onFailure(Call<List<ModelGetNumber>> call, Throwable t) {

                    }
                });
    }


    private void printData(List<ModelGetNumber> modelGetNumbers) {
        if (modelGetNumbers != null)
            for (ModelGetNumber modelGetNumber : modelGetNumbers) {
                System.out.println(modelGetNumber.prime.toString());
            }
    }
}
