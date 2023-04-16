package com.yxcorp.gateway.pay.webview.yoda.b$j;
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

public class b$j extends p0	// class@0012b9
{
    public final b g;

    public void b$j(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$j.class, "1")) {
       }else {
          g.d("bridge: popBack");
          if (b.a(this.g).canGoBack()) {
             b.a(this.g).goBack();
          }else {
             this.g.a.finish();
          }
       }
       return;
    }
}
