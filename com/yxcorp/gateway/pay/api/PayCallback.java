package com.yxcorp.gateway.pay.api.PayCallback;
import com.yxcorp.gateway.pay.params.PayResult;

public interface abstract PayCallback	// class@001217
{

    void onPayCancel(PayResult p0);
    void onPayFailure(PayResult p0);
    void onPaySuccess(PayResult p0);
    void onPayUnknown(PayResult p0);
}
