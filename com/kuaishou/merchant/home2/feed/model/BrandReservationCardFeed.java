package com.kuaishou.merchant.home2.feed.model.BrandReservationCardFeed;
import com.kuaishou.merchant.home2.feed.model.BaseFeed$a;
import com.kuaishou.merchant.home2.feed.model.ReservationFeed;
import com.kuaishou.merchant.home2.feed.model.BrandInfo;

public class BrandReservationCardFeed extends ReservationFeed implements BaseFeed$a	// class@001798
{
    public BrandInfo mBrandInfo;
    public static final long serialVersionUID = 0xf7ebc46fd40d705;

    public void BrandReservationCardFeed(){
       super();
    }
    public BrandInfo getCardBrandInfo(){
       BrandReservationCardFeed tmBrandInfo = this.mBrandInfo;
       if (tmBrandInfo == null) {
          tmBrandInfo = BrandInfo.EMPTY;
       }
       return tmBrandInfo;
    }
}
