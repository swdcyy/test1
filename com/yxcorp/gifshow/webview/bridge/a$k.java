package com.yxcorp.gifshow.webview.bridge.a$k;
import vxc.z;
import com.yxcorp.gifshow.webview.bridge.a;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.kwai.feature.api.social.bridge.beans.JsEncryptedNameParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import av5.d;
import f55.c;
import com.kwai.bridge.a;
import java.util.Objects;
import com.yxcorp.gifshow.webview.bridge.b;
import f55.g;

public class a$k extends z	// class@001717
{
    public final a k;

    public void a$k(a p0,Activity p1,WebView p2){
       this.k = p0;
       super(p1, p2);
    }
    public void i(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$k.class, "1")) {
       }else {
          d uod = a.c(d.class);
          Objects.requireNonNull(uod);
          uod.S8(this.k.a, p0, new b(this, p0));
       }
       return;
    }
}
