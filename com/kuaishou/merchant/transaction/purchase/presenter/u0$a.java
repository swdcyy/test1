package com.kuaishou.merchant.transaction.purchase.presenter.u0$a;
import com.kuaishou.merchant.transaction.purchase.presenter.u0$b;
import com.kuaishou.merchant.transaction.purchase.presenter.u0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.google.gson.JsonObject;
import vm4.e;
import com.google.gson.JsonElement;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import java.util.Set;
import java.util.Iterator;
import js6.a;

public class u0$a implements u0$b	// class@0009ab
{
    public final u0 a;

    public void u0$a(u0 p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       JsonObject obj = PatchProxy.apply(null, this, u0$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = e.d("MerchantPurchaseSubmitOrderType", this.a.s);
       boolean b = false;
       if (obj != null) {
          try{
             JsonElement jsonElement = obj.e0("intercept");
             if (jsonElement != null && jsonElement.p() > 0) {
                b = true;
             }
          }catch(java.lang.Exception e0){
             a.l(MerchantTransactionLogBiz.PURCHASE, "RNPanelPresenter", "getAsInt type error", e0);
          }
       }
    }
    public JsonObject b(){
       Object obj = PatchProxy.apply(null, this, u0$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.d("rnCreateOrderParams", this.a.s);
    }
    public void c(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u0$a.class, "3")) {
          return;
       }
       JsonObject jsonObject = e.d("MerchantPurchaseSubmitOrderType", this.a.s);
       if (jsonObject != null && jsonObject.size() > 0) {
          jsonObject.c0("identifyKey", this.a.s);
          if (p0 != null) {
             Iterator iterator = p0.w0().iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                jsonObject.G(str, p0.e0(str));
             }
          }
          a.b.GO("MerchantPurchaseInterceptOrderCreateEvent", jsonObject);
       }
       return;
    }
}
