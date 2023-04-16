package com.yxcorp.gifshow.map.map.model.CurrentMapInfo;
import java.io.Serializable;
import java.lang.Object;

public class CurrentMapInfo implements Serializable	// class@001c97
{
    public b mBubbleFeedLatLng;
    public String mBubbleFeedMessage;
    public String mChatRoomUserId;
    public String mExtListUserId;
    public String mFeedId;
    public String mFeedType;
    public int mFromSource;
    public int mInnerLocationSourceType;
    public b mLeftTopLatLng;
    public String mMomentType;
    public String mMomentUserId;
    public a mPageType;
    public b mRightBottomLatLng;
    public static final long serialVersionUID = 0xea23783c98f6806d;

    public void CurrentMapInfo(){
       super();
       this.mFeedId = "";
       this.mFeedType = "";
       this.mMomentType = "";
       this.mMomentUserId = "";
       this.mChatRoomUserId = "";
       this.mExtListUserId = "";
    }
}
