package com.yxcorp.gifshow.ad.webview.e;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.ad.webview.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r59.d;
import com.kuaishou.webkit.WebView;
import java.lang.Boolean;
import k59.e0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.ad.webview.l;
import java.lang.Integer;
import k59.f0;
import msd.a;
import k59.e2;
import k59.j2;

public class e implements WebViewFragment$a	// class@0018ba
{
    public final f a;

    public void e(f p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       f d = this.a.D;
       if (d != null) {
          d.a();
       }
       return;
    }
    public void b(WebView p0,String p1,boolean p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, e.class, "4")) {
          return;
       }
       this.a.Z8();
       f w = this.a.w;
       if (w != null) {
          w.w(new e0(this));
       }
       return;
    }
    public void c(WebView p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, e.class, "1")) {
          return;
       }
       this.a.q.m(new f0(this));
       return;
    }
    public void d(WebView p0,int p1){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, e.class, "2")) {
          return;
       }
       f a = this.a.A;
       if (a != null) {
          a.g(p1);
       }
       return;
    }
}
