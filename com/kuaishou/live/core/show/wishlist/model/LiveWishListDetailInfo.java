package com.kuaishou.live.core.show.wishlist.model.LiveWishListDetailInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class LiveWishListDetailInfo implements Serializable	// class@0012e5
{
    public List mLiveWishListDetailStat;
    public List mLiveWishListSponsors;
    public boolean mVisible;
    public String mWishListId;
    public static final long serialVersionUID = 0xedc4dcc8b6c7a85d;

    public void LiveWishListDetailInfo(){
       super();
       this.mLiveWishListSponsors = new ArrayList();
       this.mLiveWishListDetailStat = new ArrayList();
    }
}
