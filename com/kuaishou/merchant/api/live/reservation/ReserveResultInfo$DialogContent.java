package com.kuaishou.merchant.api.live.reservation.ReserveResultInfo$DialogContent;
import java.io.Serializable;
import java.lang.Object;

public class ReserveResultInfo$DialogContent implements Serializable	// class@00156b
{
    public int mActionType;
    public String mButtonText;
    public String mDescription1;
    public String mDescription2;
    public String mTitle;
    public static final long serialVersionUID = 0x4e64f5005b3551ce;

    public void ReserveResultInfo$DialogContent(){
       super();
    }
    public boolean isCloseButton(){
       boolean b = true;
       if (this.mActionType == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean isFollowButton(){
       ReserveResultInfo$DialogContent tmActionType = this.mActionType;
       boolean b = (tmActionType == null || tmActionType == 2)? true: false;
       return b;
    }
}
