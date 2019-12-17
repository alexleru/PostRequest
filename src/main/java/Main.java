import Model.ModelGetNumber;
import Model.ModelSetNumber;
import Presenter.GetData;
import Presenter.SetData;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("start Get");

        GetData getData = new GetData();
        List<ModelGetNumber> modelSetNumbers = getData.getResponse();

        ArrayList<BigInteger> arrayList = ConvertPOJOfromtoArray.POJOtoArray(modelSetNumbers);
        for (int i = 0; i < 10000; i++) {
            arrayList = SearchPrime.searchPrime(arrayList);
        }

        //System.out.println(arrayList);
        modelSetNumbers = ConvertPOJOfromtoArray.ArrayToPOJO(arrayList);

        System.out.println("start Set");

        SetData setData = new SetData();
        setData.setRequest(modelSetNumbers);


        System.out.println("*******");

//        GetData getData1 = new GetData();
//        getData1.getResponse();

        System.out.println("finish");
    }


}
