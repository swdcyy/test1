package com.google.android.material.floatingactionbutton.a;
import rj.a;
import com.google.android.material.internal.VisibilityAwareImageButton;
import gk.b;
import java.lang.Object;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Matrix;
import ck.i;
import com.google.android.material.floatingactionbutton.a$f;
import com.google.android.material.floatingactionbutton.a$i;
import android.animation.ValueAnimator;
import com.google.android.material.floatingactionbutton.a$e;
import com.google.android.material.floatingactionbutton.a$h;
import com.google.android.material.floatingactionbutton.a$d;
import android.widget.ImageButton;
import gk.a;
import android.animation.Animator$AnimatorListener;
import java.util.ArrayList;
import bk.a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import fk.a;
import ck.a;
import android.graphics.drawable.LayerDrawable;
import android.content.Context;
import rj.h;
import android.view.View;
import a2.i0;
import com.google.android.material.floatingactionbutton.a$g;
import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.material.floatingactionbutton.a$b;
import java.util.Iterator;
import android.graphics.Matrix$ScaleToFit;
import android.util.Property;
import android.animation.ObjectAnimator;
import java.lang.String;
import rj.i;
import rj.f;
import rj.g;
import android.animation.TypeEvaluator;
import java.util.List;
import rj.b;
import androidx.core.content.ContextCompat;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.google.android.material.floatingactionbutton.a$c;
import com.google.android.material.floatingactionbutton.a$a;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;

public class a	// class@001697
{
    public ViewTreeObserver$OnPreDrawListener A;
    public int a;
    public Animator b;
    public h c;
    public h d;
    public h e;
    public h f;
    public final i g;
    public a h;
    public float i;
    public Drawable j;
    public Drawable k;
    public a l;
    public Drawable m;
    public float n;
    public float o;
    public float p;
    public int q;
    public float r;
    public ArrayList s;
    public ArrayList t;
    public final VisibilityAwareImageButton u;
    public final b v;
    public final Rect w;
    public final RectF x;
    public final RectF y;
    public final Matrix z;
    public static final TimeInterpolator B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final int[] H;

    static {
       a.B = a.c;
       a.C = new int[2]{0x10100a7,0x101009e};
       a.D = new int[3]{0x1010367,0x101009c,0x101009e};
       a.E = new int[2]{0x101009c,0x101009e};
       a.F = new int[2]{0x1010367,0x101009e};
       int[] ointArray = new int[]{0x101009e};
       a.G = ointArray;
       ointArray = new int[0];
       a.H = ointArray;
    }
    public void a(VisibilityAwareImageButton p0,b p1){
       super();
       this.a = 0;
       this.r = 0x3f800000;
       this.w = new Rect();
       this.x = new RectF();
       this.y = new RectF();
       this.z = new Matrix();
       this.u = p0;
       this.v = p1;
       i oi = new i();
       this.g = oi;
       oi.a(a.C, this.f(new a$f(this)));
       oi.a(a.D, this.f(new a$e(this)));
       oi.a(a.E, this.f(new a$e(this)));
       oi.a(a.F, this.f(new a$e(this)));
       oi.a(a.G, this.f(new a$h(this)));
       oi.a(a.H, this.f(new a$d(this)));
       this.i = p0.getRotation();
    }
    public void A(int[] p0){
       this.g.d(p0);
    }
    public void B(float p0,float p1,float p2){
       a th = this.h;
       if (th != null) {
          th.l(p0, (this.p + p0));
          this.W();
       }
       return;
    }
    public void C(Rect p0){
    }
    public void D(){
       float rotation = this.u.getRotation();
       if (this.i - rotation) {
          this.i = rotation;
          this.U();
       }
       return;
    }
    public void E(Animator$AnimatorListener p0){
       a tt = this.t;
       if (tt == null) {
          return;
       }
       tt.remove(p0);
       return;
    }
    public void F(Animator$AnimatorListener p0){
       a ts = this.s;
       if (ts == null) {
          return;
       }
       ts.remove(p0);
       return;
    }
    public boolean G(){
       return (this instanceof a ^ 0x01);
    }
    public void H(ColorStateList p0,PorterDuff$Mode p1,ColorStateList p2,int p3){
       Drawable[] uDrawableArr;
       Drawable uDrawable = a.r(this.g());
       this.j = uDrawable;
       a.o(uDrawable, p0);
       if (p1 != null) {
          a.p(this.j, p1);
       }
       Drawable uDrawable1 = a.r(this.g());
       this.k = uDrawable1;
       a.o(uDrawable1, a.a(p2));
       int i = 1;
       if (p3 > 0) {
          a uoa = this.e(p3, p0);
          this.l = uoa;
          uDrawableArr = new Drawable[]{uoa,this.j,this.k};
       }else {
          this.l = null;
          uDrawableArr = new Drawable[]{this.j,this.k};
       }
       this.m = new LayerDrawable(uDrawableArr);
       a tn = this.n;
       a uoa1 = new a(this.u.getContext(), this.m, this.v.getRadius(), tn, (tn + this.p));
       this.h = new LayerDrawable(uDrawableArr);
       new LayerDrawable(uDrawableArr).i(0);
       this.v.e(this.h);
       return;
    }
    public void I(ColorStateList p0){
       a tj = this.j;
       if (tj != null) {
          a.o(tj, p0);
       }
       tj = this.l;
       if (tj != null) {
          tj.b(p0);
       }
       return;
    }
    public void J(PorterDuff$Mode p0){
       a tj = this.j;
       if (tj != null) {
          a.p(tj, p0);
       }
       return;
    }
    public final void K(float p0){
       if (this.n - p0) {
          this.n = p0;
          this.B(p0, this.o, this.p);
       }
       return;
    }
    public final void L(h p0){
       this.d = p0;
    }
    public final void M(float p0){
       if (this.o - p0) {
          this.o = p0;
          this.B(this.n, p0, this.p);
       }
       return;
    }
    public final void N(float p0){
       this.r = p0;
       a tz = this.z;
       this.c(p0, tz);
       this.u.setImageMatrix(tz);
    }
    public final void O(int p0){
       if (this.q != p0) {
          this.q = p0;
          this.V();
       }
       return;
    }
    public final void P(float p0){
       if (this.p - p0) {
          this.p = p0;
          this.B(this.n, this.o, p0);
       }
       return;
    }
    public void Q(ColorStateList p0){
       a tk = this.k;
       if (tk != null) {
          a.o(tk, a.a(p0));
       }
       return;
    }
    public final void R(h p0){
       this.c = p0;
    }
    public final boolean S(){
       boolean b = (i0.Y(this.u) && !this.u.isInEditMode())? true: false;
       return b;
    }
    public void T(a$g p0,boolean p1){
       if (this.t()) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          tb.cancel();
       }
       float f = 0x3f800000;
       if (this.S()) {
          if (this.u.getVisibility()) {
             float f1 = 0;
             this.u.setAlpha(f1);
             this.u.setScaleY(f1);
             this.u.setScaleX(f1);
             this.N(f1);
          }
          tb = this.c;
          if (tb == null) {
             h oh = this.k();
          }
          AnimatorSet uAnimatorSet = this.d(tb, f, f, f);
          uAnimatorSet.addListener(new a$b(this, p1, null));
          a ts = this.s;
          if (ts != null) {
             Iterator iterator = ts.iterator();
             while (iterator.hasNext()) {
                uAnimatorSet.addListener(iterator.next());
             }
          }
          uAnimatorSet.start();
       }else {
          this.u.c(0, p1);
          this.u.setAlpha(f);
          this.u.setScaleY(f);
          this.u.setScaleX(f);
          this.N(f);
       }
       return;
    }
    public final void U(){
       a th = this.h;
       if (th != null) {
          th.j((- this.i));
       }
       th = this.l;
       if (th != null) {
          th.e((- this.i));
       }
       return;
    }
    public final void V(){
       this.N(this.r);
    }
    public final void W(){
       a tw = this.w;
       this.o(tw);
       this.C(tw);
       this.v.a(tw.left, tw.top, tw.right, tw.bottom);
    }
    public void a(Animator$AnimatorListener p0){
       if (this.t == null) {
          this.t = new ArrayList();
       }
       this.t.add(p0);
       return;
    }
    public void b(Animator$AnimatorListener p0){
       if (this.s == null) {
          this.s = new ArrayList();
       }
       this.s.add(p0);
       return;
    }
    public final void c(float p0,Matrix p1){
       p1.reset();
       Drawable drawable = this.u.getDrawable();
       if (drawable != null && this.q != null) {
          a tx = this.x;
          a ty = this.y;
          tx.set(0, 0, (float)drawable.getIntrinsicWidth(), (float)drawable.getIntrinsicHeight());
          a tq = this.q;
          float f = (float)tq;
          ty.set(0, 0, f, (float)tq);
          p1.setRectToRect(tx, ty, Matrix$ScaleToFit.CENTER);
          tq = this.q;
          p1.postScale(p0, p0, ((float)tq / 2.00f), ((float)tq / 2.00f));
       }
       return;
    }
    public final AnimatorSet d(h p0,float p1,float p2,float p3){
       ArrayList uArrayList = new ArrayList();
       float[] uofloatArray = new float[]{p1};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.u, View.ALPHA, uofloatArray);
       p0.e("opacity").a(objectAnimat);
       uArrayList.add(objectAnimat);
       float[] uofloatArray1 = new float[]{p2};
       objectAnimat = ObjectAnimator.ofFloat(this.u, View.SCALE_X, uofloatArray1);
       p0.e("scale").a(objectAnimat);
       uArrayList.add(objectAnimat);
       uofloatArray = new float[]{p2};
       objectAnimat = ObjectAnimator.ofFloat(this.u, View.SCALE_Y, uofloatArray);
       p0.e("scale").a(objectAnimat);
       uArrayList.add(objectAnimat);
       this.c(p3, this.z);
       Matrix[] matrixArray = new Matrix[]{new Matrix(this.z)};
       objectAnimat = ObjectAnimator.ofObject(this.u, new f(), new g(), matrixArray);
       p0.e("iconScale").a(objectAnimat);
       uArrayList.add(objectAnimat);
       AnimatorSet uAnimatorSet = new AnimatorSet();
       b.a(uAnimatorSet, uArrayList);
       return uAnimatorSet;
    }
    public a e(int p0,ColorStateList p1){
       Context context = this.u.getContext();
       a uoa = this.v();
       int color = ContextCompat.getColor(context, R.color.arg_RES_7f06095e);
       int color1 = ContextCompat.getColor(context, R.color.arg_RES_7f06095d);
       int color2 = ContextCompat.getColor(context, R.color.arg_RES_7f06095b);
       uoa.d(color, color1, color2, ContextCompat.getColor(context, R.color.arg_RES_7f06095c));
       uoa.c((float)p0);
       uoa.b(p1);
       return uoa;
    }
    public final ValueAnimator f(a$i p0){
       ValueAnimator valueAnimato = new ValueAnimator();
       valueAnimato.setInterpolator(a.B);
       valueAnimato.setDuration(100);
       valueAnimato.addListener(p0);
       valueAnimato.addUpdateListener(p0);
       valueAnimato.setFloatValues(new float[2]{0,0x3f800000});
       return valueAnimato;
    }
    public GradientDrawable g(){
       GradientDrawable gradientDraw = this.w();
       gradientDraw.setShape(1);
       gradientDraw.setColor(-1);
       return gradientDraw;
    }
    public final void h(){
       if (this.A == null) {
          this.A = new a$c(this);
       }
       return;
    }
    public final Drawable i(){
       return this.m;
    }
    public final h j(){
       if (this.f == null) {
          this.f = h.c(this.u.getContext(), 0x7f020001);
       }
       return this.f;
    }
    public final h k(){
       if (this.e == null) {
          this.e = h.c(this.u.getContext(), 0x7f020002);
       }
       return this.e;
    }
    public float l(){
       return this.n;
    }
    public final h m(){
       return this.d;
    }
    public float n(){
       return this.o;
    }
    public void o(Rect p0){
       this.h.getPadding(p0);
    }
    public float p(){
       return this.p;
    }
    public final h q(){
       return this.c;
    }
    public void r(a$g p0,boolean p1){
       if (this.s()) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          tb.cancel();
       }
       if (this.S()) {
          tb = this.d;
          if (tb == null) {
             h oh = this.j();
          }
          AnimatorSet uAnimatorSet = this.d(tb, 0, 0, 0);
          uAnimatorSet.addListener(new a$a(this, p1, null));
          a tt = this.t;
          if (tt != null) {
             Iterator iterator = tt.iterator();
             while (iterator.hasNext()) {
                uAnimatorSet.addListener(iterator.next());
             }
          }
          uAnimatorSet.start();
       }else {
          tb = this.u;
          int i = (p1)? 8: 4;
          tb.c(i, p1);
       }
       return;
    }
    public boolean s(){
       boolean b = false;
       if (!this.u.getVisibility()) {
          if (this.a == 1) {
             b = true;
          }
          return b;
       }else if(this.a != 2){
          b = true;
       }
       return b;
    }
    public boolean t(){
       boolean b = false;
       if (this.u.getVisibility()) {
          if (this.a == 2) {
             b = true;
          }
          return b;
       }else if(this.a != 1){
          b = true;
       }
       return b;
    }
    public void u(){
       this.g.c();
    }
    public a v(){
       return new a();
    }
    public GradientDrawable w(){
       return new GradientDrawable();
    }
    public void x(){
       if (this.G()) {
          this.h();
          this.u.getViewTreeObserver().addOnPreDrawListener(this.A);
       }
       return;
    }
    public void y(){
    }
    public void z(){
       if (this.A != null) {
          this.u.getViewTreeObserver().removeOnPreDrawListener(this.A);
          this.A = null;
       }
       return;
    }
}
