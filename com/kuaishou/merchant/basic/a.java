package com.kuaishou.merchant.basic.a;
import com.kwai.yoda.function.c;
import com.kuaishou.merchant.basic.MerchantYodaWebViewFragment;
import java.lang.ref.WeakReference;
import java.lang.Object;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import org.json.JSONObject;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import java.lang.Number;

public class a extends c	// class@0015a4
{
    public WeakReference f;
    public static int g = 255;
    public static int h = 1;
    public static int i;

    public void a(MerchantYodaWebViewFragment p0){
       super();
       this.f = new WeakReference(p0);
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       String str;
       JSONObject obj;
       int i2;
       int g;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }
       MerchantYodaWebViewFragment merchantYoda = this.f.get();
       if (merchantYoda == null) {
          return;
       }else if(TextUtils.x(p3)){
          this.o(p0, p1, p2, -1, "jsonParam is empty", p4);
          return;
       }else {
          JSONObject jSONObject = PatchProxy.applyOneRefs(p3, this, uoa, "4");
          if (jSONObject != patchProxyRe) {
          }else {
             try{
                jSONObject = new JSONObject(p3);
             }catch(java.lang.Exception e0){
                a.l(MerchantCommonLogBiz.WEBVIEW, "ScrollEnableFunction", "ScrollEnableFunction", e0);
                jSONObject = null;
             }
          }
       }
    }
}
