package com.kuaishou.live.common.core.component.comments.model.LiveGzonePromotionMessage;
import com.kuaishou.live.basic.model.QLiveMessage;

public class LiveGzonePromotionMessage extends QLiveMessage	// class@0010c0
{
    public int mBizType;
    public boolean mShowed;
    public static final long serialVersionUID = 0x62ab88d2e16bab72;

    public void LiveGzonePromotionMessage(){
       super();
       this.mBizType = 78;
    }
}
