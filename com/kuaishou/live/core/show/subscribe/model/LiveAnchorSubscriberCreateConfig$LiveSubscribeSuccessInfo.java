package com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo implements Serializable	// class@001132
{
    public String mBannedReason;
    public boolean mDisableDelete;
    public String mDisplayBookedUserCount;
    public String mDisplayBookedUserCountNumber;
    public LiveAnchorSubscriberCreateConfig$ActivityDisplayConfig mDisplayConfig;
    public String mDisplayTotalCount;
    public String mDisplayTotalCountSuffix;
    public boolean mIsBanned;
    public boolean mIsPhotoRelated;
    public boolean mIsSelected;
    public String mPhotoDesc;
    public int mReservationActivityType;
    public int mReservationType;
    public String mSubscribeId;
    public String mSubscribeTimeDesc;
    public String mTitle;
    public static final long serialVersionUID = 0x32448ab586fab160;

    public void LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo(){
       super();
       this.mIsSelected = false;
    }
}
