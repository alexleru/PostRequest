package Presenter;

import Model.ModelGetNumber;
import Model.ModelSetNumber;
import Service.NetworkService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SetData {


    public void setRequest(){
        ModelSetNumber modelSetNumber1 = new ModelSetNumber();
        modelSetNumber1.prime = new BigInteger("37").toString();
        ModelSetNumber modelSetNumber2 = new ModelSetNumber();
        modelSetNumber2.prime = new BigInteger("41").toString();
        List<ModelSetNumber> modelSetNumbers = new ArrayList<>();
        modelSetNumbers.add(modelSetNumber1);
        modelSetNumbers.add(modelSetNumber2);
        NetworkService.getNetworkService()
                .getAPI().setPrecautionary(modelSetNumbers).enqueue(new Callback<List<ModelGetNumber>>() {
            @Override
            public void onResponse(Call<List<ModelGetNumber>> call, Response<List<ModelGetNumber>> response) {
                System.out.println(response.isSuccessful());
                List<ModelGetNumber> modelGetNumbers = response.body();
                //printData(modelGetNumbers);
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
