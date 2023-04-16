package com.kwai.component.payment.bridge.params.JsVoucherPayParams;
import java.io.Serializable;
import java.lang.Object;

public class JsVoucherPayParams implements Serializable	// class@0009f9
{
    public long mAmountFen;
    public String mCallback;
    public String mIapItemName;
    public long mKsCoin;
    public String mKsCouponId;
    public PaymentConfigResponse$PayProvider mProvider;
    public static final long serialVersionUID = 0x785707318b9122b;

    public void JsVoucherPayParams(){
       super();
    }
}
