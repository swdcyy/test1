package com.yxcorp.gifshow.featured.detail.featured.poornet.PoorNetInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class PoorNetInfo implements Serializable	// class@000f40
{
    public long mDuration;
    public boolean mEnablePoorNetOpt;
    public int mEndCdnSpeed;
    public int mEndNetType;
    public String mEndPhotoId;
    public int mEndPhotoIndex;
    public int mEndScore;
    public long mEndTime;
    public boolean mIsDebugInfo;
    public String mLeaveReason;
    public int mManualLoadMoreCnt;
    public int mManualRefreshCnt;
    public List mPhotoInfos;
    public String mPoorNetIdentity;
    public int mStartCdnSpeed;
    public int mStartNetType;
    public String mStartPhotoId;
    public int mStartPhotoIndex;
    public int mStartScore;
    public long mStartTime;
    public long mSystemClockDuration;
    public long mSystemClockEndTime;
    public long mSystemClockStartTime;
    public int mTotalStalledCnt;
    public int mViewCount;
    public static final long serialVersionUID = 0x5d4fcf91a718ef3b;

    public void PoorNetInfo(){
       super();
       this.mPhotoInfos = new ArrayList();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PoorNetInfo.class, "1");
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
       PoorNetInfo tmPoorNetIde = this.mPoorNetIdentity;
       if (tmPoorNetIde == null || !tmPoorNetIde.equals(p0.mPoorNetIdentity)) {
          b = false;
       }
       return b;
    }
}
