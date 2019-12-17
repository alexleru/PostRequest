import Model.ModelGetNumber;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ConvertPOJOfromtoArray {
    public static ArrayList<BigInteger> POJOtoArray(List<ModelGetNumber> modelGetNumbers){
        ArrayList<BigInteger> bigIntegerArrayList = new ArrayList<>();
        for (ModelGetNumber m : modelGetNumbers) {
            bigIntegerArrayList.add(m.prime);
        }
        return bigIntegerArrayList;
    }
    public static List<ModelGetNumber> ArrayToPOJO(ArrayList<BigInteger> bigIntegerArrayList){
        List<ModelGetNumber> modelGetNumbers = new ArrayList<>();
        for (BigInteger b: bigIntegerArrayList) {
            ModelGetNumber modelGetNumber = new ModelGetNumber();
            modelGetNumber.prime = b;
            modelGetNumbers.add(modelGetNumber);
        }
        return modelGetNumbers;
    }
}
