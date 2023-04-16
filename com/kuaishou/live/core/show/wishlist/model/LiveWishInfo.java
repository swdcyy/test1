package com.kuaishou.live.core.show.wishlist.model.LiveWishInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class LiveWishInfo implements Serializable	// class@0012e2
{
    public int mCurrentCount;
    public String mDescription;
    public String mDisplayCurrentCount;
    public String mDisplayExpectCount;
    public int mExpectCount;
    public int mGiftId;
    public boolean mIsRecommend;
    public LiveWishListResponse$IconInfo mLeftIconInfo;
    public String mRewardButtonDesc;
    public LiveWishListResponse$IconInfo mRightIconInfo;
    public String mWishId;
    public static final long serialVersionUID = 0x22d365e2e86c23d3;

    public void LiveWishInfo(){
       super();
       this.mGiftId = -1;
       this.mDisplayExpectCount = "";
       this.mDisplayCurrentCount = "";
    }
    public void clear(){
       this.mGiftId = 0;
       this.mExpectCount = 0;
       this.mDescription = null;
    }
    public void setDescription(String p0){
       this.mDescription = p0;
    }
    public void setExpectCount(int p0){
       this.mExpectCount = p0;
    }
    public void setGiftId(int p0){
       this.mGiftId = p0;
    }
    public void setIsRecommend(boolean p0){
       this.mIsRecommend = p0;
    }
}
