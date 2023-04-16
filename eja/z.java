package eja.z;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import brd.x;
import eja.z$a;
import erd.r;
import eja.z$b;
import kga.c;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import ja6.a;
import t45.d;
import brd.z;
import eja.z$c;
import ja6.b;
import eja.z$d;
import eja.z$e;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;

public final class z extends PresenterV2	// class@00270e
{
    public HomeFollowFragment p;

    public void z(){
       super();
    }
    public void E8(){
       g a;
       if (PatchProxy.applyVoid(null, this, z.class, "2")) {
          return;
       }
       z tp = this.p;
       String str = "mFragment";
       if (tp == null) {
          a.S(str);
       }
       t ot = tp.m();
       z tp1 = this.p;
       if (tp1 == null) {
          a.S(str);
       }
       a = c.a;
       ot.compose(tp1.Ug(FragmentEvent.DESTROY)).filter(z$a.b).subscribe(z$b.b, a);
       RxBus f = RxBus.f;
       z a1 = d.a;
       this.X7(f.f(a.class).observeOn(a1).subscribe(z$c.b));
       this.X7(f.f(b.class).observeOn(a1).filter(z$d.b).subscribe(z$e.b, a));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, z.class, "1")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       return;
    }
}
