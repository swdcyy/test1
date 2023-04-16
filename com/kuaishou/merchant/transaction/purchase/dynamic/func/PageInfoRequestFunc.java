package com.kuaishou.merchant.transaction.purchase.dynamic.func.PageInfoRequestFunc;
import mu4.b;
import com.kuaishou.merchant.transaction.purchase.dynamic.func.PageInfoRequestFunc$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import com.kuaishou.merchant.transaction.purchase.dynamic.func.PageInfoRequestFunc$mApiParamBuilder$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.google.gson.JsonObject;
import mu4.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonElement;
import rd4.b;
import rd4.b$a;
import com.kuaishou.merchant.transaction.base.dynamic.LoadingViewModel;
import com.kuaishou.merchant.transaction.base.dynamic.LoadingViewModel$a;
import com.kuaishou.ksmvvm.command.KSCommand;
import crd.b;
import sm4.b;
import sm4.a;
import ojd.c;
import com.kuaishou.merchant.transaction.purchase.dynamic.util.PageInfoParamBuilder;
import gd4.d;
import gd4.d$a;
import com.kuaishou.merchant.transaction.base.dynamic.viewbinder.MainProcViewBinder$b;
import qrd.l1;
import okhttp3.RequestBody;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.merchant.transaction.purchase.dynamic.func.PageInfoRequestFunc$b;
import t45.d;
import brd.z;
import com.kuaishou.merchant.transaction.purchase.dynamic.func.PageInfoRequestFunc$c;
import erd.a;
import com.kuaishou.merchant.transaction.purchase.dynamic.func.PageInfoRequestFunc$d;
import com.kuaishou.merchant.transaction.purchase.dynamic.func.PageInfoRequestFunc$e;
import erd.g;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import fg6.a;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.Exception;
import mu4.a;

public final class PageInfoRequestFunc implements b	// class@00090f
{
    public b a;
    public final p b;
    public final Fragment c;
    public static final PageInfoRequestFunc$a d;

    static {
       PageInfoRequestFunc.d = new PageInfoRequestFunc$a(null);
    }
    public void PageInfoRequestFunc(Fragment p0){
       super();
       this.c = p0;
       this.b = s.c(new PageInfoRequestFunc$mApiParamBuilder$2(this));
    }
    public final void a(JsonObject p0,d p1){
       JsonElement jsonElement;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PageInfoRequestFunc pageInfoRequ = PageInfoRequestFunc.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, pageInfoRequ, "3")) {
          return;
       }
       String str = PatchProxy.applyOneRefs(obj1, obj, pageInfoRequ, "10");
       Object[] objArray = null;
       int i = 1;
       if (str != patchProxyRe) {
       }else if(obj1 == null){
          str = "param empty";
       }else {
          jsonElement = obj1.e0("instanceId");
          if (jsonElement != null) {
             str = jsonElement.w();
             if (str != null) {
                str = (str.length() > 0)? 1: null;
                if (str == i) {
                   if (obj1.e0("reselectedEventType") == null) {
                      str = "reselect event type null";
                   }else {
                      str = objArray;
                   }
                }
             }
          }
          str = "no instance id";
       }
       if (str != null) {
          obj2.a(b.a.b(str));
          return;
       }else {
          jsonElement = obj1.e0("startLoading");
          if (jsonElement != null && jsonElement.p() == i) {
             LoadingViewModel.i.a(obj.c).s0().a();
          }
          PageInfoRequestFunc a = obj.a;
          if (a != null) {
             a.dispose();
          }
          b uob = a.a();
          c uoc = PatchProxy.applyOneRefs(obj1, obj, pageInfoRequ, "6");
          if (uoc != patchProxyRe) {
          }else {
             PageInfoParamBuilder pageInfoPara = PatchProxy.apply(objArray, obj, pageInfoRequ, "1");
             if (pageInfoPara == patchProxyRe) {
                pageInfoPara = obj.b.getValue();
             }
             PageInfoRequestFunc c = obj.c;
             d$a n = d.n;
             JsonObject jsonObject = n.a(c).z0();
             JsonObject jsonObject1 = PatchProxy.applyOneRefs(obj1, obj, pageInfoRequ, "7");
             if (jsonObject1 != patchProxyRe) {
             }else {
                jsonObject1 = n.a(obj.c).t0().d0();
                JsonElement jsonElement1 = obj1.e0("pageInfoTransparentParam");
                if (jsonElement1 != null) {
                   String str1 = jsonElement1.w();
                   if (str1 != null) {
                      if (str1.length() <= 0) {
                         i = 0;
                      }
                      if (i) {
                         objArray = str1;
                      }
                      if (objArray != null) {
                         jsonObject1.c0("pageInfoTransparentParam", objArray);
                      }
                   }
                }
             }
             MainProcViewBinder$b uob1 = PatchProxy.applyOneRefs(obj1, obj, pageInfoRequ, "8");
             if (uob1 != patchProxyRe) {
             }else {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.G("reselectedEventType", obj1.e0("reselectedEventType"));
                jsonObject2.G("reselectedParams", obj1.e0("reselectedParams"));
                uob1 = new MainProcViewBinder$b(jsonObject2, false);
             }
             uoc = c.d(pageInfoPara.a(c, jsonObject, jsonObject1, uob1));
          }
          obj.a = uob.g(uoc).map(new e()).map(new PageInfoRequestFunc$b(obj, obj1)).subscribeOn(d.c).observeOn(d.a).doFinally(new PageInfoRequestFunc$c(obj)).subscribe(new PageInfoRequestFunc$d(obj2), new PageInfoRequestFunc$e(obj, obj2));
          return;
       }
    }
    public void b(String p0,d p1){
       JsonObject jsonObject;
       PageInfoRequestFunc pageInfoRequ = PageInfoRequestFunc.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, pageInfoRequ, "2")) {
          return;
       }
       if (p1 == null) {
          a.g(MerchantTransactionLogBiz.PURCHASE_V2, "PageInfoRequestFunc", "listener null");
          return;
       }else if(p0 != null){
          jsonObject = a.a.h(p0, JsonObject.class);
       }else {
          jsonObject = null;
       }
       if (jsonObject != null) {
          JsonElement jsonElement = jsonObject.e0("cmd");
          if (jsonElement == null || jsonElement.p() != -1) {
          label_005a :
             a.m(jsonObject);
             this.a(jsonObject, p1);
          }else if(PatchProxy.applyVoid(null, this, pageInfoRequ, "9")){
             PageInfoRequestFunc ta = this.a;
             if (ta != null) {
                ta.dispose();
             }
             LoadingViewModel.i.a(this.c).t0().a();
          }
       }else {
          goto label_005a ;
       }
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, PageInfoRequestFunc.class, "11")) {
          return;
       }
       a.a(this);
       PageInfoRequestFunc ta = this.a;
       if (ta != null) {
          ta.dispose();
       }
       return;
    }
}
