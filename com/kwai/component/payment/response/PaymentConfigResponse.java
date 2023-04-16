package com.kwai.component.payment.response.PaymentConfigResponse;
import java.io.Serializable;
import java.lang.Object;

public class PaymentConfigResponse implements Serializable	// class@000a03
{
    public List mActiveItems;
    public boolean mEnableCouponList;
    public boolean mEnableRewardHistory;
    public float mExchangeRate;
    public List mFoldProviders;
    public List mFunctionItems;
    public boolean mHasDeposited;
    public boolean mHasRechargeActivity;
    public String mKsCoinDesc;
    public long mMinRechargeFen;
    public long mMinWithdrawFen;
    public List mPayItems;
    public long mRechargeFirstTimeGiftCoins;
    public List mRechargeProvides;
    public String mWithdrawDesc;
    public List mWithdrawProvides;
    public String mXZuanDesc;
    public float mYellow2KwaiCoin;
    public float mYellow2Money;
    public static final long serialVersionUID = 0x9b8b27684139ec4f;

    public void PaymentConfigResponse(){
       super();
       this.mHasDeposited = true;
    }
}
