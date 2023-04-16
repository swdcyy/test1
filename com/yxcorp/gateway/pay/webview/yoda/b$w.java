package com.yxcorp.gateway.pay.webview.yoda.b$w;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsPageTitleParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lv8.g;
import lv8.l;

public class b$w extends p0	// class@0012c6
{
    public final b g;

    public void b$w(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$w.class, "1")) {
       }else {
          g.d("bridge: setPageTitle");
          this.g.c.setText(R.id.pay_title_tv, p0.mTitle);
       }
       return;
    }
}
