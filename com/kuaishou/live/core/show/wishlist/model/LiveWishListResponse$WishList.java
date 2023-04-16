package com.kuaishou.live.core.show.wishlist.model.LiveWishListResponse$WishList;
import java.io.Serializable;
import com.kuaishou.live.core.show.wishlist.model.LiveWishListResponse;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;

public class LiveWishListResponse$WishList implements Serializable	// class@0012ed
{
    public boolean mAudienceVisible;
    public long mCreateTime;
    public String mWishListId;
    public List mWishes;
    public final LiveWishListResponse this$0;
    public static final long serialVersionUID = 0x83d2c7ef7e7ee3d4;

    public void LiveWishListResponse$WishList(LiveWishListResponse p0){
       this.this$0 = p0;
       super();
       this.mAudienceVisible = true;
       this.mWishes = new ArrayList();
    }
    public List getWishes(){
       return this.mWishes;
    }
}
