package com.yxcorp.gateway.pay.params.GatewayPayBizContent;
import java.io.Serializable;
import java.lang.Object;

public class GatewayPayBizContent implements Serializable	// class@001239
{
    public GatewayPayBizContent$AgreementParams mAgreementParams;
    public String mAttach;
    public String mCurrencyType;
    public String mLimitPay;
    public String mNotifyUrl;
    public String mOutTradeNo;
    public String mReturnUrl;
    public String mSubject;
    public String mTimeExpire;
    public String mTotalAmount;
    public String mUserIp;

    public void GatewayPayBizContent(){
       super();
    }
}
