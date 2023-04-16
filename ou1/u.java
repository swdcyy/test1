package ou1.u;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.LiveMultiPkRenderChildViewController;
import com.kuaishou.live.common.core.component.multipk.render.layout.LiveMultiPkViewStyle;
import hu1.c;
import du1.d;
import ht1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import kotlin.Pair;
import java.lang.Integer;
import ou1.c;
import ekd.k1;
import ju1.a;
import ou1.g;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LifecycleOwner;
import xh3.l;
import ou1.p;
import androidx.lifecycle.Observer;
import ou1.q;
import ou1.r;
import lnc.a1;
import d61.j0;
import ou1.s;
import android.view.View$OnClickListener;
import android.widget.TextView;
import ou1.t;
import zs1.b;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import android.view.LayoutInflater;
import ag6.a;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMultiPkConfig;
import java.lang.reflect.Type;
import wg3.a;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import ou1.u$a;
import java.lang.Runnable;

public final class u extends LiveMultiPkRenderChildViewController	// class@0035ab
{
    public View q;
    public TextView r;
    public c s;
    public final LiveMultiPkViewStyle t;
    public final c u;
    public final d v;
    public final a w;

    public void u(LiveMultiPkViewStyle p0,c p1,d p2,a p3){
       a.p(p0, "viewStyle");
       a.p(p1, "renderModel");
       a.p(p2, "renderDelegate");
       a.p(p3, "skinManager");
       super();
       this.t = p0;
       this.u = p1;
       this.v = p2;
       this.w = p3;
    }
    public static final View e3(u p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("scoreRootView");
       }
       return p0;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, u.class, "6")) {
          return;
       }
       this.u.a().setValue(new Pair(this.b3(), Integer.valueOf(0)));
       u ts = this.s;
       if (ts != null) {
          ts.c();
       }
       k1.n(this);
       return;
    }
    public void V2(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "5")) {
       }else {
          a.p(p0, "viewModel");
          this.f3();
          u tq = this.q;
          String str = "scoreRootView";
          if (tq == null) {
             a.S(str);
          }
          l.e(tq, this, p0.z0(), false, 4, null);
          p0.h.observe(this, super(this));
          p0.A0().observe(this, new q(this));
          p0.n.observe(this, new r(this));
          tq = this.r;
          String str1 = "multiPkGradeTextView";
          if (tq == null) {
             a.S(str1);
          }
          j0.b(tq, a1.e(6.00f));
          tq = this.r;
          if (tq == null) {
             a.S(str1);
          }
          tq.setOnClickListener(new s(p0));
          u tq1 = this.q;
          if (tq1 == null) {
             a.S(str);
          }
          l.e(tq1, this, p0.C0(), false, 4, null);
          p0.C0().observe(this, new t(this));
       }
       return;
    }
    public a W2(b p0){
       g og = PatchProxy.applyOneRefs(p0, this, u.class, "4");
       if (og != PatchProxyResult.class) {
       }else {
          a.p(p0, "pkCoreModel");
          og = new g(p0, this.b3(), this.v);
       }
       return og;
    }
    public View X2(){
       u obj = PatchProxy.apply(null, this, u.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("scoreRootView");
       }
       return obj;
    }
    public void d3(ViewGroup p0){
       View view;
       u ou = u.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ou, "1")) {
          return;
       }
       a.p(p0, "root");
       if (!PatchProxy.applyVoidOneRefs(p0, this, ou, "3")) {
          view = a.c(LayoutInflater.from(this.D2()), R.layout.arg_RES_7f0d0ccd, p0, false);
          a.o(view, "LayoutInflater.from\(cont¡­layout, root, false\n    \)");
          this.q = view;
          String str = "scoreRootView";
          if (view == null) {
             a.S(str);
          }
          view = view.findViewById(R.id.live_multi_pk_score_grade);
          a.o(view, "scoreRootView.findViewBy¡­ive_multi_pk_score_grade\)");
          this.r = view;
          LiveConfigStartupResponse$LiveMultiPkConfig liveMultiPkC = a.R(LiveConfigStartupResponse$LiveMultiPkConfig.class);
          if (liveMultiPkC != null && liveMultiPkC.mEnableAtmosphereAnimationDisplay != null) {
             u tq = this.q;
             if (tq == null) {
                a.S(str);
             }
             u tq1 = this.q;
             if (tq1 == null) {
                a.S(str);
             }
             c uoc = new c(tq, tq1, p0, this.t, this.w);
             this.s = liveMultiPkC;
          }
       }
    label_006e :
       if (!PatchProxy.applyVoid(null, this, ou, "7") && this.t == LiveMultiPkViewStyle.SIMPLE) {
          u tr = this.r;
          if (tr == null) {
             a.S("multiPkGradeTextView");
          }
          tr.setTextSize(1, 10.00f);
          int i = a1.d(R.dimen.arg_RES_7f07031b);
          ViewGroup$LayoutParams layoutParams = tr.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          layoutParams.leftMargin = i;
          layoutParams = tr.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          layoutParams.rightMargin = i;
          tr.height = a1.d(0x7f07085e);
       }
       return;
    }
    public final void f3(){
       if (PatchProxy.applyVoid(null, this, u.class, "8")) {
          return;
       }
       k1.s(new u$a(this), this, 0);
       return;
    }
}
