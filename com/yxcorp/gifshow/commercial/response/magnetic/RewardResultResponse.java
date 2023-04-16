package com.yxcorp.gifshow.commercial.response.magnetic.RewardResultResponse;
import java.io.Serializable;
import java.lang.Object;

public class RewardResultResponse implements Serializable	// class@00117b
{
    public RewardResultResponse$ResultData mResultData;
    public static final long serialVersionUID = 0x2b2b5c1248143e88;

    public void RewardResultResponse(){
       super();
    }
    public boolean isValid(){
       boolean b = (this.mResultData != null)? true: false;
       return b;
    }
}
