package com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$WishListConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveCommonConfigResponse$WishListConfig implements Serializable	// class@000e92
{
    public int mWishDescriptionMaxLength;
    public int mWishDetailPollIntervalTimeMs;
    public int mWishGiftMaxCount;
    public int mWishListLength;
    public int mWishListMaxLength;
    public int mWishListMinLength;
    public String mWishTopSponsorsText;
    public static final long serialVersionUID = 0x49552300ca168da0;

    public void LiveCommonConfigResponse$WishListConfig(){
       super();
       this.mWishListLength = 3;
       this.mWishListMinLength = 1;
       this.mWishListMaxLength = 3;
       this.mWishGiftMaxCount = 0x2710;
       this.mWishDetailPollIntervalTimeMs = 3000;
       this.mWishTopSponsorsText = "";
       this.mWishDescriptionMaxLength = 8;
    }
}
