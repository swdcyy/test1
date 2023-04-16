package eh2.a;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tw1.f;
import hf3.a;
import java.util.Objects;
import wkd.b;
import com.kwai.framework.network.sntp.a;
import java.lang.Long;
import crd.b;
import lnc.b9;
import brd.a0;
import va1.q0;
import com.kuaishou.live.common.core.component.redpacket.c;
import com.kuaishou.live.common.core.component.redpacket.b;
import erd.g;
import tw1.e;
import lf3.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class a extends c	// class@002725
{
    public a p;
    public f q;
    public static String sLivePresenterClassName = "LiveNormalRedPacketPresenter";

    public void a(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, a.class, str)) {
          return;
       }
       f uof = new f(this.p);
       this.q = uof;
       Objects.requireNonNull(uof);
       f uof1 = f.class;
       if (!PatchProxy.applyVoid(objArray, uof, uof1, "1")) {
          Long longx = b.a(0x3b1f7b44).b();
          if (longx == null) {
             if (!PatchProxy.applyVoid(objArray, uof, uof1, str)) {
                b9.a(uof.d);
                uof.d = q0.a().R(c.b, b.b);
             }
          }else {
             f.e = longx.longValue();
          }
          e uoe = new e(uof);
          uof.c = uoe;
          uof.a.B0(uoe);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tq = this.q;
       if (tq != null) {
          Objects.requireNonNull(tq);
          if (!PatchProxy.applyVoid(null, tq, f.class, "7")) {
             tq.a.F0(tq.c);
             tq.c = null;
             b9.a(tq.d);
          }
          this.q = null;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_LONG_CONNECTION");
       return;
    }
}
