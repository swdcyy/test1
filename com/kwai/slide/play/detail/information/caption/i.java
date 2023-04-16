package com.kwai.slide.play.detail.information.caption.i;
import qp7.d;
import lnc.a1;
import com.kwai.slide.play.detail.information.caption.i$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fs7.a;
import android.view.ViewGroup;
import xf7.a;
import android.content.Context;
import gs7.a;
import qp7.x0;
import com.kwai.slide.play.detail.information.caption.l;
import com.kwai.slide.play.detail.information.caption.CaptionTextView;
import android.widget.TextView;
import qp7.t0;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import android.text.TextPaint;
import zq7.m;
import android.view.View$OnAttachStateChangeListener;
import com.kwai.slide.play.detail.information.caption.h;
import android.view.View$OnTouchListener;
import zq7.f;
import zq7.n;
import android.view.View$OnClickListener;
import zq7.o;
import zq7.p;
import zq7.g;
import androidx.lifecycle.Observer;
import zq7.q;
import o56.a;
import java.lang.CharSequence;
import zq7.k;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleOwner;
import pp7.b;
import zq7.h;
import com.kwai.slide.play.detail.information.caption.f;
import zq7.i;
import com.kwai.slide.play.detail.information.caption.g;
import zq7.l;
import zq7.j;
import android.graphics.Paint;
import android.animation.ValueAnimator;
import zq7.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import zq7.s;
import android.animation.Animator$AnimatorListener;
import th0.e;
import android.animation.TimeInterpolator;
import com.kwai.slide.play.detail.information.caption.k;
import android.text.SpannableStringBuilder;
import com.kwai.slide.play.detail.information.caption.l$b;
import android.text.method.MovementMethod;
import android.text.method.ScrollingMovementMethod;
import com.yxcorp.gifshow.widget.textview.ClickablePressedSpanTextView;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;

public class i extends d	// class@0017db
{
    public int A;
    public View B;
    public int C;
    public boolean D;
    public final ViewTreeObserver$OnGlobalLayoutListener E;
    public int l;
    public CaptionTextView m;
    public TextView n;
    public l$b o;
    public SpannableStringBuilder p;
    public SpannableStringBuilder q;
    public TextView r;
    public ViewGroup s;
    public ValueAnimator t;
    public boolean u;
    public int v;
    public int w;
    public TextView x;
    public View y;
    public boolean z;
    public static final int F;
    public static int G;

    static {
       i.F = (a1.g() - a1.e(49.00f)) / 2;
    }
    public void i(){
       super();
       this.l = 3;
       this.E = new i$a(this);
    }
    public View i(){
       Object obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.a) {
          return a.c(0x7f0d03a2, this.g);
       }
       return a.a(this.h, 0x7f0d03a2, this.g, false);
    }
    public void q(x0 p0){
       int i;
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "3")) {
       }else {
          this.m = this.f.findViewById(0x7f0a0ccf);
          this.r = this.f.findViewById(0x7f0a0cd0);
          this.y = this.f.findViewById(0x7f0a0cd4);
          this.x = this.f.findViewById(0x7f0a0cd3);
          this.B = this.f.findViewById(0x7f0a065a);
          this.s = this.f.findViewById(0x7f0a065d);
          i = 0;
          this.m.setHighlightColor(i);
          this.l = this.j().z;
          i tm = this.m;
          float f = 0;
          float f1 = (NasaSlidePlayExperimentUtil.k())? 0: 0x3f800000;
          tm.setShadowLayer(0x3f800000, f1, 0x3f800000, a1.a(R.color.arg_RES_7f061ec8));
          tm = this.r;
          if (!NasaSlidePlayExperimentUtil.k()) {
             f = 0x3f800000;
          }
          tm.setShadowLayer(0x3f800000, f, 0x3f800000, a1.a(R.color.arg_RES_7f061ec8));
          this.m.setLineSpacing((float)a1.d(R.dimen.arg_RES_7f07030a), 0x3f800000);
          this.r.setLineSpacing((float)a1.d(R.dimen.arg_RES_7f07030a), 0x3f800000);
          this.r.setHighlightColor(i);
          this.x.getPaint().setFakeBoldText(true);
          this.p().addOnAttachStateChangeListener(new m(this));
          if (this.j().d()) {
             this.m.setOnTouchListener(h.b);
          }else if(this.j().e()){
             this.r.setOnTouchListener(new f(this));
          }else {
             this.m.setOnTouchListener(null);
             this.s.setVisibility(8);
          }
          if (!this.j().a()) {
             this.m.setOnClickListener(new n(this));
          }else {
             this.m.setOnClickListener(new o(this));
          }
          this.r.setOnClickListener(new p(this));
          p0.l(new g(this));
          this.y.setOnClickListener(new q(this));
          if (a.d()) {
             this.m.setContentDescription(a1.p(R.string.arg_RES_7f104a7e));
          }
          k ok = new k(this);
          if (!PatchProxy.applyVoidOneRefs(ok, p0, ol, "2")) {
             a.p(ok, "observer");
             p0.d.d(p0.c(), ok);
          }
          p0.i(new h(this));
          f uof = new f(this);
          if (!PatchProxy.applyVoidOneRefs(uof, p0, ol, "6")) {
             a.p(uof, "observer");
             p0.e.d(p0.c(), uof);
          }
          p0.j(new i(this));
          p0.k(new g(this));
          p0.g(new l(this));
          p0.h(new j(this));
       }
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       if (this.b.f()) {
          this.f.setLayerType(2, null);
       }
       return;
    }
    public void v(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "13")) {
          oi = this.t;
          if (oi != null) {
             if (!oi.isStarted()) {
                this.t.cancel();
                this.t.removeAllUpdateListeners();
                this.t.removeAllListeners();
             }
          }
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
          this.t = valueAnimato;
          valueAnimato.addUpdateListener(new e(this));
          this.t.addListener(new s(this));
          this.t.setDuration(300);
          this.t.setInterpolator(new e());
          this.t.start();
       }
       this.i.b();
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, i.class, "14")) {
          return;
       }
       this.y(0);
       this.r.scrollTo(0, 0);
       this.s.setEnabled(0);
       this.s.setVisibility(8);
       this.B.setVisibility(0);
       return;
    }
    public void x(){
       i tm;
       if (PatchProxy.applyVoid(null, this, i.class, "6")) {
          return;
       }
       this.i.d(this.o.b(), true, -1, -1, 0xbf800000);
       this.m.setMovementMethod(ScrollingMovementMethod.getInstance());
       if (this.o.a()) {
          tm = this.m;
          if (tm != null) {
             tm.setScrollAble(true);
          }
       }
       this.r.setMovementMethod(ScrollingMovementMethod.getInstance());
       if (this.o.a()) {
          tm = this.r;
          if (tm instanceof ClickablePressedSpanTextView) {
             tm.setScrollAble(true);
          }
       }
       return;
    }
    public void y(float p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oi, "15")) {
          return;
       }
       this.B.setAlpha((0x3f800000 - p0));
       this.s.setAlpha(p0);
       i tw = this.w;
       float f = (float)tw;
       this.s.getLayoutParams().height = (int)(f + (p0 * (float)(this.v - tw)));
       this.s.requestLayout();
       return;
    }
}
