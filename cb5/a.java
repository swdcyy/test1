package cb5.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import cb5.a$a;
import nsd.u;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.t;
import cb5.a$b;
import erd.g;
import crd.b;
import lnc.u1;
import m56.g;
import java.util.concurrent.TimeUnit;

public abstract class a extends PresenterV2	// class@000440
{
    public final FragmentCompositeLifecycleState p;
    public static boolean q;
    public static final a$a r;

    static {
       a.r = new a$a(null);
    }
    public void a(FragmentCompositeLifecycleState p0){
       a.p(p0, "lifecycleState");
       super();
       this.p = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.X7(this.p.g().subscribe(new a$b(this)));
       u1.a(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       u1.b(this);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       if (this.p.a() && a.q) {
          this.R8();
          a.q = false;
       }
       return;
    }
    public abstract void R8();
    public final void onForeground(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "foregroundEvent");
       boolean b = (p0.a() - TimeUnit.SECONDS.toMillis(120) >= 0)? true: false;
       a.q = b;
       this.P8();
       return;
    }
}
