package com.kuaishou.merchant.bridgecenter.params.ReservationParams;
import java.io.Serializable;
import java.lang.Object;

public class ReservationParams implements Serializable	// class@001627
{
    public String mActiveBizType;
    public String mAnchorId;
    public String mCallback;
    public int mChannel;
    public String mIsCancel;
    public String mLogPageName;
    public String mReservationId;
    public String mReserveType;
    public String mStatParams;
    public static final long serialVersionUID = 0x1358e790f8c83c8b;

    public void ReservationParams(){
       super();
       this.mChannel = 1;
    }
}
