package Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;

public class ModelSetNumber {
    @SerializedName("prime")
    @Expose
    public BigInteger prime;
}
