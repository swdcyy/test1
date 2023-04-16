package b7a.c;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.a;
import java.lang.Object;
import eda.b0;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import lnc.a1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import uw9.m3;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer;

public final class c implements g	// class@000384
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int i;
       c tb = this.b;
       if (!tb.C.Vg().e() && (p0.b()).equals(tb.x.getPhotoId())) {
          tb.L = p0.a();
          tb.M = p0.c;
          tb.N = p0.e;
          if (p0.d != null) {
             i = 0;
             tb.L = i;
             tb.M = i;
          }
          if (NasaExperimentUtils.b()) {
             i = a1.d(0x7f07031f) + m3.e(tb.getActivity(), tb.x);
             a l = tb.L;
             if (l > null || (l == null && tb.M < (- i))) {
                tb.M = tb.M + i;
             }
             i = tb.w;
             a m = tb.M;
             if (!PatchProxy.isSupport2(a.class, "10") || !PatchProxy.applyVoidThreeRefsWithListener(i, Integer.valueOf(l), Integer.valueOf(m), tb, a.class, "10")) {
                if (l >= null && (i == null || i.getLayoutManager() == null)) {
                   PatchProxy.onMethodExit(a.class, "10");
                }else {
                   i.C(l, m);
                   PatchProxy.onMethodExit(a.class, "10");
                }
             }
          }
       }
    label_0096 :
       return;
    }
}
