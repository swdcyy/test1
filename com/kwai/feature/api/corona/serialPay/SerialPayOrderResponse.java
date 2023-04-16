package com.kwai.feature.api.corona.serialPay.SerialPayOrderResponse;
import java.io.Serializable;
import java.lang.Object;

public class SerialPayOrderResponse implements Serializable	// class@000e2c
{
    public SerialPayOrderResponse$OrderPayData mOrderPayParams;
    public GatewayPayInputParams$GatewayPayOrder mParams;
    public int mPayType;
    public static final long serialVersionUID = 0xd95576879f8359d6;

    public void SerialPayOrderResponse(){
       super();
    }
    public boolean isOrderPayType(){
       boolean b = true;
       if (this.mPayType != b || this.mOrderPayParams == null) {
          b = false;
       }
       return b;
    }
}
