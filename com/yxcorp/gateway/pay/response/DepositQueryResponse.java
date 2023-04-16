package com.yxcorp.gateway.pay.response.DepositQueryResponse;
import com.yxcorp.gateway.pay.response.GatewayPayBaseResponse;

public class DepositQueryResponse extends GatewayPayBaseResponse	// class@001269
{
    public String mCompleteTime;
    public String mDepositAmount;
    public String mDepositState;
    public String mIncentiveAmout;
    public static final long serialVersionUID = 0xe9929c5f12b05cb;

    public void DepositQueryResponse(){
       super();
    }
}
