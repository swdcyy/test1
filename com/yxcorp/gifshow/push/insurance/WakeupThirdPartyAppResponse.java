package com.yxcorp.gifshow.push.insurance.WakeupThirdPartyAppResponse;
import java.io.Serializable;
import java.lang.Object;

public final class WakeupThirdPartyAppResponse implements Serializable	// class@001673
{
    public List mApplicationInfos;
    public int mRequestInterval;
    public int mWakeType;
    public int mWakeupDelay;

    public void WakeupThirdPartyAppResponse(){
       super();
       this.mRequestInterval = 0x6ddd00;
    }
}
