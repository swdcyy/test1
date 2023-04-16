package com.yxcorp.gifshow.webview.bridge.a$d;
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
import com.yxcorp.gifshow.webview.jsmodel.component.JsLocationResult$JsLocationData;
import vxc.q;
import java.util.concurrent.Callable;
import brd.t;
import android.content.Context;
import lnc.w5;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import vxc.p;
import vxc.o;
import erd.g;
import crd.b;

public class a$d extends z	// class@001710
{
    public final a k;

    public void a$d(a p0,Activity p1,WebView p2){
       this.k = p0;
       super(p1, p2);
    }
    public void i(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
       }else if(p0 == null || p0.mCallback == null){
          JsLocationResult$JsLocationData jsLocationDa = new JsLocationResult$JsLocationData();
          t ot = t.fromCallable(new q(this));
          long l = (w5.a(this.k.a))? 1000: 0;
          ot.delay(l, TimeUnit.MILLISECONDS).subscribeOn(d.c).observeOn(d.a).subscribe(new p(this, p0, jsLocationDa), new o(this, p0, jsLocationDa));
       }
       return;
    }
}
