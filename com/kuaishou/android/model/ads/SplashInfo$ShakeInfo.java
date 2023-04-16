package com.kuaishou.android.model.ads.SplashInfo$ShakeInfo;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;

public class SplashInfo$ShakeInfo implements Serializable, Cloneable	// class@000a9e
{
    public int mAccelerationThreshold;
    public boolean mClickDisabled;
    public String mLiveTitle;
    public String mSubtitle;
    public String mTitle;
    public int mTriggerCount;
    public static final long serialVersionUID = 0xae5ecb2131c401fb;

    public void SplashInfo$ShakeInfo(){
       super();
       this.mClickDisabled = true;
       this.mTriggerCount = 1;
    }
}
