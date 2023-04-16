package com.yxcorp.gifshow.ad.webview.jshandler.d;
import java.lang.Object;
import com.yxcorp.gifshow.ad.webview.jsbridge.g;
import p59.t;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import u59.g;
import zl9.b;
import p59.b;
import com.yxcorp.gifshow.ad.webview.jshandler.e;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.webview.jshandler.e$a;
import com.yxcorp.gifshow.ad.webview.jshandler.c;
import com.yxcorp.gifshow.ad.webview.jshandler.GetDataHandler;
import u59.h;
import u59.l;
import u59.i;
import u59.m;
import com.yxcorp.gifshow.ad.webview.jshandler.b;
import okd.b;
import p59.r;
import p59.p;
import u59.b;
import p59.a;
import p59.i;
import com.yxcorp.gifshow.ad.webview.jshandler.a;
import com.yxcorp.gifshow.ad.webview.jshandler.RegisterWebViewDidShowHandler;
import p59.c;
import com.yxcorp.gifshow.ad.webview.jshandler.AdReserveAppHandler;
import p59.o;
import p59.m;
import java.util.HashMap;
import com.yxcorp.gifshow.ad.webview.jshandler.AdNeoH5VideoActionHandler;
import p59.g;
import java.util.Map;
import com.yxcorp.gifshow.ad.webview.jshandler.AdNeoH5VideoReportHandler;
import o59.d0;
import com.kuaishou.webkit.WebView;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;
import tw.j;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.util.LruCache;

public class d	// class@0018fa
{

    public void d(){
       super();
    }
    public static void a(g p0,t p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, d.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, d.class, "2")) {
          p0.f(new g());
          p0.f(new b(p1));
          c uoc = PatchProxy.apply(null, null, d.class, "5");
          if (uoc != PatchProxyResult.class) {
          }else {
             uoc = new c();
          }
          p0.f(new e(p1, uoc));
          p0.f(new GetDataHandler(p1));
          p0.f(new h());
          p0.f(new l());
          p0.f(new i(p1));
          p0.f(new m(p1));
          p0.f(new b(p1));
          int i = 1;
          b.a(-2092865639).a(i, p0, p1, p2);
          p0.f(new p(p1));
          p0.f(new b(p1));
          p0.f(new a(p1));
          p0.f(new i(p1));
          p0.f(new a(p1));
          p0.g(new RegisterWebViewDidShowHandler(p1), i);
          p0.f(new c(p1));
          p0.f(new AdReserveAppHandler(p1));
          p0.f(new o());
          p0.f(new m(p1));
          b.a(-2092865639).a(2, p0, p1, p2);
          HashMap hashMap = new HashMap();
          p0.f(new AdNeoH5VideoActionHandler(p1, hashMap));
          p0.f(new g(hashMap));
          p0.f(new AdNeoH5VideoReportHandler(hashMap));
       }
       p0 = p0.b;
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, d.class, "3") && p0 != null) {
          d0 uod0 = new d0(p0, p1.a, p1);
          p0.addJavascriptInterface(uod0, "KwaiAdThird");
          if (!PatchProxy.applyVoidThreeRefs(uod0, p1, p2, null, d.class, "4") && j.H(p1.d)) {
             if (!TextUtils.x(p2)) {
                p1.h.put("ksAdXpathUrl", p2);
             }
             uod0.i(new m(p1));
             uod0.i(new i(p1));
          }
          uod0.i(new m(p1));
       }
       return;
    }
}
