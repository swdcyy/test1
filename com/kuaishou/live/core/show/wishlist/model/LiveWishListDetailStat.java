package com.kuaishou.live.core.show.wishlist.model.LiveWishListDetailStat;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class LiveWishListDetailStat implements Serializable	// class@0012e6
{
    public int mCurrentCount;
    public String mDescription;
    public String mDisplayCurrentCount;
    public String mDisplayExpectCount;
    public int mGiftId;
    public String mGiftToken;
    public LiveWishListResponse$IconInfo mLeftIconInfo;
    public List mLiveWishListSponsors;
    public String mRewardButtonDesc;
    public LiveWishListResponse$IconInfo mRightIconInfo;
    public int mTargetCount;
    public String mTitle;
    public String mWishId;
    public static final long serialVersionUID = 0xedca6f8ec5c1adf9;

    public void LiveWishListDetailStat(){
       super();
       this.mLiveWishListSponsors = new ArrayList();
    }
}
