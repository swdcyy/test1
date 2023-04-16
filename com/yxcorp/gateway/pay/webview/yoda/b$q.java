package com.yxcorp.gateway.pay.webview.yoda.b$q;
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

public class b$q extends p0	// class@0012c0
{
    public final b g;

    public void b$q(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$q.class, "1")) {
       }else {
          g.f(p0.pageName, "H5", p0.params);
       }
       return;
    }
}
