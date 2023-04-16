package com.kuaishou.merchant.api.live.reservation.ReserveResultInfo;
import java.io.Serializable;
import java.lang.Object;

public class ReserveResultInfo implements Serializable	// class@00156d
{
    public int mActivityStatus;
    public String mAnchorId;
    public ReserveResultInfo$DialogContent mDialogContent;
    public String mLiveJumpUrl;
    public int mNoticeStyle;
    public ReserveResultInfo$Reservation mReservation;
    public List mReserveInfoList;
    public int mReserveStatus;
    public String mResultToast;
    public static final long serialVersionUID = 0x859618ab20f15f9c;

    public void ReserveResultInfo(){
       super();
    }
}
