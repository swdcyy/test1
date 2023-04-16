package com.kuaishou.merchant.web.bridge.EditAddressFunction;
import com.kwai.yoda.function.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.ref.WeakReference;
import java.lang.Object;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.web.bridge.EditAddressFunction$JsEditAddressParam;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import com.kuaishou.merchant.web.bridge.EditAddressFunction$a;
import la4.b;
import crd.b;
import la4.l;
import com.kuaishou.merchant.web.bridge.b;
import com.kuaishou.merchant.web.bridge.a;
import n3d.a;
import zm4.a;

public class EditAddressFunction extends c	// class@0009d2
{
    public WeakReference f;
    public static final int g;

    public void EditAddressFunction(GifshowActivity p0){
       super();
       this.f = new WeakReference(p0);
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       EditAddressFunction$a uoa;
       b uob;
       a uoa1;
       EditAddressFunction uEditAddress = this;
       object oobject = p0;
       object oobject1 = p3;
       int i = 2;
       int i1 = 5;
       int i2 = 4;
       int i3 = 3;
       int i4 = 0;
       if (PatchProxy.isSupport(EditAddressFunction.class)) {
          Object[] objArray = new Object[i1];
          objArray[i4] = oobject;
          objArray[1] = p1;
          objArray[i] = p2;
          objArray[i3] = oobject1;
          objArray[i2] = p4;
          if (PatchProxy.applyVoid(objArray, this, EditAddressFunction.class, "2")) {
             return;
          }
       }
       Object obj = uEditAddress.f.get();
       if (obj == null || obj.isFinishing()) {
          this.o(p0, p1, p2, 0x1e84a, "current page is finished", p4);
          return;
       }else if(TextUtils.x(p3)){
          this.o(p0, p1, p2, -1, "jsonParam is empty", p4);
          return;
       }else {
          EditAddressFunction$JsEditAddressParam obj1 = PatchProxy.applyOneRefs(oobject1, this, EditAddressFunction.class, "3");
          EditAddressFunction$JsEditAddressParam jsEditAddres = (obj1 != PatchProxyResult.class)? obj1: a.a.h(oobject1, EditAddressFunction$JsEditAddressParam.class);
       }
    }
    public a s(YodaBaseWebView p0,String p1,String p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, EditAddressFunction.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a uoa = new a(this, p0, p1, p2, p3);
       return obj;
    }
}
