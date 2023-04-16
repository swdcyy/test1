package com.kuaishou.merchant.live.cart.onsale.audience.model.TopRightAreaInfo$RightAreaEntrance;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import com.kuaishou.merchant.live.cart.onsale.audience.model.TopRightAreaInfo$RightAreaBubble;

public final class TopRightAreaInfo$RightAreaEntrance implements Serializable, a	// class@001960
{
    public TopRightAreaInfo$RightAreaBubble mBubble;
    public String mDesc;
    public int mImgType;
    public String mImgUrl;
    public String mJumpUrl;
    public TopRightAreaInfo$Mark mMark;
    public int mType;
    public static final long serialVersionUID = 0xc9934f83bc7cc7ec;

    public void TopRightAreaInfo$RightAreaEntrance(){
       super();
    }
    public void afterDeserialize(){
       TopRightAreaInfo$RightAreaEntrance tmBubble = this.mBubble;
       if (tmBubble != null) {
          tmBubble.mType = this.mType;
       }
       return;
    }
}
