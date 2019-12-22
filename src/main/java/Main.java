import Model.ModelGetNumber;
import Model.ModelSetNumber;
import Presenter.GetData;
import Presenter.SetData;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("start Get");

        GetData getData = new GetData();
        List<ModelGetNumber> modelSetNumbers = getData.getResponse();
        Date dateStart = new Date();
        ArrayList<BigInteger> arrayList = ConvertPOJOfromtoArray.POJOtoArray(modelSetNumbers);
        Date dateEnd = new Date();
        System.out.println("to Array " + arrayList.size() + " " + (double)(dateEnd.getTime() - dateStart.getTime())/1000);
        for (int z = 0; z < 100 ; z++) {

            SearchPrime.newArrayFromPrime = new ArrayList<>();
            dateStart = new Date();
            for (int i = 0; i < 10000; i++) {
                arrayList = SearchPrime.searchPrime(arrayList);
            }
            dateEnd = new Date();
            System.out.println("search " + arrayList.size() + " " + (double) (dateEnd.getTime() - dateStart.getTime()) / 1000);

            dateStart = new Date();
            modelSetNumbers = ConvertPOJOfromtoArray.ArrayToPOJO(SearchPrime.newArrayFromPrime);
            dateEnd = new Date();
            System.out.println("to POJO " + modelSetNumbers.size() + " " + (double) (dateEnd.getTime() - dateStart.getTime()) / 1000);

            System.out.println("start Set");
            SetData setData = new SetData();
            setData.setRequest(modelSetNumbers);


            System.out.println("*******");
        }
//        GetData getData1 = new GetData();
//        getData1.getResponse();

        System.out.println("finish");
    }

}
