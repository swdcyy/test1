package com.yxcorp.gateway.pay.response.DepositPrepayResponse;
import com.yxcorp.gateway.pay.response.GatewayPayBaseResponse;

public class DepositPrepayResponse extends GatewayPayBaseResponse	// class@001268
{
    public String mDepositConfig;
    public String mDepositNo;
    public String mDepositSource;
    public String mOutOrderNo;
    public static final long serialVersionUID = 0x5658beaf3461139e;

    public void DepositPrepayResponse(){
       super();
    }
}
