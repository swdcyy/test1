package com.kds.headertabscrollview.layout.FixedFlingNestedScrollView;
import a2.w;
import a2.s;
import a2.f0;
import android.widget.FrameLayout;
import com.kds.headertabscrollview.layout.FixedFlingNestedScrollView$a;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.widget.OverScroller;
import android.view.ViewConfiguration;
import android.content.res.TypedArray;
import a2.y;
import android.view.ViewGroup;
import a2.u;
import android.view.View;
import a2.a;
import a2.i0;
import android.widget.EdgeEffect;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.IllegalStateException;
import java.lang.String;
import android.view.VelocityTracker;
import android.view.ViewParent;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import java.lang.Object;
import android.view.animation.AnimationUtils;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import java.lang.Math;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.graphics.Canvas;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$MarginLayoutParams;
import com.kds.headertabscrollview.layout.FixedFlingNestedScrollView$SavedState;
import android.os.Parcelable;
import android.view.View$BaseSavedState;
import com.kds.headertabscrollview.layout.FixedFlingNestedScrollView$b;
import e2.c;

public class FixedFlingNestedScrollView extends FrameLayout implements w, s, f0	// class@000723
{
    public FixedFlingNestedScrollView$b A;
    public long b;
    public final Rect c;
    public OverScroller d;
    public EdgeEffect e;
    public EdgeEffect f;
    public int g;
    public boolean h;
    public boolean i;
    public View j;
    public boolean k;
    public VelocityTracker l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public final int[] s;
    public final int[] t;
    public int u;
    public int v;
    public FixedFlingNestedScrollView$SavedState w;
    public final y x;
    public final u y;
    public float z;
    public static final FixedFlingNestedScrollView$a B;
    public static final int[] C;

    static {
       FixedFlingNestedScrollView.B = new FixedFlingNestedScrollView$a();
       int[] ointArray = new int[]{0x101017a};
       FixedFlingNestedScrollView.C = ointArray;
    }
    public void FixedFlingNestedScrollView(Context p0){
       super(p0, null);
    }
    public void FixedFlingNestedScrollView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void FixedFlingNestedScrollView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = new Rect();
       this.h = true;
       this.i = false;
       this.j = null;
       this.k = false;
       this.n = true;
       this.r = -1;
       int[] ointArray = new int[2];
       this.s = ointArray;
       int[] ointArray1 = new int[2];
       this.t = ointArray1;
       this.d = new OverScroller(this.getContext());
       this.setFocusable(true);
       this.setDescendantFocusability(0x40000);
       this.setWillNotDraw(false);
       ViewConfiguration viewConfigur = ViewConfiguration.get(this.getContext());
       this.o = viewConfigur.getScaledTouchSlop();
       this.p = viewConfigur.getScaledMinimumFlingVelocity();
       this.q = viewConfigur.getScaledMaximumFlingVelocity();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, FixedFlingNestedScrollView.C, p2, false);
       this.setFillViewport(typedArray.getBoolean(false, false));
       typedArray.recycle();
       this.x = new y(this);
       this.y = new u(this);
       this.setNestedScrollingEnabled(true);
       i0.s0(this, FixedFlingNestedScrollView.B);
    }
    public static int c(int p0,int p1,int p2){
       if (p1 >= p2 || p0 < 0) {
          return 0;
       }
       if ((p1 + p0) > p2) {
          return (p2 - p1);
       }
       return p0;
    }
    private void e(int p0){
       if (p0) {
          if (this.n != null) {
             this.x(0, p0);
          }else {
             this.scrollBy(0, p0);
          }
       }
       return;
    }
    private void f(){
       this.k = false;
       this.t();
       this.stopNestedScroll(false);
       FixedFlingNestedScrollView te = this.e;
       if (te != null) {
          te.onRelease();
          this.f.onRelease();
       }
       return;
    }
    private void g(){
       if (this.getOverScrollMode() != 2) {
          if (this.e == null) {
             Context context = this.getContext();
             this.e = new EdgeEffect(context);
             this.f = new EdgeEffect(context);
          }
       }else {
          this.e = null;
          this.f = null;
       }
       return;
    }
    private float getVerticalScrollFactorCompat(){
       if (!this.z - null) {
          TypedValue typedValue = new TypedValue();
          Context context = this.getContext();
          if (context.getTheme().resolveAttribute(0x101004d, typedValue, true)) {
             this.z = typedValue.getDimension(c.c(context.getResources()));
          }else {
             throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
          }
       }
       return this.z;
    }
    private void j(int p0){
       boolean scrollY = this.getScrollY();
       scrollY = (scrollY > 0 || (p0 > 0 && (scrollY < this.getScrollRange() || p0 < 0)))? true: false;
       float f = (float)p0;
       if (!this.dispatchNestedPreFling(0, f)) {
          this.dispatchNestedFling(0, f, scrollY);
          this.i(p0);
       }
       return;
    }
    private void m(){
       if (this.l == null) {
          this.l = VelocityTracker.obtain();
       }
       return;
    }
    private boolean n(View p0){
       return (this.p(p0, 0, this.getHeight()) ^ 0x01);
    }
    public static boolean o(View p0,View p1){
       boolean b = true;
       if (p0 == p1) {
          return b;
       }
       ViewParent parent = p0.getParent();
       if (!parent instanceof ViewGroup || !FixedFlingNestedScrollView.o(parent, p1)) {
          b = false;
       }
       return b;
    }
    private boolean p(View p0,int p1,int p2){
       p0.getDrawingRect(this.c);
       this.offsetDescendantRectToMyCoords(p0, this.c);
       boolean b = ((this.c.bottom + p1) >= this.getScrollY() && (this.c.top - p1) <= (this.getScrollY() + p2))? true: false;
       return b;
    }
    private void q(int p0,int p1,int[] p2){
       this.scrollBy(0, p0);
       int i = this.getScrollY() - this.getScrollY();
       if (p2 != null) {
          p2[1] = p2[1] + i;
       }
       this.y.e(0, i, 0, (p0 - i), null, p1, p2);
       return;
    }
    private void r(MotionEvent p0){
       int actionIndex = p0.getActionIndex();
       if (p0.getPointerId(actionIndex) == this.r) {
          actionIndex = (!actionIndex)? 1: 0;
          this.g = (int)p0.getY(actionIndex);
          this.r = p0.getPointerId(actionIndex);
          FixedFlingNestedScrollView tl = this.l;
          if (tl != null) {
             tl.clear();
          }
       }
       return;
    }
    private void t(){
       FixedFlingNestedScrollView tl = this.l;
       if (tl != null) {
          tl.recycle();
          this.l = null;
       }
       return;
    }
    private boolean v(int p0,int p1,int p2){
       boolean bottom;
       FrameLayout uFrameLayout = this;
       int i = p0;
       int i1 = p1;
       int i2 = p2;
       int scrollY = this.getScrollY();
       int i3 = this.getHeight() + scrollY;
       int i4 = (i == 33)? 1: 0;
       ArrayList focusables = uFrameLayout.getFocusables(2);
       int i5 = focusables.size();
       View view = null;
       int i6 = 0;
       int i7 = 0;
       while (i6 < i5) {
          View view1 = focusables.get(i6);
          int top = view1.getTop();
          bottom = view1.getBottom();
          if (i1 < bottom && top < i2) {
             int i8 = (i1 < top && bottom < i2)? 1: 0;
             if (view == null) {
                view = view1;
                i7 = i8;
             }else if(!i4 || (top < view.getTop() || (!i4 && bottom > view.getBottom()))){
                bottom = 1;
             }else {
                bottom = 0;
             }
             if (i7) {
                if (!i8 || !bottom) {
                label_0069 :
                   i6 = i6 + 1;
                }
             }else if(i8){
                view = view1;
                i7 = 1;
                goto label_0069 ;
             }else if(bottom){
             }
             view = view1;
             goto label_0069 ;
          }
       }
       if (view == null) {
          view = uFrameLayout;
       }
       if (i1 >= scrollY && i2 <= i3) {
          bottom = false;
       }else if(i4){
          i1 = i1 - scrollY;
       }else {
          i1 = i2 - i3;
       }
       uFrameLayout.e(i1);
       bottom = true;
       if (view != this.findFocus()) {
          view.requestFocus(i);
       }
       return bottom;
    }
    private void w(View p0){
       p0.getDrawingRect(this.c);
       this.offsetDescendantRectToMyCoords(p0, this.c);
       int i = this.d(this.c);
       if (i) {
          this.scrollBy(0, i);
       }
       return;
    }
    private void y(int p0,int p1,int p2,boolean p3){
       if (!this.getChildCount()) {
          return;
       }
       if ((AnimationUtils.currentAnimationTimeMillis() - this.b) - 250 > 0) {
          View childAt = this.getChildAt(0);
          FrameLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          int scrollY = this.getScrollY();
          this.d.startScroll(this.getScrollX(), scrollY, 0, (Math.max(0, Math.min((p1 + scrollY), Math.max(0, (((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom()))))) - scrollY), p2);
          this.u(p3);
       }else if(!this.d.isFinished()){
          this.a();
       }
       this.scrollBy(p0, p1);
       this.b = AnimationUtils.currentAnimationTimeMillis();
       return;
    }
    public void A(int p0,int p1,int p2,boolean p3){
       this.y((p0 - this.getScrollX()), (p1 - this.getScrollY()), p2, p3);
    }
    public void B(int p0,int p1,boolean p2){
       this.A(p0, p1, 250, p2);
    }
    public void a(){
       this.d.abortAnimation();
       this.stopNestedScroll(1);
    }
    public void addView(View p0){
       if (this.getChildCount() > 0) {
          throw new IllegalStateException("ScrollView can host only one direct child");
       }
       super.addView(p0);
       return;
    }
    public void addView(View p0,int p1){
       if (this.getChildCount() > 0) {
          throw new IllegalStateException("ScrollView can host only one direct child");
       }
       super.addView(p0, p1);
       return;
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       if (this.getChildCount() > 0) {
          throw new IllegalStateException("ScrollView can host only one direct child");
       }
       super.addView(p0, p1, p2);
       return;
    }
    public void addView(View p0,ViewGroup$LayoutParams p1){
       if (this.getChildCount() > 0) {
          throw new IllegalStateException("ScrollView can host only one direct child");
       }
       super.addView(p0, p1);
       return;
    }
    public boolean b(int p0){
       View view = this.findFocus();
       if (view == this) {
          view = null;
       }
       View view1 = FocusFinder.getInstance().findNextFocus(this, view, p0);
       int maxScrollAmo = this.getMaxScrollAmount();
       if (view1 != null && this.p(view1, maxScrollAmo, this.getHeight())) {
          view1.getDrawingRect(this.c);
          this.offsetDescendantRectToMyCoords(view1, this.c);
          this.e(this.d(this.c));
          view1.requestFocus(p0);
       }else if(p0 == 33 && this.getScrollY() < maxScrollAmo){
          maxScrollAmo = this.getScrollY();
       }else if(p0 == 130 && this.getChildCount() > 0){
          view1 = this.getChildAt(false);
          FrameLayout$LayoutParams layoutParams = view1.getLayoutParams();
          maxScrollAmo = Math.min(((view1.getBottom() + layoutParams.bottomMargin) - ((this.getScrollY() + this.getHeight()) - this.getPaddingBottom())), maxScrollAmo);
       }
       if (!maxScrollAmo) {
          return false;
       }else if(p0 == 130){
          maxScrollAmo = - maxScrollAmo;
       }
       this.e(maxScrollAmo);
       if (view != null && (view.isFocused() && this.n(view))) {
          this.setDescendantFocusability(0x20000);
          this.requestFocus();
          this.setDescendantFocusability(this.getDescendantFocusability());
       }
    label_009b :
       return true;
    }
    public int computeHorizontalScrollExtent(){
       return super.computeHorizontalScrollExtent();
    }
    public int computeHorizontalScrollOffset(){
       return super.computeHorizontalScrollOffset();
    }
    public int computeHorizontalScrollRange(){
       return super.computeHorizontalScrollRange();
    }
    public void computeScroll(){
       FixedFlingNestedScrollView uFixedFlingN = this;
       if (uFixedFlingN.d.isFinished()) {
          return;
       }
       uFixedFlingN.d.computeScrollOffset();
       int currY = uFixedFlingN.d.getCurrY();
       int i = currY - uFixedFlingN.v;
       uFixedFlingN.v = currY;
       FixedFlingNestedScrollView t = uFixedFlingN.t;
       int i1 = 0;
       t[1] = i1;
       this.dispatchNestedPreScroll(0, i, t, null, 1);
       int i2 = i - uFixedFlingN.t[1];
       int scrollRange = this.getScrollRange();
       if (i2) {
          int scrollY = this.getScrollY();
          int i3 = 0;
          this.s(i3, i2, this.getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
          int i4 = this.getScrollY() - scrollY;
          i2 = i2 - i4;
          FixedFlingNestedScrollView t1 = uFixedFlingN.t;
          t1[1] = i1;
          this.dispatchNestedScroll(i3, i4, 0, i2, uFixedFlingN.s, 1, t1);
          i2 = i2 - uFixedFlingN.t[1];
       }
       if (i2) {
          currY = this.getOverScrollMode();
          if (!currY || (currY == 1 && scrollRange > 0)) {
             i1 = 1;
          }
          if (i1) {
             this.g();
             if (i2 < 0) {
                if (uFixedFlingN.e.isFinished()) {
                   uFixedFlingN.e.onAbsorb((int)uFixedFlingN.d.getCurrVelocity());
                }
             }else if(uFixedFlingN.f.isFinished()){
                uFixedFlingN.f.onAbsorb((int)uFixedFlingN.d.getCurrVelocity());
             }
          }
          this.a();
       }
       if (!uFixedFlingN.d.isFinished()) {
          i0.j0(this);
       }else {
          uFixedFlingN.stopNestedScroll(1);
       }
       return;
    }
    public int computeVerticalScrollExtent(){
       return super.computeVerticalScrollExtent();
    }
    public int computeVerticalScrollOffset(){
       return Math.max(0, super.computeVerticalScrollOffset());
    }
    public int computeVerticalScrollRange(){
       int i = (this.getHeight() - this.getPaddingBottom()) - this.getPaddingTop();
       if (!this.getChildCount()) {
          return i;
       }
       View childAt = this.getChildAt(0);
       FrameLayout$LayoutParams layoutParams = childAt.getLayoutParams();
       int i1 = childAt.getBottom() + layoutParams.bottomMargin;
       int scrollY = this.getScrollY();
       int i2 = Math.max(0, (i1 - i));
       if (scrollY < 0) {
          i1 = i1 - scrollY;
       }else if(scrollY > i2){
          i1 = i1 + (scrollY - i2);
       }
       return i1;
    }
    public int d(Rect p0){
       int i = 0;
       if (!this.getChildCount()) {
          return i;
       }
       int height = this.getHeight();
       int scrollY = this.getScrollY();
       int i1 = scrollY + height;
       int verticalFadi = this.getVerticalFadingEdgeLength();
       if (p0.top > null) {
          scrollY = scrollY + verticalFadi;
       }
       View childAt = this.getChildAt(i);
       FrameLayout$LayoutParams layoutParams = childAt.getLayoutParams();
       verticalFadi = (p0.bottom < ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin))? i1 - verticalFadi: i1;
       Rect bottom = p0.bottom;
       if (bottom > verticalFadi && p0.top > scrollY) {
          int i2 = (p0.height() > height)? p0.top - scrollY: p0.bottom - verticalFadi;
          i = Math.min((i2 + i), ((childAt.getBottom() + layoutParams.bottomMargin) - i1));
       }else if(p0.top < scrollY && bottom < verticalFadi){
          i = (p0.height() > height)? i - (verticalFadi - p0.bottom): i - (scrollY - p0.top);
          i = Math.max(i, (- this.getScrollY()));
       }
       return i;
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       boolean b = (super.dispatchKeyEvent(p0) || this.h(p0))? true: false;
       return b;
    }
    public boolean dispatchNestedFling(float p0,float p1,boolean p2){
       return this.y.a(p0, p1, p2);
    }
    public boolean dispatchNestedPreFling(float p0,float p1){
       return this.y.b(p0, p1);
    }
    public boolean dispatchNestedPreScroll(int p0,int p1,int[] p2,int[] p3){
       return this.dispatchNestedPreScroll(p0, p1, p2, p3, 0);
    }
    public boolean dispatchNestedPreScroll(int p0,int p1,int[] p2,int[] p3,int p4){
       return this.y.d(p0, p1, p2, p3, p4);
    }
    public void dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4,int p5,int[] p6){
       this.y.e(p0, p1, p2, p3, p4, p5, p6);
    }
    public boolean dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4){
       return this.y.f(p0, p1, p2, p3, p4);
    }
    public boolean dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4,int p5){
       return this.y.g(p0, p1, p2, p3, p4, p5);
    }
    public void draw(Canvas p0){
       int i1;
       int width;
       int height;
       int i3;
       super.draw(p0);
       if (this.e != null) {
          int scrollY = this.getScrollY();
          int i = 0;
          if (!this.e.isFinished()) {
             i1 = p0.save();
             width = this.getWidth();
             height = this.getHeight();
             int i2 = Math.min(i, scrollY);
             if (this.getClipToPadding()) {
                width = width - (this.getPaddingLeft() + this.getPaddingRight());
                i3 = this.getPaddingLeft() + i;
             }else {
                i3 = 0;
             }
             if (this.getClipToPadding()) {
                height = height - (this.getPaddingTop() + this.getPaddingBottom());
                i2 = i2 + this.getPaddingTop();
             }
             p0.translate((float)i3, (float)i2);
             this.e.setSize(width, height);
             if (this.e.draw(p0)) {
                i0.j0(this);
             }
             p0.restoreToCount(i1);
          }
          if (!this.f.isFinished()) {
             i1 = p0.save();
             width = this.getWidth();
             height = this.getHeight();
             scrollY = Math.max(this.getScrollRange(), scrollY) + height;
             if (this.getClipToPadding()) {
                width = width - (this.getPaddingLeft() + this.getPaddingRight());
                i = i + this.getPaddingLeft();
             }
             if (this.getClipToPadding()) {
                height = height - (this.getPaddingTop() + this.getPaddingBottom());
                scrollY = scrollY - this.getPaddingBottom();
             }
             p0.translate((float)(i - width), (float)scrollY);
             p0.rotate(180.00f, (float)width, 0);
             this.f.setSize(width, height);
             if (this.f.draw(p0)) {
                i0.j0(this);
             }
             p0.restoreToCount(i1);
          }
       }
       return;
    }
    public float getBottomFadingEdgeStrength(){
       if (!this.getChildCount()) {
          return 0;
       }
       View childAt = this.getChildAt(0);
       FrameLayout$LayoutParams layoutParams = childAt.getLayoutParams();
       int verticalFadi = this.getVerticalFadingEdgeLength();
       int i = ((childAt.getBottom() + layoutParams.bottomMargin) - this.getScrollY()) - (this.getHeight() - this.getPaddingBottom());
       if (i < verticalFadi) {
          return ((float)i / (float)verticalFadi);
       }
       return 0x3f800000;
    }
    public int getMaxScrollAmount(){
       return (int)((float)this.getHeight() * 0x3f000000);
    }
    public int getNestedScrollAxes(){
       return this.x.a();
    }
    public int getScrollRange(){
       int i = 0;
       if (this.getChildCount() > 0) {
          View childAt = this.getChildAt(i);
          FrameLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          i = Math.max(i, (((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom())));
       }
       return i;
    }
    public float getTopFadingEdgeStrength(){
       if (!this.getChildCount()) {
          return 0;
       }
       int verticalFadi = this.getVerticalFadingEdgeLength();
       int scrollY = this.getScrollY();
       if (scrollY < verticalFadi) {
          return ((float)scrollY / (float)verticalFadi);
       }
       return 0x3f800000;
    }
    public boolean h(KeyEvent p0){
       int b1;
       View view;
       this.c.setEmpty();
       boolean b = true;
       int i = 0;
       if (this.getChildCount() > 0) {
          View childAt = this.getChildAt(i);
          FrameLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          if (((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) > ((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom())) {
             b1 = true;
          label_0034 :
             int i1 = 130;
             if (!b1) {
                if (this.isFocused() && p0.getKeyCode() != 4) {
                   view = this.findFocus();
                   if (view == this) {
                      view = null;
                   }
                   view = FocusFinder.getInstance().findNextFocus(this, view, i1);
                   if (view == null || (view == this || !view.requestFocus(i1))) {
                      b = false;
                   }
                   return b;
                }else {
                   return i;
                }
             }else if(!p0.getAction()){
                b1 = p0.getKeyCode();
                int i2 = 33;
                if (b1 != 19) {
                   if (b1 != 20) {
                      if (b1 == 62) {
                         if (!p0.isShiftPressed()) {
                            i2 = 130;
                         }
                         FixedFlingNestedScrollView uFixedFlingN = (i2 == i1)? 1: null;
                         b1 = this.getHeight();
                         if (uFixedFlingN) {
                            uFixedFlingN.top = this.getScrollY() + b1;
                            int childCount = this.getChildCount();
                            if (childCount > 0) {
                               view = this.getChildAt((childCount - b));
                               FrameLayout$LayoutParams layoutParams1 = view.getLayoutParams();
                               childCount = (view.getBottom() + layoutParams1.bottomMargin) + this.getPaddingBottom();
                               FixedFlingNestedScrollView tc = this.c;
                               if ((tc.top + b1) > childCount) {
                                  tc.top = childCount - b1;
                               }
                            }
                         }else {
                            uFixedFlingN.top = this.getScrollY() - b1;
                            uFixedFlingN = this.c;
                            if (uFixedFlingN.top < null) {
                               uFixedFlingN.top = i;
                            }
                         }
                         uFixedFlingN = this.c;
                         Rect top = uFixedFlingN.top;
                         b1 = b1 + top;
                         uFixedFlingN.bottom = b1;
                         this.v(i2, top, b1);
                      }
                   }else if(!p0.isAltPressed()){
                      i = this.b(i1);
                   }else {
                      i = this.k(i1);
                   }
                }else if(!p0.isAltPressed()){
                   i = this.b(i2);
                }else {
                   i = this.k(i2);
                }
             }
             return i;
          }
       }
       b1 = false;
       goto label_0034 ;
    }
    public boolean hasNestedScrollingParent(){
       return this.hasNestedScrollingParent(0);
    }
    public boolean hasNestedScrollingParent(int p0){
       return this.y.l(p0);
    }
    public void i(int p0){
       if (this.getChildCount() > 0) {
          this.d.fling(this.getScrollX(), this.getScrollY(), 0, p0, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
          this.u(true);
       }
       return;
    }
    public boolean isNestedScrollingEnabled(){
       return this.y.m();
    }
    public boolean k(int p0){
       FixedFlingNestedScrollView tc1;
       int i = 1;
       int i1 = 0;
       FixedFlingNestedScrollView uFixedFlingN = (p0 == 130)? 1: null;
       int height = this.getHeight();
       FixedFlingNestedScrollView tc = this.c;
       tc.top = i1;
       tc.bottom = height;
       if (uFixedFlingN) {
          i1 = this.getChildCount();
          if (i1 > 0) {
             View childAt = this.getChildAt((i1 - i));
             FrameLayout$LayoutParams layoutParams = childAt.getLayoutParams();
             this.c.bottom = (childAt.getBottom() + layoutParams.bottomMargin) + this.getPaddingBottom();
             tc1 = this.c;
             tc1.top = tc1.bottom - height;
          }
       }
       tc1 = this.c;
       return this.v(p0, tc1.top, tc1.bottom);
    }
    public boolean l(int p0,int p1){
       int i = 0;
       if (this.getChildCount() > 0) {
          int scrollY = this.getScrollY();
          View childAt = this.getChildAt(i);
          if (p1 >= (childAt.getTop() - scrollY) && (p1 < (childAt.getBottom() - scrollY) && (p0 >= childAt.getLeft() && p0 < childAt.getRight()))) {
             i = true;
          }
       }
    label_002a :
       return i;
    }
    public void measureChild(View p0,int p1,int p2){
       p0.measure(FrameLayout.getChildMeasureSpec(p1, (this.getPaddingLeft() + this.getPaddingRight()), p0.getLayoutParams().width), View$MeasureSpec.makeMeasureSpec(0, 0));
    }
    public void measureChildWithMargins(View p0,int p1,int p2,int p3,int p4){
       ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
       p0.measure(FrameLayout.getChildMeasureSpec(p1, ((((this.getPaddingLeft() + this.getPaddingRight()) + layoutParams.leftMargin) + layoutParams.rightMargin) + p2), layoutParams.width), View$MeasureSpec.makeMeasureSpec((layoutParams.topMargin + layoutParams.bottomMargin), 0));
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.i = false;
    }
    public boolean onGenericMotionEvent(MotionEvent p0){
       if (!(p0.getSource() & 0x02) || (p0.getAction() == 8 && this.k == null)) {
          float axisValue = p0.getAxisValue(9);
          if (axisValue) {
             int scrollRange = this.getScrollRange();
             int scrollY = this.getScrollY();
             int i = scrollY - (int)(axisValue * this.getVerticalScrollFactorCompat());
             if (i < 0) {
                scrollRange = 0;
             }else if(i > scrollRange){
                scrollRange = i;
             }
             if (scrollRange != scrollY) {
                super.scrollTo(this.getScrollX(), scrollRange);
                return true;
             }
          }
       }
    label_0045 :
       return false;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       FixedFlingNestedScrollView tr;
       int action = p0.getAction();
       int i = 2;
       if (action == i && this.k != null) {
          return true;
       }
       action = action & 0x00ff;
       if (action) {
          int i1 = -1;
          if (action != 1) {
             if (action != i) {
                if (action != 3) {
                   if (action == 6) {
                      this.r(p0);
                   }
                }
             }else {
                tr = this.r;
                if (tr != i1) {
                   action = p0.findPointerIndex(tr);
                   if (action != i1) {
                      action = (int)p0.getY(action);
                      if (Math.abs((action - this.g)) > this.o && !(i & this.getNestedScrollAxes())) {
                         this.k = true;
                         this.g = action;
                         this.m();
                         this.l.addMovement(p0);
                         this.u = 0;
                         ViewParent parent = this.getParent();
                         if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                         }
                      }
                   }
                }
             }
          }
          this.k = false;
          this.r = i1;
          this.t();
          if (this.d.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
             i0.j0(this);
          }
          this.stopNestedScroll(false);
       }else {
          action = (int)p0.getY();
          if (!this.l((int)p0.getX(), action)) {
             this.k = false;
             this.t();
          }else {
             this.g = action;
             this.r = p0.getPointerId(false);
             tr = this.l;
             if (tr == null) {
                this.l = VelocityTracker.obtain();
             }else {
                tr.clear();
             }
             this.l.addMovement(p0);
             this.d.computeScrollOffset();
             this.k = this.d.isFinished() ^ true;
             this.startNestedScroll(i, false);
          }
       }
    label_00c9 :
       return this.k;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       FrameLayout$LayoutParams layoutParams;
       int i;
       super.onLayout(p0, p1, p2, p3, p4);
       p0 = false;
       this.h = p0;
       FixedFlingNestedScrollView tj = this.j;
       if (tj != null && FixedFlingNestedScrollView.o(tj, this)) {
          this.w(this.j);
       }
       View view = null;
       this.j = view;
       if (this.i == null) {
          if (this.w != null) {
             this.scrollTo(this.getScrollX(), this.w.b);
             this.w = view;
          }
          if (this.getChildCount() > 0) {
             View childAt = this.getChildAt(p0);
             layoutParams = childAt.getLayoutParams();
             i = (childAt.getMeasuredHeight() + layoutParams.topMargin) + layoutParams.bottomMargin;
          }
          layoutParams = this.getScrollY();
          i = FixedFlingNestedScrollView.c(layoutParams, (((p4 - p2) - this.getPaddingTop()) - this.getPaddingBottom()), i);
          if (i != layoutParams) {
             this.scrollTo(this.getScrollX(), i);
          }
       }
       this.scrollTo(this.getScrollX(), this.getScrollY());
       this.i = true;
       return;
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       if (this.m == null) {
          return;
       }
       if (!View$MeasureSpec.getMode(p1)) {
          return;
       }
       if (this.getChildCount() > 0) {
          View childAt = this.getChildAt(0);
          FrameLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          int i = (((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
          if (childAt.getMeasuredHeight() < i) {
             childAt.measure(FrameLayout.getChildMeasureSpec(p0, (((this.getPaddingLeft() + this.getPaddingRight()) + layoutParams.leftMargin) + layoutParams.rightMargin), layoutParams.width), View$MeasureSpec.makeMeasureSpec(i, 0x40000000));
          }
       }
       return;
    }
    public boolean onNestedFling(View p0,float p1,float p2,boolean p3){
       if (p3) {
          return false;
       }
       this.j((int)p2);
       return true;
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       return this.dispatchNestedPreFling(p1, p2);
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3){
       this.onNestedPreScroll(p0, p1, p2, p3, 0);
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3,int p4){
       this.dispatchNestedPreScroll(p1, p2, p3, null, p4);
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4){
       this.q(p4, 0, null);
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5){
       this.q(p4, p5, null);
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5,int[] p6){
       this.q(p4, p5, p6);
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2){
       this.onNestedScrollAccepted(p0, p1, p2, 0);
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2,int p3){
       this.x.c(p0, p1, p2, p3);
       this.startNestedScroll(2, p3);
    }
    public void onOverScrolled(int p0,int p1,boolean p2,boolean p3){
       super.scrollTo(p0, p1);
    }
    public boolean onRequestFocusInDescendants(int p0,Rect p1){
       if (p0 == 2) {
          p0 = 130;
       }else if(p0 == 1){
          p0 = 33;
       }
       View view = (p1 == null)? FocusFinder.getInstance().findNextFocus(this, null, p0): FocusFinder.getInstance().findNextFocusFromRect(this, p1, p0);
       if (view == null) {
          return false;
       }else if(this.n(view)){
          return false;
       }else {
          return view.requestFocus(p0, p1);
       }
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (!p0 instanceof FixedFlingNestedScrollView$SavedState) {
          super.onRestoreInstanceState(p0);
          return;
       }else {
          super.onRestoreInstanceState(p0.getSuperState());
          this.w = p0;
          this.requestLayout();
          return;
       }
    }
    public Parcelable onSaveInstanceState(){
       FixedFlingNestedScrollView$SavedState savedState = new FixedFlingNestedScrollView$SavedState(super.onSaveInstanceState());
       savedState.b = this.getScrollY();
       return savedState;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       super.onScrollChanged(p0, p1, p2, p3);
       FixedFlingNestedScrollView tA = this.A;
       if (tA != null) {
          tA.a(this, p0, p1, p2, p3);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       View view = this.findFocus();
       if (view == null || (this != view && this.p(view, 0, p3))) {
          view.getDrawingRect(this.c);
          this.offsetDescendantRectToMyCoords(view, this.c);
          this.e(this.d(this.c));
       }
    label_0026 :
       return;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       return this.onStartNestedScroll(p0, p1, p2, 0);
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2,int p3){
       boolean b = (p2 & 0x02)? true: false;
       return b;
    }
    public void onStopNestedScroll(View p0){
       this.onStopNestedScroll(p0, 0);
    }
    public void onStopNestedScroll(View p0,int p1){
       this.x.e(p0, p1);
       this.stopNestedScroll(p1);
    }
    public boolean onTouchEvent(MotionEvent p0){
       FixedFlingNestedScrollView l;
       FixedFlingNestedScrollView uFixedFlingN = this;
       MotionEvent motionEvent = p0;
       this.m();
       int actionMasked = p0.getActionMasked();
       if (!actionMasked) {
          uFixedFlingN.u = 0;
       }
       MotionEvent motionEvent1 = MotionEvent.obtain(p0);
       motionEvent1.offsetLocation(0, (float)uFixedFlingN.u);
       FixedFlingNestedScrollView uFixedFlingN1 = 2;
       if (actionMasked) {
          int i = -1;
          if (actionMasked != 1) {
             if (actionMasked != uFixedFlingN1) {
                if (actionMasked != 3) {
                   if (actionMasked != 0.00f) {
                      if (actionMasked == 6) {
                         this.r(p0);
                         uFixedFlingN.g = (int)motionEvent.getY(motionEvent.findPointerIndex(uFixedFlingN.r));
                      }
                   }else {
                      actionMasked = p0.getActionIndex();
                      uFixedFlingN.g = (int)motionEvent.getY(actionMasked);
                      uFixedFlingN.r = motionEvent.getPointerId(actionMasked);
                   }
                }else if(uFixedFlingN.k != null && (this.getChildCount() > 0 && uFixedFlingN.d.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange()))){
                   i0.j0(this);
                }
                uFixedFlingN.r = i;
                this.f();
             }else {
                int i1 = motionEvent.findPointerIndex(uFixedFlingN.r);
                if (i1 != i) {
                   int i2 = (int)motionEvent.getY(i1);
                   actionMasked = uFixedFlingN.g - i2;
                   if (uFixedFlingN.k == null && Math.abs(actionMasked) > uFixedFlingN.o) {
                      ViewParent parent = this.getParent();
                      if (parent != null) {
                         parent.requestDisallowInterceptTouchEvent(true);
                      }
                      uFixedFlingN.k = true;
                      if (actionMasked > 0) {
                         actionMasked = actionMasked - uFixedFlingN.o;
                      }else {
                         actionMasked = actionMasked + uFixedFlingN.o;
                      }
                   }
                   int i3 = actionMasked;
                   if (uFixedFlingN.k != null) {
                      if (this.dispatchNestedPreScroll(0, i3, uFixedFlingN.t, uFixedFlingN.s, 0)) {
                         i3 = i3 - uFixedFlingN.t[1];
                         uFixedFlingN.u = uFixedFlingN.u + uFixedFlingN.s[1];
                      }
                      int i4 = i3;
                      uFixedFlingN.g = i2 - uFixedFlingN.s[1];
                      int scrollY = this.getScrollY();
                      int scrollRange = this.getScrollRange();
                      actionMasked = this.getOverScrollMode();
                      int i5 = (!actionMasked || (actionMasked == 1 && scrollRange > 0))? 1: 0;
                      int i6 = scrollRange;
                      if (this.s(0, i4, 0, this.getScrollY(), 0, scrollRange, 0, 0, 1) && !uFixedFlingN.hasNestedScrollingParent(0)) {
                         uFixedFlingN.l.clear();
                      }
                      i = this.getScrollY() - scrollY;
                      FixedFlingNestedScrollView t = uFixedFlingN.t;
                      t[1] = 0;
                      this.dispatchNestedScroll(0, i, 0, (i4 - i), uFixedFlingN.s, 0, t);
                      uFixedFlingN1 = uFixedFlingN.s;
                      uFixedFlingN.g = uFixedFlingN.g - uFixedFlingN1[1];
                      uFixedFlingN.u = uFixedFlingN.u + uFixedFlingN1[1];
                      if (i5) {
                         actionMasked = i4 - uFixedFlingN.t[1];
                         this.g();
                         int i7 = scrollY + actionMasked;
                         if (i7 < 0) {
                            c.e(uFixedFlingN.e, ((float)actionMasked / (float)this.getHeight()), (motionEvent.getX(i1) / (float)this.getWidth()));
                            if (!uFixedFlingN.f.isFinished()) {
                               uFixedFlingN.f.onRelease();
                            }
                         }else if(i7 > i6){
                            c.e(uFixedFlingN.f, ((float)actionMasked / (float)this.getHeight()), (0x3f800000 - (motionEvent.getX(i1) / (float)this.getWidth())));
                            if (!uFixedFlingN.e.isFinished()) {
                               uFixedFlingN.e.onRelease();
                            }
                         }
                         l = uFixedFlingN.e;
                         if (l != null && (!l.isFinished() || !uFixedFlingN.f.isFinished())) {
                            i0.j0(this);
                         }
                      }
                   }
                }
             }
          }else {
             l = uFixedFlingN.l;
             l.computeCurrentVelocity(1000, (float)uFixedFlingN.q);
             actionMasked = (int)l.getYVelocity(uFixedFlingN.r);
             if (Math.abs(actionMasked) >= uFixedFlingN.p) {
                uFixedFlingN.j((- actionMasked));
             }else if(uFixedFlingN.d.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())){
                i0.j0(this);
             }
             uFixedFlingN.r = i;
             this.f();
          }
       }else if(!this.getChildCount()){
          return 0;
       }else {
          actionMasked = uFixedFlingN.d.isFinished() ^ true;
          uFixedFlingN.k = actionMasked;
          if (actionMasked) {
             ViewParent parent1 = this.getParent();
             if (parent1 != null) {
                parent1.requestDisallowInterceptTouchEvent(true);
             }
          }
          if (!uFixedFlingN.d.isFinished()) {
             this.a();
          }
          uFixedFlingN.g = (int)p0.getY();
          uFixedFlingN.r = motionEvent.getPointerId(0);
          uFixedFlingN.startNestedScroll(uFixedFlingN1, 0);
       }
    label_0227 :
       l = uFixedFlingN.l;
       if (l != null) {
          l.addMovement(motionEvent1);
       }
       motionEvent1.recycle();
       return true;
    }
    public void requestChildFocus(View p0,View p1){
       if (this.h == null) {
          this.w(p1);
       }else {
          this.j = p1;
       }
       super.requestChildFocus(p0, p1);
       return;
    }
    public boolean requestChildRectangleOnScreen(View p0,Rect p1,boolean p2){
       p1.offset((p0.getLeft() - p0.getScrollX()), (p0.getTop() - p0.getScrollY()));
       int i = this.d(p1);
       boolean b = (i)? true: false;
       if (b) {
          if (p2) {
             this.scrollBy(0, i);
          }else {
             this.x(0, i);
          }
       }
       return b;
    }
    public void requestDisallowInterceptTouchEvent(boolean p0){
       if (p0) {
          this.t();
       }
       super.requestDisallowInterceptTouchEvent(p0);
       return;
    }
    public void requestLayout(){
       this.h = true;
       super.requestLayout();
    }
    public boolean s(int p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,boolean p8){
       FixedFlingNestedScrollView uFixedFlingN = this;
       int overScrollMo = this.getOverScrollMode();
       boolean b = false;
       int i = (this.computeHorizontalScrollRange() > this.computeHorizontalScrollExtent())? 1: 0;
       int i1 = (this.computeVerticalScrollRange() > this.computeVerticalScrollExtent())? 1: 0;
       i = (!overScrollMo || (overScrollMo == 1 && i))? 1: 0;
       overScrollMo = (!overScrollMo || (overScrollMo == 1 && i1))? 1: 0;
       i1 = p2 + p0;
       i = (!i)? 0: p6;
       int i2 = p3 + p1;
       overScrollMo = (!overScrollMo)? 0: p7;
       int i3 = - i;
       i = i + p4;
       int i4 = - overScrollMo;
       overScrollMo = overScrollMo + p5;
       if (i1 > i) {
          i1 = i;
       }else if(i1 < i3){
          i1 = i3;
       }else {
          i = false;
       label_0055 :
          if (i2 > overScrollMo) {
             i2 = overScrollMo;
          }else if(i2 < i4){
             i2 = i4;
          }else {
             overScrollMo = false;
          label_005f :
             if (overScrollMo && !this.hasNestedScrollingParent(1)) {
                uFixedFlingN.d.springBack(i1, i2, 0, 0, 0, this.getScrollRange());
             }
             this.onOverScrolled(i1, i2, i, overScrollMo);
             if (i || overScrollMo) {
                b = true;
             }
             return b;
          }
          overScrollMo = true;
          goto label_005f ;
       }
       i = true;
       goto label_0055 ;
    }
    public void scrollTo(int p0,int p1){
       if (this.getChildCount() > 0) {
          View childAt = this.getChildAt(0);
          FrameLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          p0 = FixedFlingNestedScrollView.c(p0, ((this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight()), ((childAt.getWidth() + layoutParams.leftMargin) + layoutParams.rightMargin));
          p1 = FixedFlingNestedScrollView.c(p1, ((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom()), ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin));
          if (p0 != this.getScrollX() || p1 != this.getScrollY()) {
             super.scrollTo(p0, p1);
          }
       }
       return;
    }
    public void setFillViewport(boolean p0){
       if (p0 != this.m) {
          this.m = p0;
          this.requestLayout();
       }
       return;
    }
    public void setNestedScrollingEnabled(boolean p0){
       this.y.n(p0);
    }
    public void setOnScrollChangeListener(FixedFlingNestedScrollView$b p0){
       this.A = p0;
    }
    public void setSmoothScrollingEnabled(boolean p0){
       this.n = p0;
    }
    public boolean shouldDelayChildPressedState(){
       return true;
    }
    public boolean startNestedScroll(int p0){
       return this.startNestedScroll(p0, 0);
    }
    public boolean startNestedScroll(int p0,int p1){
       return this.y.q(p0, p1);
    }
    public void stopNestedScroll(){
       this.stopNestedScroll(0);
    }
    public void stopNestedScroll(int p0){
       this.y.s(p0);
    }
    public void u(boolean p0){
       if (p0) {
          this.startNestedScroll(2, 1);
       }else {
          this.stopNestedScroll(1);
       }
       this.v = this.getScrollY();
       i0.j0(this);
       return;
    }
    public final void x(int p0,int p1){
       this.y(p0, p1, 250, false);
    }
    public final void z(int p0,int p1){
       this.A(p0, p1, 250, false);
    }
}
