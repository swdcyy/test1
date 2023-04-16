package com.yxcorp.gifshow.follow.config.startup.FollowStartupPojo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class FollowStartupPojo implements Serializable	// class@00109c
{
    public int mBigCardStyle;
    public EnableMyfollowSlide mEnableMyfollowSlide;
    public boolean mEnableNewFollowTab;
    public int mFollowAggreLiveMinCount;
    public FollowFeatureGuideConfig mFollowFeatureGuideConfig;
    public int mFollowFeatureMaskShowCount;
    public int mFollowFeatureSnackBarShowCount;
    public long mFollowFeedsLikeGuideIntervalTime;
    public long mFollowFeedsLikeGuideShowTime;
    public long mFollowFeedsLiveCountDownDelayTime;
    public long mFollowFeedsLiveCountDownTime;
    public List mFollowFilterBoxes;
    public FollowFoldFreqCardConfig mFollowFoldFreqCardConfig;
    public FollowHorizontalPhotosConfig mFollowHorizontalPhotosConfig;
    public FollowLiveTipsGuideConfig mFollowLiveTipsGuideConfig;
    public FollowNextToastConfig mFollowNextToastConfig;
    public boolean mFollowPageAutoPlay;
    public LivePlayConfig mLivePlayConfig;
    public long mNirvanaLiveAnchorEndCountDownTime;
    public FollowFeatureSnackBarGuideConfig mSnackBarGuideConfig;
    public static final long serialVersionUID = 0xe4632ad1271aa79b;

    public void FollowStartupPojo(){
       super();
       this.mFollowFeedsLiveCountDownDelayTime = 8;
       this.mFollowFeedsLiveCountDownTime = 3;
       this.mFollowFeedsLikeGuideShowTime = 11;
       this.mFollowFeedsLikeGuideIntervalTime = 24;
       this.mNirvanaLiveAnchorEndCountDownTime = 3;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FollowStartupPojo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "¹Ø×¢startup{myFollowFilterBoxesConfig="+this.mFollowFilterBoxes+", mFollowFeedsLiveCountDownDelayTime="+this.mFollowFeedsLiveCountDownDelayTime+", mFollowFeedsLiveCountDownTime="+this.mFollowFeedsLiveCountDownTime+", mFollowFeedsLikeGuideShowTime="+this.mFollowFeedsLikeGuideShowTime+", mFollowFeedsLikeGuideIntervalTime="+this.mFollowFeedsLikeGuideIntervalTime+", mNirvanaLiveAnchorEndCountDownTime="+this.mNirvanaLiveAnchorEndCountDownTime+", mEnableNewFollowTab="+this.mEnableNewFollowTab+", mFollowAggreLiveMinCount="+this.mFollowAggreLiveMinCount+", mFollowPageAutoPlay="+this.mFollowPageAutoPlay+", mLivePlayConfig="+this.mLivePlayConfig+", mFollowHorizontalPhotosConfig="+this.mFollowHorizontalPhotosConfig+", FollowFoldFreqCardConfig="+this.mFollowFoldFreqCardConfig+'}';
    }
}
