package com.kuaishou.android.model.mix.LiveReservationInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveReservationInfo implements Serializable	// class@000d09
{
    public long mPushTime;
    public String mPushTimeDesc;
    public String mReservationId;
    public int mReservationStatus;
    public String mStartPushTimeAvatarShowTitle;
    public String mStartPushTimeAvatarShowTitleEn;
    public String mTitle;
    public String mUserId;
    public static final long serialVersionUID = 0x12c4e5717deb6b4a;

    public void LiveReservationInfo(){
       super();
       this.mReservationStatus = 0;
    }
}
