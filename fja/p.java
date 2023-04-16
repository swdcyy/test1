package fja.p;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.t;
import fja.o;
import erd.r;
import fja.n;
import kga.c;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import xl8.b;

public class p extends PresenterV2	// class@00295b
{
    public HomeFollowFragment p;
    public b q;

    public void p(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
          return;
       }
       this.X7(new FragmentCompositeLifecycleState(this.p).k().filter(o.b).subscribe(new n(this), c.a));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("FOLLOW_IS_IN_PYMK_DETAIL_PAGE");
       return;
    }
}
