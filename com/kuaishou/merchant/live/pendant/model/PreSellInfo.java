package com.kuaishou.merchant.live.pendant.model.PreSellInfo;
import java.io.Serializable;
import java.lang.Object;

public class PreSellInfo implements Serializable	// class@001abe
{
    public String mDeposit;
    public String mDepositButtonText;
    public String mHasReservedJumpUrl;
    public int mPhase;
    public long mPreBeginTime;
    public CDNUrl[] mPreBuyButtonImgUrl;
    public String mPrePrice;
    public CDNUrl[] mReservedButtonImgUrl;
    public static final long serialVersionUID = 0xba6d86b28cc8786a;

    public void PreSellInfo(){
       super();
    }
}
