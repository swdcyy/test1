package com.kuaishou.live.common.core.component.bottombubble.notices.highfrequencybehavior.LiveHighFrequencyBehaviorNoticeInfo$ExtraInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseExtraInfo;
import java.lang.Boolean;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.bottombubble.notices.highfrequencybehavior.LiveHighFrequencyBehaviorNoticeInfo$BgConfig;
import java.lang.String;

public final class LiveHighFrequencyBehaviorNoticeInfo$ExtraInfo extends LiveCommentNoticeBaseExtraInfo	// class@000fcd
{
    public long feedUpdateInterval;
    public LiveHighFrequencyBehaviorNoticeInfo$BgConfig mBgConfig;
    public String mCommentFeed;
    public List mFollowIcon;
    public String mFollowUserId;
    public Boolean mFollowing;
    public Integer mHighFrequencyPriority;
    public String mUserStateSegments;
    public long noMoreFeedShowDuration;

    public void LiveHighFrequencyBehaviorNoticeInfo$ExtraInfo(){
       super();
       this.mUserStateSegments = "";
       this.mFollowing = Boolean.FALSE;
       this.mFollowIcon = CollectionsKt__CollectionsKt.E();
       this.mFollowUserId = "";
       this.mCommentFeed = "";
       this.mHighFrequencyPriority = Integer.valueOf(0);
    }
    public final long getFeedUpdateInterval(){
       return this.feedUpdateInterval;
    }
    public final LiveHighFrequencyBehaviorNoticeInfo$BgConfig getMBgConfig(){
       return this.mBgConfig;
    }
    public final String getMCommentFeed(){
       return this.mCommentFeed;
    }
    public final List getMFollowIcon(){
       return this.mFollowIcon;
    }
    public final String getMFollowUserId(){
       return this.mFollowUserId;
    }
    public final Boolean getMFollowing(){
       return this.mFollowing;
    }
    public final Integer getMHighFrequencyPriority(){
       return this.mHighFrequencyPriority;
    }
    public final String getMUserStateSegments(){
       return this.mUserStateSegments;
    }
    public final long getNoMoreFeedShowDuration(){
       return this.noMoreFeedShowDuration;
    }
    public final void setFeedUpdateInterval(long p0){
       this.feedUpdateInterval = p0;
    }
    public final void setMBgConfig(LiveHighFrequencyBehaviorNoticeInfo$BgConfig p0){
       this.mBgConfig = p0;
    }
    public final void setMCommentFeed(String p0){
       this.mCommentFeed = p0;
    }
    public final void setMFollowIcon(List p0){
       this.mFollowIcon = p0;
    }
    public final void setMFollowUserId(String p0){
       this.mFollowUserId = p0;
    }
    public final void setMFollowing(Boolean p0){
       this.mFollowing = p0;
    }
    public final void setMHighFrequencyPriority(Integer p0){
       this.mHighFrequencyPriority = p0;
    }
    public final void setMUserStateSegments(String p0){
       this.mUserStateSegments = p0;
    }
    public final void setNoMoreFeedShowDuration(long p0){
       this.noMoreFeedShowDuration = p0;
    }
}
