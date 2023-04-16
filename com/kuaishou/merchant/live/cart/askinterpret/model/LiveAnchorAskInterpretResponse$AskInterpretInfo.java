package com.kuaishou.merchant.live.cart.askinterpret.model.LiveAnchorAskInterpretResponse$AskInterpretInfo;
import java.io.Serializable;
import com.kuaishou.merchant.live.cart.askinterpret.model.LiveAnchorAskInterpretResponse;
import java.lang.Object;

public class LiveAnchorAskInterpretResponse$AskInterpretInfo implements Serializable	// class@0018fa
{
    public String itemId;
    public String itemTitle;
    public int mAskNumber;
    public int mCurrentStock;
    public String mDisplayPrice;
    public List mImageUrls;
    public int mInterpretStatus;
    public int mSequence;
    public final LiveAnchorAskInterpretResponse this$0;

    public void LiveAnchorAskInterpretResponse$AskInterpretInfo(LiveAnchorAskInterpretResponse p0){
       this.this$0 = p0;
       super();
    }
}
