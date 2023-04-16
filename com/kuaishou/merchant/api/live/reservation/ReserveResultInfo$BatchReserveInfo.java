package com.kuaishou.merchant.api.live.reservation.ReserveResultInfo$BatchReserveInfo;
import java.io.Serializable;
import com.kuaishou.merchant.api.live.reservation.ReserveResultInfo;
import java.lang.Object;

public class ReserveResultInfo$BatchReserveInfo implements Serializable	// class@00156a
{
    public int mActiveBizType;
    public int mActivityStatus;
    public String mAnchorId;
    public String mExtendMap;
    public int mFollowType;
    public ReserveResultInfo$Reservation mReservation;
    public String mReservationId;
    public int mReserveStatus;
    public int mReserveType;
    public final ReserveResultInfo this$0;

    public void ReserveResultInfo$BatchReserveInfo(ReserveResultInfo p0){
       this.this$0 = p0;
       super();
    }
}
