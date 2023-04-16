package com.yxcorp.gifshow.init.module.WebViewSpeedUpInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c76.b;
import b76.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.p;
import brd.t;
import t45.d;
import brd.z;
import sxa.p0;
import erd.g;
import crd.b;
import qe6.b;
import com.yxcorp.utility.SystemUtil;
import android.os.Build$VERSION;
import com.yxcorp.gifshow.init.module.e1;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public class WebViewSpeedUpInitModule extends TTIInitModule	// class@0019ae
{
    public static final int q;

    public void WebViewSpeedUpInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public boolean H7(){
       Object obj = PatchProxy.applyWithListener(null, this, WebViewSpeedUpInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(WebViewSpeedUpInitModule.class, "3");
       return (b.b() ^ 0x01);
    }
    public int f0(){
       return 9;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, WebViewSpeedUpInitModule.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidWithListener(null, this, WebViewSpeedUpInitModule.class, "2")) {
          RxBus.f.f(p.class).observeOn(d.a).subscribe(new p0(this));
          if (b.a()) {
             this.n0();
          }
          PatchProxy.onMethodExit(WebViewSpeedUpInitModule.class, "2");
       }
       PatchProxy.onMethodExit(WebViewSpeedUpInitModule.class, "1");
       return;
    }
    public final void n0(){
       if (PatchProxy.applyVoidWithListener(null, this, WebViewSpeedUpInitModule.class, "4")) {
          return;
       }
       if (Build$VERSION.SDK_INT == 23) {
          e.g(e1.b, "WebViewSpeedUpInitModule");
       }
       PatchProxy.onMethodExit(WebViewSpeedUpInitModule.class, "4");
       return;
    }
}
