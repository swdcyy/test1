package com.kuaishou.merchant.transaction.purchase.dynamic.func.PageInfoRequestFunc$b;
import erd.o;
import com.kuaishou.merchant.transaction.purchase.dynamic.func.PageInfoRequestFunc;
import com.google.gson.JsonObject;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonElement;
import java.util.Objects;
import fg6.a;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentResponse;
import com.google.gson.Gson;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentInfo;
import java.util.Map;
import kotlin.jvm.internal.a;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo$Field;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentGlobalInfo;
import ud4.a;
import ud4.a$a;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import java.lang.Exception;
import p74.a;
import o74.a;
import java.lang.IllegalArgumentException;

public final class PageInfoRequestFunc$b implements o	// class@00090a
{
    public final PageInfoRequestFunc b;
    public final JsonObject c;

    public void PageInfoRequestFunc$b(PageInfoRequestFunc p0,JsonObject p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       PageInfoRequestFunc$b obj = PatchProxy.applyOneRefs(p0, this, PageInfoRequestFunc$b.class, str);
       if (obj != patchProxyRe) {
       }else {
          obj = this.b;
          String str1 = this.c.e0("instanceId").w();
          Objects.requireNonNull(obj);
          obj = PatchProxy.applyTwoRefs(p0, str1, obj, PageInfoRequestFunc.class, "5");
          if (obj != patchProxyRe) {
          }else {
             p0 = a.a.h(p0, PageComponentResponse.class);
             String str2 = null;
             PageComponentResponse data = (p0 != null)? p0.data: str2;
             if (data != null) {
                PageComponentInfo data1 = p0.data.data;
                if (data1 != null && data1.get(str1) != null) {
                   JsonObject obj1 = p0.data.data.get(str1);
                   a.m(obj1);
                   if (obj1.fields != null) {
                      obj1 = p0.data.data.get(str1);
                      a.m(obj1);
                      if (obj1.fields.data != null) {
                         data1 = p0.data.global;
                         if (data1 != null && data1.bizData != null) {
                            obj1 = new JsonObject();
                            a$a obj2 = p0.data.data.get(str1);
                            a.m(obj2);
                            obj1.G("instanceData", obj2.fields.data);
                            obj2 = a.a;
                            p0 = p0.data.global.bizData;
                            Objects.requireNonNull(obj2);
                            str = PatchProxy.applyOneRefs(p0, obj2, a$a.class, str);
                            if (str != patchProxyRe) {
                            }else if(p0 != null){
                               if (!p0 instanceof JsonObject) {
                                  p0 = str2;
                               }
                               if (p0 != null) {
                                  try{
                                     p0 = p0.e0("pageInfoTransparentParam");
                                     if (p0 != null) {
                                        str2 = p0.w();
                                     }
                                  }catch(java.lang.Exception e7){
                                     a.g(MerchantTransactionLogBiz.PURCHASE_V2, "DyProtocolUtil", "JsonParseFailed:"+e7.getMessage());
                                  }
                               }
                            }
                            if (str != null) {
                               obj1.c0("pageInfoTransparentParam", str);
                            }
                            obj = obj1;
                         }
                      }
                   }
                }
             }
             throw new IllegalArgumentException("resp invalid");
          }
       }
       return obj;
    }
}
