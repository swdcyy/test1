package com.kuaishou.android.model.mix.LivePlaybackMeta;
import java.io.Serializable;
import java.lang.Object;

public class LivePlaybackMeta implements Serializable	// class@000d04
{
    public int mCurrentQuality;
    public String mDisplayLiveStartTime;
    public long mEndOffsetMs;
    public String mGameId;
    public boolean mIsCommentForbidden;
    public boolean mIsUseFreeTraffic;
    public String mLiveCaption;
    public CDNUrl[] mLiveCoverUrls;
    public String mLiveHighlightId;
    public long mLiveStartTime;
    public String mLiveStreamId;
    public String mLiveStreamIdEncryption;
    public long mPlayOffsetMs;
    public String mProductId;
    public List mQualityPlayUrls;
    public boolean mShopLive;
    public long mStartOffsetMs;
    public long mStartTime;
    public static final long serialVersionUID = 0xd013435733dd4e71;

    public void LivePlaybackMeta(){
       super();
       this.mCurrentQuality = 0;
    }
}
