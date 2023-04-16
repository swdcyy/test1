package com.yxcorp.gifshow.ad.webview.AdYodaActivity$a;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.ad.webview.AdYodaActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r59.d;
import com.kuaishou.webkit.WebView;
import uxc.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Boolean;
import tw.i;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k59.j2;

public class AdYodaActivity$a implements WebViewFragment$a	// class@001897
{
    public final AdYodaActivity a;

    public void AdYodaActivity$a(AdYodaActivity p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, AdYodaActivity$a.class, "5")) {
          return;
       }
       AdYodaActivity r = this.a.R;
       if (r != null) {
          r.a();
       }
       return;
    }
    public void b(WebView p0,String p1,boolean p2){
       f.b(this, p0, p1, p2);
    }
    public void c(WebView p0,int p1,String p2,String p3){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdYodaActivity$a uoa = AdYodaActivity$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, AdYodaActivity$a.class, "1")) {
          return;
       }
       this.a.N3();
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p3, this, AdYodaActivity$a.class, "2");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
          label_0040 :
             b = false;
             if (p3 != null && (i.d(p1) && (p0 instanceof KwaiYodaWebView && TextUtils.n(p0.getCurrentUrl(), p3)))) {
                b = true;
             }
          }
       }else {
          goto label_0040 ;
       }
       if (b) {
          String str = PatchProxy.applyOneRefs(p3, this, uoa, "3");
          if (str != patchProxyRe) {
          }else {
             String str1 = "https://activity.e.kuaishou.com/pages/report?layoutType=4";
             str = (p3.startsWith(str1) && i.f(str1))? i.a(str1): "";
          }
          if (!TextUtils.x(str)) {
             p0.loadUrl(str);
             i.e("commercial_h5_host_fail", p1, p2, p3);
          }
       }
       return;
    }
    public void d(WebView p0,int p1){
       AdYodaActivity$a uoa = AdYodaActivity$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4")) {
          return;
       }
       AdYodaActivity q = this.a.Q;
       if (q != null) {
          q.g(p1);
       }
       q = this.a.R;
       if (q != null) {
          q.d(p0, p1);
       }
       return;
    }
}
