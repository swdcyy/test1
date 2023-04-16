package com.kuaishou.merchant.home2.feed.model.BrandLiveFeed;
import com.kuaishou.merchant.home2.feed.model.BaseFeed$a;
import com.kuaishou.merchant.home2.feed.model.LiveFeed;
import com.kuaishou.merchant.home2.feed.model.BrandInfo;

public class BrandLiveFeed extends LiveFeed implements BaseFeed$a	// class@001796
{
    public BrandInfo mBrandInfo;
    public int mBrandTrailerType;
    public static final long serialVersionUID = 0x997c0f84f046230;

    public void BrandLiveFeed(){
       super();
    }
    public BrandInfo getCardBrandInfo(){
       BrandLiveFeed tmBrandInfo = this.mBrandInfo;
       if (tmBrandInfo == null) {
          tmBrandInfo = BrandInfo.EMPTY;
       }
       return tmBrandInfo;
    }
}
