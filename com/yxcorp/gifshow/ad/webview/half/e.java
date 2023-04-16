package com.yxcorp.gifshow.ad.webview.half.e;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.ad.webview.half.AdHalfWebFragmentV2;
import java.lang.Object;
import uxc.f;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.ad.webview.half.AdHalfWebFragment$a;
import n59.s;
import msd.a;
import k59.e2;

public class e implements WebViewFragment$a	// class@0018c6
{
    public final AdHalfWebFragmentV2 a;

    public void e(AdHalfWebFragmentV2 p0){
       this.a = p0;
       super();
    }
    public void a(){
       f.c(this);
    }
    public void b(WebView p0,String p1,boolean p2){
       f.b(this, p0, p1, p2);
    }
    public void c(WebView p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, e.class, "1")) {
          return;
       }
       e ta = this.a;
       if (ta.H.h != null) {
          ta.I.m(new s(this));
       }
       return;
    }
    public void d(WebView p0,int p1){
       f.d(this, p0, p1);
    }
}
