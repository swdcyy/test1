package com.yxcorp.gifshow.webview.bridge.a$l;
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
import av5.d;
import f55.c;
import com.kwai.bridge.a;
import java.util.Objects;
import com.yxcorp.gifshow.webview.bridge.c;
import f55.g;

public class a$l extends z	// class@001718
{
    public final a k;

    public void a$l(a p0,Activity p1,WebView p2){
       this.k = p0;
       super(p1, p2);
    }
    public void i(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$l.class, "1")) {
       }else {
          d uod = a.c(d.class);
          Objects.requireNonNull(uod);
          uod.i4(this.k.a, new c(this, p0));
       }
       return;
    }
}
