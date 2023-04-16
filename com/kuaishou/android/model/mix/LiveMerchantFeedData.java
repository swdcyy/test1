package com.kuaishou.android.model.mix.LiveMerchantFeedData;
import java.io.Serializable;
import java.lang.Object;

public class LiveMerchantFeedData implements Serializable	// class@000d00
{
    public int mLiveType;
    public static final long serialVersionUID = 0xc0f34165b92c6157;

    public void LiveMerchantFeedData(){
       super();
    }
    public boolean isMerchantLive(){
       boolean b = ((this.mLiveType & 2) == 2)? true: false;
       return b;
    }
    public boolean isShopLive(){
       int i = 1;
       if ((this.mLiveType & i) == i) {
       }else {
          i = false;
       }
       return i;
    }
}
