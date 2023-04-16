package c59.c;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import a59.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import z49.b;
import a59.c;
import z49.b0;
import z49.n0;
import z49.v;
import z49.u;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterLiveReserveStatusBridge;
import z49.r;
import z49.v0;
import z49.m;
import z49.f;
import z49.x;
import z49.h0;
import z49.q;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.MeasureTextWidthBridge;
import z49.o;
import z49.n;
import z49.t0;
import z49.y;
import z49.g;
import z49.u0;
import z49.c0;
import z49.i0;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.ShowDialogBridge;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.CallAdBridge;
import z49.j;
import z49.p0;
import z49.e;
import c59.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import z49.d;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterProgressListenerBridge;
import z49.h;
import z49.w;

public final class c extends TkBridgeGroup	// class@0004e3
{

    public void c(f p0){
       a.p(p0, "tkBridgeContext");
       super();
       this.i(new b(p0));
       this.i(new b0(p0));
       this.i(new n0(p0));
       this.i(new v(p0));
       this.i(new u(p0));
       this.i(new RegisterLiveReserveStatusBridge(p0));
       this.i(new r(p0));
       this.i(new v0());
       this.i(new m(p0));
       this.i(new f(p0));
       this.i(new x(p0));
       this.i(new h0(p0));
       this.i(new q(p0));
       this.i(new MeasureTextWidthBridge());
       this.i(new o(p0));
       this.i(new n());
       this.i(new t0(p0));
       this.i(new y(p0));
       this.i(new g(p0));
       this.i(new u0(p0));
       this.i(new c0());
       this.i(new i0(p0));
       this.i(new ShowDialogBridge(p0));
       this.i(new CallAdBridge(p0));
       this.i(new j(p0));
       this.i(new p0(p0));
       this.i(new e(p0));
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(this, p0, obj, d.class, "1")) {
       }else if(PatchProxy.applyVoidTwoRefs(this, p0, obj, d.class, "1")){
          a.p(this, "adPageBridgeGroup");
          a.p(p0, "tkBridgeContext");
          this.i(new RegisterProgressListenerBridge(p0));
          this.i(new h(p0));
          this.i(new w(p0));
       }
       a.p(this, "adPageBridgeGroup");
       a.p(p0, "tkBridgeContext");
       return;
    }
}
