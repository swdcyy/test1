package com.yxcorp.gifshow.ad.webview.half.b;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.ad.webview.half.AdHalfWebFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r59.d;
import com.kuaishou.webkit.WebView;
import uxc.f;
import java.lang.Integer;
import n59.k;
import msd.a;
import k59.e2;
import k59.j2;

public class b implements WebViewFragment$a	// class@0018c3
{
    public final AdHalfWebFragment a;

    public void b(AdHalfWebFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       AdHalfWebFragment r = this.a.R;
       if (r != null) {
          r.a();
       }
       return;
    }
    public void b(WebView p0,String p1,boolean p2){
       f.b(this, p0, p1, p2);
    }
    public void c(WebView p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, b.class, "2")) {
          return;
       }
       this.a.N.m(new k(this));
       return;
    }
    public void d(WebView p0,int p1){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, b.class, "1")) {
          return;
       }
       AdHalfWebFragment k = this.a.K;
       if (k != null) {
          k.g(p1);
       }
       return;
    }
}
