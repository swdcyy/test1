package etb.z;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import etb.z$a;
import s2b.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import s2b.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import etb.y;
import erd.r;
import etb.x;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class z extends PresenterV2	// class@002815
{
    public a p;
    public RecyclerFragment q;

    public void z(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, z.class, "2")) {
          return;
       }
       if (this.p == null) {
          this.p = new z$a(this);
       }
       this.q.r9().h(this.p);
       this.X7(this.q.Vg().j().filter(y.b).subscribe(new x(this), Functions.d()));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, z.class, "1")) {
          return;
       }
       this.q = this.r8("NOTICE_BOX_FRAGMENT");
       return;
    }
}
