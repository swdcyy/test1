package com.kuaishou.merchant.live.basic.model.CartStatusLoopResponse$RetryConfig;
import java.io.Serializable;
import java.lang.Object;

public class CartStatusLoopResponse$RetryConfig implements Serializable	// class@001890
{
    public boolean mEnable;
    public long mMaxDelayMillis;
    public int mMaxErrorTimes;
    public static final long serialVersionUID = 0x5805f45e5706fb4a;

    public void CartStatusLoopResponse$RetryConfig(){
       super();
       this.mEnable = true;
       this.mMaxDelayMillis = 0x3a98;
       this.mMaxErrorTimes = 10;
    }
}
