package dta.o0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.kcube.decorator.IContainerDecorator;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import sb5.a;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import dta.o0$a;
import erd.g;
import crd.b;
import wq6.h;
import wq6.g;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import tkd.b;
import tkd.d;
import hn5.d;
import java.util.Objects;
import sn5.a;
import wq6.d;
import as6.a;
import zq6.r;
import rn5.a;
import zq6.p;
import bo5.a;
import gsa.e0;
import ro5.b;
import android.view.View;
import com.google.android.material.tabs.KCubeTabLayout;

public final class o0 extends PresenterV2	// class@002545
{
    public KCubeTabLayout p;
    public final IContainerDecorator q;

    public void o0(IContainerDecorator p0){
       a.p(p0, "iContainerDecorator");
       super();
       this.q = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o0.class, "2")) {
          return;
       }
       this.X7(RxBus.f.g(a.class, RxBus$ThreadMode.MAIN).subscribe(new o0$a(this)));
       return;
    }
    public final void P8(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o0.class, "4")) {
          return;
       }
       if (p0.l()) {
          int i = 0;
          int i1 = p0.a().h();
          while (i < i1) {
             h oh = p0.a().U(i);
             if (oh.l()) {
                this.P8(oh);
             }else {
                this.R8(oh);
             }
             i = i + 1;
          }
       }else {
          this.R8(p0);
       }
       return;
    }
    public final void R8(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o0.class, "5")) {
          return;
       }
       if (this.getActivity() instanceof FragmentActivity) {
          if (!p0.z()) {
             p0 = null;
          }
          if (p0 != null) {
             Activity activity = this.getActivity();
             Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
             a uoa = d.a(-683509148).P4(activity, p0);
             r or = a.i(p0).e0();
             p b = a.b;
             a.o(b, "HomeBottomStateId.BOTTOM_SCHEME");
             or.a(b, uoa);
             p e = a.e;
             a.o(e, "HomeTopStateId.TAB_BAR_VIEW_INFO");
             Activity activity1 = this.getActivity();
             Objects.requireNonNull(activity1, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
             or.a(e, b.a(p0, activity1));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o0.class, "1")) {
          return;
       }
       a.p(p0, "view");
       this.p = p0.findViewById(0x7f0a3c8b);
       return;
    }
}
