package com.kwai.social.startup.reminder.model.FriendTabStartupConfig;
import java.lang.Object;
import com.kwai.social.startup.reminder.model.FriendTabStartupConfig$NegativeFeedback;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class FriendTabStartupConfig	// class@0018c8
{
    public long mAutoSelectFeedsIntervals;
    public boolean mEnableAndroidFriendRedDotOpt;
    public boolean mEnableIconRedDot;
    public String mExtraInfo;
    public FriendTabStartupConfig$FriendFollowSlidePlayEntrance mFollowSlidePlayEntrance;
    public FriendTabStartupConfig$FriendsGuidePopup mFriendsGuidePopup;
    public FriendTabStartupConfig$MoreActionEntrance mMoreActionEntrance;
    public FriendTabStartupConfig$NegativeFeedback mNegativeFeedback;
    public FriendTabStartupConfig$PrefetchConfig mPrefetchConfig;
    public JsonElement mPymkBigCardStyleConfig;
    public boolean mQuickCommentDisabled;
    public FriendTabStartupConfig$SecondTabConfig mSecondTabConfig;
    public int mUnreadFinishTipMaxShowCountOneDay;

    public void FriendTabStartupConfig(){
       super();
       this.mUnreadFinishTipMaxShowCountOneDay = 1;
       this.mNegativeFeedback = new FriendTabStartupConfig$NegativeFeedback();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FriendTabStartupConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FriendTabStartupConfig{mUnreadFinishTipMaxShowCountOneDay="+this.mUnreadFinishTipMaxShowCountOneDay+", mNegativeFeedback="+this.mNegativeFeedback+", mExtraInfo=\'"+this.mExtraInfo+'''+", mFriendsGuidePopup="+this.mFriendsGuidePopup+", mPrefetchConfig="+this.mPrefetchConfig+", mQuickCommentDisabled="+this.mQuickCommentDisabled+", mMoreActionEntrance="+this.mMoreActionEntrance+", mFollowSlidePlayEntrance="+this.mFollowSlidePlayEntrance+", mSecondTabConfig="+this.mSecondTabConfig+'}';
    }
}
