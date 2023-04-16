package bc9.x;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.assistant.a;
import dc9.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import bc9.g;
import u79.o;
import u79.a;
import bc9.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import th0.e;
import android.view.animation.Interpolator;
import android.view.View;
import bc9.d;
import cc9.h;
import com.kwai.robust.PatchProxyResult;
import cc9.j;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.assistant.a$b;
import bc9.x$a;
import cc9.i;
import bc9.x$b;
import bc9.x$c;
import android.view.ViewTreeObserver;
import bc9.x$d;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.app.Activity;
import bc9.x$e;
import j8c.a;
import q87.c;
import java.util.Collection;
import ekd.q;
import java.util.List;
import android.view.ViewGroup;
import vf9.s;
import android.content.Intent;
import android.animation.ValueAnimator;
import java.lang.Float;
import th0.n;
import android.animation.TimeInterpolator;
import bc9.x$f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import bc9.x$g;
import android.animation.Animator$AnimatorListener;
import bc9.x$h;
import android.view.animation.Animation$AnimationListener;
import zb9.q;
import bc9.x$i;

public final class x extends d0	// class@000412
{
    public View A;
    public ArrayList B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public AssistantResponse I;
    public boolean J;
    public List K;
    public final a L;
    public final b M;
    public final int o;
    public final int p;
    public final long q;
    public final float r;
    public final float s;
    public j t;
    public Intent u;
    public g v;
    public ViewPager w;
    public View x;
    public View y;
    public View z;

    public void x(CameraPageType p0,b p1,a p2,b p3){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       a.p(p2, "assistContext");
       a.p(p3, "viewHelper");
       super(p0, p1);
       this.L = p2;
       this.M = p3;
       this.o = -1;
       this.p = a1.e(24.00f);
       this.q = (long)300;
       this.r = 0x3f800000;
       this.E = -1;
    }
    public void d5(int p0){
       x ox = x.class;
       if (PatchProxy.isSupport(ox) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ox, "7")) {
          return;
       }
       super.d5(p0);
       if (this.H != null) {
          this.l2();
       }
       return;
    }
    public final void g2(boolean p0){
       x ox = x.class;
       if (PatchProxy.isSupport(ox) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ox, "18")) {
          return;
       }
       if (this.w == null) {
          return;
       }
       ox = this.v;
       if (ox != null) {
          g og = g.class;
          if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), ox, og, "10")) {
             o oo = ox.C();
             if (oo != null) {
                FragmentActivity activity = ox.j.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type android.content.Context");
                b uob = b.class;
                if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), activity, oo, uob, "21")) {
                   a.p(activity, "context");
                   Animation uAnimation = (p0)? AnimationUtils.loadAnimation(activity, R.anim.arg_RES_7f01006a): AnimationUtils.loadAnimation(activity, R.anim.arg_RES_7f010069);
                   a.o(uAnimation, "translationAnimation");
                   uAnimation.setInterpolator(new e());
                   uAnimation.setDuration(oo.d);
                   b p = oo.p;
                   if (p != null) {
                      a.m(p);
                      p.startAnimation(uAnimation);
                   }else {
                      oo.z = new d(oo, uAnimation);
                   }
                }
             }
          }
       }
       this.p2();
       return;
    }
    public final a h2(){
       return this.L;
    }
    public final boolean i2(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, x.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null && p0 instanceof j) {
          KSTemplateDetailInfo mTemplateId = p0.b().mTemplateId;
          x tt = this.t;
          if (tt != null) {
             KSTemplateDetailInfo kSTemplateDe = tt.b();
             if (kSTemplateDe != null) {
                kSTemplateDe = kSTemplateDe.mTemplateId;
                if (kSTemplateDe != null && kSTemplateDe.equals(mTemplateId) == true) {
                   b = true;
                }
             }
          }
       }
       return b;
    }
    public void k(View p0){
       Intent intent1;
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "1")) {
          return;
       }
       super.k(p0);
       this.J = false;
       this.x = p0;
       Intent intent = null;
       this.u = intent;
       this.L.q().c(new x$a(this));
       this.L.f().c(new x$b(this));
       this.L.f().c(new x$c(this));
       View view = (p0 != null)? p0.findViewById(R.id.button_close): intent;
       View view1 = (p0 != null)? p0.findViewById(R.id.camera_flash_bar_root): intent;
       if (view != null) {
          ViewTreeObserver viewTreeObse = view.getViewTreeObserver();
          if (viewTreeObse != null) {
             viewTreeObse.addOnGlobalLayoutListener(new x$d(this, view1, view));
          }
       }
       view = this.e.findViewById(R.id.camera_scroll_snapshot_tab_container);
       if (view != null) {
          ViewTreeObserver viewTreeObse1 = view.getViewTreeObserver();
          if (viewTreeObse1 != null) {
             viewTreeObse1.addOnGlobalLayoutListener(new x$e(this, view));
          }
       }
       if (this.H != null) {
          this.l2();
       }
       view = (p0 != null)? p0.findViewById(R.id.shader_layout): intent;
       this.y = view;
       view = (p0 != null)? p0.findViewById(R.id.button_switch_camera_wrapper): intent;
       this.z = view;
       if (p0 != null) {
          intent = p0.findViewById(R.id.fold_button);
       }
       this.A = intent;
       return;
    }
    public final void k2(Boolean p0,boolean p1){
       x ox = x.class;
       String str = "9";
       if (PatchProxy.isSupport(ox) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ox, str)) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CameraAssistant", "onKSItemUnselected", objArray);
       this.t = null;
       this.u = null;
       x tv = this.v;
       if (tv != null) {
          tv.I(this.o);
       }
       if (p0 != null && (this.G != null && this.E > this.o)) {
          boolean b = p0.booleanValue();
          tv = this.E;
          if (!PatchProxy.isSupport(ox) || (!PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), Integer.valueOf(tv), this, ox, "19") && this.w != null)) {
             ox = this.v;
             if (ox != null) {
                g og = g.class;
                if (!PatchProxy.isSupport(og) || (PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), Integer.valueOf(tv), ox, og, str) || (q.f(ox.d) || (tv >= null && tv < ox.d.size())))) {
                   o oo = ox.D(tv);
                   if (oo != null) {
                      FragmentActivity activity = ox.j.getActivity();
                      Objects.requireNonNull(activity, "null cannot be cast to non-null type android.content.Context");
                      b uob = b.class;
                      if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), activity, oo, uob, "20")) {
                         a.p(activity, "context");
                         Animation uAnimation = (b)? AnimationUtils.loadAnimation(activity, R.anim.arg_RES_7f01006c): AnimationUtils.loadAnimation(activity, R.anim.arg_RES_7f01006b);
                         a.o(uAnimation, "translationAnimation");
                         uAnimation.setInterpolator(new e());
                         uAnimation.setDuration(oo.d);
                         b p = oo.p;
                         if (p != null) {
                            p.startAnimation(uAnimation);
                         }
                      }
                   }
                }
             }
             this.o2();
          }
       }
    label_00e9 :
       this.E = this.o;
       x tw = this.w;
       if (tw != null) {
          tw.setVisibility(4);
       }
       this.G = false;
       if (p1) {
          this.l2();
       }
       return;
    }
    public final void l2(){
       if (PatchProxy.applyVoid(null, this, x.class, "10")) {
          return;
       }
       if (this.J != null) {
          this.H = true;
          return;
       }else {
          this.H = false;
          s os = new s(this.L.n(), false, false, true, false);
          this.d.m(v8);
          this.L.K(null);
          return;
       }
    }
    public final void m2(int p0){
       x ox = x.class;
       if (PatchProxy.isSupport(ox) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ox, "21")) {
          return;
       }
       ox = this.y;
       if (ox != null) {
          ox.setVisibility(p0);
       }
       ox = this.z;
       if (ox != null) {
          ox.setVisibility(p0);
       }
       ox = this.A;
       if (ox != null) {
          ox.setVisibility(p0);
       }
       return;
    }
    public final ValueAnimator n2(float p0,float p1){
       float[] obj;
       x ox = x.class;
       if (PatchProxy.isSupport(ox)) {
          obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, ox, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new float[]{p0,p1};
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(obj);
       a.o(valueAnimato, "sidebarAlphaAnimator");
       valueAnimato.setInterpolator(new n());
       valueAnimato.setDuration(240);
       valueAnimato.addUpdateListener(new x$f(this));
       valueAnimato.addListener(new x$g(this, p1));
       return valueAnimato;
    }
    public final void o2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, x.class, "22")) {
          return;
       }
       x tv = this.v;
       if (tv != null && !PatchProxy.applyVoid(objArray, tv, g.class, "7")) {
          o oo = tv.C();
          if (oo != null) {
             oo.i();
          }
          if (oo != null) {
             oo.w(true, false);
          }
       }
    label_002b :
       Animation uAnimation = AnimationUtils.loadAnimation(this.e, R.anim.arg_RES_7f010067);
       a.o(uAnimation, "alphaAnimation");
       uAnimation.setInterpolator(new e());
       uAnimation.setDuration(this.q);
       uAnimation.setAnimationListener(new x$h(this));
       x tw = this.w;
       if (tw != null) {
          tw.startAnimation(uAnimation);
       }
       this.G = false;
       this.n2(this.s, this.r).start();
       this.d.m(new q(false));
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, x.class, "8")) {
          return;
       }
       boolean b = true;
       this.J = b;
       if (this.t != null) {
          this.k2(Boolean.TRUE, b);
       }
       super.onDestroyView();
       x tv = this.v;
       if (tv != null && !PatchProxy.applyVoid(null, tv, g.class, "6")) {
          tv.z();
       }
       this.w = null;
       this.F = false;
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, x.class, "5")) {
          return;
       }
       super.onPause();
       x tv = this.v;
       if (tv != null) {
          tv.E();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, x.class, "6")) {
          return;
       }
       super.onResume();
       x tv = this.v;
       if (tv != null) {
          tv.F();
       }
       return;
    }
    public final void p2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, x.class, "23")) {
          return;
       }
       Animation uAnimation = AnimationUtils.loadAnimation(this.e, R.anim.arg_RES_7f010068);
       a.o(uAnimation, "alphaAnimation");
       uAnimation.setInterpolator(new e());
       uAnimation.setDuration(this.q);
       uAnimation.setAnimationListener(new x$i(this));
       x tw = this.w;
       if (tw != null) {
          tw.startAnimation(uAnimation);
       }
       this.G = true;
       this.n2(this.r, this.s).start();
       this.d.m(new q(true));
       x tv = this.v;
       if (tv != null && !PatchProxy.applyVoid(objArray, tv, g.class, "8")) {
          tv.B();
       }
       return;
    }
}
