package com.yxcorp.gateway.pay.webview.yoda.b$l;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lv8.g;

public class b$l extends p0	// class@0012bb
{
    public final b g;

    public void b$l(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$l.class, "1")) {
       }else {
          g.d("bridge: exitWebView");
          this.g.a.finish();
       }
       return;
    }
}
