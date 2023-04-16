package com.yxcorp.gifshow.homepage.kcube.actionbar.bottom.widget.BottomTabView;
import android.widget.FrameLayout;
import android.content.Context;
import com.yxcorp.gifshow.homepage.kcube.actionbar.bottom.widget.BottomTabView$a;
import android.util.AttributeSet;
import wq6.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import o56.a;
import com.yxcorp.utility.n;
import lnc.a1;
import hn5.o;
import sn5.e;
import java.lang.Boolean;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import a2.i0;
import android.animation.ValueAnimator;
import tyc.p;
import android.animation.TimeInterpolator;
import vsa.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import vsa.f;
import android.animation.Animator$AnimatorListener;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import vsa.b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.widget.TabDoubleImageRotateView;
import com.yxcorp.gifshow.widget.TabTripleImageRotateView;
import com.yxcorp.gifshow.widget.TabTripleStaticImage;
import android.widget.RelativeLayout;
import vsa.e;
import ekd.f$j;
import android.widget.LinearLayout;
import android.graphics.Bitmap;
import vsa.d;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.ImageSwitchView;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.graphics.Typeface;
import ekd.d0;
import java.lang.CharSequence;
import android.text.Layout;
import android.graphics.Paint$FontMetricsInt;
import android.graphics.Paint$Align;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import java.lang.Math;
import ll8.c$b;
import android.content.res.TypedArray;
import ekd.k1;
import lnc.b9;
import lnc.k2;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.lang.Runnable;
import android.os.Handler;
import androidx.core.content.ContextCompat;
import java.lang.Float;
import java.lang.Throwable;
import android.util.Log;
import hn5.i0;

public class BottomTabView extends FrameLayout	// class@0016f1
{
    public b A;
    public final h B;
    public final Runnable C;
    public CheckedTextView b;
    public LinearLayout c;
    public ImageSwitchView d;
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
    public KwaiImageView u;
    public KwaiImageView v;
    public TabDoubleImageRotateView w;
    public TabTripleImageRotateView x;
    public TabTripleStaticImage y;
    public ValueAnimator z;
    public static Integer D;

    public void BottomTabView(Context p0){
       super(p0);
       this.e = 0;
       this.o = false;
       this.p = false;
       this.q = false;
       this.r = false;
       this.s = false;
       this.t = false;
       this.C = new BottomTabView$a(this);
       this.B = null;
       this.e(p0, null);
    }
    public void BottomTabView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = 0;
       this.o = false;
       this.p = false;
       this.q = false;
       this.r = false;
       this.s = false;
       this.t = false;
       this.C = new BottomTabView$a(this);
       this.B = null;
       this.e(p0, p1);
    }
    public void BottomTabView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = 0;
       this.o = false;
       this.p = false;
       this.q = false;
       this.r = false;
       this.s = false;
       this.t = false;
       this.C = new BottomTabView$a(this);
       this.B = null;
       this.e(p0, p1);
    }
    public void BottomTabView(Context p0,h p1){
       super(p0);
       this.e = 0;
       this.o = false;
       this.p = false;
       this.q = false;
       this.r = false;
       this.s = false;
       this.t = false;
       this.C = new BottomTabView$a(this);
       this.B = p1;
       this.e(p0, null);
    }
    public static int getRealTextSize(){
       Integer obj = PatchProxy.apply(null, null, BottomTabView.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = BottomTabView.D;
       if (obj != null) {
          return obj.intValue();
       }
       if (n.y(a.B) <= a1.e(360.00f) && o.a()) {
          BottomTabView.D = Integer.valueOf(16);
          return 16;
       }else {
          BottomTabView.D = Integer.valueOf(17);
          return 17;
       }
    }
    public void a(e p0){
       BottomTabView uBottomTabVi2;
       BottomTabView te;
       boolean b1;
       View[] viewArray;
       BottomTabView tu;
       FrameLayout$LayoutParams layoutParams;
       View[] viewArray2;
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomTabView.class, "47")) {
          return;
       }
       e a = p0.a;
       this.e = a;
       this.f = p0.b;
       this.g = p0.c;
       this.h = p0.d;
       float f = 0;
       int i = 5;
       BottomTabView uBottomTabVi = 17;
       float f1 = 24.00f;
       BottomTabView uBottomTabVi1 = null;
       String str = 8;
       if (a == i) {
          a = p0.g;
          boolean b = p0.f();
          if (!PatchProxy.isSupport(BottomTabView.class) || !PatchProxy.applyVoidTwoRefs(a, Boolean.valueOf(b), this, BottomTabView.class, "33")) {
             this.e = i;
             this.q = true;
             int i1 = 0x7f08069a;
             if (!PatchProxy.applyVoid(uBottomTabVi1, this, BottomTabView.class, "59") && this.v == null) {
                KwaiImageView kwaiImageVie = new KwaiImageView(this.getContext());
                this.v = kwaiImageVie;
                kwaiImageVie.setPlaceHolderImage(a1.f(i1));
                this.v.setFailureImage(a1.f(i1));
                this.v.setScaleType(ImageView$ScaleType.FIT_XY);
                layoutParams = new FrameLayout$LayoutParams(a1.e(f1), a1.e(f1));
                layoutParams.gravity = uBottomTabVi;
                this.v.setLayoutParams(layoutParams);
                this.addView(this.v);
             }
             viewArray = new View[]{this.v};
             n.Z(0, viewArray);
             this.k();
             uBottomTabVi2 = this.v;
             if (uBottomTabVi2 != null) {
                if (a != null) {
                   uBottomTabVi2.setImageDrawable(a);
                }else {
                   uBottomTabVi2.setImageDrawable(a1.f(i1));
                }
                if (b) {
                   if (!PatchProxy.applyVoid(uBottomTabVi1, this, BottomTabView.class, "34")) {
                      te = this.v;
                      if (te == null || i0.X(te)) {
                         if (this.z == null) {
                            ValueAnimator valueAnimato = PatchProxy.apply(uBottomTabVi1, this, BottomTabView.class, "64");
                            if (valueAnimato != PatchProxyResult.class) {
                            }else {
                               valueAnimato = ValueAnimator.ofFloat(new float[4]{0x3f800000,0x3f900000,0x3f755326,0x3f800000});
                               valueAnimato.setDuration(1050);
                               valueAnimato.setInterpolator(new p(0.35f, f, 0x3f266666, 0x3f800000));
                               valueAnimato.addUpdateListener(new a(this));
                               valueAnimato.addListener(new f(this));
                            }
                            this.z = valueAnimato;
                         }
                         this.z.start();
                         this.A = t.interval(2, TimeUnit.SECONDS).observeOn(d.a).subscribe(new b(this), Functions.d());
                      }
                   }
                }else if(PatchProxy.applyVoid(uBottomTabVi1, this, BottomTabView.class, "37")){
                   te = this.v;
                   if (te != null) {
                      te.clearAnimation();
                      this.v.animate().scaleX(0x3f800000).scaleY(0x3f800000).alpha(0x3f800000).setDuration(250).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                   }
                }
             }
          label_016d :
             this.c();
          }
       }else if(PatchProxy.applyVoid(uBottomTabVi1, this, BottomTabView.class, "35") || this.q == null){
          this.q = false;
          viewArray2 = new View[]{this.v};
          n.Z(str, viewArray2);
          this.k();
          this.o();
       }
       i = 6;
       float f2 = 40.00f;
       Context uContext = 3;
       if (this.e == i) {
          a = p0.h;
          if (!PatchProxy.applyVoidOneRefs(a, this, BottomTabView.class, "56")) {
             this.e = i;
             if (PatchProxy.applyVoidOneRefs(a, this, BottomTabView.class, "60") || (this.w != null || (!q.f(a) && a.size() >= uContext))) {
                this.w = new TabDoubleImageRotateView(this.getContext());
                layoutParams = new FrameLayout$LayoutParams(a1.e(f2), a1.e(f1));
                layoutParams.gravity = uBottomTabVi;
                this.w.setLayoutParams(layoutParams);
                this.addView(this.w);
                this.r = true;
             }
          label_01ec :
             viewArray = new View[]{this.w};
             n.Z(0, viewArray);
             this.r = true;
             uBottomTabVi2 = this.w;
             if (uBottomTabVi2 != null && i0.X(uBottomTabVi2)) {
                this.c();
                this.w.a(a);
                this.w.e();
             }
          }
       }else if(PatchProxy.applyVoid(uBottomTabVi1, this, BottomTabView.class, "57") || this.r == null){
          this.l();
          this.r = false;
          viewArray2 = new View[]{this.w};
          n.Z(str, viewArray2);
          this.m();
       }
       uBottomTabVi2 = 7;
       if (this.e == uBottomTabVi2) {
          a = p0.h;
          if (!PatchProxy.applyVoidOneRefs(a, this, BottomTabView.class, "49")) {
             this.e = uBottomTabVi2;
             if (PatchProxy.applyVoidOneRefs(a, this, BottomTabView.class, "61") || (this.x != null || (!q.f(a) && a.size() >= uContext))) {
                this.x = new TabTripleImageRotateView(this.getContext());
                layoutParams = new FrameLayout$LayoutParams(a1.e(f2), a1.e(f1));
                layoutParams.gravity = uBottomTabVi;
                this.x.setLayoutParams(layoutParams);
                this.addView(this.x);
                this.s = true;
             }
          label_0287 :
             viewArray = new View[]{this.x};
             n.Z(0, viewArray);
             this.s = true;
             uBottomTabVi2 = this.x;
             if (uBottomTabVi2 != null && i0.X(uBottomTabVi2)) {
                this.c();
                this.x.a(a);
                this.x.f();
             }
          }
       }else if(PatchProxy.applyVoid(uBottomTabVi1, this, BottomTabView.class, "50") || this.s == null){
          this.n();
          viewArray2 = new View[]{this.x};
          n.Z(str, viewArray2);
          this.s = false;
          this.m();
       }
       if (this.e == str) {
          a = p0.h;
          if (!PatchProxy.applyVoidOneRefs(a, this, BottomTabView.class, "54")) {
             this.e = str;
             if (PatchProxy.applyVoidOneRefs(a, this, BottomTabView.class, "62") || (this.y != null || (!q.f(a) && a.size() >= uContext))) {
                this.y = new TabTripleStaticImage(this.getContext());
                layoutParams = new FrameLayout$LayoutParams(a1.e(f2), a1.e(f1));
                layoutParams.gravity = uBottomTabVi;
                this.y.setLayoutParams(layoutParams);
                this.addView(this.y);
                this.t = true;
             }
          label_0321 :
             viewArray = new View[]{this.y};
             n.Z(0, viewArray);
             this.t = true;
             if (this.y != null) {
                this.c();
                this.y.a(a);
             }
          }
       }else if(PatchProxy.applyVoid(uBottomTabVi1, this, BottomTabView.class, "55") || this.t == null){
          viewArray2 = new View[]{this.y};
          n.Z(str, viewArray2);
          this.t = false;
          this.m();
       }
       te = this.e;
       if (te == 9 || te == 10) {
          a = p0.i;
          b1 = p0.f();
          if (!PatchProxy.isSupport(BottomTabView.class) || (!PatchProxy.applyVoidTwoRefs(a, Boolean.valueOf(b1), this, BottomTabView.class, "51") && a != null)) {
             this.f();
             viewArray = new View[]{this.u};
             n.Z(0, viewArray);
             uBottomTabVi2 = this.u;
             if (uBottomTabVi2 != null && i0.X(uBottomTabVi2)) {
                if (b1) {
                   this.u.setAlpha(f);
                   this.u.setScaleY(f);
                   this.u.setScaleX(f);
                   this.u.setImageBitmap(a);
                   tu = this.u;
                   d uod = new d(this);
                   if (!PatchProxy.applyVoidTwoRefs(tu, uod, this, BottomTabView.class, "39")) {
                      tu.clearAnimation();
                      tu.animate().scaleY(0x3f800000).scaleX(0x3f800000).alpha(0x3f800000).setDuration(240).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(uod).start();
                   }
                   this.b();
                }else {
                   this.b();
                   this.u.setImageBitmap(a);
                }
             }
          }
       }else {
          b1 = p0.f();
          if (!PatchProxy.isSupport(BottomTabView.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b1), this, BottomTabView.class, "52")) {
             if (b1) {
                tu = this.u;
                if (tu != null) {
                   this.d(tu, new e(this));
                }
                if (!PatchProxy.applyVoid(uBottomTabVi1, this, BottomTabView.class, "41")) {
                   this.c.clearAnimation();
                   this.c.animate().alpha(0x3f800000).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(240).start();
                }
             }else {
                View[] viewArray1 = new View[]{this.u};
                n.Z(str, viewArray1);
                this.m();
             }
          }
       }
       this.invalidate();
       return;
    }
    public void addView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomTabView.class, "6")) {
          return;
       }
       super.addView(p0);
       if (p0 instanceof LinearLayout && p0.getId() == 0x7f0a3c8b) {
          this.setTabLayout(p0);
          this.setTextView(p0.findViewById(0x1020014));
          this.setIconImageView(p0.findViewById(R.id.tab_icon));
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, BottomTabView.class, "42")) {
          return;
       }
       this.c.clearAnimation();
       this.c.animate().alpha(0).setDuration(200).setInterpolator(new AccelerateDecelerateInterpolator()).start();
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, BottomTabView.class, "43")) {
          return;
       }
       this.c.clearAnimation();
       this.c.animate().scaleX(0).scaleY(0).alpha(0).setDuration(200).setInterpolator(new AccelerateDecelerateInterpolator()).start();
       return;
    }
    public final void d(View p0,f$j p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BottomTabView.class, "38")) {
          return;
       }
       p0.clearAnimation();
       p0.animate().scaleY(0).scaleX(0).alpha(0).setDuration(240).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(p1).start();
       return;
    }
    public void draw(Canvas p0){
       GradientDrawable gradientDraw;
       int i2;
       int i3;
       float desiredWidth;
       Paint$FontMetricsInt fontMetricsI;
       BitmapDrawable uBitmapDrawa;
       int i5;
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomTabView.class, "8")) {
          return;
       }
       super.draw(p0);
       BottomTabView te = this.e;
       float f = 7.00f;
       int i = 1;
       float f1 = 2.00f;
       if (te != i) {
          String str = "alte-din.ttf";
          BottomTabView uBottomTabVi = 0x41300000;
          int i1 = 0x40c00000;
          float f2 = 0x3f800000;
          float f3 = 8.00f;
          if (te != 2) {
             if (te != 3) {
                if (te != 4) {
                   if (te != 9) {
                      if (te != 10 || (this.p == null && !PatchProxy.applyVoidOneRefs(p0, this, BottomTabView.class, "12"))) {
                         gradientDraw = new GradientDrawable();
                         i = ((this.c.getLeft() + this.c.getRight()) / 2) + a1.e(f3);
                         i2 = ((this.c.getTop() + this.c.getBottom()) / 2) - a1.e(13.00f);
                         i3 = a1.e(f);
                         if ((i + i3) > this.getMeasuredWidth()) {
                            i = this.getMeasuredWidth() - i3;
                         }
                         gradientDraw.setBounds(i, i2, (i + i3), (i2 + i3));
                         gradientDraw.setColor(this.k);
                         gradientDraw.setCornerRadius(((float)i3 / f1));
                         gradientDraw.draw(p0);
                      }
                   }else if(this.p != null || PatchProxy.applyVoidOneRefs(p0, this, BottomTabView.class, "13")){
                      gradientDraw = new GradientDrawable();
                      gradientDraw.setColor(this.k);
                      gradientDraw.setCornerRadius((float)a1.e(20.00f));
                      gradientDraw.setStroke(a1.e(f2), this.m);
                      i3 = ((this.c.getLeft() + this.c.getRight()) / 2) + a1.e(i1);
                      int i4 = ((this.c.getTop() + this.c.getBottom()) / 2) - a1.e(17.00f);
                      this.j.setTextSize((float)n.c0(this.getContext(), uBottomTabVi));
                      this.j.setColor(this.l);
                      this.j.setTypeface(d0.a(str, this.getContext()));
                      desiredWidth = Layout.getDesiredWidth(this.f, this.j);
                      float f4 = (this.f.length() == i)? (float)a1.e(15.00f): (float)a1.e(uBottomTabVi) + desiredWidth;
                      i2 = a1.e(15.00f) + i4;
                      gradientDraw.setBounds(i3, i4, (int)((float)i3 + f4), i2);
                      gradientDraw.draw(p0);
                      fontMetricsI = this.j.getFontMetricsInt();
                      this.j.setTextAlign(Paint$Align.CENTER);
                      p0.drawText(this.f.toString(), (((float)(i3 + i3) + f4) / f1), (float)((((i2 + i4) - fontMetricsI.bottom) - fontMetricsI.top) / 2), this.j);
                   }
                }else if(this.p != null || PatchProxy.applyVoidOneRefs(p0, this, BottomTabView.class, "11")){
                   uBitmapDrawa = new BitmapDrawable(this.getResources(), this.h);
                   i3 = this.getTextViewRight() - a1.e(10.00f);
                   i = this.getTextViewTop() - a1.e(f3);
                   if ((uBitmapDrawa.getIntrinsicWidth() + i3) > this.getWidth()) {
                      i3 = i3 - ((uBitmapDrawa.getIntrinsicWidth() + i3) - this.getWidth());
                   }
                   p0.drawBitmap(uBitmapDrawa.getBitmap(), (float)i3, (float)i, null);
                }
             }else if(this.p != null || PatchProxy.applyVoidOneRefs(p0, this, BottomTabView.class, "10")){
                uBitmapDrawa = a1.f(this.g);
                i3 = this.getTextViewRight() - a1.e(10.00f);
                i = this.getTextViewTop() - a1.e(f3);
                if ((uBitmapDrawa.getIntrinsicWidth() + i3) > this.getWidth()) {
                   i3 = i3 - ((uBitmapDrawa.getIntrinsicWidth() + i3) - this.getWidth());
                }
                p0.drawBitmap(uBitmapDrawa.getBitmap(), (float)i3, (float)i, null);
             }
          }else if(this.p != null || PatchProxy.applyVoidOneRefs(p0, this, BottomTabView.class, "14")){
             gradientDraw = new GradientDrawable();
             gradientDraw.setColor(this.k);
             gradientDraw.setCornerRadius((float)a1.e(f3));
             gradientDraw.setStroke(a1.e(f2), this.m);
             BottomTabView td = this.d;
             if (td != null && !td.getVisibility()) {
                i3 = this.getLayoutRight() - a1.e(i1);
                i = this.getLayoutTop() + a1.e(f1);
             }else {
                i3 = this.getTextViewRight() - a1.e(i1);
                i = this.getTextViewTop() - a1.e(f3);
             }
             this.j.setTextSize((float)n.c0(this.getContext(), uBottomTabVi));
             this.j.setColor(this.l);
             this.j.setTypeface(d0.a(str, this.getContext()));
             i1 = a1.e(16.00f);
             desiredWidth = Math.max((float)a1.e(16.00f), (((float)i1 / f1) + Layout.getDesiredWidth(this.f, this.j)));
             i1 = i1 + i;
             gradientDraw.setBounds(i3, i, (int)((float)i3 + desiredWidth), i1);
             gradientDraw.draw(p0);
             fontMetricsI = this.j.getFontMetricsInt();
             this.j.setTextAlign(Paint$Align.CENTER);
             p0.drawText(this.f.toString(), (((float)(i3 + i3) + desiredWidth) / f1), (float)((((i1 + i) - fontMetricsI.bottom) - fontMetricsI.top) / 2), this.j);
          }
       }else if(this.p != null || PatchProxy.applyVoidOneRefs(p0, this, BottomTabView.class, "9")){
          gradientDraw = new GradientDrawable();
          BottomTabView td1 = this.d;
          desiredWidth = 3.00f;
          if (td1 != null && !td1.getVisibility()) {
             i = this.getLayoutRight() - a1.e(desiredWidth);
             i5 = this.getLayoutTop() + a1.e(desiredWidth);
          }else {
             i = this.getTextViewRight() - a1.e(desiredWidth);
             i5 = this.getTextViewTop();
          }
          i3 = a1.e(f);
          if ((i + i3) > this.getMeasuredWidth()) {
             i = this.getMeasuredWidth() - i3;
          }
          gradientDraw.setBounds(i, i5, (i + i3), (i5 + i3));
          gradientDraw.setColor(this.k);
          gradientDraw.setCornerRadius(((float)i3 / f1));
          gradientDraw.draw(p0);
       }
    label_0329 :
       return;
    }
    public final void e(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BottomTabView.class, "2")) {
          return;
       }
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
    public final void f(){
       if (PatchProxy.applyVoid(null, this, BottomTabView.class, "63")) {
          return;
       }
       if (this.u != null) {
          return;
       }
       KwaiImageView kwaiImageVie = new KwaiImageView(this.getContext());
       this.u = kwaiImageVie;
       kwaiImageVie.setScaleType(ImageView$ScaleType.FIT_XY);
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(a1.e(28.00f), a1.e(28.00f));
       layoutParams.gravity = 17;
       this.u.setLayoutParams(layoutParams);
       this.addView(this.u);
       return;
    }
    public void g(int p0){
       if (PatchProxy.isSupport(BottomTabView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BottomTabView.class, "3")) {
          return;
       }
       this.k = p0;
       this.postInvalidate();
       return;
    }
    public int getCurrentBadgeStatus(){
       return this.e;
    }
    public final int getLayoutRight(){
       Object obj = PatchProxy.apply(null, this, BottomTabView.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.getRight();
    }
    public final int getLayoutTop(){
       Object obj = PatchProxy.apply(null, this, BottomTabView.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.getTop();
    }
    public CharSequence getText(){
       return this.f;
    }
    public final int getTextSize(){
       Object obj = PatchProxy.apply(null, this, BottomTabView.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.n == null) {
          int realTextSize = (k1.h())? BottomTabView.getRealTextSize(): 14;
          this.n = realTextSize;
       }
       return this.n;
    }
    public int getTextViewRight(){
       Object obj = PatchProxy.apply(null, this, BottomTabView.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.j.setTextSize((float)n.c0(this.getContext(), (float)this.getTextSize()));
       return (int)((float)((this.c.getLeft() + this.c.getRight()) / 2) + (Layout.getDesiredWidth(this.b.getText(), this.j) / 2.00f));
    }
    public int getTextViewTop(){
       Object obj = PatchProxy.apply(null, this, BottomTabView.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.j.setTextSize((float)n.c0(this.getContext(), (float)this.getTextSize()));
       return (int)((float)((this.c.getTop() + this.c.getBottom()) / 2) - (Math.abs((this.j.descent() - this.j.ascent())) / 2.00f));
    }
    public void h(int p0){
       if (PatchProxy.isSupport(BottomTabView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BottomTabView.class, "4")) {
          return;
       }
       this.m = p0;
       this.postInvalidate();
       return;
    }
    public void i(int p0){
       if (PatchProxy.isSupport(BottomTabView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BottomTabView.class, "5")) {
          return;
       }
       this.l = p0;
       this.postInvalidate();
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, BottomTabView.class, "45")) {
          return;
       }
       this.removeView(this.u);
       this.u = null;
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, BottomTabView.class, "36")) {
          return;
       }
       b9.a(this.A);
       BottomTabView tz = this.z;
       if (tz != null && tz.isRunning()) {
          this.z.cancel();
       }
       return;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, BottomTabView.class, "58")) {
          return;
       }
       BottomTabView tw = this.w;
       if (tw != null) {
          tw.f();
          this.w.b();
       }
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, BottomTabView.class, "44")) {
          return;
       }
       this.c.clearAnimation();
       this.c.setScaleX(0x3f800000);
       this.c.setScaleY(0x3f800000);
       this.c.setAlpha(0x3f800000);
       return;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, BottomTabView.class, "53")) {
          return;
       }
       BottomTabView tx = this.x;
       if (tx != null) {
          tx.g();
          this.x.c();
       }
       return;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, BottomTabView.class, "40")) {
          return;
       }
       this.c.clearAnimation();
       this.c.animate().scaleX(0x3f800000).scaleY(0x3f800000).alpha(0x3f800000).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(240).start();
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, BottomTabView.class, "65")) {
          return;
       }
       super.onDetachedFromWindow();
       BottomTabView te = this.e;
       if (te == 5 && this.q != null) {
          this.k();
       }else if(te == 7 && this.s != null){
          this.n();
       }else if(te == 6 && this.r != null){
          this.l();
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(BottomTabView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, BottomTabView.class, "1")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0) {
          BottomTabView tb = this.b;
          tb.setPivotX(((float)tb.getWidth() * 0x3f000000));
          tb = this.b;
          tb.setPivotY(((float)tb.getHeight() * 0x3f000000));
       }
       return;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, BottomTabView.class, "27")) {
          return;
       }
       if (this.isInLayout()) {
          k2 b = k2.b;
          BottomTabView tC = this.C;
          Objects.requireNonNull(b);
          a.p(tC, "runnable");
          k2.a.removeCallbacks(tC);
          b.a(this.C);
       }
       return;
    }
    public final void setIconImageView(ImageSwitchView p0){
       this.d = p0;
    }
    public final void setPressed(boolean p0){
       if (PatchProxy.isSupport(BottomTabView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BottomTabView.class, "23")) {
          return;
       }
       super.setPressed(p0);
       if (!PatchProxy.isSupport(BottomTabView.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BottomTabView.class, "24")) {
          this.b.animate().scaleX(this.i).scaleY(this.i).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(150).start();
       }
       return;
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(BottomTabView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BottomTabView.class, "66")) {
          return;
       }
       this.isSelected();
       super.setSelected(p0);
       return;
    }
    public final void setTabLayout(LinearLayout p0){
       this.c = p0;
    }
    public void setTextColor(int p0){
       if (PatchProxy.isSupport(BottomTabView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BottomTabView.class, "19")) {
          return;
       }
       this.b.setTextColor(p0);
       return;
    }
    public void setTextShadow(boolean p0){
       if (PatchProxy.isSupport(BottomTabView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BottomTabView.class, "30")) {
          return;
       }
       int color = ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f061ed6);
       float f = (p0)? 0x3f800000: 0;
       this.b.setShadowLayer(f, f, f, color);
       return;
    }
    public void setTextSize(int p0){
       if (PatchProxy.isSupport(BottomTabView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BottomTabView.class, "26")) {
          return;
       }
       this.n = p0;
       BottomTabView tb = this.b;
       if (tb != null) {
          tb.setTextSize(1, (float)p0);
       }
       return;
    }
    public void setTextSizeScale(float p0){
       boolean b;
       if (PatchProxy.isSupport(BottomTabView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, BottomTabView.class, "21")) {
          return;
       }
       BottomTabView obj = PatchProxy.apply(null, this, BottomTabView.class, "20");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = this.d;
          b = (obj != null && !obj.getVisibility())? true: false;
       }
       if (b) {
          return;
       }else {
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
    }
    public void setTextSizeScale(boolean p0){
       if (PatchProxy.isSupport(BottomTabView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BottomTabView.class, "22")) {
          return;
       }
       float f = (p0)? 0: 0x3f800000;
       this.setTextSizeScale(f);
       return;
    }
    public final void setTextView(CheckedTextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomTabView.class, "7")) {
          return;
       }
       this.b = p0;
       p0.setTextSize(1, (float)this.getTextSize());
       this.setTextSizeScale(false);
       return;
    }
}
