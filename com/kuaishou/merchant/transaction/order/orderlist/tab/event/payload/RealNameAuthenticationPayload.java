package com.kuaishou.merchant.transaction.order.orderlist.tab.event.payload.RealNameAuthenticationPayload;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.payload.TabBusinessPayload;
import com.google.gson.a;
import com.google.gson.JsonElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import ekd.k0;
import com.kuaishou.merchant.transaction.base.live.model.PurchaseCreateOrderUnionResponse$VerifyInfo;
import java.lang.reflect.Type;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;

public class RealNameAuthenticationPayload extends TabBusinessPayload	// class@0008cf
{
    public MerchantEventModel mRefundEvent;
    public int mSceneType;
    public PurchaseCreateOrderUnionResponse$VerifyInfo mVerifyInfo;
    public static final long serialVersionUID = 0xb246066a26959704;

    public void RealNameAuthenticationPayload(){
       super();
    }
    public static RealNameAuthenticationPayload convertInfo(a p0,JsonElement p1){
       RealNameAuthenticationPayload obj = PatchProxy.applyTwoRefs(p0, p1, null, RealNameAuthenticationPayload.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new RealNameAuthenticationPayload();
       JsonObject jsonObject = p1.r();
       JsonElement jsonElement = k0.e(jsonObject, "params");
       if (jsonElement != null) {
          JsonObject jsonObject1 = jsonElement.r();
          obj.mSceneType = k0.f(jsonObject1, "sceneType", 0);
          obj.mVerifyInfo = p0.c(jsonElement, PurchaseCreateOrderUnionResponse$VerifyInfo.class);
          obj.mOid = k0.h(jsonObject1, "oid", "");
       }
       jsonObject = k0.e(jsonObject, "refundEvent");
       if (jsonObject != null) {
          obj.mRefundEvent = p0.c(jsonObject, MerchantEventModel.class);
       }
       return obj;
    }
}
