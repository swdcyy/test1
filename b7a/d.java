package b7a.d;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.a;
import java.lang.Object;
import eda.p;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Number;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import moc.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.Fragment;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import java.lang.Integer;
import android.view.ViewGroup;
import de5.a;
import m9a.v;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;

public final class d implements g	// class@000385
{
    public final a b;

    public void d(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int i1;
       int i3;
       a w;
       a w1;
       d b = this.b;
       p op = p0;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if ((op.b()).equals(b.x.getPhotoId()) && b.C.Vg().e()) {
          boolean b1 = op.c();
          String str = "8";
          int i = 0;
          if (PatchProxy.isSupport2(a.class, str)) {
             Object obj = PatchProxy.applyOneRefsWithListener(Boolean.valueOf(b1), b, a.class, str);
             if (obj != patchProxyRe) {
                b1 = obj.intValue();
             }else if(b1){
                PatchProxy.onMethodExit(a.class, str);
                i1 = 0;
             label_0074 :
                b1 = op.c();
                str = "9";
                if (PatchProxy.isSupport2(a.class, str)) {
                   obj = PatchProxy.applyOneRefsWithListener(Boolean.valueOf(b1), b, a.class, str);
                   if (obj != patchProxyRe) {
                      int i2 = obj.intValue();
                   label_00c1 :
                      i = i2;
                   label_00c2 :
                      i3 = i;
                   label_00c3 :
                      b.J = b.d(b.I);
                      if (b.w != null) {
                         v.a(b.getActivity(), b.x, b.C.f(), b.C.getParentFragment().f(), i1, i3, b.N, op.c(), b.p, b.q.get(), b.w, Integer.valueOf(b.J), b.w.getTop(), b.u, null, true);
                      }else {
                         v.a(b.getActivity(), b.x, b.C.f(), b.C.getParentFragment().f(), i1, i3, b.N, op.c(), b.p, b.q.get(), b.t, Integer.valueOf(b.J), b.t.getTop(), b.u, null, true);
                      }
                      if (!op.c() && !PatchProxy.applyVoidWithListener(null, b, a.class, "13")) {
                         ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                         uElementPack.action2 = "EXPAND_ATLAS_VERTICAL";
                         ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                         uContentPack.photoPackage = w1.f(b.x.mEntity);
                         u1.u(1, uElementPack, uContentPack);
                         PatchProxy.onMethodExit(a.class, "13");
                      }
                   }
                }
                if (b1) {
                   PatchProxy.onMethodExit(a.class, str);
                   i3 = 0;
                   goto label_00c3 ;
                }else if(NasaExperimentUtils.b()){
                   w = b.w;
                   if (w != null) {
                      LinearLayoutManager layoutManage = w.getLayoutManager();
                      if (layoutManage != null) {
                         b1 = layoutManage.i0();
                         if (b1 >= 0) {
                            i = layoutManage.findViewByPosition(b1).getTop();
                         }
                      }
                   }
                   PatchProxy.onMethodExit(a.class, str);
                   goto label_00c2 ;
                }else {
                   w = b.M;
                   PatchProxy.onMethodExit(a.class, str);
                   goto label_00c1 ;
                }
             }else if(NasaExperimentUtils.b()){
                w1 = b.w;
                if (w1 != null) {
                   LinearLayoutManager layoutManage1 = w1.getLayoutManager();
                   if (layoutManage1 != null) {
                      b1 = layoutManage1.i0();
                      if (b1 > 0) {
                      label_006a :
                         PatchProxy.onMethodExit(a.class, str);
                      }
                   }
                }
                b1 = false;
                goto label_006a ;
             }else {
                w1 = b.L;
                PatchProxy.onMethodExit(a.class, str);
             }
          }else {
             goto label_0049 ;
          }
          i1 = b1;
          goto label_0074 ;
       }
    label_018d :
       return;
    }
}
