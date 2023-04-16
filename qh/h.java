package qh.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import ujc.e;
import brd.t;
import t45.d;
import brd.z;
import qh.h$a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import qh.h$b;
import android.view.View;
import androidx.fragment.app.Fragment;
import rd5.d;
import kotlin.jvm.internal.a;
import com.kwai.performance.fluency.page.monitor.PageMonitor;

public final class h extends PresenterV2	// class@0029e3
{
    public final BaseFragment p;

    public void h(BaseFragment p0){
       super();
       this.p = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       u1.a(this);
       this.X7(RxBus.f.f(e.class).observeOn(d.a).subscribe(new h$a(this)));
       h tp = this.p;
       if (tp != null) {
          this.X7(tp.Vg().j().subscribe(new h$b(tp)));
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       h tp = this.p;
       if (tp != null) {
          View view = tp.getView();
          if (view != null) {
             view.setTag(R.id.view_status_tag, "invalid");
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       u1.b(this);
       return;
    }
    public final void onEventMainThread(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "4")) {
          return;
       }
       a.p(p0, "event");
       h tp = this.p;
       if (tp != null) {
          View view = tp.getView();
          if (view != null) {
             view.setTag(R.id.view_status_tag, "");
          }
       }
       PageMonitor.trackPageRequestEnd$default(PageMonitor.INSTANCE, this.p, false, false, null, 14, null);
       return;
    }
}
