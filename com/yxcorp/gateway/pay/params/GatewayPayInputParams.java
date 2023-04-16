package com.yxcorp.gateway.pay.params.GatewayPayInputParams;
import java.io.Serializable;
import java.lang.Object;

public class GatewayPayInputParams implements Serializable	// class@00123c
{
    public String mAccountGroupKey;
    public String mCallback;
    public GatewayPayInputParams$GatewayPayOrder mOrder;
    public String mProvider;
    public static final long serialVersionUID = 0x940db536d9daac54;

    public void GatewayPayInputParams(){
       super();
    }
}
