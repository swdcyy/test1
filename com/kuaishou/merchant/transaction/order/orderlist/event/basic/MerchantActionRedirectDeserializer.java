package com.kuaishou.merchant.transaction.order.orderlist.event.basic.MerchantActionRedirectDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.model.ActionRedirectEventResponse;

public class MerchantActionRedirectDeserializer implements b	// class@00092f
{

    public void MerchantActionRedirectDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       ActionRedirectEventResponse uActionRedir = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantActionRedirectDeserializer.class, "2");
       if (uActionRedir != PatchProxyResult.class) {
       }else {
          uActionRedir = new ActionRedirectEventResponse();
          uActionRedir.responseStr = p0.toString();
       }
       return uActionRedir;
    }
}
