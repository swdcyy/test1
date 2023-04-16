package com.kuaishou.live.core.show.wishlist.model.LiveWishListResponse;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.core.show.wishlist.model.LiveWishListResponse$WishList;

public class LiveWishListResponse implements Serializable	// class@0012ee
{
    public LiveWishListRecommendGiftInfo mRecommendGiftInfo;
    public LiveWishListResponse$WishList mWishList;
    public LiveWishListResponse$LiveWishListGiftExtraInfo mWishListGiftExtraInfo;
    public static final long serialVersionUID = 0xa1354701e6ae0fa1;

    public void LiveWishListResponse(){
       super();
       this.mWishList = new LiveWishListResponse$WishList(this);
    }
}
