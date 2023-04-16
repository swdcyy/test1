package aqa.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import aqa.a;
import erd.g;
import crd.b;

public class b extends PresenterV2	// class@0002b7
{
    public BaseFragment p;
    public int q;

    public void b(){
       super();
       this.q = 1;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (this.p == null) {
          return;
       }
       if (this.getActivity() != null) {
          this.q = this.getActivity().getRequestedOrientation();
       }
       this.X7(this.p.Vg().i().subscribe(new a(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.t8("FRAGMENT");
       return;
    }
}
