package com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanySettingInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveGzoneAccompanySettingInfo implements Serializable	// class@000c3e
{
    public int mBillingMode;
    public int mFleetFeeType;
    public int mFleetTicketFeeAmount;
    public int mFleetTicketFeeUnit;
    public String mGameRequirementsText;
    public int mMinAccompanySeconds;
    public LiveGzoneAccompanyRequirement mRequirement;
    public int mTotalSeatCount;
    public static final long serialVersionUID = 0xcfe35ceec5bac85a;

    public void LiveGzoneAccompanySettingInfo(){
       super();
    }
    public boolean isFree(){
       boolean b = true;
       if (this.mFleetFeeType == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean isMatchBillMode(){
       boolean b = true;
       if (this.mBillingMode == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean isTimeBillingMode(){
       boolean b = (this.mBillingMode == 2)? true: false;
       return b;
    }
}
