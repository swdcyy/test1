package com.kuaishou.live.core.basic.model.LiveAnnounceInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveAnnounceInfo implements Serializable	// class@00085f
{
    public String mAnnounceContent;
    public long mAnnounceId;
    public String mBizType;
    public String mBusinessParams;
    public LiveAnnounceInfo$LiveAnnounceAction mLiveAnnounceAction;
    public List mLiveAnnounceLabels;
    public LiveSubscribeBriefInfo mLiveSubscribeInfo;
    public static final long serialVersionUID = 0x131c6d1d4608f27c;

    public void LiveAnnounceInfo(){
       super();
    }
}
