package com.kuaishou.merchant.transaction.live.dynamic.service.PageInfoParamBuilder;
import com.kuaishou.merchant.transaction.live.dynamic.service.PageInfoParamBuilder$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import com.kuaishou.merchant.transaction.live.dynamic.service.PageInfoParamBuilder$mFormDataManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import androidx.fragment.app.Fragment;
import com.google.gson.JsonObject;
import com.kuaishou.merchant.transaction.base.dynamic.viewbinder.MainProcViewBinder$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import com.google.gson.JsonElement;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import ue4.o;
import ue4.d;
import java.util.List;
import com.kuaishou.merchant.transaction.base.dynamic.form.a;
import com.kuaishou.merchant.transaction.base.dynamic.form.FormSceneEnum;
import java.util.Map;
import ue4.h;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.kuaishou.merchant.transaction.live.dynamic.service.PageInfoParamBuilder$mergeData$1;
import msd.p;
import tb7.d;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.merchant.transaction.live.dynamic.service.PageInfoParamBuilder$mergeData$$inlined$let$lambda$1;

public final class PageInfoParamBuilder	// class@0007c2
{
    public final p a;
    public final Context b;
    public static final PageInfoParamBuilder$a c;

    static {
       PageInfoParamBuilder.c = new PageInfoParamBuilder$a(null);
    }
    public void PageInfoParamBuilder(Context p0){
       super();
       this.b = p0;
       this.a = s.c(PageInfoParamBuilder$mFormDataManager$2.INSTANCE);
    }
    public final JsonObject a(Fragment p0,JsonObject p1,JsonObject p2,MainProcViewBinder$b p3){
       d a;
       JsonObject obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, PageInfoParamBuilder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       if (p1 != null && !PatchProxy.applyVoidTwoRefs(obj, p1, this, PageInfoParamBuilder.class, "4")) {
          if (!p1.size()) {
             a.g(MerchantTransactionLogBiz.PURCHASE_V2, "PageInfoParamBuilder", "fillUriParamsFail:Empty");
          }
          obj.G("uriParams", p1);
       }
       if (p2 != null && !PatchProxy.applyVoidTwoRefs(obj, p2, this, PageInfoParamBuilder.class, "5")) {
          Iterator iterator1 = p2.entrySet().iterator();
          while (iterator1.hasNext()) {
             Map$Entry uEntry1 = iterator1.next();
             String key = uEntry1.getKey();
             obj.G(key, uEntry1.getValue());
          }
       }
       if (!PatchProxy.applyVoidOneRefs(obj, this, PageInfoParamBuilder.class, "3")) {
          PageInfoParamBuilder tb = this.b;
          if (tb != null) {
             obj.G("cashierParam", o.i(tb));
          }
          o.f(obj);
       }
       if (p3 != null && !PatchProxy.applyVoidTwoRefs(obj, p3, this, PageInfoParamBuilder.class, "6")) {
          p3.a(obj);
       }
       try{
          if (p0 != null && !PatchProxy.applyVoidTwoRefs(p0, obj, this, PageInfoParamBuilder.class, "7")) {
             a = d.a;
             List list = a.c(p0, a.a(p0));
             a uoa = PatchProxy.apply(null, this, PageInfoParamBuilder.class, "1");
             if (uoa == PatchProxyResult.class) {
                uoa = this.a.getValue();
             }
             Map map = uoa.b(p0, list, FormSceneEnum.REFRESH_PAGE);
             if (map != null) {
                Iterator iterator = map.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   if (obj.s0(uEntry.getKey())) {
                      JsonElement jsonElement = obj.e0(uEntry.getKey());
                      if (jsonElement != null && jsonElement.E() == true) {
                         this.b(obj.e0(uEntry.getKey()).r(), uEntry.getValue());
                      }
                   }
                   h.a(obj, uEntry.getKey(), uEntry.getValue());
                }
             }
          }
       }catch(java.lang.Exception e10){
          a.g(MerchantTransactionLogBiz.PURCHASE_V2, "PageInfoParamBuilder", "fillFormDataFailed:"+e10.getMessage());
       }
       return obj;
    }
    public final void b(JsonObject p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PageInfoParamBuilder.class, "8")) {
          return;
       }
       if (p1 instanceof JsonObject) {
          d.a(p1, new PageInfoParamBuilder$mergeData$1(p0));
       }else if(p1 instanceof String){
          try{
             p1 = a.a.h(p1, JsonObject.class);
             if (p1 != null) {
                d.a(p1, new PageInfoParamBuilder$mergeData$$inlined$let$lambda$1(p0));
             }
          }catch(java.lang.Exception e0){
             a.g(MerchantTransactionLogBiz.PURCHASE_V2, "PageInfoParamBuilder", "mergeFormDataFailed:form data\'s parse failed");
          }
       }else {
          a.g(MerchantTransactionLogBiz.PURCHASE_V2, "PageInfoParamBuilder", "mergeFormDataFailed:form data\'s type incorrect");
       }
    }
}
