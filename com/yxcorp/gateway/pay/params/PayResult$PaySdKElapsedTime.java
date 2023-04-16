package com.yxcorp.gateway.pay.params.PayResult$PaySdKElapsedTime;
import java.io.Serializable;
import java.lang.Object;

public class PayResult$PaySdKElapsedTime implements Serializable	// class@00123e
{
    public long paySDKEndApp;
    public long paySDKQueryResultCompleted;
    public long paySDKStartApp;
    public static final long serialVersionUID = 0xe780d5a1ab1ef13e;

    public void PayResult$PaySdKElapsedTime(long p0,long p1,long p2){
       super();
       this.paySDKStartApp = p0;
       this.paySDKEndApp = p1;
       this.paySDKQueryResultCompleted = p2;
    }
}
