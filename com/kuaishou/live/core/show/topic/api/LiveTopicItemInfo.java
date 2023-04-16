package com.kuaishou.live.core.show.topic.api.LiveTopicItemInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveTopicItemInfo implements Serializable	// class@0011e7
{
    public String mFollowCountDescription;
    public boolean mHasShown;
    public String mSelectedStatus;
    public CDNUrl[] mTopicBackgroundCdnUrls;
    public CDNUrl[] mTopicCoverUrls;
    public CDNUrl[] mTopicIconCdnUrls;
    public long mTopicId;
    public String mTopicName;
    public String mWatchCountDescription;
    public static final long serialVersionUID = 0xa6a0d1bdac4fdfc3;

    public void LiveTopicItemInfo(){
       super();
    }
}
