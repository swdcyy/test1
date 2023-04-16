package com.google.android.material.appbar.CollapsingToolbarLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import ck.c;
import android.view.View;
import rj.a;
import android.animation.TimeInterpolator;
import ll8.c$b;
import android.content.res.TypedArray;
import ck.k;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.CollapsingToolbarLayout$a;
import a2.z;
import a2.i0;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import sj.l;
import java.lang.Object;
import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import androidx.appcompat.widget.Toolbar;
import android.view.ViewParent;
import com.google.android.material.appbar.CollapsingToolbarLayout$LayoutParams;
import android.graphics.Canvas;
import a2.u0;
import android.view.ViewGroup;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.Typeface;
import java.lang.Math;
import z1.d;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout$c;
import com.google.android.material.appbar.AppBarLayout$c;
import ck.d;
import android.text.TextUtils;
import android.view.View$MeasureSpec;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.ColorDrawable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.a;

public class CollapsingToolbarLayout extends FrameLayout	// class@00161c
{
    public boolean b;
    public int c;
    public Toolbar d;
    public View e;
    public View f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final Rect k;
    public final c l;
    public boolean m;
    public boolean n;
    public Drawable o;
    public Drawable p;
    public int q;
    public boolean r;
    public ValueAnimator s;
    public long t;
    public int u;
    public AppBarLayout$c v;
    public int w;
    public u0 x;

    public void CollapsingToolbarLayout(Context p0){
       super(p0, null);
    }
    public void CollapsingToolbarLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CollapsingToolbarLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = true;
       this.k = new Rect();
       this.u = -1;
       c uoc = new c(this);
       this.l = uoc;
       uoc.U(a.e);
       int[] ointArray = new int[0];
       TypedArray typedArray = k.h(p0, p1, c$b.P, p2, R.style.arg_RES_7f1104bc, ointArray);
       uoc.M(typedArray.getInt(3, 0x800053));
       uoc.H(typedArray.getInt(0, 0x800013));
       int dimensionPix = typedArray.getDimensionPixelSize(4, 0);
       this.j = dimensionPix;
       this.i = dimensionPix;
       this.h = dimensionPix;
       this.g = dimensionPix;
       dimensionPix = 7;
       if (typedArray.hasValue(dimensionPix)) {
          this.g = typedArray.getDimensionPixelSize(dimensionPix, 0);
       }
       dimensionPix = 6;
       if (typedArray.hasValue(dimensionPix)) {
          this.i = typedArray.getDimensionPixelSize(dimensionPix, 0);
       }
       dimensionPix = 8;
       if (typedArray.hasValue(dimensionPix)) {
          this.h = typedArray.getDimensionPixelSize(dimensionPix, 0);
       }
       dimensionPix = 5;
       if (typedArray.hasValue(dimensionPix)) {
          this.j = typedArray.getDimensionPixelSize(dimensionPix, 0);
       }
       this.m = typedArray.getBoolean(14, true);
       this.setTitle(typedArray.getText(13));
       uoc.K(R.style.arg_RES_7f110315);
       uoc.F(R.style.arg_RES_7f1102fb);
       dimensionPix = 9;
       if (typedArray.hasValue(dimensionPix)) {
          uoc.K(typedArray.getResourceId(dimensionPix, 0));
       }
       if (typedArray.hasValue(true)) {
          uoc.F(typedArray.getResourceId(true, 0));
       }
       this.u = typedArray.getDimensionPixelSize(11, -1);
       this.t = (long)typedArray.getInt(10, 600);
       this.setContentScrim(typedArray.getDrawable(2));
       this.setStatusBarScrim(typedArray.getDrawable(12));
       this.c = typedArray.getResourceId(15, -1);
       typedArray.recycle();
       this.setWillNotDraw(0);
       i0.I0(this, new CollapsingToolbarLayout$a(this));
       return;
    }
    public static int f(View p0){
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          return ((p0.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin);
       }
       return p0.getHeight();
    }
    public static l h(View p0){
       l tag = p0.getTag(R.id.view_offset_helper);
       if (tag == null) {
          tag = new l(p0);
          p0.setTag(R.id.view_offset_helper, tag);
       }
       return tag;
    }
    public final void a(int p0){
       this.b();
       CollapsingToolbarLayout ts = this.s;
       if (ts == null) {
          ValueAnimator valueAnimato = new ValueAnimator();
          this.s = valueAnimato;
          valueAnimato.setDuration(this.t);
          ts = this.s;
          TimeInterpolator c = (p0 > this.q)? a.c: a.d;
          ts.setInterpolator(c);
          this.s.addUpdateListener(new CollapsingToolbarLayout$b(this));
       }else if(ts.isRunning()){
          this.s.cancel();
       }
       int[] ointArray = new int[]{this.q,p0};
       this.s.setIntValues(ointArray);
       this.s.start();
       return;
    }
    public final void b(){
       if (this.b == null) {
          return;
       }
       Toolbar toolbar = null;
       this.d = toolbar;
       this.e = toolbar;
       CollapsingToolbarLayout tc = this.c;
       if (tc != -1) {
          Toolbar toolbar1 = this.findViewById(tc);
          this.d = toolbar1;
          if (toolbar1 != null) {
             this.e = this.c(toolbar1);
          }
       }
       if (this.d == null) {
          int childCount = this.getChildCount();
          int i = 0;
          while (i < childCount) {
             View childAt = this.getChildAt(i);
             if (childAt instanceof Toolbar) {
                toolbar = childAt;
                break ;
             }
             i = i + 1;
          }
          this.d = toolbar;
       }
       this.m();
       this.b = false;
       return;
    }
    public final View c(View p0){
       for (ViewParent parent = p0.getParent(); parent != this && parent != null; parent = parent.getParent()) {
          if (parent instanceof View) {
             ViewParent viewParent = parent;
          }
       }
       return p0;
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       return p0 instanceof CollapsingToolbarLayout$LayoutParams;
    }
    public CollapsingToolbarLayout$LayoutParams d(){
       return new CollapsingToolbarLayout$LayoutParams(-1, -1);
    }
    public void draw(Canvas p0){
       CollapsingToolbarLayout to;
       super.draw(p0);
       this.b();
       if (this.d == null) {
          to = this.o;
          if (to != null && this.q > null) {
             to.mutate().setAlpha(this.q);
             this.o.draw(p0);
          }
       }
       if (this.m != null && this.n != null) {
          this.l.i(p0);
       }
       if (this.p != null && this.q > null) {
          to = this.x;
          int i = 0;
          int i1 = (to != null)? to.k(): 0;
          if (i1 > 0) {
             this.p.setBounds(i, (- this.w), this.getWidth(), (i1 - this.w));
             this.p.mutate().setAlpha(this.q);
             this.p.draw(p0);
          }
       }
    label_0061 :
       return;
    }
    public boolean drawChild(Canvas p0,View p1,long p2){
       int i;
       boolean b = true;
       if (this.o != null && (this.q > null && this.i(p1))) {
          this.o.mutate().setAlpha(this.q);
          this.o.draw(p0);
          i = 1;
       }else {
          i = 0;
       }
       if (!super.drawChild(p0, p1, p2) && !i) {
          b = false;
       }
       return b;
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       int[] drawableStat = this.getDrawableState();
       CollapsingToolbarLayout tp = this.p;
       int i = 0;
       if (tp != null && tp.isStateful()) {
          i = i | tp.setState(drawableStat);
       }
       tp = this.o;
       if (tp != null && tp.isStateful()) {
          i = i | tp.setState(drawableStat);
       }
       tp = this.l;
       if (tp != null) {
          i = i | tp.S(drawableStat);
       }
       if (i) {
          this.invalidate();
       }
       return;
    }
    public FrameLayout$LayoutParams e(ViewGroup$LayoutParams p0){
       return new CollapsingToolbarLayout$LayoutParams(p0);
    }
    public final int g(View p0){
       return (((this.getHeight() - CollapsingToolbarLayout.h(p0).a()) - p0.getHeight()) - p0.getLayoutParams().bottomMargin);
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return this.d();
    }
    public FrameLayout$LayoutParams generateDefaultLayoutParams(){
       return this.d();
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return this.generateLayoutParams(p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       return this.e(p0);
    }
    public FrameLayout$LayoutParams generateLayoutParams(AttributeSet p0){
       return new CollapsingToolbarLayout$LayoutParams(this.getContext(), p0);
    }
    public int getCollapsedTitleGravity(){
       return this.l.m();
    }
    public Typeface getCollapsedTitleTypeface(){
       return this.l.o();
    }
    public Drawable getContentScrim(){
       return this.o;
    }
    public int getExpandedTitleGravity(){
       return this.l.r();
    }
    public int getExpandedTitleMarginBottom(){
       return this.j;
    }
    public int getExpandedTitleMarginEnd(){
       return this.i;
    }
    public int getExpandedTitleMarginStart(){
       return this.g;
    }
    public int getExpandedTitleMarginTop(){
       return this.h;
    }
    public Typeface getExpandedTitleTypeface(){
       return this.l.s();
    }
    public int getScrimAlpha(){
       return this.q;
    }
    public long getScrimAnimationDuration(){
       return this.t;
    }
    public int getScrimVisibleHeightTrigger(){
       CollapsingToolbarLayout tu = this.u;
       if (tu >= null) {
          return tu;
       }
       tu = this.x;
       int i = (tu != null)? tu.k(): 0;
       int i1 = i0.C(this);
       if (i1 > 0) {
          return Math.min(((i1 * 2) + i), this.getHeight());
       }else {
          return (this.getHeight() / 3);
       }
    }
    public Drawable getStatusBarScrim(){
       return this.p;
    }
    public CharSequence getTitle(){
       CharSequence uCharSequenc = (this.m != null)? this.l.u(): null;
       return uCharSequenc;
    }
    public final boolean i(View p0){
       CollapsingToolbarLayout te = this.e;
       boolean b = true;
       if (te == null || te == this) {
          if (p0 != this.d) {
          label_0011 :
             b = false;
          }
       }else if(p0 == te){
       }
       return b;
    }
    public u0 j(u0 p0){
       Object obj = (i0.y(this))? p0: null;
       if (!d.a(this.x, obj)) {
          this.x = obj;
          this.requestLayout();
       }
       return p0.c();
    }
    public void k(boolean p0,boolean p1){
       if (this.r != p0) {
          int i = 255;
          if (p1) {
             if (!p0) {
                i = 0;
             }
             this.a(i);
          }else if(p0){
             i = 0;
          }
          this.setScrimAlpha(i);
          this.r = p0;
       }
       return;
    }
    public final void l(){
       this.setContentDescription(this.getTitle());
    }
    public final void m(){
       if (this.m == null) {
          CollapsingToolbarLayout tf = this.f;
          if (tf != null) {
             ViewParent parent = tf.getParent();
             if (parent instanceof ViewGroup) {
                parent.removeView(this.f);
             }
          }
       }
       if (this.m != null && this.d != null) {
          if (this.f == null) {
             this.f = new View(this.getContext());
          }
          if (this.f.getParent() == null) {
             this.d.addView(this.f, -1, -1);
          }
       }
    label_003e :
       return;
    }
    public final void n(){
       if (this.o != null || this.p != null) {
          boolean b = ((this.getHeight() + this.w) < this.getScrimVisibleHeightTrigger())? true: false;
          this.setScrimsShown(b);
       }
       return;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       ViewParent parent = this.getParent();
       if (parent instanceof AppBarLayout) {
          i0.B0(this, i0.y(parent));
          if (this.v == null) {
             this.v = new CollapsingToolbarLayout$c(this);
          }
          parent.c(this.v);
          i0.p0(this);
       }
       return;
    }
    public void onDetachedFromWindow(){
       ViewParent parent = this.getParent();
       CollapsingToolbarLayout tv = this.v;
       if (tv != null && parent instanceof AppBarLayout) {
          parent.o(tv);
       }
       super.onDetachedFromWindow();
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i1;
       int childCount;
       super.onLayout(p0, p1, p2, p3, p4);
       CollapsingToolbarLayout tx = this.x;
       int i = 0;
       if (tx != null) {
          i1 = tx.k();
          childCount = this.getChildCount();
          int i2 = 0;
          while (i2 < childCount) {
             View childAt = this.getChildAt(i2);
             if (!i0.y(childAt) && childAt.getTop() < i1) {
                i0.e0(childAt, i1);
             }
             i2 = i2 + 1;
          }
       }
       if (this.m != null) {
          tx = this.f;
          if (tx != null) {
             childCount = 1;
             tx = (i0.X(tx) && !this.f.getVisibility())? true: false;
             this.n = tx;
             if (tx) {
                if (i0.B(this) != childCount) {
                   childCount = 0;
                }
                tx = this.e;
                if (tx == null) {
                   tx = this.d;
                }
                i1 = this.g(tx);
                d.a(this, this.f, this.k);
                CollapsingToolbarLayout tl = this.l;
                Rect left = this.k.left;
                int titleMarginE = (childCount)? this.d.getTitleMarginEnd(): this.d.getTitleMarginStart();
                int i3 = left + titleMarginE;
                titleMarginE = (this.k.top + i1) + this.d.getTitleMarginTop();
                Rect right = this.k.right;
                int titleMarginS = (childCount)? this.d.getTitleMarginStart(): this.d.getTitleMarginEnd();
                tl.E(i3, titleMarginE, (right + titleMarginS), ((this.k.bottom + i1) - this.d.getTitleMarginBottom()));
                tx = this.l;
                tl = (childCount)? this.i: this.g;
                i3 = this.k.top + this.h;
                p3 = p3 - p1;
                CollapsingToolbarLayout tg = (childCount)? this.g: this.i;
                tx.J(tl, i3, (p3 - tg), ((p4 - p2) - this.j));
                this.l.C();
             }
          }
       }
       i1 = this.getChildCount();
       for (; i < i1; i = i + 1) {
          CollapsingToolbarLayout.h(this.getChildAt(i)).d();
       }
       if (this.d != null) {
          if (this.m != null && TextUtils.isEmpty(this.l.u())) {
             this.setTitle(this.d.getTitle());
          }
          tx = this.e;
          if (tx == null || tx == this) {
             this.setMinimumHeight(CollapsingToolbarLayout.f(this.d));
          }else {
             this.setMinimumHeight(CollapsingToolbarLayout.f(tx));
          }
       }
       this.n();
       return;
    }
    public void onMeasure(int p0,int p1){
       this.b();
       super.onMeasure(p0, p1);
       p1 = View$MeasureSpec.getMode(p1);
       CollapsingToolbarLayout tx = this.x;
       int i = (tx != null)? tx.k(): 0;
       if (!p1 && i > 0) {
          super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec((this.getMeasuredHeight() + i), 0x40000000));
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       CollapsingToolbarLayout to = this.o;
       if (to != null) {
          to.setBounds(0, 0, p0, p1);
       }
       return;
    }
    public void setCollapsedTitleGravity(int p0){
       this.l.H(p0);
    }
    public void setCollapsedTitleTextAppearance(int p0){
       this.l.F(p0);
    }
    public void setCollapsedTitleTextColor(int p0){
       this.setCollapsedTitleTextColor(ColorStateList.valueOf(p0));
    }
    public void setCollapsedTitleTextColor(ColorStateList p0){
       this.l.G(p0);
    }
    public void setCollapsedTitleTypeface(Typeface p0){
       this.l.I(p0);
    }
    public void setContentScrim(Drawable p0){
       CollapsingToolbarLayout to = this.o;
       if (to != p0) {
          Drawable$Callback uCallback = null;
          if (to != null) {
             to.setCallback(uCallback);
          }
          if (p0 != null) {
             uCallback = p0.mutate();
          }
          this.o = uCallback;
          if (uCallback != null) {
             uCallback.setBounds(0, 0, this.getWidth(), this.getHeight());
             this.o.setCallback(this);
             this.o.setAlpha(this.q);
          }
          i0.j0(this);
       }
       return;
    }
    public void setContentScrimColor(int p0){
       this.setContentScrim(new ColorDrawable(p0));
    }
    public void setContentScrimResource(int p0){
       this.setContentScrim(ContextCompat.getDrawable(this.getContext(), p0));
    }
    public void setExpandedTitleColor(int p0){
       this.setExpandedTitleTextColor(ColorStateList.valueOf(p0));
    }
    public void setExpandedTitleGravity(int p0){
       this.l.M(p0);
    }
    public void setExpandedTitleMarginBottom(int p0){
       this.j = p0;
       this.requestLayout();
    }
    public void setExpandedTitleMarginEnd(int p0){
       this.i = p0;
       this.requestLayout();
    }
    public void setExpandedTitleMarginStart(int p0){
       this.g = p0;
       this.requestLayout();
    }
    public void setExpandedTitleMarginTop(int p0){
       this.h = p0;
       this.requestLayout();
    }
    public void setExpandedTitleTextAppearance(int p0){
       this.l.K(p0);
    }
    public void setExpandedTitleTextColor(ColorStateList p0){
       this.l.L(p0);
    }
    public void setExpandedTitleTypeface(Typeface p0){
       this.l.O(p0);
    }
    public void setScrimAlpha(int p0){
       if (p0 != this.q) {
          if (this.o != null) {
             CollapsingToolbarLayout td = this.d;
             if (td != null) {
                i0.j0(td);
             }
          }
          this.q = p0;
          i0.j0(this);
       }
       return;
    }
    public void setScrimAnimationDuration(long p0){
       this.t = p0;
    }
    public void setScrimVisibleHeightTrigger(int p0){
       if (this.u != p0) {
          this.u = p0;
          this.n();
       }
       return;
    }
    public void setScrimsShown(boolean p0){
       boolean b = (i0.Y(this) && !this.isInEditMode())? true: false;
       this.k(p0, b);
       return;
    }
    public void setStatusBarScrim(Drawable p0){
       CollapsingToolbarLayout tp = this.p;
       if (tp != p0) {
          Drawable$Callback uCallback = null;
          if (tp != null) {
             tp.setCallback(uCallback);
          }
          if (p0 != null) {
             uCallback = p0.mutate();
          }
          this.p = uCallback;
          if (uCallback != null) {
             if (uCallback.isStateful()) {
                this.p.setState(this.getDrawableState());
             }
             a.m(this.p, i0.B(this));
             CollapsingToolbarLayout tp1 = this.p;
             boolean b = (!this.getVisibility())? true: false;
             tp1.setVisible(b, false);
             this.p.setCallback(this);
             this.p.setAlpha(this.q);
          }
          i0.j0(this);
       }
       return;
    }
    public void setStatusBarScrimColor(int p0){
       this.setStatusBarScrim(new ColorDrawable(p0));
    }
    public void setStatusBarScrimResource(int p0){
       this.setStatusBarScrim(ContextCompat.getDrawable(this.getContext(), p0));
    }
    public void setTitle(CharSequence p0){
       this.l.T(p0);
       this.l();
    }
    public void setTitleEnabled(boolean p0){
       if (p0 != this.m) {
          this.m = p0;
          this.l();
          this.m();
          this.requestLayout();
       }
       return;
    }
    public void setVisibility(int p0){
       super.setVisibility(p0);
       boolean b = (!p0)? true: false;
       CollapsingToolbarLayout tp = this.p;
       if (tp != null && tp.isVisible() != b) {
          this.p.setVisible(b, false);
       }
       tp = this.o;
       if (tp != null && tp.isVisible() != b) {
          this.o.setVisible(b, false);
       }
       return;
    }
    public boolean verifyDrawable(Drawable p0){
       boolean b = (!super.verifyDrawable(p0) && (p0 == this.o || p0 == this.p))? true: false;
       return b;
    }
}
