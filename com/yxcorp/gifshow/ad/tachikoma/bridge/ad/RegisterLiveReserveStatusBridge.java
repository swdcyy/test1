package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterLiveReserveStatusBridge;
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
import wl9.b;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterLiveReserveStatusBridge$onPageShow$1;
import z49.a0;
import msd.l;
import erd.g;

public final class RegisterLiveReserveStatusBridge extends e	// class@001819
{
    public a b;
    public b c;
    public f d;

    public void RegisterLiveReserveStatusBridge(f p0){
       a.p(p0, "mTkBridgeContext");
       super();
       this.d = p0;
    }
    public String a(){
       return "registerLiveReserveStatusListener";
    }
    public Object c(JSONObject p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RegisterLiveReserveStatusBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       this.b = p1;
       return this.e();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, RegisterLiveReserveStatusBridge.class, "3")) {
          return;
       }
       b9.a(this.c);
       this.c = null;
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, RegisterLiveReserveStatusBridge.class, "2")) {
          return;
       }
       if (this.c == null) {
          this.c = RxBus.f.f(b.class).observeOn(d.a).subscribe(new a0(new RegisterLiveReserveStatusBridge$onPageShow$1(this)));
       }
       return;
    }
}
