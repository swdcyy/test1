package com.kuaishou.android.live.model.LiveAudiencePaidShowConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveAudiencePaidShowConfig implements Serializable	// class@0007e4
{
    public int mAuthReason;
    public long mFreePlayDeadlineMs;
    public int mPaidShowCoinCost;
    public String mPaidShowId;
    public String mPaidShowPayPopupDesc;
    public String mPaidShowPayPopupNoFreeDesc;
    public String mPaidShowPayPopupTitle;
    public String mPaidShowPayTicketName;
    public String mTopNoticeMsg;
    public static final long serialVersionUID = 0x68e19c52cb7e1718;

    public void LiveAudiencePaidShowConfig(){
       super();
       this.mAuthReason = 1;
    }
}
