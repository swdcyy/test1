package ch2.a;
import k51.c;
import ch2.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw1.g;
import uw1.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import p91.m;
import ch2.n;

public class a extends c	// class@000532
{
    public m p;
    public m q;
    public n r;
    public g s;
    public static String sLivePresenterClassName = "LiveKrnRedPacketContainerDelegatePresenter";

    public void a(){
       super();
       this.s = new a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a tq = this.q;
       if (tq != null) {
          tq.A2(this.s);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tq = this.q;
       if (tq != null) {
          tq.I2(this.s);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.s8(m.class);
       this.r = this.q8(n.class);
       return;
    }
}
