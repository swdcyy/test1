package com.google.android.material.tabs.NasaTabView;
import android.widget.FrameLayout;
import android.content.Context;
import com.google.android.material.tabs.NasaTabView$f;
import android.util.AttributeSet;
import wq6.h;
import android.animation.ValueAnimator;
import java.lang.Object;
import java.lang.Float;
import android.widget.ImageView;
import java.lang.Long;
import java.lang.Integer;
import o56.a;
import com.yxcorp.utility.n;
import lnc.a1;
import hn5.o;
import cw9.b;
import android.widget.LinearLayout;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.view.View;
import ekd.f$j;
import android.animation.Animator$AnimatorListener;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.text.TextPaint;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView$ScaleType;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.widget.TabTripleImageRotateView;
import com.yxcorp.gifshow.widget.TabTripleStaticImage;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.widget.TabDoubleImageRotateView;
import android.widget.CheckedTextView;
import crd.b;
import lnc.b9;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import com.airbnb.lottie.LottieAnimationView;
import android.graphics.Bitmap;
import a2.i0;
import com.google.android.material.tabs.NasaTabView$b;
import android.view.ViewGroup;
import sn5.d;
import sn5.e;
import android.graphics.Canvas;
import sn5.h;
import sn5.h$a;
import sn5.i;
import sn5.i$a;
import tyc.p;
import jk.y;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.google.android.material.tabs.NasaTabView$d;
import java.lang.CharSequence;
import ekd.k1;
import android.text.Layout;
import java.lang.Math;
import android.animation.AnimatorSet;
import java.lang.String;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import com.google.android.material.tabs.NasaTabView$e;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import jk.z;
import erd.g;
import io.reactivex.internal.functions.Functions;
import android.widget.LinearLayout$LayoutParams;
import s0d.f;
import java.io.File;
import qkd.b;
import android.net.Uri;
import com.yxcorp.utility.TextUtils;
import s0d.e;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import pb.d;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Typeface;
import ekd.d0;
import android.graphics.Paint$FontMetricsInt;
import android.graphics.Paint$Align;
import com.google.android.material.tabs.NasaTabView$a;
import jk.x;
import gsa.i;
import androidx.core.content.ContextCompat;
import java.lang.Throwable;
import android.util.Log;
import hn5.i0;
import android.graphics.drawable.AnimationDrawable;
import com.google.android.material.tabs.NasaTabView$c;

public class NasaTabView extends FrameLayout	// class@0016c3
{
    public TabTripleStaticImage A;
    public int B;
    public AnimationDrawable C;
    public AnimatorSet D;
    public AnimatorSet E;
    public ValueAnimator F;
    public b G;
    public final h H;
    public KwaiImageView I;
    public int J;
    public int K;
    public String L;
    public String M;
    public List N;
    public List O;
    public File P;
    public File Q;
    public int R;
    public int S;
    public final a T;
    public LottieAnimationView U;
    public int U0;
    public String V;
    public int V0;
    public String W;
    public int W0;
    public int X0;
    public CheckedTextView b;
    public LinearLayout c;
    public KwaiImageView d;
    public int e;
    public CharSequence f;
    public int g;
    public Bitmap h;
    public float i;
    public TextPaint j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public ImageView v;
    public KwaiImageView w;
    public KwaiImageView x;
    public TabDoubleImageRotateView y;
    public TabTripleImageRotateView z;
    public static Integer Y0;

    public void NasaTabView(Context p0){
       super(p0);
       this.e = 0;
       this.o = false;
       this.p = false;
       this.q = false;
       this.r = false;
       this.s = false;
       this.t = false;
       this.u = false;
       this.B = 0x7f081902;
       this.R = -1;
       this.S = -1;
       this.T = new NasaTabView$f(this);
       this.W0 = -1;
       this.X0 = -1;
       this.H = null;
       this.C(p0, null);
    }
    public void NasaTabView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = 0;
       this.o = false;
       this.p = false;
       this.q = false;
       this.r = false;
       this.s = false;
       this.t = false;
       this.u = false;
       this.B = 0x7f081902;
       this.R = -1;
       this.S = -1;
       this.T = new NasaTabView$f(this);
       this.W0 = -1;
       this.X0 = -1;
       this.H = null;
       this.C(p0, p1);
    }
    public void NasaTabView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = 0;
       this.o = false;
       this.p = false;
       this.q = false;
       this.r = false;
       this.s = false;
       this.t = false;
       this.u = false;
       this.B = 0x7f081902;
       this.R = -1;
       this.S = -1;
       this.T = new NasaTabView$f(this);
       this.W0 = -1;
       this.X0 = -1;
       this.H = null;
       this.C(p0, p1);
    }
    public void NasaTabView(Context p0,h p1){
       super(p0);
       this.e = 0;
       this.o = false;
       this.p = false;
       this.q = false;
       this.r = false;
       this.s = false;
       this.t = false;
       this.u = false;
       this.B = 0x7f081902;
       this.R = -1;
       this.S = -1;
       this.T = new NasaTabView$f(this);
       this.W0 = -1;
       this.X0 = -1;
       this.H = p1;
       this.C(p0, null);
    }
    private void I(ValueAnimator p0){
       float f = p0.getAnimatedValue().floatValue();
       NasaTabView tx = this.x;
       if (tx != null) {
          tx.setScaleX(f);
          this.x.setScaleY(f);
       }
       return;
    }
    private void J(Long p0){
       this.F.start();
    }
    public static void a(NasaTabView p0,Long p1){
       p0.J(p1);
    }
    public static void b(NasaTabView p0,ValueAnimator p1){
       p0.I(p1);
    }
    public static int getRealTextSize(){
       Integer y0 = NasaTabView.Y0;
       if (y0 != null) {
          return y0.intValue();
       }
       if (n.y(a.B) <= a1.e(360.00f) && o.a()) {
          NasaTabView.Y0 = Integer.valueOf(16);
          return 16;
       }else {
          NasaTabView.Y0 = Integer.valueOf(17);
          return 17;
       }
    }
    public static int getSelectedTextSizeZh(){
       if (b.g()) {
          return 17;
       }
       return 16;
    }
    public final void A(){
       this.c.clearAnimation();
       this.c.animate().scaleX(0).scaleY(0).alpha(0).setDuration(200).setInterpolator(new AccelerateDecelerateInterpolator()).start();
    }
    public final void B(View p0,f$j p1){
       p0.clearAnimation();
       p0.animate().scaleY(0).scaleX(0).alpha(0).setDuration(240).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(p1).start();
    }
    public final void C(Context p0,AttributeSet p1){
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.F3);
          this.k = typedArray.getColor(0, this.getResources().getColor(0x7f061fcd));
          this.m = typedArray.getColor(1, this.getResources().getColor(0x7f061fcd));
          this.l = typedArray.getColor(2, this.getResources().getColor(0x7f061c32));
          typedArray.recycle();
       }
       this.setWillNotDraw(0);
       TextPaint textPaint = new TextPaint();
       this.j = textPaint;
       textPaint.setAntiAlias(1);
       this.j.setDither(1);
       return;
    }
    public final void D(){
       if (this.w != null) {
          return;
       }
       KwaiImageView kwaiImageVie = new KwaiImageView(this.getContext());
       this.w = kwaiImageVie;
       kwaiImageVie.setScaleType(ImageView$ScaleType.FIT_XY);
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(a1.e(28.00f), a1.e(28.00f));
       layoutParams.gravity = 17;
       this.w.setLayoutParams(layoutParams);
       this.addView(this.w);
       return;
    }
    public final void E(){
       if (this.x != null) {
          return;
       }
       KwaiImageView kwaiImageVie = new KwaiImageView(this.getContext());
       this.x = kwaiImageVie;
       kwaiImageVie.setPlaceHolderImage(a1.f(R.drawable.detail_avatar_secret));
       this.x.setFailureImage(a1.f(R.drawable.detail_avatar_secret));
       this.x.setScaleType(ImageView$ScaleType.FIT_XY);
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(a1.e(24.00f), a1.e(24.00f));
       layoutParams.gravity = 17;
       this.x.setLayoutParams(layoutParams);
       this.addView(this.x);
       return;
    }
    public final void F(List p0){
       if (this.z != null || (!q.f(p0) && p0.size() >= 3)) {
          this.z = new TabTripleImageRotateView(this.getContext());
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(a1.e(40.00f), a1.e(24.00f));
          layoutParams.gravity = 17;
          this.z.setLayoutParams(layoutParams);
          this.addView(this.z);
          this.s = true;
       }
    label_003f :
       return;
    }
    public final void G(List p0){
       if (this.A != null || (!q.f(p0) && p0.size() >= 3)) {
          this.A = new TabTripleStaticImage(this.getContext());
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(a1.e(40.00f), a1.e(24.00f));
          layoutParams.gravity = 17;
          this.A.setLayoutParams(layoutParams);
          this.addView(this.A);
          this.t = true;
       }
    label_003f :
       return;
    }
    public final void H(List p0){
       if (this.y != null || (!q.f(p0) && p0.size() >= 3)) {
          this.y = new TabDoubleImageRotateView(this.getContext());
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(a1.e(40.00f), a1.e(24.00f));
          layoutParams.gravity = 17;
          this.y.setLayoutParams(layoutParams);
          this.addView(this.y);
          this.r = true;
       }
    label_003f :
       return;
    }
    public boolean K(){
       NasaTabView td = this.d;
       boolean b = (td != null && !td.getVisibility())? true: false;
       return b;
    }
    public void L(boolean p0){
       this.b.animate().scaleX(this.i).scaleY(this.i).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(150).start();
    }
    public void M(int p0){
       this.k = p0;
       this.postInvalidate();
    }
    public void N(int p0){
       this.m = p0;
       this.postInvalidate();
    }
    public void O(int p0){
       this.l = p0;
       this.postInvalidate();
    }
    public void P(){
       this.removeView(this.w);
       this.w = null;
    }
    public final void Q(){
       b9.a(this.G);
       NasaTabView tF = this.F;
       if (tF != null && tF.isRunning()) {
          this.F.cancel();
       }
       return;
    }
    public final void R(){
       NasaTabView ty = this.y;
       if (ty != null) {
          ty.f();
          this.y.b();
       }
       return;
    }
    public void S(){
       NasaTabView td = this.d;
       if (td != null) {
          td.setVisibility(8);
       }
       return;
    }
    public final void T(){
       this.c.clearAnimation();
       this.c.setScaleX(0x3f800000);
       this.c.setScaleY(0x3f800000);
       this.c.setAlpha(0x3f800000);
    }
    public final void U(){
       NasaTabView tz = this.z;
       if (tz != null) {
          tz.g();
          this.z.c();
       }
       return;
    }
    public void V(Drawable p0){
       this.o = true;
       this.D();
       AccelerateDecelerateInterpolator uAccelerateD = new AccelerateDecelerateInterpolator();
       NasaTabView tw = this.w;
       if (tw != null) {
          tw.clearAnimation();
          this.w.setImageDrawable(p0);
          this.w.animate().scaleX(0x3f800000).scaleY(0x3f800000).alpha(0x3f800000).setDuration(250).setInterpolator(uAccelerateD).start();
       }
       this.A();
       return;
    }
    public void W(Drawable p0,boolean p1){
       this.e = 5;
       this.q = true;
       this.E();
       View[] viewArray = new View[true];
       viewArray[0] = this.x;
       n.Z(0, viewArray);
       this.Q();
       NasaTabView tx = this.x;
       if (tx != null) {
          if (p0 != null) {
             tx.setImageDrawable(p0);
          }else {
             tx.setImageDrawable(a1.f(R.drawable.detail_avatar_secret));
          }
          if (p1) {
             this.h0();
          }else {
             this.e0();
          }
       }
       this.A();
       return;
    }
    public final void X(){
       if (this.I == null) {
          this.I = new KwaiImageView(this.getContext());
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(this.R, this.S);
          layoutParams.gravity = 17;
          this.I.getHierarchy().u(t$b.a);
          this.addView(this.I, layoutParams);
          this.i0();
       }
       this.I.setVisibility(0);
       this.c.setVisibility(8);
       this.b.setVisibility(8);
       return;
    }
    public final void Y(){
       if (this.U == null) {
          this.U = new LottieAnimationView(this.getContext());
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(this.W0, this.X0);
          layoutParams.gravity = 17;
          this.addView(this.U, layoutParams);
          this.j0();
       }
       this.U.setVisibility(0);
       NasaTabView tb = this.b;
       if (tb != null) {
          tb.setVisibility(8);
       }
       tb = this.c;
       if (tb != null) {
          tb.setVisibility(8);
       }
       return;
    }
    public void Z(Bitmap p0,boolean p1){
       if (p0 == null) {
          return;
       }
       this.D();
       View[] viewArray = new View[]{this.w};
       n.Z(0, viewArray);
       NasaTabView tw = this.w;
       if (tw != null && i0.X(tw)) {
          if (p1) {
             this.w.setAlpha(0);
             this.w.setScaleY(0);
             this.w.setScaleX(0);
             this.w.setImageBitmap(p0);
             this.g0(this.w, new NasaTabView$b(this));
             this.y();
          }else {
             this.y();
             this.w.setImageBitmap(p0);
          }
       }
       return;
    }
    public void a0(List p0){
       this.e = 7;
       this.F(p0);
       View[] viewArray = new View[]{this.z};
       n.Z(0, viewArray);
       this.s = true;
       NasaTabView tz = this.z;
       if (tz != null && i0.X(tz)) {
          this.A();
          this.z.a(p0);
          this.z.f();
       }
       return;
    }
    public void addView(View p0){
       super.addView(p0);
       if (p0 instanceof LinearLayout && p0.getId() == 0x7f0a3c8b) {
          this.setTabLayout(p0);
          this.setTextView(p0.findViewById(0x1020014));
          this.setIconImageView(p0.findViewById(R.id.tab_icon));
       }
       return;
    }
    public void b0(List p0){
       this.e = 8;
       this.G(p0);
       View[] viewArray = new View[]{this.A};
       n.Z(0, viewArray);
       this.t = true;
       if (this.A != null) {
          this.A();
          this.A.a(p0);
       }
       return;
    }
    public void c(d p0){
       if (p0.a != null) {
          this.V(p0.b);
       }else {
          this.q(p0.c);
       }
       return;
    }
    public final void c0(){
       this.c.clearAnimation();
       this.c.animate().alpha(0x3f800000).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(240).start();
    }
    public void d(e p0){
       e a = p0.a;
       this.e = a;
       this.f = p0.b;
       this.g = p0.c;
       this.h = p0.d;
       if (a == 5) {
          this.W(p0.g, p0.f());
       }else {
          this.r();
       }
       if (this.e == 6) {
          this.d0(p0.h);
       }else {
          this.z();
       }
       if (this.e == 7) {
          this.a0(p0.h);
       }else {
          this.w();
       }
       if (this.e == 8) {
          this.b0(p0.h);
       }else {
          this.x();
       }
       NasaTabView te = this.e;
       if (te == 9 || te == 10) {
          this.Z(p0.i, p0.f());
       }else {
          this.v(p0.f());
       }
       this.invalidate();
       return;
    }
    public void d0(List p0){
       this.e = 6;
       this.H(p0);
       View[] viewArray = new View[]{this.y};
       n.Z(0, viewArray);
       this.r = true;
       NasaTabView ty = this.y;
       if (ty != null && i0.X(ty)) {
          this.A();
          this.y.a(p0);
          this.y.e();
       }
       return;
    }
    public void draw(Canvas p0){
       super.draw(p0);
       if (this.u != null) {
          return;
       }
       NasaTabView te = this.e;
       if (te != 1) {
          if (te != 2) {
             if (te != 3) {
                if (te != 4) {
                   if (te != 9) {
                      if (te == 10 && this.p == null) {
                         this.m(p0);
                      }
                   }else if(this.p == null){
                      this.n(p0);
                   }
                }else if(this.p == null){
                   this.k(p0);
                }
             }else if(this.p == null){
                this.o(p0);
             }
          }else if(this.p == null){
             this.p(p0);
          }
       }else if(this.p == null){
          this.l(p0);
       }
       return;
    }
    public void e(h p0){
       if (p0.a != null) {
          p0 = p0.b;
          if (p0 != null) {
             this.J = p0.a;
             this.K = p0.b;
             this.L = p0.c;
             this.M = p0.d;
             this.N = p0.e;
             this.O = p0.f;
             this.P = p0.g;
             this.Q = p0.h;
             this.R = p0.i;
             this.S = p0.j;
             this.X();
             this.i0();
          label_003a :
             return;
          }
       }
       this.s();
       goto label_003a ;
    }
    public final void e0(){
       NasaTabView tx = this.x;
       if (tx == null) {
          return;
       }
       tx.clearAnimation();
       this.x.animate().scaleX(0x3f800000).scaleY(0x3f800000).alpha(0x3f800000).setDuration(250).setInterpolator(new AccelerateDecelerateInterpolator()).start();
       return;
    }
    public void f(i p0){
       if (p0.a != null) {
          p0 = p0.b;
          if (p0 != null) {
             this.V = p0.a;
             this.W = p0.b;
             this.U0 = p0.c;
             this.V0 = p0.d;
             this.W0 = p0.e;
             this.X0 = p0.f;
             this.Y();
             this.j0();
          label_002a :
             return;
          }
       }
       this.u();
       goto label_002a ;
    }
    public final void f0(){
       this.c.clearAnimation();
       this.c.animate().scaleX(0x3f800000).scaleY(0x3f800000).alpha(0x3f800000).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(240).start();
    }
    public final ValueAnimator g(){
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[4]{0x3f800000,0x3f900000,0x3f755326,0x3f800000});
       valueAnimato.setDuration(1050);
       valueAnimato.setInterpolator(new p(0.35f, 0, 0x3f266666, 0x3f800000));
       valueAnimato.addUpdateListener(new y(this));
       valueAnimato.addListener(new NasaTabView$d(this));
       return valueAnimato;
    }
    public final void g0(View p0,f$j p1){
       p0.clearAnimation();
       p0.animate().scaleY(0x3f800000).scaleX(0x3f800000).alpha(0x3f800000).setDuration(240).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(p1).start();
    }
    public int getCurrentBadgeStatus(){
       return this.e;
    }
    public int getImageViewLeft(){
       NasaTabView tI = this.I;
       if (tI == null) {
          return 0;
       }
       return tI.getLeft();
    }
    public final int getLayoutRight(){
       return this.c.getRight();
    }
    public final int getLayoutTop(){
       return this.c.getTop();
    }
    public List getSelectedCdnUrls(){
       return this.N;
    }
    public CharSequence getText(){
       return this.f;
    }
    public final int getTextSize(){
       if (this.n == null) {
          int realTextSize = (k1.h())? NasaTabView.getRealTextSize(): 14;
          this.n = realTextSize;
       }
       return this.n;
    }
    public int getTextViewRight(){
       this.j.setTextSize((float)n.c0(this.getContext(), (float)this.getTextSize()));
       return (int)((float)((this.c.getLeft() + this.c.getRight()) / 2) + (Layout.getDesiredWidth(this.b.getText(), this.j) / 2.00f));
    }
    public int getTextViewTop(){
       this.j.setTextSize((float)n.c0(this.getContext(), (float)this.getTextSize()));
       return (int)((float)((this.c.getTop() + this.c.getBottom()) / 2) - (Math.abs((this.j.descent() - this.j.ascent())) / 2.00f));
    }
    public List getUnSelectedCdnUrls(){
       return this.O;
    }
    public final AnimatorSet h(){
       NasaTabView tv = this.v;
       if (tv == null) {
          return null;
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(tv, "alpha", new float[2]{0x3f800000,0}),ObjectAnimator.ofFloat(this.v, "scaleX", new float[2]{0x3f800000,0}),ObjectAnimator.ofFloat(this.v, "scaleY", new float[2]{0x3f800000,0})};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.setDuration(150);
       uAnimatorSet.addListener(new NasaTabView$e(this));
       return uAnimatorSet;
    }
    public final void h0(){
       NasaTabView tx = this.x;
       if (tx != null && !i0.X(tx)) {
          return;
       }
       if (this.F == null) {
          this.F = this.g();
       }
       this.F.start();
       this.G = t.interval(2, TimeUnit.SECONDS).observeOn(d.a).subscribe(new z(this), Functions.d());
       return;
    }
    public KwaiImageView i(){
       KwaiImageView kwaiImageVie = new KwaiImageView(this.getContext());
       kwaiImageVie.setId(R.id.tab_icon);
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(a1.e(32.00f), a1.e(32.00f));
       layoutParams.gravity = 17;
       kwaiImageVie.setLayoutParams(layoutParams);
       kwaiImageVie.setVisibility(8);
       return kwaiImageVie;
    }
    public final void i0(){
       NasaTabView tJ;
       if (this.I == null) {
          return;
       }
       if (this.isSelected()) {
          tJ = this.J;
          if (tJ > null) {
             this.I.setPlaceHolderImage(tJ);
          }
       }else {
          tJ = this.K;
          if (tJ > null) {
             this.I.setPlaceHolderImage(tJ);
          }
       }
       f uof = f.x();
       if (this.isSelected()) {
          if (b.S(this.P)) {
             uof.s(Uri.fromFile(this.P));
          }
          if (!TextUtils.x(this.L)) {
             uof.t(this.L);
          }
          if (!q.f(this.N)) {
             uof.q(this.N);
          }
       }else if(b.S(this.Q)){
          uof.s(Uri.fromFile(this.Q));
       }
       if (!TextUtils.x(this.M)) {
          uof.t(this.M);
       }
       if (!q.f(this.O)) {
          uof.q(this.O);
       }
       b uob = null;
       d uod = this.I.g0(uob, uob, uof.w());
       NasaTabView tI = this.I;
       if (uod != null) {
          uod.s(this.T);
          uod.q(true);
          uob = uod.e();
       }
       tI.setController(uob);
       ViewGroup$LayoutParams layoutParams = this.I.getLayoutParams();
       layoutParams.width = this.R;
       layoutParams.height = this.S;
       this.I.setLayoutParams(layoutParams);
       return;
    }
    public final AnimatorSet j(){
       AnimatorSet uAnimatorSet = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(this.c, "alpha", new float[2]{0,0x3f800000}),ObjectAnimator.ofFloat(this.c, "scaleX", new float[2]{0,0x3f800000}),ObjectAnimator.ofFloat(this.c, "scaleY", new float[2]{0,0x3f800000})};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.setDuration(300);
       return uAnimatorSet;
    }
    public final void j0(){
       NasaTabView tU0;
       if (this.U == null) {
          return;
       }
       if (this.isSelected()) {
          if (!TextUtils.x(this.V)) {
             this.U.setAnimationFromUrl(this.V);
          }else {
             tU0 = this.U0;
             if (tU0 > null) {
                this.U.setAnimation(tU0);
             }
          }
       }else if(!TextUtils.x(this.W)){
          this.U.setAnimationFromUrl(this.W);
       }else {
          tU0 = this.V0;
          if (tU0 > null) {
             this.U.setAnimation(tU0);
          }
       }
       ViewGroup$LayoutParams layoutParams = this.U.getLayoutParams();
       layoutParams.width = this.W0;
       layoutParams.height = this.X0;
       this.U.setLayoutParams(layoutParams);
       return;
    }
    public final void k(Canvas p0){
       BitmapDrawable uBitmapDrawa = new BitmapDrawable(this.getResources(), this.h);
       int i = this.getTextViewRight() - a1.e(10.00f);
       int i1 = this.getTextViewTop() - a1.e(8.00f);
       if ((uBitmapDrawa.getIntrinsicWidth() + i) > this.getWidth()) {
          i = i - ((uBitmapDrawa.getIntrinsicWidth() + i) - this.getWidth());
       }
       p0.drawBitmap(uBitmapDrawa.getBitmap(), (float)i, (float)i1, null);
       return;
    }
    public final void l(Canvas p0){
       int i;
       int layoutTop;
       GradientDrawable gradientDraw = new GradientDrawable();
       NasaTabView td = this.d;
       float f = 3.00f;
       if (td != null && !td.getVisibility()) {
          i = this.getLayoutRight() - a1.e(f);
          layoutTop = this.getLayoutTop();
       }else {
          i = this.getTextViewRight() - a1.e(f);
          layoutTop = this.getTextViewTop();
       }
       int i1 = a1.e(7.00f);
       if ((i + i1) > this.getMeasuredWidth()) {
          i = this.getMeasuredWidth() - i1;
       }
       gradientDraw.setBounds(i, layoutTop, (i + i1), (layoutTop + i1));
       gradientDraw.setColor(this.k);
       gradientDraw.setCornerRadius(((float)i1 / 2.00f));
       gradientDraw.draw(p0);
       return;
    }
    public final void m(Canvas p0){
       GradientDrawable gradientDraw = new GradientDrawable();
       int i = ((this.c.getLeft() + this.c.getRight()) / 2) + a1.e(8.00f);
       int i1 = ((this.c.getTop() + this.c.getBottom()) / 2) - a1.e(13.00f);
       int i2 = a1.e(7.00f);
       if ((i + i2) > this.getMeasuredWidth()) {
          i = this.getMeasuredWidth() - i2;
       }
       gradientDraw.setBounds(i, i1, (i + i2), (i1 + i2));
       gradientDraw.setColor(this.k);
       gradientDraw.setCornerRadius(((float)i2 / 2.00f));
       gradientDraw.draw(p0);
       return;
    }
    public final void n(Canvas p0){
       GradientDrawable gradientDraw = new GradientDrawable();
       gradientDraw.setColor(this.k);
       gradientDraw.setCornerRadius((float)a1.e(20.00f));
       gradientDraw.setStroke(a1.e(0x3f800000), this.m);
       int i = ((this.c.getLeft() + this.c.getRight()) / 2) + a1.e(6.00f);
       int i1 = ((this.c.getTop() + this.c.getBottom()) / 2) - a1.e(17.00f);
       float f = 11.00f;
       this.j.setTextSize((float)n.c0(this.getContext(), f));
       this.j.setColor(this.l);
       this.j.setTypeface(d0.a("alte-din.ttf", this.getContext()));
       float desiredWidth = Layout.getDesiredWidth(this.f, this.j);
       desiredWidth = (this.f.length() == 1)? (float)a1.e(15.00f): desiredWidth + (float)a1.e(f);
       int i2 = a1.e(15.00f) + i1;
       gradientDraw.setBounds(i, i1, (int)((float)i + desiredWidth), i2);
       gradientDraw.draw(p0);
       Paint$FontMetricsInt fontMetricsI = this.j.getFontMetricsInt();
       this.j.setTextAlign(Paint$Align.CENTER);
       p0.drawText(this.f.toString(), (((float)(i + i) + desiredWidth) / 2.00f), (float)((((i2 + i1) - fontMetricsI.bottom) - fontMetricsI.top) / 2), this.j);
       return;
    }
    public final void o(Canvas p0){
       BitmapDrawable uBitmapDrawa = a1.f(this.g);
       int i = this.getTextViewRight() - a1.e(10.00f);
       int i1 = this.getTextViewTop() - a1.e(8.00f);
       if ((uBitmapDrawa.getIntrinsicWidth() + i) > this.getWidth()) {
          i = i - ((uBitmapDrawa.getIntrinsicWidth() + i) - this.getWidth());
       }
       p0.drawBitmap(uBitmapDrawa.getBitmap(), (float)i, (float)i1, null);
       return;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       NasaTabView te = this.e;
       if (te == 5 && this.q != null) {
          this.Q();
       }else if(te == 7 && this.s != null){
          this.U();
       }else if(te == 6 && this.r != null){
          this.R();
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0) {
          NasaTabView tb = this.b;
          tb.setPivotX(((float)tb.getWidth() * 0x3f000000));
          tb = this.b;
          tb.setPivotY(((float)tb.getHeight() * 0x3f000000));
       }
       return;
    }
    public final void p(Canvas p0){
       GradientDrawable gradientDraw = new GradientDrawable();
       gradientDraw.setColor(this.k);
       gradientDraw.setCornerRadius((float)a1.e(8.00f));
       gradientDraw.setStroke(a1.e(0x3f800000), this.m);
       int i = this.getTextViewRight() - a1.e(6.00f);
       int i1 = this.getTextViewTop() - a1.e(8.00f);
       this.j.setTextSize((float)n.c0(this.getContext(), 11.00f));
       this.j.setColor(this.l);
       this.j.setTypeface(d0.a("alte-din.ttf", this.getContext()));
       int i2 = a1.e(16.00f);
       float f = Math.max((float)a1.e(16.00f), (((float)i2 / 2.00f) + Layout.getDesiredWidth(this.f, this.j)));
       i2 = i2 + i1;
       gradientDraw.setBounds(i, i1, (int)((float)i + f), i2);
       gradientDraw.draw(p0);
       Paint$FontMetricsInt fontMetricsI = this.j.getFontMetricsInt();
       i2 = i2 + i1;
       this.j.setTextAlign(Paint$Align.CENTER);
       p0.drawText(this.f.toString(), (((float)(i + i) + f) / 2.00f), (float)(((i2 - fontMetricsI.bottom) - fontMetricsI.top) / 2), this.j);
    }
    public void q(boolean p0){
       if (this.o == null) {
          return;
       }
       if (p0) {
          NasaTabView tw = this.w;
          if (tw != null) {
             this.B(tw, new NasaTabView$a(this));
          }
          this.f0();
       }else {
          this.P();
          this.T();
          this.o = false;
       }
       return;
    }
    public void r(){
       if (this.q == null) {
          return;
       }
       this.q = false;
       View[] viewArray = new View[]{this.x};
       n.Z(8, viewArray);
       this.Q();
       this.f0();
       return;
    }
    public final void s(){
       NasaTabView tI = this.I;
       if (tI != null) {
          tI.setVisibility(8);
       }
       tI = this.c;
       if (tI != null) {
          tI.setVisibility(0);
       }
       tI = this.b;
       if (tI != null) {
          tI.setVisibility(0);
       }
       return;
    }
    public void setIconConfig(x p0){
       this.n = p0.a;
       int i = 0;
       if (this.d == null) {
          KwaiImageView kwaiImageVie = this.i();
          this.d = kwaiImageVie;
          this.c.addView(kwaiImageVie, i);
       }
       if (this.d != null) {
          NasaTabView tb = this.b;
          if (tb != null) {
             tb.setTextSize(1, (float)this.n);
             this.d.setVisibility(i);
             i.j(this.d, p0.c, null);
             this.M(p0.b);
          }
       }
       return;
    }
    public final void setIconImageView(KwaiImageView p0){
       this.d = p0;
    }
    public void setLoadingView(boolean p0){
       int i = (p0)? 0x7f081931: 0x7f081902;
       this.B = i;
       return;
    }
    public final void setPressed(boolean p0){
       super.setPressed(p0);
       this.L(p0);
    }
    public void setSelected(boolean p0){
       int i = (p0 == this.isSelected())? 1: 0;
       super.setSelected(p0);
       if (i) {
          this.i0();
          this.j0();
       }
       return;
    }
    public final void setTabLayout(LinearLayout p0){
       this.c = p0;
    }
    public void setTextColor(int p0){
       this.b.setTextColor(p0);
    }
    public void setTextShadow(boolean p0){
       int color = ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f061ed6);
       float f = (p0)? 0x3f800000: 0;
       this.b.setShadowLayer(f, f, f, color);
       return;
    }
    public void setTextSize(int p0){
       this.n = p0;
       NasaTabView tb = this.b;
       if (tb != null) {
          tb.setTextSize(1, (float)p0);
       }
       return;
    }
    public void setTextSizeScale(float p0){
       if (this.K()) {
          return;
       }
       p0 = (p0 * 0) + 0x3f800000;
       try{
          this.b.setScaleX(p0);
          this.b.setScaleY(p0);
       }catch(java.lang.Exception e0){
          i0.b("nasa_tab_view_exception", Log.getStackTraceString(e0));
       }
       this.i = p0;
       return;
    }
    public void setTextSizeScale(boolean p0){
       float f = (p0)? 0: 0x3f800000;
       this.setTextSizeScale(f);
       return;
    }
    public final void setTextView(CheckedTextView p0){
       this.b = p0;
       p0.setTextSize(1, (float)this.getTextSize());
       this.setTextSizeScale(false);
    }
    public void t(){
       if (this.u == null) {
          return;
       }
       boolean b = false;
       this.u = b;
       NasaTabView tC = this.C;
       if (tC != null) {
          tC.stop();
       }
       this.c.setVisibility(b);
       this.c.setAlpha(0);
       AnimatorSet uAnimatorSet = this.j();
       this.D = uAnimatorSet;
       uAnimatorSet.start();
       uAnimatorSet = this.h();
       this.E = uAnimatorSet;
       if (uAnimatorSet != null) {
          uAnimatorSet.start();
       }
       this.invalidate();
       return;
    }
    public final void u(){
       NasaTabView tU = this.U;
       if (tU != null) {
          tU.setVisibility(8);
       }
       tU = this.b;
       if (tU != null) {
          tU.setVisibility(0);
       }
       tU = this.c;
       if (tU != null) {
          tU.setVisibility(0);
       }
       return;
    }
    public void v(boolean p0){
       if (p0) {
          NasaTabView tw = this.w;
          if (tw != null) {
             this.B(tw, new NasaTabView$c(this));
          }
          this.c0();
       }else {
          View[] viewArray = new View[]{this.w};
          n.Z(8, viewArray);
          this.T();
       }
       return;
    }
    public void w(){
       if (this.s == null) {
          return;
       }
       this.U();
       View[] viewArray = new View[]{this.z};
       n.Z(8, viewArray);
       this.s = false;
       this.T();
       return;
    }
    public void x(){
       if (this.t == null) {
          return;
       }
       View[] viewArray = new View[]{this.A};
       n.Z(8, viewArray);
       this.t = false;
       this.T();
       return;
    }
    public final void y(){
       this.c.clearAnimation();
       this.c.animate().alpha(0).setDuration(200).setInterpolator(new AccelerateDecelerateInterpolator()).start();
    }
    public void z(){
       if (this.r == null) {
          return;
       }
       this.R();
       this.r = false;
       View[] viewArray = new View[]{this.y};
       n.Z(8, viewArray);
       this.T();
       return;
    }
}
