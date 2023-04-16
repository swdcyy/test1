package com.yxcorp.gateway.pay.params.FrontCashierPayParams;
import java.io.Serializable;
import java.lang.Object;

public class FrontCashierPayParams implements Serializable	// class@001236
{
    public String mChannelType;
    public boolean mNeedToH5;
    public String mOutTradeNo;
    public String mPayCode;
    public String mPayMsg;
    public String mPaymentMethod;
    public String mProvider;
    public String mProviderConfig;
    public String mReferer;
    public static final long serialVersionUID = 0xe2883500f2aebca1;

    public void FrontCashierPayParams(){
       super();
    }
}
