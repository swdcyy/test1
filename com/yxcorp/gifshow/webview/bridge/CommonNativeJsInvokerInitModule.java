package com.yxcorp.gifshow.webview.bridge.CommonNativeJsInvokerInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import e06.b;
import brd.t;
import t45.d;
import brd.z;
import vxc.d;
import erd.g;
import crd.b;
import com.kwai.feature.component.screenshot.ScreenshotUserEvent;
import vxc.c;

public class CommonNativeJsInvokerInitModule extends TTIInitModule	// class@001700
{
    public static final int q;

    public void CommonNativeJsInvokerInitModule(){
       super();
    }
    public int f0(){
       return 20;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonNativeJsInvokerInitModule.class, "1")) {
          return;
       }
       RxBus f = RxBus.f;
       z a = d.a;
       f.f(b.class).observeOn(a).subscribe(new d(this));
       f.f(ScreenshotUserEvent.class).observeOn(a).subscribe(new c(this));
       return;
    }
}
