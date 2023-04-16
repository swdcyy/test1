package com.yxcorp.gifshow.ad.webview.AdYodaFragment$b;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment;
import java.lang.Object;
import uxc.f;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.yxcorp.gifshow.ad.webview.l;

public class AdYodaFragment$b implements WebViewFragment$a	// class@00189b
{
    public final AdYodaFragment a;

    public void AdYodaFragment$b(AdYodaFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       f.c(this);
    }
    public void b(WebView p0,String p1,boolean p2){
       if (PatchProxy.isSupport(AdYodaFragment$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, AdYodaFragment$b.class, "1")) {
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
       f.a(this, p0, p1, p2, p3);
    }
    public void d(WebView p0,int p1){
       f.d(this, p0, p1);
    }
}
