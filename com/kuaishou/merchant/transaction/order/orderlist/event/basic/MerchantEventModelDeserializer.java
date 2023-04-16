package com.kuaishou.merchant.transaction.order.orderlist.event.basic.MerchantEventModelDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;
import com.google.gson.JsonObject;
import ekd.k0;
import al4.a;
import java.lang.Integer;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.EventPayloadInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionOpenHalfRnPayloadInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionJumpWithBackupPayloadInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionRedirectPayloadInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionJumpPayloadInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionRequestPayloadInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionAddressJumpPayloadInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionPayPayloadInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.display.payload.DisplayDialogPayloadInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.display.payload.DisplayAlertAddressPayloadInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.display.payload.DisplaySheetPayloadInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.display.payload.DisplayAlertPayloadInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.display.payload.DisplayToastPayloadInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.business.payload.BusinessEventPayloadInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.EventContinuationInfo;
import com.kuaishou.merchant.api.core.model.MerchantEventLoggerParam;

public class MerchantEventModelDeserializer implements b	// class@000930
{

    public void MerchantEventModelDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       EventPayloadInfo uEventPayloa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MerchantEventModel merchantEven = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantEventModelDeserializer.class, "2");
       if (merchantEven != patchProxyRe) {
       }else {
          merchantEven = new MerchantEventModel();
          JsonObject jsonObject = p0.r();
          merchantEven.mType = k0.f(jsonObject, "type", 0);
          JsonElement jsonElement = k0.e(jsonObject, "payload");
          MerchantEventModel mType = merchantEven.mType;
          if (PatchProxy.isSupport(a.class)) {
             uEventPayloa = PatchProxy.applyThreeRefs(p2, jsonElement, Integer.valueOf(mType), null, a.class, "2");
             if (uEventPayloa != patchProxyRe) {
             }else {
             label_004b :
                uEventPayloa = null;
                if (jsonElement != null && p2 != null) {
                   if (mType != 3001) {
                      switch (mType){
                          case 1001:
                            uEventPayloa = p2.c(jsonElement, ActionPayPayloadInfo.class);
                            break;
                          case 1002:
                            uEventPayloa = p2.c(jsonElement, ActionAddressJumpPayloadInfo.class);
                            break;
                          case 1003:
                            uEventPayloa = p2.c(jsonElement, ActionRequestPayloadInfo.class);
                            break;
                          case 1004:
                            uEventPayloa = p2.c(jsonElement, ActionJumpPayloadInfo.class);
                            break;
                          case 1005:
                            uEventPayloa = p2.c(jsonElement, ActionRedirectPayloadInfo.class);
                            break;
                          case 1006:
                            uEventPayloa = p2.c(jsonElement, ActionJumpWithBackupPayloadInfo.class);
                            break;
                          case 1007:
                            uEventPayloa = p2.c(jsonElement, ActionOpenHalfRnPayloadInfo.class);
                            break;
                          default:
                            switch (mType){
                                case 2001:
                                  uEventPayloa = p2.c(jsonElement, DisplayToastPayloadInfo.class);
                                  break;
                                case 2002:
                                  uEventPayloa = p2.c(jsonElement, DisplayAlertPayloadInfo.class);
                                  break;
                                case 2003:
                                  uEventPayloa = p2.c(jsonElement, DisplaySheetPayloadInfo.class);
                                  break;
                                case 2004:
                                  uEventPayloa = p2.c(jsonElement, DisplayAlertAddressPayloadInfo.class);
                                  break;
                                case 2005:
                                  uEventPayloa = p2.c(jsonElement, DisplayDialogPayloadInfo.class);
                                  break;
                                default:
                            }
                      }
                   }else {
                      uEventPayloa = new BusinessEventPayloadInfo();
                      uEventPayloa.mPayloadJsonStr = jsonElement.toString();
                   }
                }
             }
          }else {
             goto label_004b ;
          }
          merchantEven.mPayload = uEventPayloa;
          JsonElement jsonElement1 = k0.e(jsonObject, "continuation");
          if (jsonElement1 != null) {
             merchantEven.mContinuationInfo = p2.c(jsonElement1, EventContinuationInfo.class);
          }
          jsonObject = k0.e(jsonObject, "logs");
          if (jsonObject != null) {
             merchantEven.mLogs = p2.c(jsonObject, MerchantEventLoggerParam.class);
          }
       }
       return merchantEven;
    }
}
