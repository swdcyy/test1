package com.kuaishou.live.audience.component.shake.mode.LiveAudienceShakeActivityInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveAudienceShakeActivityInfo implements Serializable	// class@000bda
{
    public String mActivityId;
    public LinkedList mActivityLiveStreamInfo;
    public long mNextFetchTimestamp;
    public static final long serialVersionUID = 0x9ced9fa96834955b;

    public void LiveAudienceShakeActivityInfo(){
       super();
    }
}
