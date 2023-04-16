package com.kuaishou.android.model.ads.SplashInfo$RotationInfo;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;

public class SplashInfo$RotationInfo implements Serializable, Cloneable	// class@000a98
{
    public boolean mClickDisabled;
    public Uri mImageUri;
    public String mImageUrl;
    public String mLiveTitle;
    public String mSubTitle;
    public String mTitle;
    public int mTriggerCount;
    public SplashInfo$AxisDirection mXAxisDirection;
    public SplashInfo$AxisDirection mYAxisDirection;
    public SplashInfo$AxisDirection mZAxisDirection;
    public static final long serialVersionUID = 0x879d9e9916796258;

    public void SplashInfo$RotationInfo(){
       super();
       this.mTriggerCount = 1;
       this.mClickDisabled = true;
    }
}
