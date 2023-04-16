package eja.o0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import y99.k;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import brd.t;
import eja.o0$a;
import erd.r;
import eja.o0$b;
import z99.b;
import erd.g;
import crd.b;
import lnc.b9;
import jb5.d;

public final class o0 extends PresenterV2	// class@0026e5
{
    public RecyclerFragment p;
    public k q;
    public d r;
    public b s;

    public void o0(){
       super();
    }
    public static final RecyclerFragment P8(o0 p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public static final k R8(o0 p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mViewFocusState");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o0.class, "2")) {
          return;
       }
       this.X7(RxBus.f.f(n.class).filter(o0$a.b).subscribe(new o0$b(this), new b()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, o0.class, "3")) {
          return;
       }
       b9.a(this.s);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o0.class, "1")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       obj = this.r8("PAGE_LIST");
       a.o(obj, "inject\(PageAccessIds.PAGE_LIST\)");
       this.r = obj;
       obj = this.r8("AUTO_PLAY_DISPATCH_FOCUS_STATE");
       a.o(obj, "inject\(AutoPlayAccessIds¡­LAY_DISPATCH_FOCUS_STATE\)");
       this.q = obj;
       return;
    }
}
