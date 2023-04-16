package bta.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import xq6.a;
import bta.a$b;
import wq6.h;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import bo5.a;
import java.util.List;
import zq6.b;
import wq6.f;
import bta.a$a;
import zq6.i;
import zq6.s;
import xq6.b;

public final class a extends PresenterV2	// class@000464
{
    public final a p;
    public h q;
    public f r;
    public PagerSlidingTabStrip$d s;
    public final a$b t;

    public void a(){
       super();
       this.p = new a();
       this.t = new a$b(this);
    }
    public static final h P8(a p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("kcubeTab");
       }
       return p0;
    }
    public static final PagerSlidingTabStrip$d R8(a p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("stripTab");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       p g = a.G;
       a.o(g, "HomeTopStateId.TAB_AVATAR");
       uArrayList.add(g);
       g = a.H;
       a.o(g, "HomeTopStateId.TAB_AVATAR_SCALE");
       uArrayList.add(g);
       g = a.I;
       a.o(g, "HomeTopStateId.TAB_LOTTIE");
       uArrayList.add(g);
       g = a.J;
       a.o(g, "HomeTopStateId.TAB_DOUBLE_AVATAR");
       uArrayList.add(g);
       g = a.K;
       a.o(g, "HomeTopStateId.TAB_TRIPLE_AVATAR");
       uArrayList.add(g);
       a tp = this.p;
       a tr = this.r;
       if (tr == null) {
          a.S("containerController");
       }
       b uob = tr.y();
       a tq = this.q;
       if (tq == null) {
          a.S("kcubeTab");
       }
       tp.a(uob.c(tq, uArrayList, new a$a(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.p.c();
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Object obj = this.r8("KCUBE_CONTAINER_CONTROLLER");
       a.o(obj, "inject\(ActionBarAccessId¡­UBE_CONTAINER_CONTROLLER\)");
       this.r = obj;
       obj = this.r8("KCUBE_TAB");
       a.o(obj, "inject\(ActionBarAccessIds.KCUBE_TAB\)");
       this.q = obj;
       obj = this.q8(PagerSlidingTabStrip$d.class);
       a.o(obj, "inject\(PagerSlidingTabStrip.Tab::class.java\)");
       this.s = obj;
       return;
    }
}
