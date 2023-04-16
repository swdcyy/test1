package com.kuaishou.live.core.show.wishlist.model.LiveWishListRecommendGiftInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;

public class LiveWishListRecommendGiftInfo implements Serializable	// class@0012e8
{
    public boolean mIsHistoryData;
    public List mRecommendGifts;
    public static final long serialVersionUID = 0x65fd5ed685ee96db;

    public void LiveWishListRecommendGiftInfo(){
       super();
       this.mRecommendGifts = new ArrayList();
    }
    public List getRecommendGifts(){
       return this.mRecommendGifts;
    }
}
