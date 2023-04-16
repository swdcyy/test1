package ou1.o;
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
import ekd.k1;
import ou1.c;
import ou1.f;
import android.animation.Animator;
import ju1.a;
import ou1.g;
import ou1.i;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import ou1.h;
import xh3.l;
import lnc.a1;
import d61.j0;
import ou1.j;
import android.view.View$OnClickListener;
import ou1.l;
import ou1.m;
import ou1.n;
import zs1.b;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import ec3.f;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import ha1.b;
import android.view.LayoutInflater;
import ag6.a;
import android.widget.TextView;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMultiPkConfig;
import java.lang.reflect.Type;
import wg3.a;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;

public final class o extends LiveMultiPkRenderChildViewController	// class@0035a4
{
    public View q;
    public View r;
    public TextView s;
    public View t;
    public c u;
    public f v;
    public final LiveMultiPkViewStyle w;
    public final c x;
    public final d y;
    public final a z;

    public void o(LiveMultiPkViewStyle p0,c p1,d p2,a p3){
       a.p(p0, "viewStyle");
       a.p(p1, "renderModel");
       a.p(p2, "renderDelegate");
       a.p(p3, "skinManager");
       super();
       this.w = p0;
       this.x = p1;
       this.y = p2;
       this.z = p3;
    }
    public static final View e3(o p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("scoreContainerView");
       }
       return p0;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "6")) {
          return;
       }
       this.x.a().setValue(new Pair(this.b3(), Integer.valueOf(0)));
       k1.n(this);
       o tu = this.u;
       if (tu != null) {
          tu.c();
       }
       tu = this.v;
       if (tu != null && !PatchProxy.applyVoid(objArray, tu, f.class, "3")) {
          tu.a(tu.f);
          tu.a(tu.g);
          tu.d = tu.b;
          tu.e = 1;
       }
       return;
    }
    public void V2(a p0){
       o oo = o.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oo, "5")) {
       }else {
          a.p(p0, "viewModel");
          p0.l.observe(this, new i(this));
          if (!PatchProxy.applyVoidOneRefs(p0, this, oo, "7")) {
             p0.m.observe(this, new h(this));
          }
          o tq = this.q;
          if (tq == null) {
             a.S("rootView");
          }
          l.e(tq, this, p0.z0(), false, 4, null);
          oo = this.r;
          String str = "scoreContainerView";
          if (oo == null) {
             a.S(str);
          }
          j0.b(oo, a1.e(6.00f));
          oo = this.r;
          if (oo == null) {
             a.S(str);
          }
          oo.setOnClickListener(new j(p0));
          p0.j.observe(this, new l(this));
          this.c3().A0().observe(this, new m(this));
          p0.k.observe(this, new n(this));
       }
       return;
    }
    public a W2(b p0){
       g og = PatchProxy.applyOneRefs(p0, this, o.class, "4");
       if (og != PatchProxyResult.class) {
       }else {
          a.p(p0, "pkCoreModel");
          og = new g(p0, this.b3(), this.y);
       }
       return og;
    }
    public View X2(){
       o obj = PatchProxy.apply(null, this, o.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("rootView");
       }
       return obj;
    }
    public void d3(ViewGroup p0){
       View view;
       o oo = o.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oo, "1")) {
          return;
       }
       a.p(p0, "root");
       if (!PatchProxy.applyVoidOneRefs(p0, this, oo, "3")) {
          int i = 0x7f0d0cc8;
          if (f.b()) {
             view = b.c(this.D2(), i, p0, 0);
             a.o(view, "LiteLayoutInflater.infla¡­ot,\n        false\n      \)");
          }else {
             view = a.c(LayoutInflater.from(this.D2()), i, p0, 0);
             a.o(view, "LayoutInflater.from\(cont¡­yout, root, false\n      \)");
          }
          this.q = view;
          if (view == null) {
             a.S("rootView");
          }
          view = view.findViewById(R.id.live_multi_pk_rank_score_container);
          a.o(view, "rootView.findViewById\(R.¡­_pk_rank_score_container\)");
          this.r = view;
          if (view == null) {
             a.S("scoreContainerView");
          }
          view = view.findViewById(R.id.live_multi_pk_score_grade);
          a.o(view, "scoreContainerView.findV¡­ive_multi_pk_score_grade\)");
          this.s = view;
          o tr = this.r;
          if (tr == null) {
             a.S("scoreContainerView");
          }
          view = tr.findViewById(R.id.live_multi_pk_rank_score_layout);
          a.o(view, "scoreContainerView.findV¡­lti_pk_rank_score_layout\)");
          this.t = view;
          o tr1 = this.r;
          if (tr1 == null) {
             a.S("scoreContainerView");
          }
          this.v = new f(tr1, this.w);
          LiveConfigStartupResponse$LiveMultiPkConfig liveMultiPkC = a.R(LiveConfigStartupResponse$LiveMultiPkConfig.class);
          if (liveMultiPkC != null && liveMultiPkC.mEnableAtmosphereAnimationDisplay != null) {
             o tq = this.q;
             if (tq == null) {
                a.S("rootView");
             }
             o tr2 = this.r;
             if (tr2 == null) {
                a.S("scoreContainerView");
             }
             c uoc = new c(tq, tr2, p0, this.w, this.z);
             this.u = liveMultiPkC;
          }
       }
    label_00bd :
       if (!PatchProxy.applyVoid(null, this, oo, "8") && this.w == LiveMultiPkViewStyle.SIMPLE) {
          o ts = this.s;
          if (ts == null) {
             a.S("multiPkGradeTextView");
          }
          ts.setTextSize(0, (float)a1.d(R.dimen.arg_RES_7f070860));
          ViewGroup$LayoutParams layoutParams = ts.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          layoutParams.rightMargin = a1.e(4.00f);
          ts = this.r;
          if (ts == null) {
             a.S("scoreContainerView");
          }
          ts.height = a1.d(0x7f07085e);
       }
       return;
    }
}
