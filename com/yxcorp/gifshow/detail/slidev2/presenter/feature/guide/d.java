package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import j8a.p;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.d$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.d$b;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import tkd.b;
import tkd.d;
import hv5.c;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import im8.f;
import xx9.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewParent;
import j8a.o;
import android.view.View$OnTouchListener;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import j8a.q;
import android.animation.Animator$AnimatorListener;
import android.content.Context;
import oe6.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import lnc.a1;
import androidx.fragment.app.Fragment;
import vy6.a;
import androidx.viewpager.widget.ViewPager$i;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class d extends PresenterV2	// class@001989
{
    public PhotoDetailParam A;
    public final ViewPager$i B;
    public final a C;
    public SlidePlayViewModel p;
    public BaseFragment q;
    public f r;
    public TextView s;
    public KwaiLottieAnimationView t;
    public View u;
    public a v;
    public final Runnable w;
    public Runnable x;
    public int y;
    public View z;

    public void d(){
       super();
       this.w = new p(this);
       this.B = new d$a(this);
       this.C = new d$b(this);
    }
    public static void P8(d p0){
       boolean b;
       Objects.requireNonNull(p0);
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, p0, uod, "1")) {
       }else {
          NasaFeatureGuideManager obj = PatchProxy.apply(objArray, p0, uod, "7");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             Boolean uBoolean = 262;
             b = (p0.A.getSource() == uBoolean || (p0.A.getSourceOfContainer() == uBoolean && (d.a(0x4999d7cf).HH() && (NasaFeatureGuideManager.f().c() && (!p0.r.get().booleanValue() && (!p0.v.c() && (!p0.p.r() && (!VisitorModeManager.f() && !SlideGuideManager.a().b(p0.getActivity())))))))))? true: false;
          }
          if (b) {
             if (p0.y != null) {
                p0.x = new p(p0);
             }else if(PatchProxy.applyVoid(objArray, p0, uod, "2")){
                if (!PatchProxy.applyVoid(objArray, p0, uod, "6") && p0.getActivity() != null) {
                   ViewStub viewStub = p0.z.findViewById(R.id.atlas_drag_progress_guide_layout_stub);
                   p0.u = (viewStub != null && viewStub.getParent() != null)? viewStub.inflate(): p0.z.findViewById(0x7f0a027d);
                   d u = p0.u;
                   if (u != null) {
                      u.setOnTouchListener(new o(p0));
                      p0.s = p0.u.findViewById(0x7f0a32e5);
                      KwaiLottieAnimationView kwaiLottieAn = p0.u.findViewById(R.id.progress_drag_guide_lottie_view);
                      p0.t = kwaiLottieAn;
                      kwaiLottieAn.q(true);
                      p0.t.setRepeatCount(2);
                      p0.t.a(new q(p0));
                   }
                }
             label_010e :
                if (PatchProxy.applyVoid(objArray, p0, uod, "3") || (p0.u == null || (p0.t != null && (p0.s == null || (p0.getActivity() != null && p0.getContext() != null))))) {
                   p0.r.set(Boolean.TRUE);
                   obj = NasaFeatureGuideManager.f();
                   Objects.requireNonNull(obj);
                   NasaFeatureGuideManager nasaFeatureG = NasaFeatureGuideManager.class;
                   if (!PatchProxy.isSupport(nasaFeatureG) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, obj, nasaFeatureG, "27")) {
                      SharedPreferences$Editor uEditor = a.a.edit();
                      uEditor.putBoolean("AtlasProgressDragGuideHint", 0);
                      g.a(uEditor);
                   }
                   p0.s.setVisibility(0);
                   p0.s.setText(R.string.arg_RES_7f100250);
                   if (!PatchProxy.applyVoid(objArray, p0, uod, "4")) {
                      p0.t.setVisibility(0);
                      p0.t.D(R.string.arg_RES_7f100eea);
                      p0.t.s();
                   }
                   p0.u.setBackground(a1.f(R.color.arg_RES_7f0619a3));
                   p0.u.setVisibility(0);
                   SlideGuideManager.a().f(true);
                }
             }
          }
       }
    label_01a2 :
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "9")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.q.getParentFragment());
       this.p = slidePlayVie;
       if (slidePlayVie == null) {
          return;
       }
       slidePlayVie.P(this.q, this.C);
       this.p.i(this.B);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "10")) {
          return;
       }
       k1.m(this.w);
       d tp = this.p;
       if (tp != null) {
          tp.g(this.B);
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       if (this.u == null || (this.s != null && this.t != null)) {
          this.r.set(Boolean.FALSE);
          int i = 8;
          this.t.setVisibility(i);
          if (this.t.p()) {
             this.t.f();
          }
          this.t.t();
          this.s.setVisibility(i);
          this.u.setVisibility(i);
          SlideGuideManager.a().f(false);
       }
    label_004b :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "8")) {
          return;
       }
       this.q = this.r8("DETAIL_FRAGMENT");
       this.r = this.x8("DETAIL_HAS_SHOWN_GUIDE");
       this.v = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       this.z = this.r8("DETAIL_PARENT_VIEW");
       this.A = this.q8(PhotoDetailParam.class);
       return;
    }
}
