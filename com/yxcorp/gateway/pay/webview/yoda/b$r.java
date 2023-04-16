package com.yxcorp.gateway.pay.webview.yoda.b$r;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.TaskEventParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lv8.g;

public class b$r extends p0	// class@0012c1
{
    public final b g;

    public void b$r(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$r.class, "1")) {
       }else {
          g.g(p0.actionName, p0.params, null, p0.pageName);
       }
       return;
    }
}
