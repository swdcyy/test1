package com.kuaishou.live.common.core.component.comments.model.LiveFellowRedPackSendPacketMessage;
import com.kuaishou.live.basic.model.QLiveMessage;

public class LiveFellowRedPackSendPacketMessage extends QLiveMessage	// class@0010bb
{
    public boolean mIsSendByAnchor;
    public int mRedPackSentType;
    public static final long serialVersionUID = 0x20d561de379093fd;

    public void LiveFellowRedPackSendPacketMessage(int p0,boolean p1){
       super();
       this.mRedPackSentType = p0;
       this.mIsSendByAnchor = p1;
    }
}
