package com.kuaishou.merchant.home2.feed.model.ReservationInfo;
import java.lang.Object;

public class ReservationInfo	// class@0017bb
{
    public String mButtonColor;
    public String mButtonContent;
    public String mCouponId;
    public int mReservationActivityType;
    public String mReservationHighlights;
    public String mReservationId;
    public String mReservationLiveStartTime;
    public int mReservationStatus;
    public String mReservationTitle;
    public int mReservationType;
    public String mReservedButtonColor;
    public String mReservedButtonContent;

    public void ReservationInfo(){
       super();
       this.mReservationStatus = 1;
    }
    public boolean a(){
       boolean b = (this.mReservationStatus == 2)? true: false;
       return b;
    }
}
