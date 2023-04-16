package com.kuaishou.android.model.mix.FeedFriendInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.Set;
import java.util.Collections;
import java.util.List;

public class FeedFriendInfo implements Serializable	// class@000c7d
{
    public boolean mBackToPrePage;
    public List mClickedFriendFeeds;
    public FeedFriendEntranceInfo mFeedFriendEntranceInfo;
    public boolean mHasCheckNegativeFeedback;
    public boolean mHasRead;
    public AtomicBoolean mHasRemovedUser;
    public Set mHasShownBubbleUsers;
    public boolean mHasShownUnreadFinishTips;
    public HyperTag mOldFeedTips;
    public String mPrsid;
    public JsonObject mTipsFeedLogInfo;
    public JsonObject mTipsLogInfo;
    public HyperTag mUnreadFinishHyperTag;
    public String mUnreadFinishTips;
    public static final long serialVersionUID = 0x7c1de4bb3e0cee7d;

    public void FeedFriendInfo(){
       super();
       this.mHasShownBubbleUsers = Collections.emptySet();
       this.mClickedFriendFeeds = Collections.emptyList();
    }
}
