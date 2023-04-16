package com.yxcorp.gifshow.featured.detail.featured.poornet.PoorNetPhotoInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class PoorNetPhotoInfo implements Serializable	// class@000f42
{
    public long mCacheSize;
    public long mDuration;
    public boolean mEnterInSideBar;
    public boolean mIsAd;
    public boolean mIsFullyCache;
    public boolean mIsNonVideo;
    public boolean mIsPrefetch;
    public boolean mLeaveInSideBar;
    public int mMediaType;
    public long mPhotoEnterTime;
    public String mPhotoId;
    public int mPhotoIndex;
    public long mPhotoLeaveTime;
    public long mPhotoSystemClockEnterTime;
    public long mPhotoSystemClockLeaveTime;
    public int mPhotoType;
    public int mPrefetchPoolSize;
    public int mStalledCnt;
    public long mSystemClockDuration;
    public static final long serialVersionUID = 0x90f3a7943320f871;

    public void PoorNetPhotoInfo(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PoorNetPhotoInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       PoorNetPhotoInfo tmPhotoId = this.mPhotoId;
       if (tmPhotoId == null || !tmPhotoId.equals(p0.mPhotoId)) {
          b = false;
       }
       return b;
    }
}
