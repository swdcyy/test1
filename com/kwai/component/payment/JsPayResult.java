package com.kwai.component.payment.JsPayResult;
import com.yxcorp.gateway.pay.params.result.BaseResult;
import com.kwai.component.payment.JsPayResult$PaymentResult;

public final class JsPayResult extends BaseResult	// class@0009ed
{
    public final JsPayResult$PaymentResult mPaymentResult;
    public static final long serialVersionUID = 0xb4b4dc55f4d6b5;

    public void JsPayResult(JsPayResult$PaymentResult p0){
       super();
       this.mResult = 1;
       this.mPaymentResult = p0;
    }
}
