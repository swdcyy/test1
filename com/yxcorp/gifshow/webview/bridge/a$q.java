package com.yxcorp.gifshow.webview.bridge.a$q;
import vxc.z;
import com.yxcorp.gifshow.webview.bridge.a;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.jsmodel.JsCallbackParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import kka.h;
import com.kuaishou.gifshow.network.degrade.RequestTiming;

public class a$q extends z	// class@00171d
{
    public final a k;

    public void a$q(a p0,Activity p1,WebView p2){
       this.k = p0;
       super(p1, p2);
    }
    public void i(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$q.class, "1")) {
       }else {
          b.a(-1592356291).k(RequestTiming.DEFAULT);
       }
       return;
    }
}
