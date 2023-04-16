package com.yxcorp.gateway.pay.api.WithdrawCallback;
import java.lang.String;

public interface abstract WithdrawCallback	// class@00121f
{

    void onWithdrawCancel(String p0);
    void onWithdrawFailure(int p0,String p1);
    void onWithdrawSuccess(String p0);
}
