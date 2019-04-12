package com.example.taxamount_sanjeevgnyawali;
public class taxamount {
    private float amount;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float lowtax(){

        float res = amount/100;
        return res;
    }
    public float mediumtax(){
        float remaining = amount-200000;
        float low = 200000/100;
        float medium = remaining*15/100;
        float res = low + medium;
        return res;
    }
    public float hightax(){
        float remainingHigh = amount-350000;
        float remainingLow = remainingHigh-200000;
        float low = 200000/100;
        float medium = remainingHigh*15/100;
        float high = remainingHigh*25/100;
        float res = low + medium + high;
        return res;
    }
}
