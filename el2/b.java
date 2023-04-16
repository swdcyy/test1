package el2.b;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState;
import el2.a;
import lf3.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.a0;
import t02.r1;
import lp3.i;

public class b extends c	// class@002784
{
    public m p;
    public a0 q;
    public r1 r;
    public i s;
    public static String sLivePresenterClassName = "LiveSpecialAccountSwitchConfigPresenter";

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.p.u().u0(645, LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState.class, new a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.s8(a0.class);
       this.r = this.s8(r1.class);
       this.s = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
}
