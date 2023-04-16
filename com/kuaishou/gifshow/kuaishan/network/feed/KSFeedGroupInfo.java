package com.kuaishou.gifshow.kuaishan.network.feed.KSFeedGroupInfo;
import java.io.Serializable;
import java.lang.Object;

public class KSFeedGroupInfo implements Serializable	// class@001aa5
{
    public CDNUrl[] mGifIconUrls;
    public int mGifMaxShowCount;
    public long mGifShowEndTime;
    public long mGifShowStartTime;
    public String mGroupName;
    public CDNUrl[] mIconUrls;
    public String mId;
    public int mIndex;
    public static final long serialVersionUID = 0xb969faad9af7d535;

    public void KSFeedGroupInfo(){
       super();
    }
}
