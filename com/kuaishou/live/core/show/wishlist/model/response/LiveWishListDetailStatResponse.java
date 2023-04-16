package com.kuaishou.live.core.show.wishlist.model.response.LiveWishListDetailStatResponse;
import java.io.Serializable;
import java.lang.Object;

public class LiveWishListDetailStatResponse implements Serializable	// class@0012f1
{
    public LiveWishListDetailExtraInfo mLiveWishListDetailExtraInfo;
    public LiveWishListDetailInfo mLiveWishListDetailInfo;
    public int mResult;
    public static final LiveWishListDetailStatResponse EMPTY;
    public static final long serialVersionUID;

    static {
       LiveWishListDetailStatResponse.EMPTY = new LiveWishListDetailStatResponse();
    }
    public void LiveWishListDetailStatResponse(){
       super();
    }
}
