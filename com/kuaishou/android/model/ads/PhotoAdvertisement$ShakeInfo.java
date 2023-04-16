package com.kuaishou.android.model.ads.PhotoAdvertisement$ShakeInfo;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;

public class PhotoAdvertisement$ShakeInfo implements Serializable, Cloneable	// class@000a1a
{
    public int mAccelerationThreshold;
    public boolean mClickDisabled;
    public int mShakeEnableDelayTimeMs;
    public String mSubtitle;
    public String mTitle;
    public int mTriggerCount;
    public static final long serialVersionUID = 0xb69f9c7905c42ba9;

    public void PhotoAdvertisement$ShakeInfo(){
       super();
       this.mTriggerCount = 1;
    }
}
