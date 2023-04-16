package com.yxcorp.gifshow.ad.webview.o$a;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.ad.webview.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r59.d;
import com.kuaishou.webkit.WebView;
import uxc.f;
import java.lang.Integer;

public class o$a implements WebViewFragment$a	// class@00190f
{
    public final o a;

    public void o$a(o p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, o$a.class, "2")) {
          return;
       }
       o d = this.a.d;
       if (d != null) {
          d.a();
       }
       return;
    }
    public void b(WebView p0,String p1,boolean p2){
       f.b(this, p0, p1, p2);
    }
    public void c(WebView p0,int p1,String p2,String p3){
       f.a(this, p0, p1, p2, p3);
    }
    public void d(WebView p0,int p1){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       o d = this.a.d;
       if (d != null) {
          d.d(p0, p1);
       }
       return;
    }
}
