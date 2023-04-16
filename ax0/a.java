package ax0.a;
import c12.f;
import ax0.a$a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import mb1.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import hf3.a;
import t02.a0;
import brd.t;
import ry1.b;
import ax0.a$b;
import erd.g;
import crd.b;

public final class a extends f	// class@0002c2
{
    public a K;
    public a0 L;
    public a M;
    public static final a$a N;
    public static String sLivePresenterClassName;

    static {
       a.N = new a$a(null);
    }
    public void a(){
       super();
    }
    public void Q(boolean p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, a.class, "3")) {
          return;
       }
       a tM = this.M;
       if (tM != null) {
          tM.b();
       }
       this.M = null;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.j8();
       Object obj = this.r8("LIVE_LONG_CONNECTION");
       a.o(obj, "inject\(LiveAccessIds.LIVE_LONG_CONNECTION\)");
       this.K = obj;
       obj = this.q8(a0.class);
       a.o(obj, "inject\(LivePlayCallerContext::class.java\)");
       this.L = obj;
       return;
    }
    public void x(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       a tL = this.L;
       if (tL == null) {
          a.S("livePlayCallerContext");
       }
       this.X7(tL.b3.T3().subscribe(new a$b(this)));
       return;
    }
}
