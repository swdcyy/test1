package com.kwai.social.startup.reminder.model.NotifyMixConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class NotifyMixConfig	// class@0018d6
{
    public boolean mEnableFansUpdateInReminder;
    public boolean mEnableGuideCommentFollow;
    public boolean mEnableNotifyBoxMixSort;
    public boolean mEnableOfflineMessageTab;
    public boolean mEnabledMomentMixModeV2;
    public boolean mEnabledMomentToSlideBar;
    public boolean mEnabledNoticeMessageMixBox;
    public boolean mEnabledNoticeMessageMixBoxV;
    public boolean mEnabledShowRealRedDotCount;
    public int mGuideCommentFollowOnePage;
    public int mGuideCommentFollowTotal;
    public boolean mNasaReduceMessageRedDot;
    public int mNewFansThreshold;
    public int mNotifyBoxEntranceStyle;
    public int mNotifyBoxMixSortRedDotType;
    public List mNotifyFilterCategories;
    public int mShowPymkThreshold;
    public int mUnreadNewsNotifyPlan;
    public int notifyMixSortMoments;

    public void NotifyMixConfig(){
       super();
       this.notifyMixSortMoments = 0;
       this.mUnreadNewsNotifyPlan = 0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NotifyMixConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NotifyMixConfig{, mShowPymkThreshold="+this.mShowPymkThreshold+", mEnableFansUpdateInReminder="+this.mEnableFansUpdateInReminder+", mNewFansThreshold="+this.mNewFansThreshold+", mEnabledMomentMixModeV2="+this.mEnabledMomentMixModeV2+", mEnabledMomentToSlideBar="+this.mEnabledMomentToSlideBar+", mEnabledNoticeMessageMixBox="+this.mEnabledNoticeMessageMixBox+", mEnableNotifyBoxMixSort="+this.mEnableNotifyBoxMixSort+", mNotifyBoxMixSortRedDotType="+this.mNotifyBoxMixSortRedDotType+", mNotifyBoxEntranceStyle="+this.mNotifyBoxEntranceStyle+", mNasaReduceMessageRedDot="+this.mNasaReduceMessageRedDot+", mUnreadNewsNotifyPlan="+this.mUnreadNewsNotifyPlan+", mEnableGuideCommentFollow="+this.mEnableGuideCommentFollow+", mGuideCommentFollowOnePage="+this.mGuideCommentFollowOnePage+", mGuideCommentFollowTotal="+this.mGuideCommentFollowTotal+", mNotifyFilterCategories="+this.mNotifyFilterCategories+'}';
    }
}
