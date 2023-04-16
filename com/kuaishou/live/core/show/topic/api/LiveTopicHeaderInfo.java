package com.kuaishou.live.core.show.topic.api.LiveTopicHeaderInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveTopicHeaderInfo implements Serializable	// class@0011e4
{
    public CDNUrl[] mBackgroundUrls;
    public boolean mHasShown;
    public boolean mIsFollowing;
    public boolean mNeedShowFollowButton;
    public boolean mNeedShowJoinButton;
    public LiveTopicActivityInfo mTopicActivityInfo;
    public CDNUrl[] mTopicCoverUrls;
    public String mTopicDescription;
    public long mTopicId;
    public String mTopicName;
    public String mWatchCountDescription;
    public static final long serialVersionUID = 0xa6a0d1bdac4fdfc3;

    public void LiveTopicHeaderInfo(){
       super();
    }
}
