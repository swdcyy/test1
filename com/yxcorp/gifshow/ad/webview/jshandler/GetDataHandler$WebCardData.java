package com.yxcorp.gifshow.ad.webview.jshandler.GetDataHandler$WebCardData;
import java.io.Serializable;
import java.lang.Object;

public final class GetDataHandler$WebCardData implements Serializable	// class@0018e6
{
    public PhotoAdvertisement mAd;
    public String mCardData;
    public int mDetailBrowseType;
    public QPhoto mFeed;
    public String mH5Data;
    public boolean mHasLiveReserved;
    public int mIsFollowing;

    public void GetDataHandler$WebCardData(){
       super();
       this.mIsFollowing = 0;
       this.mDetailBrowseType = 0;
       this.mHasLiveReserved = false;
    }
}
