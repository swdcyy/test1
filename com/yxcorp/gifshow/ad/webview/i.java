package com.yxcorp.gifshow.ad.webview.i;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.ad.webview.j;
import java.lang.Object;
import uxc.f;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import k59.q0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.ad.webview.l;
import java.lang.Integer;
import k59.r0;
import msd.a;
import k59.e2;

public class i implements WebViewFragment$a	// class@0018c7
{
    public final j a;

    public void i(j p0){
       this.a = p0;
       super();
    }
    public void a(){
       f.c(this);
    }
    public void b(WebView p0,String p1,boolean p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, i.class, "2")) {
          return;
       }
       this.a.S8();
       j y = this.a.y;
       if (y != null) {
          y.w(new q0(this));
       }
       return;
    }
    public void c(WebView p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, i.class, "1")) {
          return;
       }
       i ta = this.a;
       if (ta.v != null) {
          ta.q.m(new r0(this));
       }
       return;
    }
    public void d(WebView p0,int p1){
       f.d(this, p0, p1);
    }
}
