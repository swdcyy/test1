package com.yxcorp.gifshow.ad.util.k;
import java.lang.Object;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.webview.helper.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.net.Uri;
import ekd.x0;
import g59.o;
import com.kwai.framework.model.feed.BaseFeed;
import android.app.Activity;
import java.lang.Integer;
import java.lang.Boolean;
import mxb.j0;
import mxb.i0;
import g59.l0;
import erd.g;
import wkd.b;
import nf6.i;
import android.content.Context;
import android.content.Intent;
import g59.m0;
import com.kuaishou.webkit.URLUtil;
import k59.b2;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.c;

public class k	// class@00188c
{

    public void k(){
       super();
    }
    public static void a(WebView p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, k.class, "2")) {
          return;
       }
       if (!TextUtils.x(p1)) {
          e.a(p0, p1, "callappResult"+p2);
       }
       return;
    }
    public static int b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.x(p0)) {
          return 0;
       }
       Uri uri = x0.f(p0);
       if (uri == null) {
          return 0;
       }
       uri = x0.a(uri, "layoutType");
       if (TextUtils.x(uri)) {
          return 0;
       }
       return o.a(uri, 0);
    }
    public static boolean c(BaseFeed p0,Activity p1,WebView p2,String p3,int p4,int p5,boolean p6){
       String obj1;
       String str1;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       int i = p4;
       int i1 = p5;
       k ok = k.class;
       String obj = null;
       int i2 = 4;
       int i3 = 3;
       int i4 = 2;
       int i5 = 0;
       if (PatchProxy.isSupport(ok)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,Integer.valueOf(p4),Integer.valueOf(p5),Boolean.valueOf(p6)};
          obj1 = PatchProxy.apply(objArray, obj, ok, "1");
          if (obj1 != PatchProxyResult.class) {
             return obj1.booleanValue();
          }
       }
       if (oobject3 != null && oobject3.startsWith("ks://")) {
          Uri uri = x0.f(p3);
          obj1 = x0.a(uri, "h5link");
          obj = x0.a(uri, "deeplink");
          String str = x0.a(uri, "callback");
          if (!TextUtils.x(obj)) {
             i2 = 58;
             if (obj.indexOf(i2) >= 0 && obj.indexOf(i2) <= obj.length()) {
                str1 = obj.substring(i5, obj.indexOf(i2));
             label_008d :
                if (oobject != null) {
                   i0.a().e(385, oobject).q("deeplink", obj).d(new l0(str1, i1, i)).a();
                }
                if (!TextUtils.x(obj)) {
                   Intent intent = b.a(0x66dce92a).c(oobject1, x0.f(obj), 1, 1);
                   if (intent != null) {
                      k.a(oobject2, str, "true");
                      if (oobject != null) {
                         i0.a().e(386, oobject).q("deeplink", obj).d(new m0(str1, obj, i1, i)).a();
                      }
                      intent.addFlags(0x10000000);
                      oobject1.startActivity(intent);
                      return 1;
                   }
                }
                k.a(oobject2, str, "false");
                if (!TextUtils.x(obj1) && URLUtil.isNetworkUrl(obj1)) {
                   if (p6) {
                      if (PatchProxy.isSupport(ok)) {
                         Object[] objArray1 = new Object[]{oobject,oobject1,oobject2,obj1,Integer.valueOf(p4)};
                         if (!PatchProxy.applyVoid(objArray1, null, ok, "3")) {
                         }
                      }else if(oobject2 != null && !TextUtils.x(p2.getUrl())){
                         i5 = 1;
                      }
                      b2 uob2 = new b2(oobject1, obj1);
                      uob2.k = i;
                      if (i5) {
                         uob2.m = p2.getUrl();
                      }
                      uob2.g(oobject);
                      c.i(oobject1, uob2.a());
                   }else {
                      oobject2.loadUrl(obj1);
                   }
                }
                return 1;
             }
          }
          str1 = "";
          goto label_008d ;
       }else {
          return i5;
       }
    }
}
