package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import j8a.y0;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.m$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.m$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.m$c;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import im8.f;
import rf5.u;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import wh5.c;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewParent;
import com.kwai.slide.play.detail.utils.ExperimentUtils;
import ekd.i;
import android.content.Context;
import com.yxcorp.utility.n;
import le5.f;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import j8a.w0;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import j8a.z0;
import android.animation.Animator$AnimatorListener;
import g9a.g;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.text.TextPaint;
import oe6.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import androidx.viewpager.widget.ViewPager$i;
import jta.c;
import r7a.f;
import j8a.x0;
import erd.g;
import crd.b;
import brd.t;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class m extends PresenterV2	// class@00199d
{
    public Runnable A;
    public int B;
    public final ViewPager$i C;
    public final a D;
    public final c E;
    public f p;
    public SlidePlayViewModel q;
    public u r;
    public f s;
    public BaseFragment t;
    public QPhoto u;
    public View v;
    public View w;
    public KwaiLottieAnimationView x;
    public t y;
    public final Runnable z;

    public void m(){
       super();
       this.z = new y0(this);
       this.C = new m$a(this);
       this.D = new m$b(this);
       this.E = new m$c(this);
    }
    public static void P8(m p0){
       boolean b;
       int i;
       Objects.requireNonNull(p0);
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, p0, om, "3")) {
       }else {
          NasaFeatureGuideManager obj = PatchProxy.apply(objArray, p0, om, "4");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(NasaFeatureGuideManager.f().j() && (!p0.p.get().booleanValue() && (p0.r.v() && (p0.u.getVideoDuration() - 0xea60 >= 0 && (!VisitorModeManager.f() && (!c.b() && !SlideGuideManager.a().b(p0.getActivity()))))))){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             if (p0.B != null) {
                p0.A = new y0(p0);
             }else if(PatchProxy.applyVoid(objArray, p0, om, "5")){
                if (!PatchProxy.applyVoid(objArray, p0, om, "6") && p0.getActivity() != null) {
                   ViewStub viewStub = p0.v.findViewById(R.id.press_control_speed_guide_layout_stub);
                   if (viewStub != null && viewStub.getParent() != null) {
                      if (ExperimentUtils.d() == 1) {
                         viewStub.setLayoutResource(R.layout.arg_RES_7f0d153d);
                      }else if(ExperimentUtils.d() == 2){
                         viewStub.setLayoutResource(R.layout.arg_RES_7f0d153e);
                      }
                      p0.w = viewStub.inflate();
                   }else {
                      p0.w = p0.v.findViewById(0x7f0a31b9);
                   }
                   if (p0.w != null) {
                      if (i.c() && ExperimentUtils.d() == 1) {
                         m w = p0.w;
                         w.setPadding(w.getPaddingLeft(), n.A(p0.getContext()), p0.w.getPaddingRight(), p0.w.getPaddingBottom());
                      }
                      if (f.r()) {
                         ViewGroup$MarginLayoutParams layoutParams = p0.w.getLayoutParams();
                         layoutParams.bottomMargin = a1.d(0x7f070bf1);
                         p0.w.setLayoutParams(layoutParams);
                      }
                      p0.w.setOnTouchListener(new w0(p0));
                      KwaiLottieAnimationView kwaiLottieAn = p0.w.findViewById(R.id.speed_guide_anim);
                      p0.x = kwaiLottieAn;
                      if (kwaiLottieAn != null) {
                         kwaiLottieAn.setRepeatCount(true);
                         p0.x.a(new z0(p0));
                      }
                      View view = p0.w.findViewById(R.id.left_speed_guide);
                      View view1 = p0.w.findViewById(R.id.right_speed_guide);
                      if (view != null && view1 != null) {
                         view.setBackground(new g(true));
                         view1.setBackground(new g(0));
                      }
                      TextView textView = p0.w.findViewById(R.id.speed_play_guide_more_text);
                      TextView textView1 = p0.w.findViewById(R.id.speed_play_guide_bottom_text);
                      TextView textView2 = p0.w.findViewById(R.id.speed_play_guide_side_text);
                      if (textView != null && textView1 != null) {
                         textView.getPaint().setFakeBoldText(true);
                         textView1.getPaint().setFakeBoldText(true);
                      }
                      if (textView2 != null) {
                         textView2.getPaint().setFakeBoldText(true);
                      }
                   }
                }
             label_01ac :
                if (!PatchProxy.applyVoid(objArray, p0, om, "7") && (p0.w == null || (p0.getActivity() != null && p0.getContext() != null))) {
                   p0.p.set(Boolean.TRUE);
                   obj = NasaFeatureGuideManager.f();
                   Objects.requireNonNull(obj);
                   NasaFeatureGuideManager nasaFeatureG = NasaFeatureGuideManager.class;
                   if (!PatchProxy.isSupport(nasaFeatureG) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, obj, nasaFeatureG, "29")) {
                      SharedPreferences$Editor uEditor = a.a.edit();
                      uEditor.putBoolean("ShouldShowPressControlSpeedHint", 0);
                      g.a(uEditor);
                   }
                   if (!PatchProxy.applyVoid(objArray, p0, om, "8")) {
                      om = p0.x;
                      if (om != null) {
                         om.D(R.string.arg_RES_7f100ee7);
                         p0.x.s();
                      }
                   }
                   om = p0.w;
                   i = (ExperimentUtils.d() == 1)? 0x7f0601a9: 0x7f06019f;
                   om.setBackgroundColor(a1.a(i));
                   p0.w.setVisibility(0);
                   SlideGuideManager.a().f(true);
                   SlideGuideManager.a().g(true);
                }
             }
          }
       }
    label_0239 :
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.t.getParentFragment());
       this.q = slidePlayVie;
       if (slidePlayVie == null) {
          return;
       }
       slidePlayVie.P(this.t, this.D);
       this.q.i(this.C);
       this.s.a(this.E);
       this.X7(this.y.subscribe(new x0(this)));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, m.class, "10")) {
          return;
       }
       k1.m(this.z);
       this.A = objArray;
       m tq = this.q;
       if (tq != null) {
          tq.D(this.t, this.D);
          this.q.g(this.C);
       }
       this.s.c(this.E);
       return;
    }
    public void R8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, m.class, "9")) {
          return;
       }
       this.A = objArray;
       k1.m(this.z);
       if (this.w != null) {
          m tx = this.x;
          if (tx != null) {
             tx.t();
             if (this.x.p()) {
                this.x.f();
             }
          }
          if (!this.w.getVisibility()) {
             this.p.set(Boolean.FALSE);
             this.w.setVisibility(8);
          }
       }
       SlideGuideManager.a().f(false);
       SlideGuideManager.a().g(false);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.u = this.q8(QPhoto.class);
       this.p = this.x8("DETAIL_HAS_SHOWN_GUIDE");
       this.t = this.r8("DETAIL_FRAGMENT");
       this.r = this.q8(u.class);
       this.v = this.r8("DETAIL_PARENT_VIEW");
       this.s = this.r8("NASA_SIDEBAR_STATUS");
       this.y = this.r8("DETAIL_CANCEL_GUIDE_OBSERVABLE");
       return;
    }
}
