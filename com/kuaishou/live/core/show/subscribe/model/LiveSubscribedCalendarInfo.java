package com.kuaishou.live.core.show.subscribe.model.LiveSubscribedCalendarInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveSubscribedCalendarInfo implements Serializable	// class@001141
{
    public String mAnchorId;
    public boolean mEnableAutoFollow;
    public boolean mEnableWriteCalendar;
    public long mEndTime;
    public String mJumpUrl;
    public String mRemark;
    public long mRemindAdvanceMs;
    public LiveSubscribedCalendarInfo$RepeatedReservationInfo mRepeatedReservationInfo;
    public int mReservationActivityType;
    public int mReservationType;
    public long mStartTime;
    public String mSubscribeId;
    public String mTitle;
    public String mUrl;
    public int result;
    public static final long serialVersionUID = 0xf30c83b9a807f8f1;

    public void LiveSubscribedCalendarInfo(){
       super();
    }
}
