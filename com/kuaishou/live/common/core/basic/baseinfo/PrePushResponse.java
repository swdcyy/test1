package com.kuaishou.live.common.core.basic.baseinfo.PrePushResponse;
import java.io.Serializable;
import java.lang.Object;

public class PrePushResponse implements Serializable	// class@000e7a
{
    public boolean mAllowFallbackInPush;
    public long mChangeProviderMaxDelayMillis;
    public String mHostName;
    public boolean mIsNeedRePush;
    public boolean mIsOrigin;
    public String mLiveStreamId;
    public List mPingAddr;
    public String mPrePushAttach;
    public LivePreviousLiveInfo mPreviousLiveInfo;
    public String mPushRtmpUrl;
    public int mPushType;
    public static final long serialVersionUID = 0x1917b75a2291f5d2;

    public void PrePushResponse(){
       super();
       this.mIsOrigin = false;
       this.mPushRtmpUrl = "";
       this.mLiveStreamId = "";
       this.mPushType = 1;
       this.mIsNeedRePush = false;
    }
}
