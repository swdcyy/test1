package com.kuaishou.merchant.transaction.order.orderlist.tab.event.BusinessPayloadDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.payload.TabBusinessPayload;
import com.google.gson.JsonObject;
import ekd.k0;
import wl4.r;
import java.lang.Integer;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.payload.OverSoldTimeAlertPayload;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.payload.RealNameAuthenticationPayload;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.payload.OrderCancelPayload;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.payload.BusinessPayloadInfo;

public class BusinessPayloadDeserializer implements b	// class@00093a
{

    public void BusinessPayloadDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       TabBusinessPayload tabBusinessP;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, BusinessPayloadDeserializer.class, "2");
       if (p1 != patchProxyRe) {
       }else {
          int i = k0.f(p0.r(), "customType", 0);
          if (PatchProxy.isSupport(r.class)) {
             Object obj = PatchProxy.applyThreeRefs(p2, p0, Integer.valueOf(i), null, r.class, "2");
             if (obj != patchProxyRe) {
                tabBusinessP = obj;
             }else {
             label_003b :
                BusinessPayloadInfo uBusinessPay = null;
                if (p2 != null) {
                   switch (i){
                       case 1:
                       case 4:
                       case 5:
                       case 6:
                       case 8:
                         tabBusinessP = p2.c(p0, BusinessPayloadInfo.class);
                         break;
                       case 2:
                         tabBusinessP = p2.c(p0, OrderCancelPayload.class);
                         break;
                       case 3:
                         tabBusinessP = RealNameAuthenticationPayload.convertInfo(p2, p0);
                         break;
                       case 7:
                         tabBusinessP = OverSoldTimeAlertPayload.convertInfo(p2, p0);
                         break;
                       default:
                   }
                }
                tabBusinessP = uBusinessPay;
             }
          }else {
             goto label_003b ;
          }
          tabBusinessP.mType = i;
          i = tabBusinessP;
       }
       return p1;
    }
}
