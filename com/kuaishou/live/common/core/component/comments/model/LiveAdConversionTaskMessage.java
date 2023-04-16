package com.kuaishou.live.common.core.component.comments.model.LiveAdConversionTaskMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$NormalMsg;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LinkMsg;

public class LiveAdConversionTaskMessage extends QLiveMessage	// class@0010b5
{
    public final long mConversionId;
    public final LiveAdSocialMessages$LinkMsg mLinkMsg;
    public final LiveAdSocialMessages$NormalMsg mNormalMsg;
    public static final long serialVersionUID = 0xded9520471688750;

    public void LiveAdConversionTaskMessage(long p0,LiveAdSocialMessages$NormalMsg p1,LiveAdSocialMessages$LinkMsg p2){
       super();
       this.mConversionId = p0;
       this.mNormalMsg = p1;
       this.mLinkMsg = p2;
    }
}
