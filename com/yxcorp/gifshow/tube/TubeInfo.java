package com.yxcorp.gifshow.tube.TubeInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import ok.k;

public class TubeInfo implements Serializable	// class@001e19
{
    public String expTag;
    public boolean isFinished;
    public boolean isLandscape;
    public boolean isOffline;
    public boolean isSubscribed;
    public String llsid;
    public String logLabel;
    public int logPosOffset;
    public TubeViewAreaInfo mAreaInfo;
    public int mBizType;
    public boolean mCanReserved;
    public TubeChannelInfo mChannel;
    public List mChannels;
    public CDNUrl[] mCoverUrls;
    public String mDescription;
    public ExtraParams mExtraParams;
    public TubeEpisodeInfo mFirstEpisode;
    public String mFirstPhotoDescription;
    public boolean mIsReserved;
    public String mLastEpisodeName;
    public TubeEpisodeInfo mLastSeenEpisode;
    public TubeEpisodeInfo mLatestEpisode;
    public List mMultipleChannels;
    public String mName;
    public int mPosition;
    public TubePurchaseInfo mPurchaseInfo;
    public boolean mShowed;
    public long mSubscribeCount;
    public long mTotalEpisodeCount;
    public long mTotalEpisodeCountIgnoreStatus;
    public TubeContentTag mTubeContentTag;
    public TubeDateInfo mTubeDateInfo;
    public String mTubeId;
    public TubeRankInfo mTubeRankInfo;
    public User mUser;
    public long mViewCount;
    public String onLineTime;
    public String recommendReason;
    public String serverExpTag;
    public CharSequence tubeAuthorSpannable;
    public CharSequence tubeNameSpannable;
    public static final long serialVersionUID = 0x1423561c53807cb0;

    public void TubeInfo(){
       super();
       this.isOffline = false;
       this.isFinished = false;
       this.mSubscribeCount = 0;
       this.mViewCount = 0;
       this.mTotalEpisodeCount = 0;
       this.isSubscribed = false;
       this.llsid = "";
       this.expTag = "";
       this.serverExpTag = "";
       this.mCanReserved = true;
       this.logLabel = "";
       this.logPosOffset = 0;
       this.recommendReason = "";
       this.onLineTime = "";
       this.tubeNameSpannable = null;
       this.tubeAuthorSpannable = null;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TubeInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof TubeInfo) {
          return false;
       }
       return TextUtils.equals(p0.mTubeId, this.mTubeId);
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, TubeInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.isEmpty(this.mTubeId)) {
          return super.hashCode();
       }
       obj = new Object[]{this.mTubeId};
       return k.b(obj);
    }
}
