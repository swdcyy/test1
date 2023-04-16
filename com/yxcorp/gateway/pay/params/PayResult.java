package com.yxcorp.gateway.pay.params.PayResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gateway.pay.params.PayResult$PaySdKElapsedTime;

public class PayResult implements Serializable	// class@00123f
{
    public String mCode;
    public String mCompleteTime;
    public String mDepositAmount;
    public String mIncentiveAmount;
    public String mMerchantId;
    public PayResult$PaySdKElapsedTime mPaySdKElapsedTime;
    public String mProvider;
    public String mTradeNo;
    public static final long serialVersionUID = 0xac152766fe08d96e;

    public void PayResult(String p0,String p1,String p2,String p3){
       super();
       this.mCode = p0;
       this.mTradeNo = p1;
       this.mMerchantId = p2;
       this.mProvider = p3;
    }
    public void PayResult(String p0,String p1,String p2,String p3,PayResult$PaySdKElapsedTime p4){
       super();
       this.mCode = p0;
       this.mTradeNo = p1;
       this.mMerchantId = p2;
       this.mProvider = p3;
       this.mPaySdKElapsedTime = p4;
    }
    public void PayResult(String p0,String p1,String p2,String p3,String p4){
       super();
       this.mCode = p0;
       this.mTradeNo = p1;
       this.mDepositAmount = p2;
       this.mIncentiveAmount = p3;
       this.mCompleteTime = p4;
    }
}
