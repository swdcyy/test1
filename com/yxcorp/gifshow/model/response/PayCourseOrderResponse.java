package com.yxcorp.gifshow.model.response.PayCourseOrderResponse;
import java.io.Serializable;
import java.lang.Object;

public class PayCourseOrderResponse implements Serializable	// class@001f4d
{
    public PayCourseOrderResponse$OrderPayData mOrderPayParams;
    public GatewayPayInputParams$GatewayPayOrder mParams;
    public int mPayType;
    public static final long serialVersionUID = 0xd95576879f8359d6;

    public void PayCourseOrderResponse(){
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
