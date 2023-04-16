package androidx.drawerlayout.widget.DrawerLayout;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import androidx.drawerlayout.widget.DrawerLayout$c;
import android.graphics.Paint;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import androidx.drawerlayout.widget.DrawerLayout$e;
import androidx.customview.widget.ViewDragHelper$c;
import androidx.customview.widget.ViewDragHelper;
import android.view.View;
import a2.i0;
import androidx.drawerlayout.widget.DrawerLayout$b;
import a2.a;
import androidx.drawerlayout.widget.DrawerLayout$a;
import android.view.View$OnApplyWindowInsetsListener;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Object;
import a2.g;
import android.graphics.Rect;
import androidx.core.graphics.drawable.a;
import androidx.drawerlayout.widget.DrawerLayout$d;
import java.util.List;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.lang.Math;
import android.graphics.Canvas;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Matrix;
import android.view.WindowInsets;
import android.view.KeyEvent;
import android.view.View$MeasureSpec;
import java.lang.IllegalStateException;
import android.os.Parcelable;
import androidx.drawerlayout.widget.DrawerLayout$SavedState;
import androidx.customview.view.AbsSavedState;
import java.lang.CharSequence;
import androidx.core.content.ContextCompat;
import android.graphics.drawable.ColorDrawable;

public class DrawerLayout extends ViewGroup	// class@000742
{
    public Drawable A;
    public CharSequence B;
    public CharSequence C;
    public Object D;
    public boolean E;
    public Drawable F;
    public Drawable G;
    public Drawable H;
    public Drawable I;
    public final ArrayList J;
    public Rect K;
    public Matrix L;
    public final DrawerLayout$c b;
    public float c;
    public int d;
    public int e;
    public float f;
    public Paint g;
    public final ViewDragHelper h;
    public final ViewDragHelper i;
    public final DrawerLayout$e j;
    public final DrawerLayout$e k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public DrawerLayout$d u;
    public List v;
    public float w;
    public float x;
    public Drawable y;
    public Drawable z;
    public static final int[] M;
    public static final int[] N;
    public static final boolean O;
    public static final boolean P;

    static {
       int[] ointArray = new int[]{0x1010434};
       DrawerLayout.M = ointArray;
       ointArray = new int[]{0x10100b3};
       DrawerLayout.N = ointArray;
       DrawerLayout.O = true;
       DrawerLayout.P = true;
    }
    public void DrawerLayout(Context p0){
       super(p0, null);
    }
    public void DrawerLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void DrawerLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new DrawerLayout$c();
       this.e = 0x99000000;
       this.g = new Paint();
       this.n = true;
       this.o = 3;
       this.p = 3;
       this.q = 3;
       this.r = 3;
       this.F = null;
       this.G = null;
       this.H = null;
       this.I = null;
       this.setDescendantFocusability(0x40000);
       DisplayMetrics density = c.c(this.getResources()).density;
       this.d = (int)((64.00f * density) + 0x3f000000);
       float f = 400.00f * density;
       DrawerLayout$e uoe = new DrawerLayout$e(this, 3);
       this.j = uoe;
       DrawerLayout$e uoe1 = new DrawerLayout$e(this, 5);
       this.k = uoe1;
       ViewDragHelper viewDragHelp = ViewDragHelper.create(this, 0x3f800000, uoe);
       this.h = viewDragHelp;
       viewDragHelp.setEdgeTrackingEnabled(true);
       viewDragHelp.setMinVelocity(f);
       uoe.q(viewDragHelp);
       ViewDragHelper viewDragHelp1 = ViewDragHelper.create(this, 0x3f800000, uoe1);
       this.i = viewDragHelp1;
       viewDragHelp1.setEdgeTrackingEnabled(2);
       viewDragHelp1.setMinVelocity(f);
       uoe1.q(viewDragHelp1);
       this.setFocusableInTouchMode(true);
       i0.D0(this, true);
       i0.s0(this, new DrawerLayout$b(this));
       boolean b = false;
       this.setMotionEventSplittingEnabled(b);
       if (i0.y(this)) {
          this.setOnApplyWindowInsetsListener(new DrawerLayout$a(this));
          this.setSystemUiVisibility(1280);
          TypedArray typedArray = p0.obtainStyledAttributes(DrawerLayout.M);
          this.y = typedArray.getDrawable(b);
          typedArray.recycle();
       }
       this.c = density * 10.00f;
       this.J = new ArrayList();
       return;
    }
    public static boolean A(View p0){
       boolean b = (i0.z(p0) != 4 && i0.z(p0) != 2)? true: false;
       return b;
    }
    public static String w(int p0){
       if ((p0 & 0x03) == 3) {
          return "LEFT";
       }
       if ((p0 & 0x05) == 5) {
          return "RIGHT";
       }
       return Integer.toHexString(p0);
    }
    public static boolean x(View p0){
       Drawable background = p0.getBackground();
       boolean b = (background != null && background.getOpacity() == -1)? true: false;
       return b;
    }
    public boolean B(View p0){
       boolean b = (p0.getLayoutParams().a == null)? true: false;
       return b;
    }
    public boolean C(View p0){
       if (!this.D(p0)) {
          throw new IllegalArgumentException("View "+p0+" is not a drawer");
       }
       int i = 1;
       if ((p0.getLayoutParams().d & i) != i) {
          i = false;
       }
       return i;
    }
    public boolean D(View p0){
       int i = g.b(p0.getLayoutParams().a, i0.B(p0));
       if (i & 0x03) {
          return true;
       }
       if (i & 0x05) {
          return true;
       }
       return false;
    }
    public boolean E(View p0){
       if (!this.D(p0)) {
          throw new IllegalArgumentException("View "+p0+" is not a drawer");
       }
       boolean b = (p0.getLayoutParams().b > 0)? true: false;
       return b;
    }
    public final boolean F(float p0,float p1,View p2){
       if (this.K == null) {
          this.K = new Rect();
       }
       p2.getHitRect(this.K);
       return this.K.contains((int)p0, (int)p1);
    }
    public final boolean G(Drawable p0,int p1){
       if (p0 == null || !a.h(p0)) {
          return false;
       }
       a.m(p0, p1);
       return true;
    }
    public void H(View p0,float p1){
       float f = (float)p0.getWidth();
       int i = (int)(f * p1) - (int)(this.u(p0) * f);
       if (this.c(p0, 3)) {
       }else {
          i = - i;
       }
       p0.offsetLeftAndRight(i);
       this.S(p0, p1);
       return;
    }
    public void I(int p0){
       this.J(p0, true);
    }
    public void J(int p0,boolean p1){
       View view = this.n(p0);
       if (view == null) {
          throw new IllegalArgumentException("No drawer view found with gravity "+DrawerLayout.w(p0));
       }
       this.L(view, p1);
       return;
    }
    public void K(View p0){
       this.L(p0, true);
    }
    public void L(View p0,boolean p1){
       if (!this.D(p0)) {
          throw new IllegalArgumentException("View "+p0+" is not a sliding drawer");
       }
       DrawerLayout$LayoutParams layoutParams = p0.getLayoutParams();
       if (this.n != null) {
          layoutParams.b = 0x3f800000;
          layoutParams.d = 1;
          this.T(p0, 1);
       }else {
          int i = 0;
          if (p1) {
             layoutParams.d = layoutParams.d | 0x02;
             if (this.c(p0, 3)) {
                this.h.smoothSlideViewTo(p0, i, p0.getTop());
             }else {
                this.i.smoothSlideViewTo(p0, (this.getWidth() - p0.getWidth()), p0.getTop());
             }
          }else {
             this.H(p0, 0x3f800000);
             this.U(layoutParams.a, i, p0);
             p0.setVisibility(i);
          }
       }
       this.invalidate();
       return;
    }
    public void M(DrawerLayout$d p0){
       if (p0 == null) {
          return;
       }
       DrawerLayout tv = this.v;
       if (tv == null) {
          return;
       }
       tv.remove(p0);
       return;
    }
    public final Drawable N(){
       DrawerLayout tF;
       int i = i0.B(this);
       if (!i) {
          tF = this.F;
          if (tF != null) {
             this.G(tF, i);
             return this.F;
          }
       }else {
          tF = this.G;
          if (tF != null) {
             this.G(tF, i);
             return this.G;
          }
       }
       return this.H;
    }
    public final Drawable O(){
       DrawerLayout tG;
       int i = i0.B(this);
       if (!i) {
          tG = this.G;
          if (tG != null) {
             this.G(tG, i);
             return this.G;
          }
       }else {
          tG = this.F;
          if (tG != null) {
             this.G(tG, i);
             return this.F;
          }
       }
       return this.I;
    }
    public final void P(){
       if (DrawerLayout.P) {
          return;
       }
       this.z = this.N();
       this.A = this.O();
       return;
    }
    public void Q(Object p0,boolean p1){
       this.D = p0;
       this.E = p1;
       boolean b = (!p1 && this.getBackground() == null)? true: false;
       this.setWillNotDraw(b);
       this.requestLayout();
       return;
    }
    public void R(int p0,int p1){
       View view;
       int i = g.b(p1, i0.B(this));
       if (p1 != 3) {
          if (p1 != 5) {
             if (p1 != 0x800003) {
                if (p1 == 0x800005) {
                   this.r = p0;
                }
             }else {
                this.q = p0;
             }
          }else {
             this.p = p0;
          }
       }else {
          this.o = p0;
       }
       if (p0) {
          DrawerLayout th = (i == 3)? this.h: this.i;
          th.cancel();
       }
       if (p0 != 1) {
          if (p0 == 2) {
             view = this.n(i);
             if (view != null) {
                this.K(view);
             }
          }
       }else {
          view = this.n(i);
          if (view != null) {
             this.f(view);
          }
       }
       return;
    }
    public void S(View p0,float p1){
       DrawerLayout$LayoutParams layoutParams = p0.getLayoutParams();
       if (!p1 - layoutParams.b) {
          return;
       }
       layoutParams.b = p1;
       this.l(p0, p1);
       return;
    }
    public final void T(View p0,boolean p1){
       int childCount = this.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          if (p1 || (!this.D(childAt) || (p1 && childAt == p0))) {
             i0.D0(childAt, 1);
          }else {
             i0.D0(childAt, 4);
          }
          i = i + 1;
       }
       return;
    }
    public void U(int p0,int p1,View p2){
       p0 = this.h.getViewDragState();
       int viewDragStat = this.i.getViewDragState();
       int i = 2;
       if (p0 == 1 || viewDragStat == 1) {
          i = 1;
       }else if(p0 == i || viewDragStat == i){
          i = 0;
       }
       if (p2 != null && !p1) {
          DrawerLayout$LayoutParams b = p2.getLayoutParams().b;
          if (!b) {
             this.j(p2);
          }else if(!b - 0x3f800000){
             this.k(p2);
          }
       }
       if (i != this.l) {
          this.l = i;
          DrawerLayout tv = this.v;
          if (tv != null) {
             for (tv = tv.size() - 1; tv >= 0; tv--) {
                this.v.get(tv).c(i);
             }
          }
       }
       return;
    }
    public void a(DrawerLayout$d p0){
       if (this.v == null) {
          this.v = new ArrayList();
       }
       this.v.add(p0);
       return;
    }
    public void addFocusables(ArrayList p0,int p1,int p2){
       if (this.getDescendantFocusability() == 0x60000) {
          return;
       }
       int childCount = this.getChildCount();
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (i1 < childCount) {
          View childAt = this.getChildAt(i1);
          if (this.D(childAt)) {
             if (this.C(childAt)) {
                childAt.addFocusables(p0, p1, p2);
                i2 = 1;
             }
          }else {
             this.J.add(childAt);
          }
          i1 = i1 + 1;
       }
       if (!i2) {
          childCount = this.J.size();
          while (i < childCount) {
             View view = this.J.get(i);
             if (!view.getVisibility()) {
                view.addFocusables(p0, p1, p2);
             }
             i = i + 1;
          }
       }
       this.J.clear();
       return;
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       super.addView(p0, p1, p2);
       if (this.o() != null || this.D(p0)) {
          i0.D0(p0, 4);
       }else {
          i0.D0(p0, 1);
       }
       if (!DrawerLayout.O) {
          i0.s0(p0, this.b);
       }
       return;
    }
    public void b(){
       if (this.t == null) {
          long l = SystemClock.uptimeMillis();
          MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0, 0, 0);
          int childCount = this.getChildCount();
          for (int i = 0; i < childCount; i = i + 1) {
             this.getChildAt(i).dispatchTouchEvent(motionEvent);
          }
          motionEvent.recycle();
          this.t = true;
       }
       return;
    }
    public boolean c(View p0,int p1){
       boolean b = ((this.t(p0) & p1) == p1)? true: false;
       return b;
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       boolean b = (p0 instanceof DrawerLayout$LayoutParams && super.checkLayoutParams(p0))? true: false;
       return b;
    }
    public void computeScroll(){
       int childCount = this.getChildCount();
       float f = 0;
       for (int i = 0; i < childCount; i = i + 1) {
          f = Math.max(f, this.getChildAt(i).getLayoutParams().b);
       }
       this.f = f;
       boolean b = this.i.continueSettling(true);
       if (this.h.continueSettling(true) || b) {
          i0.j0(this);
       }
       return;
    }
    public void d(int p0){
       this.e(p0, true);
    }
    public boolean dispatchGenericMotionEvent(MotionEvent p0){
       if ((p0.getSource() & 0x02) && (p0.getAction() == 10 || this.f <= 0)) {
          return super.dispatchGenericMotionEvent(p0);
       }
       int childCount = this.getChildCount();
       if (childCount) {
          float x = p0.getX();
          float y = p0.getY();
          childCount = childCount - 1;
          while (childCount >= 0) {
             View childAt = this.getChildAt(childCount);
             if (!this.F(x, y, childAt) || (!this.B(childAt) && this.m(p0, childAt))) {
                return 1;
             }
             childCount = childCount - 1;
          }
       }
       return false;
    }
    public boolean drawChild(Canvas p0,View p1,long p2){
       boolean childCount;
       int right;
       DrawerLayout uDrawerLayou = this;
       View view = p1;
       int height = this.getHeight();
       boolean b = this.B(view);
       int width = this.getWidth();
       int i = p0.save();
       int i1 = 3;
       int i2 = 0;
       if (b) {
          childCount = this.getChildCount();
          int i3 = 0;
          int i4 = 0;
          while (i3 < childCount) {
             View childAt = this.getChildAt(i3);
             if (childAt == view || (childAt.getVisibility() || (!DrawerLayout.x(childAt) || (this.D(childAt) && childAt.getHeight() >= height)))) {
                if (this.c(childAt, i1)) {
                   right = childAt.getRight();
                   if (right > i4) {
                      i4 = right;
                   }
                }else {
                   right = childAt.getLeft();
                   if (right < width) {
                      width = right;
                   }
                }
             }
             i3 = i3 + 1;
          }
          p0.clipRect(i4, i2, width, this.getHeight());
          i2 = i4;
       }
       childCount = super.drawChild(p0, p1, p2);
       p0.restoreToCount(i);
       DrawerLayout f = uDrawerLayou.f;
       DrawerLayout uDrawerLayou1 = null;
       if (f - uDrawerLayou1 > 0 && b) {
          DrawerLayout e = uDrawerLayou.e;
          uDrawerLayou.g.setColor(((e & 0xffffff) | ((int)((float)((0xff000000 & e) >> 24) * f) << 24)));
          p0.drawRect((float)i2, 0, (float)width, (float)this.getHeight(), uDrawerLayou.g);
       }else {
          float f1 = 0x3f800000;
          if (uDrawerLayou.z != null && this.c(view, i1)) {
             i1 = p1.getRight();
             uDrawerLayou.z.setBounds(i1, p1.getTop(), (uDrawerLayou.z.getIntrinsicWidth() + i1), p1.getBottom());
             uDrawerLayou.z.setAlpha((int)(Math.max(uDrawerLayou1, Math.min(((float)i1 / (float)uDrawerLayou.h.getEdgeSize()), f1)) * 0x437f0000));
             uDrawerLayou.z.draw(p0);
          }else if(uDrawerLayou.A != null && this.c(view, 5)){
             i1 = p1.getLeft();
             uDrawerLayou.A.setBounds((i1 - uDrawerLayou.A.getIntrinsicWidth()), p1.getTop(), i1, p1.getBottom());
             uDrawerLayou.A.setAlpha((int)(Math.max(uDrawerLayou1, Math.min(((float)(this.getWidth() - i1) / (float)uDrawerLayou.i.getEdgeSize()), f1)) * 0x437f0000));
             uDrawerLayou.A.draw(p0);
          }
       }
       return childCount;
    }
    public void e(int p0,boolean p1){
       View view = this.n(p0);
       if (view == null) {
          throw new IllegalArgumentException("No drawer view found with gravity "+DrawerLayout.w(p0));
       }
       this.g(view, p1);
       return;
    }
    public void f(View p0){
       this.g(p0, true);
    }
    public void g(View p0,boolean p1){
       if (!this.D(p0)) {
          throw new IllegalArgumentException("View "+p0+" is not a sliding drawer");
       }
       DrawerLayout$LayoutParams layoutParams = p0.getLayoutParams();
       if (this.n != null) {
          layoutParams.b = 0;
          layoutParams.d = 0;
       }else {
          int i = 4;
          if (p1) {
             layoutParams.d = layoutParams.d | i;
             if (this.c(p0, 3)) {
                this.h.smoothSlideViewTo(p0, (- p0.getWidth()), p0.getTop());
             }else {
                this.i.smoothSlideViewTo(p0, this.getWidth(), p0.getTop());
             }
          }else {
             this.H(p0, 0);
             this.U(layoutParams.a, 0, p0);
             p0.setVisibility(i);
          }
       }
       this.invalidate();
       return;
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return new DrawerLayout$LayoutParams(-1, -1);
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return new DrawerLayout$LayoutParams(this.getContext(), p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       DrawerLayout$LayoutParams layoutParams;
       if (p0 instanceof DrawerLayout$LayoutParams) {
          layoutParams = new DrawerLayout$LayoutParams(p0);
       }else if(p0 instanceof ViewGroup$MarginLayoutParams){
          layoutParams = new DrawerLayout$LayoutParams(p0);
       }else {
          layoutParams = new DrawerLayout$LayoutParams(p0);
       }
       return layoutParams;
    }
    public float getDrawerElevation(){
       if (DrawerLayout.P) {
          return this.c;
       }
       return 0;
    }
    public Drawable getStatusBarBackgroundDrawable(){
       return this.y;
    }
    public void h(){
       this.i(false);
    }
    public void i(boolean p0){
       boolean b;
       int childCount = this.getChildCount();
       int i = 0;
       int i1 = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          DrawerLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          if (this.D(childAt) && (!p0 || layoutParams.c != null)) {
             int width = childAt.getWidth();
             if (this.c(childAt, 3)) {
                width = - width;
                b = this.h.smoothSlideViewTo(childAt, width, childAt.getTop());
             }else {
                b = this.i.smoothSlideViewTo(childAt, this.getWidth(), childAt.getTop());
             }
             i1 = i1 | b;
             layoutParams.c = false;
          }
          i = i + 1;
       }
       this.j.p();
       this.k.p();
       if (i1) {
          this.invalidate();
       }
       return;
    }
    public void j(View p0){
       DrawerLayout$LayoutParams layoutParams = p0.getLayoutParams();
       int i = 1;
       if ((layoutParams.d & i) == i) {
          layoutParams.d = 0;
          DrawerLayout tv = this.v;
          if (tv != null) {
             for (int i1 = tv.size() - i; i1 >= 0; i1 = i1 - 1) {
                this.v.get(i1).a(p0);
             }
          }
          this.T(p0, 0);
          if (this.hasWindowFocus()) {
             p0 = this.getRootView();
             if (p0 != null) {
                p0.sendAccessibilityEvent(32);
             }
          }
       }
    label_003c :
       return;
    }
    public void k(View p0){
       DrawerLayout$LayoutParams layoutParams = p0.getLayoutParams();
       if (!(layoutParams.d & 1)) {
          layoutParams.d = 1;
          DrawerLayout tv = this.v;
          if (tv != null) {
             for (int i = tv.size() - 1; i >= 0; i = i - 1) {
                this.v.get(i).b(p0);
             }
          }
          this.T(p0, 1);
          if (this.hasWindowFocus()) {
             this.sendAccessibilityEvent(32);
          }
       }
       return;
    }
    public void l(View p0,float p1){
       DrawerLayout tv = this.v;
       if (tv != null) {
          int i = tv.size();
          i = i - 1;
          while (i >= 0) {
             this.v.get(i).d(p0, p1);
          }
       }
       return;
    }
    public final boolean m(MotionEvent p0,View p1){
       boolean b;
       if (!p1.getMatrix().isIdentity()) {
          p0 = this.v(p0, p1);
          b = p1.dispatchGenericMotionEvent(p0);
          p0.recycle();
       }else {
          float f = (float)(this.getScrollX() - p1.getLeft());
          float f1 = (float)(this.getScrollY() - p1.getTop());
          p0.offsetLocation(f, f1);
          b = p1.dispatchGenericMotionEvent(p0);
          p0.offsetLocation((- f), (- f1));
       }
       return b;
    }
    public View n(int p0){
       View childAt;
       p0 = g.b(p0, i0.B(this)) & 0x07;
       int childCount = this.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return null;
          }
          childAt = this.getChildAt(i);
          int i1 = this.t(childAt) & 0x07;
          if (i1 == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return childAt;
    }
    public View o(){
       View childAt;
       int childCount = this.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return null;
          }
          childAt = this.getChildAt(i);
          int i1 = childAt.getLayoutParams().d & 1;
          if (i1 == 1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return childAt;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.n = true;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.n = true;
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       if (this.E != null && this.y != null) {
          DrawerLayout tD = this.D;
          int systemWindow = (tD != null)? tD.getSystemWindowInsetTop(): 0;
          if (systemWindow > 0) {
             this.y.setBounds(0, 0, this.getWidth(), systemWindow);
             this.y.draw(p0);
          }
       }
    label_0028 :
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       boolean b1;
       int actionMasked = p0.getActionMasked();
       int i = this.h.shouldInterceptTouchEvent(p0) | this.i.shouldInterceptTouchEvent(p0);
       boolean b = true;
       if (actionMasked) {
          if (actionMasked != b) {
             if (actionMasked != 2) {
                if (actionMasked == 3) {
                label_0031 :
                   this.i(b);
                   this.s = false;
                   this.t = false;
                }
             }else if(this.h.checkTouchSlop(3)){
                this.j.p();
                this.k.p();
             }
          }else {
             goto label_0031 ;
          }
          b1 = false;
       }else {
          float x = p0.getX();
          float y = p0.getY();
          this.w = x;
          this.x = y;
          if (this.f > 0) {
             View view = this.h.findTopChildUnder((int)x, (int)y);
             if (view != null && this.B(view)) {
                b1 = true;
             label_0060 :
                this.s = false;
                this.t = false;
             }
          }
          b1 = false;
          goto label_0060 ;
       }
       if (i || (b1 || (!this.y() && this.t == null))) {
          b = false;
       }
    label_0074 :
       return b;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       if (p0 != 4 || !this.z()) {
          return super.onKeyDown(p0, p1);
       }
       p1.startTracking();
       return true;
    }
    public boolean onKeyUp(int p0,KeyEvent p1){
       if (p0 != 4) {
          return super.onKeyUp(p0, p1);
       }
       View view = this.p();
       if (view != null && !this.r(view)) {
          this.h();
       }
       boolean b = (view != null)? true: false;
       return b;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i2;
       float f;
       float f1;
       int i4;
       int i5;
       ViewGroup$MarginLayoutParams marginLayout;
       ViewGroup viewGroup = this;
       viewGroup.m = true;
       int i = p3 - p1;
       int childCount = this.getChildCount();
       int i1 = 0;
       while (i1 < childCount) {
          View childAt = viewGroup.getChildAt(i1);
          if (childAt.getVisibility() != 8) {
             DrawerLayout$LayoutParams layoutParams1 = childAt.getLayoutParams();
             if (viewGroup.B(childAt)) {
                ViewGroup$MarginLayoutParams leftMargin = layoutParams1.leftMargin;
                i2 = childAt.getMeasuredWidth() + leftMargin;
                int i3 = layoutParams1.topMargin + childAt.getMeasuredHeight();
                childAt.layout(leftMargin, layoutParams1.topMargin, i2, i3);
             }else {
                int measuredWidt = childAt.getMeasuredWidth();
                int measuredHeig = childAt.getMeasuredHeight();
                if (viewGroup.c(childAt, 3)) {
                   i2 = - measuredWidt;
                   f = (float)measuredWidt;
                   f1 = layoutParams1.b * f;
                   i2 = i2 + (int)f1;
                   i4 = measuredWidt + i2;
                   f1 = (float)i4 / f;
                }else {
                   float f2 = (float)measuredWidt;
                   f = layoutParams1.b * f2;
                   i5 = i - (int)f;
                   i4 = i - i5;
                   f1 = (float)i4 / f2;
                   i2 = i5;
                }
                i5 = (f1 - layoutParams1.b)? 1: 0;
                int i6 = layoutParams1.a & 0x70;
                if (i6 != 16) {
                   if (i6 != 80) {
                      ViewGroup$MarginLayoutParams topMargin = layoutParams1.topMargin;
                      measuredWidt = measuredWidt + i2;
                      measuredHeig = measuredHeig + topMargin;
                      childAt.layout(i2, topMargin, measuredWidt, measuredHeig);
                   }else {
                      measuredHeig = p4 - p2;
                      i6 = measuredHeig - layoutParams1.bottomMargin;
                      i6 = i6 - childAt.getMeasuredHeight();
                      measuredWidt = measuredWidt + i2;
                      measuredHeig = measuredHeig - layoutParams1.bottomMargin;
                      childAt.layout(i2, i6, measuredWidt, measuredHeig);
                   }
                }else {
                   i6 = p4 - p2;
                   int i8 = i6 - measuredHeig;
                   i8 = i8 / 2;
                   ViewGroup$MarginLayoutParams topMargin1 = layoutParams1.topMargin;
                   if (i8 < topMargin1) {
                      marginLayout = topMargin1;
                   }else {
                      int i9 = i8 + measuredHeig;
                      ViewGroup$MarginLayoutParams bottomMargin = layoutParams1.bottomMargin;
                      int i10 = i6 - bottomMargin;
                      if (i9 > i10) {
                         i6 = i6 - bottomMargin;
                         marginLayout = i6 - measuredHeig;
                      }
                   }
                   measuredWidt = measuredWidt + i2;
                   measuredHeig = measuredHeig + marginLayout;
                   childAt.layout(i2, marginLayout, measuredWidt, measuredHeig);
                }
                if (i5) {
                   viewGroup.S(childAt, f1);
                }
                int i7 = (layoutParams1.b > 0)? 0: 4;
                if (childAt.getVisibility() != i7) {
                   childAt.setVisibility(i7);
                }
             }
          }
          i1 = i1 + 1;
          DrawerLayout$LayoutParams layoutParams = 1;
       }
       viewGroup.m = false;
       viewGroup.n = false;
       return;
    }
    public void onMeasure(int p0,int p1){
       int i;
       WindowInsets windowInsets;
       ViewGroup viewGroup = this;
       int mode = View$MeasureSpec.getMode(p0);
       int mode1 = View$MeasureSpec.getMode(p1);
       int size = View$MeasureSpec.getSize(p0);
       int size1 = View$MeasureSpec.getSize(p1);
       DrawerLayout uDrawerLayou = 0x40000000;
       if (mode != uDrawerLayou || mode1 != uDrawerLayou) {
          if (this.isInEditMode()) {
             i = Integer.MIN_VALUE;
             if (mode != i && !mode) {
                size = 300;
             }
             if (mode1 != i && !mode1) {
                size1 = 300;
             }
          }else {
             throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
          }
       }
       viewGroup.setMeasuredDimension(size, size1);
       int i1 = 0;
       IllegalStateException illegalState = (viewGroup.D != null && i0.y(this))? 1: null;
       i = i0.B(this);
       int childCount = this.getChildCount();
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       while (true) {
          if (i2 >= childCount) {
             return;
          }
          View childAt = viewGroup.getChildAt(i2);
          if (childAt.getVisibility() != 8) {
             DrawerLayout$LayoutParams layoutParams = childAt.getLayoutParams();
             int i6 = 3;
             if (illegalState) {
                int i7 = g.b(layoutParams.a, i);
                mode1 = 5;
                if (i0.y(childAt)) {
                   uDrawerLayou = viewGroup.D;
                   if (i7 == i6) {
                      windowInsets = uDrawerLayou.replaceSystemWindowInsets(uDrawerLayou.getSystemWindowInsetLeft(), uDrawerLayou.getSystemWindowInsetTop(), i1, uDrawerLayou.getSystemWindowInsetBottom());
                   }else if(i7 == mode1){
                      windowInsets = uDrawerLayou.replaceSystemWindowInsets(i1, uDrawerLayou.getSystemWindowInsetTop(), uDrawerLayou.getSystemWindowInsetRight(), uDrawerLayou.getSystemWindowInsetBottom());
                   }
                   childAt.dispatchApplyWindowInsets(windowInsets);
                }else {
                   uDrawerLayou = viewGroup.D;
                   if (i7 == 3) {
                      windowInsets = uDrawerLayou.replaceSystemWindowInsets(uDrawerLayou.getSystemWindowInsetLeft(), uDrawerLayou.getSystemWindowInsetTop(), i1, uDrawerLayou.getSystemWindowInsetBottom());
                   }else if(i7 == mode1){
                      windowInsets = uDrawerLayou.replaceSystemWindowInsets(i1, uDrawerLayou.getSystemWindowInsetTop(), uDrawerLayou.getSystemWindowInsetRight(), uDrawerLayou.getSystemWindowInsetBottom());
                   }
                   layoutParams.leftMargin = windowInsets.getSystemWindowInsetLeft();
                   layoutParams.topMargin = windowInsets.getSystemWindowInsetTop();
                   layoutParams.rightMargin = windowInsets.getSystemWindowInsetRight();
                   layoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom();
                }
             }
             if (viewGroup.B(childAt)) {
                mode1 = size - layoutParams.leftMargin;
                mode1 = mode1 - layoutParams.rightMargin;
                int i8 = 0x40000000;
                i6 = size1 - layoutParams.topMargin;
                i6 = i6 - layoutParams.bottomMargin;
                childAt.measure(View$MeasureSpec.makeMeasureSpec(mode1, i8), View$MeasureSpec.makeMeasureSpec(i6, i8));
             }else if(viewGroup.D(childAt)){
                if (DrawerLayout.P) {
                   DrawerLayout c = viewGroup.c;
                   if (i0.w(childAt) - c) {
                      i0.A0(childAt, c);
                   }
                }
                mode1 = viewGroup.t(childAt) & 0x07;
                ViewGroup$MarginLayoutParams marginLayout = (mode1 == 3)? 1: null;
                if (!marginLayout || (!i3 && (marginLayout || !i4))) {
                   if (marginLayout) {
                      i3 = 1;
                   }else {
                      i4 = 1;
                   }
                   mode1 = viewGroup.d + layoutParams.leftMargin;
                   mode1 = mode1 + layoutParams.rightMargin;
                   i6 = layoutParams.topMargin + layoutParams.bottomMargin;
                   childAt.measure(ViewGroup.getChildMeasureSpec(p0, mode1, layoutParams.width), ViewGroup.getChildMeasureSpec(p1, i6, layoutParams.height));
                label_018a :
                   i2 = i2 + 1;
                   i1 = 0;
                }else {
                   break ;
                }
             }else {
                throw new IllegalStateException("Child "+childAt+" at index "+i2+" does not have a valid layout_gravity - must be Gravity.LEFT, "+"Gravity.RIGHT or Gravity.NO_GRAVITY");
             }
          }
          int i5 = p1;
          goto label_018a ;
       }
       throw new IllegalStateException("Child drawer has absolute gravity "+DrawerLayout.w(mode1)+" but this "+"DrawerLayout"+" already has a "+"drawer view along that edge");
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (!p0 instanceof DrawerLayout$SavedState) {
          super.onRestoreInstanceState(p0);
          return;
       }else {
          super.onRestoreInstanceState(p0.a());
          DrawerLayout$SavedState d = p0.d;
          if (d != null) {
             View view = this.n(d);
             if (view != null) {
                this.K(view);
             }
          }
          d = p0.e;
          if (d != 3) {
             this.R(d, 3);
          }
          d = p0.f;
          if (d != 3) {
             this.R(d, 5);
          }
          d = p0.g;
          if (d != 3) {
             this.R(d, 0x800003);
          }
          DrawerLayout$SavedState h = p0.h;
          if (h != 3) {
             this.R(h, 0x800005);
          }
          return;
       }
    }
    public void onRtlPropertiesChanged(int p0){
       this.P();
    }
    public Parcelable onSaveInstanceState(){
       DrawerLayout$SavedState savedState = new DrawerLayout$SavedState(super.onSaveInstanceState());
       int childCount = this.getChildCount();
       int i = 0;
       while (i < childCount) {
          DrawerLayout$LayoutParams layoutParams = this.getChildAt(i).getLayoutParams();
          DrawerLayout$LayoutParams d = layoutParams.d;
          int i1 = 1;
          int i2 = (d == i1)? 1: 0;
          if (d != 2) {
             i1 = 0;
          }
          if (i2 || i1) {
             savedState.d = layoutParams.a;
             break ;
          }
          i = i + 1;
       }
       savedState.e = this.o;
       savedState.f = this.p;
       savedState.g = this.q;
       savedState.h = this.r;
       return savedState;
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b;
       this.h.processTouchEvent(p0);
       this.i.processTouchEvent(p0);
       int i = p0.getAction() & 0x00ff;
       if (i) {
          if (i != 1) {
             if (i == 3) {
                this.i(true);
                this.s = false;
                this.t = false;
             }
          }else {
             float x = p0.getX();
             float y = p0.getY();
             View view = this.h.findTopChildUnder((int)x, (int)y);
             if (view != null && (this.B(view) && (((x - this.w) * (x - this.w)) + ((y - this.x) * (y - this.x))) - (float)(this.h.getTouchSlop() * this.h.getTouchSlop()) < 0)) {
                View view1 = this.o();
                if (view1 != null && this.r(view1) != 2) {
                   b = false;
                label_0063 :
                   this.i(b);
                   this.s = false;
                }
             }
             b = true;
             goto label_0063 ;
          }
       }else {
          this.w = p0.getX();
          this.x = p0.getY();
          this.s = false;
          this.t = false;
       }
       return true;
    }
    public View p(){
       View childAt;
       int childCount = this.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return null;
          }
          childAt = this.getChildAt(i);
          if (this.D(childAt) && this.E(childAt)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return childAt;
    }
    public int q(int p0){
       DrawerLayout tr;
       int i = i0.B(this);
       if (p0 != 3) {
          if (p0 != 5) {
             if (p0 != 0x800003) {
                if (p0 == 0x800005) {
                   tr = this.r;
                   if (tr != 3) {
                      return tr;
                   }else if(!i){
                      tr = this.p;
                   }else {
                      tr = this.o;
                   }
                   if (tr != 3) {
                      return tr;
                   }
                }
             }else {
                tr = this.q;
                if (tr != 3) {
                   return tr;
                }else if(!i){
                   tr = this.o;
                }else {
                   tr = this.p;
                }
                if (tr != 3) {
                   return tr;
                }
             }
          }else {
             tr = this.p;
             if (tr != 3) {
                return tr;
             }else if(!i){
                tr = this.r;
             }else {
                tr = this.q;
             }
             if (tr != 3) {
                return tr;
             }
          }
       }else {
          tr = this.o;
          if (tr != 3) {
             return tr;
          }else if(!i){
             tr = this.q;
          }else {
             tr = this.r;
          }
          if (tr != 3) {
             return tr;
          }
       }
    label_0051 :
       return 0;
    }
    public int r(View p0){
       if (this.D(p0)) {
          return this.q(p0.getLayoutParams().a);
       }
       throw new IllegalArgumentException("View "+p0+" is not a drawer");
    }
    public void requestDisallowInterceptTouchEvent(boolean p0){
       super.requestDisallowInterceptTouchEvent(p0);
       this.s = p0;
       if (p0) {
          this.i(true);
       }
       return;
    }
    public void requestLayout(){
       if (this.m == null) {
          super.requestLayout();
       }
       return;
    }
    public CharSequence s(int p0){
       p0 = g.b(p0, i0.B(this));
       if (p0 == 3) {
          return this.B;
       }
       if (p0 == 5) {
          return this.C;
       }
       return null;
    }
    public void setDrawerElevation(float p0){
       this.c = p0;
       int i = 0;
       while (i < this.getChildCount()) {
          View childAt = this.getChildAt(i);
          if (this.D(childAt)) {
             i0.A0(childAt, this.c);
          }
          i++;
       }
       return;
    }
    public void setDrawerListener(DrawerLayout$d p0){
       DrawerLayout tu = this.u;
       if (tu != null) {
          this.M(tu);
       }
       if (p0 != null) {
          this.a(p0);
       }
       this.u = p0;
       return;
    }
    public void setDrawerLockMode(int p0){
       this.R(p0, 3);
       this.R(p0, 5);
    }
    public void setScrimColor(int p0){
       this.e = p0;
       this.invalidate();
    }
    public void setStatusBarBackground(int p0){
       Drawable drawable = (p0)? ContextCompat.getDrawable(this.getContext(), p0): null;
       this.y = drawable;
       this.invalidate();
       return;
    }
    public void setStatusBarBackground(Drawable p0){
       this.y = p0;
       this.invalidate();
    }
    public void setStatusBarBackgroundColor(int p0){
       this.y = new ColorDrawable(p0);
       this.invalidate();
    }
    public int t(View p0){
       return g.b(p0.getLayoutParams().a, i0.B(this));
    }
    public float u(View p0){
       return p0.getLayoutParams().b;
    }
    public final MotionEvent v(MotionEvent p0,View p1){
       p0 = MotionEvent.obtain(p0);
       p0.offsetLocation((float)(this.getScrollX() - p1.getLeft()), (float)(this.getScrollY() - p1.getTop()));
       Matrix matrix = p1.getMatrix();
       if (!matrix.isIdentity()) {
          if (this.L == null) {
             this.L = new Matrix();
          }
          matrix.invert(this.L);
          p0.transform(this.L);
       }
       return p0;
    }
    public final boolean y(){
       int childCount = this.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return false;
          }
          if (this.getChildAt(i).getLayoutParams().c != null) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public final boolean z(){
       boolean b = (this.p() != null)? true: false;
       return b;
    }
}
