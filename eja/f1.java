package eja.f1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import jsa.m;
import brd.t;
import t45.d;
import brd.z;
import eja.f1$a;
import kga.c;
import erd.g;
import crd.b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;

public final class f1 extends PresenterV2	// class@0026c3
{
    public HomeFollowFragment p;

    public void f1(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f1.class, "4")) {
          return;
       }
       this.X7(RxBus.f.f(m.class).observeOn(d.a).subscribe(new f1$a(this), c.a));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f1.class, "3")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       return;
    }
}
