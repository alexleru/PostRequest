package Presenter;

import Model.ModelGetNumber;
import Service.NetworkService;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

public class SetData {


    public void setRequest(List<ModelGetNumber> modelSetNumbers) {
        Call<List<ModelGetNumber>> callSync = NetworkService.getNetworkService()
                .getAPI().setPrecautionary(modelSetNumbers);

        try {
            Response<List<ModelGetNumber>> response = callSync.execute();
            List<ModelGetNumber> modelGetNumbers = response.body();
            //printData(modelGetNumbers);
        } catch (IOException e) {
            e.printStackTrace();
        }

//                .enqueue(new Callback<List<ModelGetNumber>>() {
//            @Override
//            public void onResponse(Call<List<ModelGetNumber>> call, Response<List<ModelGetNumber>> response) {
//                System.out.println(response.isSuccessful());
//                List<ModelGetNumber> modelGetNumbers = response.body();
//                printData(modelGetNumbers);
//            }
//
//            @Override
//            public void onFailure(Call<List<ModelGetNumber>> call, Throwable t) {
//
//            }
//        });
    }

    private void printData(List<ModelGetNumber> modelGetNumbers) {
        if (modelGetNumbers != null)
            for (ModelGetNumber modelGetNumber : modelGetNumbers) {
                System.out.println(modelGetNumber.prime.toString());
            }
    }
}
