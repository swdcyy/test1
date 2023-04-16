package com.kuaishou.live.common.core.component.comments.model.LiveAnnounceMessage;
import com.kuaishou.live.basic.model.QLiveMessage;

public class LiveAnnounceMessage extends QLiveMessage	// class@0010b6
{
    public String mActionType;
    public long mAnnounceId;
    public String mAnnounceText;
    public String mBizType;
    public String mBusinessParams;
    public List mLabelList;
    public LiveAnnounceInfo$LiveAnnounceAction mLiveAnnounceAction;
    public LiveSubscribeBriefInfo mSubscribeInfo;
    public static final long serialVersionUID = 0xc2eea5196bd1eea6;

    public void LiveAnnounceMessage(){
       super();
       this.mActionType = "NULL";
    }
}
