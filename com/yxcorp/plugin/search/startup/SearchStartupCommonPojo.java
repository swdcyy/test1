package com.yxcorp.plugin.search.startup.SearchStartupCommonPojo;
import java.io.Serializable;
import java.lang.Object;

public class SearchStartupCommonPojo implements Serializable	// class@000769
{
    public FeedNegativeFeedback mFeedNegativeFeedback;
    public SearchStartEndTime mHomeSpringSceneTime;
    public int mRecoAfterPlayMaxCards;
    public long mRecoAfterPlayTriggerTime;
    public int mSearchFeedbackAccessPos;
    public String mSearchFeedbackPageUrl;
    public int mSearchKboxEventAllShowCount;
    public int mSearchKboxEventShowCount;
    public float mSearchLiveReserveFollowToastMills;
    public float mSearchLiveReservePermissionMills;
    public int mSearchShowPhotoDurationSeconds;
    public float mSearchSinglePhotoWidthRation;
    public int mSearchUserTabFoldGetMoreThreshold;
    public int mSearchUserTabPymkDailyCount;
    public static final long serialVersionUID = 0xbad8387a9a8441f3;

    public void SearchStartupCommonPojo(){
       super();
       this.mRecoAfterPlayTriggerTime = 5000;
       this.mSearchUserTabPymkDailyCount = 5;
       this.mRecoAfterPlayMaxCards = 5;
       this.mSearchShowPhotoDurationSeconds = 30;
       this.mSearchUserTabFoldGetMoreThreshold = 15;
       this.mSearchKboxEventShowCount = 2;
       this.mSearchKboxEventAllShowCount = 6;
       this.mSearchSinglePhotoWidthRation = 0x3f3851ec;
       this.mSearchLiveReserveFollowToastMills = 604800000.00f;
       this.mSearchLiveReservePermissionMills = 172800000.00f;
    }
}
