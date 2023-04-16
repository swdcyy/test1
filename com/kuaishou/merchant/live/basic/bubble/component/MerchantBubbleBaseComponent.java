package com.kuaishou.merchant.live.basic.bubble.component.MerchantBubbleBaseComponent;
import java.io.Serializable;
import java.lang.Object;

public class MerchantBubbleBaseComponent implements Serializable	// class@00187f
{
    public boolean mIsUsed;

    public void MerchantBubbleBaseComponent(){
       super();
       this.mIsUsed = false;
    }
    public void setToUsed(){
       this.mIsUsed = true;
    }
}
