package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterStrongStyleActionbarListenerBridge;
import a59.e;
import a59.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import org.json.JSONObject;
import a59.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.util.rx.RxBus;
import a59.g;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterStrongStyleActionbarListenerBridge$onPageShow$1;
import z49.g0;
import msd.l;
import erd.g;

public final class RegisterStrongStyleActionbarListenerBridge extends e	// class@001820
{
    public a b;
    public b c;
    public f d;

    public void RegisterStrongStyleActionbarListenerBridge(f p0){
       a.p(p0, "mTkBridgeContext");
       super();
       this.d = p0;
    }
    public String a(){
       return "registerLoadStrongStyleAdBarListener";
    }
    public Object c(JSONObject p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RegisterStrongStyleActionbarListenerBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       this.b = p1;
       return this.e();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, RegisterStrongStyleActionbarListenerBridge.class, "3")) {
          return;
       }
       b9.a(this.c);
       this.c = null;
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, RegisterStrongStyleActionbarListenerBridge.class, "2")) {
          return;
       }
       if (this.c == null) {
          this.c = RxBus.f.f(g.class).observeOn(d.a).subscribe(new g0(new RegisterStrongStyleActionbarListenerBridge$onPageShow$1(this)));
       }
       return;
    }
}
