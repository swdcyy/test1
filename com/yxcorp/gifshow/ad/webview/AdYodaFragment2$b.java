package com.yxcorp.gifshow.ad.webview.AdYodaFragment2$b;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment2;
import java.lang.Object;
import uxc.f;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.yxcorp.gifshow.ad.webview.l;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.yxcorp.gifshow.commercial.api.web.AdYodaConfig;
import tw.i;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k59.j2;

public class AdYodaFragment2$b implements WebViewFragment$a	// class@00189f
{
    public final AdYodaFragment2 a;

    public void AdYodaFragment2$b(AdYodaFragment2 p0){
       this.a = p0;
       super();
    }
    public void a(){
       f.c(this);
    }
    public void b(WebView p0,String p1,boolean p2){
       if (PatchProxy.isSupport(AdYodaFragment2$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, AdYodaFragment2$b.class, "4")) {
          return;
       }
       if (!this.a.q.v()) {
          KwaiYodaWebViewFragment r = this.a.r;
          if (r != null && r.canGoBack()) {
             this.a.q.x(true);
          }
       }
       return;
    }
    public void c(WebView p0,int p1,String p2,String p3){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdYodaFragment2$b uob = AdYodaFragment2$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, AdYodaFragment2$b.class, "1")) {
          return;
       }
       AdYodaFragment2$b ta = this.a;
       AdYodaFragment2 j = ta.J;
       if (j != null && j.mIsPreload == null) {
          ta.Oh();
       }
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p3, this, AdYodaFragment2$b.class, "2");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
          label_0048 :
             b = false;
             if (p3 != null && (i.d(p1) && (p0 instanceof KwaiYodaWebView && TextUtils.n(p0.getCurrentUrl(), p3)))) {
                b = true;
             }
          }
       }else {
          goto label_0048 ;
       }
       if (b) {
          String str = PatchProxy.applyOneRefs(p3, this, uob, "3");
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
       if (PatchProxy.isSupport(AdYodaFragment2$b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, AdYodaFragment2$b.class, "5")) {
          return;
       }
       this.a.I.g(p1);
       return;
    }
}
