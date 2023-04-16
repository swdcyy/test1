package com.yxcorp.gifshow.ad.tachikoma.bridge.follow.RegisterFollowListenerBridge;
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
import wca.n;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.ad.tachikoma.bridge.follow.RegisterFollowListenerBridge$onPageShow$1;
import b59.e;
import msd.l;
import erd.g;

public final class RegisterFollowListenerBridge extends e	// class@00182c
{
    public a b;
    public b c;
    public f d;

    public void RegisterFollowListenerBridge(f p0){
       a.p(p0, "mTkBridgeContext");
       super();
       this.d = p0;
    }
    public String a(){
       return "registerFollowStatusListener";
    }
    public Object c(JSONObject p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RegisterFollowListenerBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       this.b = p1;
       return this.e();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, RegisterFollowListenerBridge.class, "3")) {
          return;
       }
       b9.a(this.c);
       this.c = null;
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, RegisterFollowListenerBridge.class, "2")) {
          return;
       }
       if (this.c == null) {
          this.c = RxBus.f.f(n.class).observeOn(d.a).subscribe(new e(new RegisterFollowListenerBridge$onPageShow$1(this)));
       }
       return;
    }
}
