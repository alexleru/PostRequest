package Presenter;

import Model.ModelGetNumber;
import Service.NetworkService;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

public class GetData {
    public List<ModelGetNumber> getResponse() {
        List<ModelGetNumber> modelGetNumbers = null;

        Call<List<ModelGetNumber>> callSync = NetworkService.getNetworkService()
                .getAPI().getPrecautionary();
        try {
            Response<List<ModelGetNumber>> response = callSync.execute();

            modelGetNumbers = response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return modelGetNumbers;
//                .enqueue(new Callback<List<ModelGetNumber>>() {
//                    @Override
//                    public void onResponse(Call<List<ModelGetNumber>> call, Response<List<ModelGetNumber>> response) {
//                        List<ModelGetNumber> modelGetNumbers = response.body();
//                        printData(modelGetNumbers);
//                    }
//
//                    @Override
//                    public void onFailure(Call<List<ModelGetNumber>> call, Throwable t) {
//
//                    }
//                });
    }


    private void printData(List<ModelGetNumber> modelGetNumbers) {
        var i = 1;
        if (modelGetNumbers != null)
            for (ModelGetNumber modelGetNumber : modelGetNumbers) {
                System.out.println(i++ + " - " +modelGetNumber.prime.toString());
            }
    }
}
