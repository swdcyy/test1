package com.yxcorp.gifshow.commercial.response.magnetic.RewardPendantResponse;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.response.magnetic.RewardPendantResponse$Data;

public class RewardPendantResponse implements Serializable	// class@001174
{
    public RewardPendantResponse$Data mData;
    public static final long serialVersionUID = 0xecb1626ca7df1048;

    public void RewardPendantResponse(){
       super();
    }
    public boolean canShowView(){
       RewardPendantResponse tmData = this.mData;
       boolean b = false;
       if (tmData == null) {
          return b;
       }
       if (tmData.mRemainingCount <= null) {
          return b;
       }
       RewardPendantResponse$Data mStatus = tmData.mStatus;
       if (mStatus == 1 || mStatus == 2) {
          b = true;
       }
       return b;
    }
    public boolean isValid(){
       boolean b = (this.mData != null)? true: false;
       return b;
    }
}
