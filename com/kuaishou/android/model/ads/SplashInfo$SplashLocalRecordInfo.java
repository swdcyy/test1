package com.kuaishou.android.model.ads.SplashInfo$SplashLocalRecordInfo;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class SplashInfo$SplashLocalRecordInfo implements Serializable, Cloneable	// class@000ab0
{
    public boolean mClearMaterialAfterImpression;
    public long mEndTime;
    public int mImpressionCount;
    public long mPreloadTime;
    public long mRealtimeRequestTime;
    public String mSplashIdList;
    public long mStartTime;
    public int mValidCarriedCount;
    public static final long serialVersionUID = 0xa4003e60cce8bd82;

    public void SplashInfo$SplashLocalRecordInfo(){
       super();
    }
    public Object clone(){
       Object obj = PatchProxy.apply(null, this, SplashInfo$SplashLocalRecordInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.clone();
    }
}
