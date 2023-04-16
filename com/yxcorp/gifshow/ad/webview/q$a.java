package com.yxcorp.gifshow.ad.webview.q$a;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.ad.webview.q;
import java.lang.Object;
import uxc.f;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.view.View;
import android.widget.RelativeLayout;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;

public class q$a implements WebViewFragment$a	// class@001914
{
    public final q a;

    public void q$a(q p0){
       this.a = p0;
       super();
    }
    public void a(){
       f.c(this);
    }
    public void b(WebView p0,String p1,boolean p2){
       if (PatchProxy.isSupport(q$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, q$a.class, "1")) {
          return;
       }
       View view = this.a.p.findViewById(R.id.right_btn);
       if (view == null) {
          return;
       }
       if (!p2 && !p0.C(a.a().a())) {
          view.setVisibility(8);
       }else {
          view.setVisibility(0);
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
