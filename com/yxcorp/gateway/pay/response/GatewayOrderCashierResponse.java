package com.yxcorp.gateway.pay.response.GatewayOrderCashierResponse;
import com.yxcorp.gateway.pay.response.GatewayPayBaseResponse;

public class GatewayOrderCashierResponse extends GatewayPayBaseResponse	// class@00126a
{
    public long mCreateTime;
    public String mCurrencyType;
    public String mOutTradeNo;
    public Map mProviderConfig;
    public String mSubject;
    public long mTotalAmount;
    public static final long serialVersionUID = 0xea6b8861556194e;

    public void GatewayOrderCashierResponse(){
       super();
    }
}
