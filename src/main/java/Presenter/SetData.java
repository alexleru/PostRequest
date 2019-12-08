package Presenter;

import Model.ModelSetNumber;
import Service.NetworkService;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SetData {


    public void setRequest(){
        ModelSetNumber modelSetNumber = new ModelSetNumber();
        modelSetNumber.prime = new BigInteger("19");
        List<ModelSetNumber> modelSetNumbers = new ArrayList<>();
        modelSetNumbers.add(modelSetNumber);
        NetworkService.getNetworkService()
                .getAPI().setPrecautionary(modelSetNumbers);
    }
}
