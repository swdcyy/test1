package com.kwai.slide.play.detail.rightactionbar.music.wheel.MusicWheelElementView;
import qp7.d;
import com.kwai.slide.play.detail.rightactionbar.music.wheel.MusicWheelElementView$mCoverImageSize$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.slide.play.detail.rightactionbar.music.wheel.MusicWheelElementView$mCoverMarginEnd$2;
import com.kwai.slide.play.detail.rightactionbar.music.wheel.MusicWheelElementView$mTextWidth$2;
import android.view.View;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.TextView;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import android.animation.ObjectAnimator;
import com.kwai.slide.play.detail.rightactionbar.music.wheel.MusicWheelElementView$a;
import android.animation.Animator$AnimatorListener;
import java.lang.Number;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import fs7.a;
import android.view.ViewGroup;
import xf7.a;
import android.content.Context;
import gs7.a;
import qp7.x0;
import ss7.r;
import ss7.j;
import java.util.Objects;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pp7.b;
import ss7.k;
import ss7.l;
import ss7.m;
import ss7.n;
import com.kwai.slide.play.detail.utils.ExperimentUtils;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import uy6.f;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import ss7.s;
import qrd.l1;
import qp7.t0;
import bt7.e;
import android.text.TextPaint;
import com.kwai.slide.play.detail.rightactionbar.music.wheel.MusicWheelElementView$b;
import android.view.View$OnClickListener;

public final class MusicWheelElementView extends d	// class@00186e
{
    public KwaiImageView l;
    public ImageView m;
    public TextView n;
    public View o;
    public View p;
    public View q;
    public ViewStubInflater2 r;
    public s s;
    public final p t;
    public final p u;
    public final p v;
    public AnimatorSet w;
    public AnimatorSet x;
    public HashMap y;

    public void MusicWheelElementView(){
       super();
       this.t = s.c(MusicWheelElementView$mCoverImageSize$2.INSTANCE);
       this.u = s.c(MusicWheelElementView$mCoverMarginEnd$2.INSTANCE);
       this.v = s.c(new MusicWheelElementView$mTextWidth$2(this));
    }
    public static final View v(MusicWheelElementView p0){
       p0 = p0.o;
       if (p0 == null) {
          a.S("mBackgroundView");
       }
       return p0;
    }
    public static final View w(MusicWheelElementView p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mContainerView");
       }
       return p0;
    }
    public static final KwaiImageView x(MusicWheelElementView p0){
       p0 = p0.l;
       if (p0 == null) {
          a.S("mCoverView");
       }
       return p0;
    }
    public static final ImageView y(MusicWheelElementView p0){
       p0 = p0.m;
       if (p0 == null) {
          a.S("mGramophoneView");
       }
       return p0;
    }
    public static final TextView z(MusicWheelElementView p0){
       p0 = p0.n;
       if (p0 == null) {
          a.S("mSameStyleView");
       }
       return p0;
    }
    public final Animator A(View p0,long p1){
       ObjectAnimator obj;
       MusicWheelElementView musicWheelEl = MusicWheelElementView.class;
       if (PatchProxy.isSupport(musicWheelEl)) {
          obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, musicWheelEl, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = ObjectAnimator.ofFloat(p0, "rotation", new float[2]{0,0x43b40000});
       obj.addListener(new MusicWheelElementView$a(this, p0, p1));
       obj.setRepeatCount(-1);
       obj.setDuration(p1);
       a.o(obj, "ObjectAnimator.ofFloat\(v¡­  duration = time\n      }");
       return obj;
    }
    public final int B(){
       Object obj = PatchProxy.apply(null, this, MusicWheelElementView.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.t.getValue();
       }
       return obj.intValue();
    }
    public final int C(){
       Object obj = PatchProxy.apply(null, this, MusicWheelElementView.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = this.u.getValue();
       }
       return obj.intValue();
    }
    public final int D(){
       Object obj = PatchProxy.apply(null, this, MusicWheelElementView.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = this.v.getValue();
       }
       return obj.intValue();
    }
    public final void E(){
       if (PatchProxy.applyVoid(null, this, MusicWheelElementView.class, "22")) {
          return;
       }
       MusicWheelElementView tr = this.r;
       if (tr != null) {
          tr.g(false);
       }
       return;
    }
    public View i(){
       Object obj = PatchProxy.apply(null, this, MusicWheelElementView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.a) {
          return a.c(0x7f0d03c0, this.m());
       }
       return a.a(this.k(), 0x7f0d03c0, this.m(), false);
    }
    public void q(x0 p0){
       r or = r.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicWheelElementView.class, "6")) {
       }else {
          a.p(p0, "viewModel");
          j oj = new j(this);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(oj, p0, or, "2")) {
             a.p(oj, "observer");
             p0.d.d(p0.c(), oj);
          }
          k ok = new k(this);
          if (!PatchProxy.applyVoidOneRefs(ok, p0, or, "4")) {
             a.p(ok, "observer");
             p0.h.d(p0.c(), ok);
          }
          l ol = new l(this);
          if (!PatchProxy.applyVoidOneRefs(ol, p0, or, "15")) {
             a.p(ol, "observer");
             p0.g.d(p0.c(), ol);
          }
          m om = new m(this, p0);
          if (!PatchProxy.applyVoidOneRefs(om, p0, or, "8")) {
             a.p(om, "observer");
             p0.e.d(p0.c(), om);
          }
          n on = new n(this);
          if (!PatchProxy.applyVoidOneRefs(on, p0, or, "12")) {
             a.p(on, "observer");
             p0.f.d(p0.c(), on);
          }
       }
       return;
    }
    public void r(){
       View view;
       MusicWheelElementView tq;
       if (PatchProxy.applyVoid(null, this, MusicWheelElementView.class, "5")) {
          return;
       }
       float f = (ExperimentUtils.f())? 12.00f: 14.00f;
       ViewGroup$LayoutParams layoutParams = this.p().getLayoutParams();
       String str = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
       Objects.requireNonNull(layoutParams, str);
       layoutParams.topMargin = a1.e(f);
       view = this.p().findViewById(R.id.music_wheel_container);
       a.o(view, "view.findViewById\(R.id.music_wheel_container\)");
       this.p = view;
       view = this.p().findViewById(R.id.music_wheel_background);
       a.o(view, "view.findViewById\(R.id.music_wheel_background\)");
       this.o = view;
       view = this.p().findViewById(R.id.music_wheel_gramophone);
       a.o(view, "view.findViewById\(R.id.music_wheel_gramophone\)");
       this.m = view;
       view = this.p().findViewById(R.id.music_wheel_same_style);
       a.o(view, "view.findViewById\(R.id.music_wheel_same_style\)");
       this.n = view;
       view = this.p().findViewById(R.id.music_wheel_cover);
       a.o(view, "view.findViewById\(R.id.music_wheel_cover\)");
       this.l = view;
       view = this.p().findViewById(R.id.music_note_layout);
       a.o(view, "view.findViewById\(R.id.music_note_layout\)");
       this.q = view;
       if (ExperimentUtils.f()) {
          tq = this.q;
          if (tq == null) {
             a.S("mMusicalNoteLayout");
          }
          tq.setVisibility(8);
       }
       if (SlidePerformanceExp.d().disableMusicalNoteAnim == null) {
          ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a2cfc, 0x7f0a2cfb);
          this.r = viewStubInfl;
          viewStubInfl.d(this.p());
          this.s = new s(this.p());
       }
       tq = this.l;
       String str1 = "mCoverView";
       if (tq == null) {
          a.S(str1);
       }
       MusicWheelElementView tl = this.l;
       if (tl == null) {
          a.S(str1);
       }
       layoutParams = tl.getLayoutParams();
       Objects.requireNonNull(layoutParams, str);
       layoutParams.width = this.B();
       layoutParams.height = this.B();
       layoutParams.setMarginEnd(this.C());
       tq.setLayoutParams(layoutParams);
       tq = this.p;
       str1 = "mContainerView";
       if (tq == null) {
          a.S(str1);
       }
       tl = this.p;
       if (tl == null) {
          a.S(str1);
       }
       ViewGroup$LayoutParams layoutParams1 = tl.getLayoutParams();
       Objects.requireNonNull(layoutParams1, str);
       layoutParams1.setMarginEnd((a1.e(this.j().k()) + e.b.g()));
       tq.setLayoutParams(layoutParams1);
       tq = this.n;
       if (tq == null) {
          a.S("mSameStyleView");
       }
       TextPaint paint = tq.getPaint();
       a.o(paint, "mSameStyleView.paint");
       paint.setFakeBoldText(true);
       tq = this.p;
       if (tq == null) {
          a.S(str1);
       }
       tq.setOnClickListener(new MusicWheelElementView$b(this));
       return;
    }
}
