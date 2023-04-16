package esa.i;
import z1.a;
import esa.n;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import so5.a;
import dta.n0;
import wq6.f;
import com.kwai.kcube.decorator.IContainerDecorator;
import pr6.d;
import com.yxcorp.gifshow.homebottom.presenter.b;
import tkd.b;
import tkd.d;
import om6.i;
import cta.g;
import dta.o0;
import com.yxcorp.utility.RomUtils;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.homebottom.presenter.OppoPreventBurnInCameraPresenter;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import wq6.g;
import vw5.a;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager;
import fsa.a;
import esa.k;
import esa.l;
import java.lang.Runnable;
import msd.a;
import ayb.i;
import gx5.b;

public final class i implements a	// class@0027c9
{
    public final n a;

    public void i(n p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       i ta = this.a;
       Objects.requireNonNull(ta);
       String str = "4";
       int i = -1304126307;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, ta, n.class, str)) {
       }else if(a.a().booleanValue()){
          p0.U7(new n0(ta.c(), ta.e()));
       }else {
          p0.U7(new b());
          p0.U7(d.a(i).n8(ta.e()));
       }
       p0.U7(new g(ta.c(), ta.e()));
       PatchProxy.onMethodExit(n.class, str);
       if (!PatchProxy.applyVoidOneRefsWithListener(p0, ta, n.class, "5")) {
          if (!a.a().booleanValue()) {
             p0.U7(new o0(ta));
          }
          p0.U7(d.a(i).qt());
          p0.U7(d.a(i).Bb());
          if (!a.a().booleanValue() && (RomUtils.s() && !a.t().d("disableOppoPreventBurnIn", false))) {
             p0.U7(new OppoPreventBurnInCameraPresenter(ta.e()));
          }
       label_00bb :
          if (!ta.c().O(b.d)) {
             d.a(-680793205).AB(p0);
          }
          TabIdentifier f = b.f;
          if (f.equals(HomeExperimentManager.c()) && (ta.j(f) || ta.j(b.D))) {
             p0.U7(new a(new k(ta), new l(ta)));
          }
          d.a(0x4f878389).El(ta.e(), p0);
          if (ta.e().j() != null) {
             d.a(0x3673894c).iC(ta.e(), ta.e().j().P(b.l), R.id.tab_layout, p0);
          }
          PatchProxy.onMethodExit(n.class, "5");
       }
       return;
    }
}
