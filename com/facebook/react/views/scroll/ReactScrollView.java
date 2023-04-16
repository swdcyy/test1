package com.facebook.react.views.scroll.ReactScrollView;
import ze.q;
import android.view.ViewGroup$OnHierarchyChangeListener;
import android.view.View$OnLayoutChangeListener;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.scroll.FpsListener;
import android.content.Context;
import uf.a;
import uf.d;
import android.graphics.Rect;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import bg.d;
import android.view.View;
import android.widget.OverScroller;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import od.a;
import java.lang.Integer;
import java.lang.Math;
import java.util.List;
import android.view.ViewGroup;
import uf.b;
import com.facebook.react.views.scroll.ReactScrollView$a;
import java.lang.Runnable;
import a2.i0;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import yd.e;
import java.util.concurrent.atomic.AtomicBoolean;
import android.view.KeyEvent;
import java.lang.Number;
import android.graphics.Point;
import ze.r;
import java.lang.reflect.Field;
import java.lang.RuntimeException;
import java.lang.Throwable;
import android.view.MotionEvent;
import df.g;
import ze.k;
import android.view.View$MeasureSpec;
import java.lang.Float;
import android.graphics.drawable.ColorDrawable;

public class ReactScrollView extends ScrollView implements q, ViewGroup$OnHierarchyChangeListener, View$OnLayoutChangeListener	// class@0013e8
{
    public float A;
    public final a b;
    public final OverScroller c;
    public final d d;
    public final Rect e;
    public boolean f;
    public Rect g;
    public String h;
    public boolean i;
    public boolean j;
    public Runnable k;
    public boolean l;
    public boolean m;
    public boolean n;
    public FpsListener o;
    public String p;
    public Drawable q;
    public int r;
    public int s;
    public float t;
    public List u;
    public boolean v;
    public boolean w;
    public View x;
    public d y;
    public boolean z;
    public static Field B;
    public static boolean C;

    public void ReactScrollView(ReactContext p0){
       super(p0, null);
    }
    public void ReactScrollView(ReactContext p0,FpsListener p1){
       super(p0);
       this.b = new a();
       this.d = new d();
       this.e = new Rect();
       this.h = "hidden";
       this.j = false;
       this.m = true;
       this.o = null;
       this.r = 0;
       this.s = 0;
       this.t = 0x3f7c28f6;
       this.v = true;
       this.w = true;
       this.z = false;
       this.A = 0;
       this.o = p1;
       this.p = "RCTScrollView:"+this.hashCode();
       this.y = new d(this);
       this.c = this.getOverScrollerFromParent();
       this.setOnHierarchyChangeListener(this);
       this.setScrollBarStyle(0x2000000);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, ReactScrollView.class, "20")) {
          return;
       }
       if (this.e()) {
          a.c(this.o);
          a.c(this.p);
          this.o.enable(this.p);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, ReactScrollView.class, "3")) {
          return;
       }
       this.awakenScrollBars();
       return;
    }
    public void c(int p0){
       double d2;
       int i;
       int i1;
       int i2;
       int i3;
       double d3;
       int i7;
       ReactScrollView u1;
       int i8;
       int i9;
       int i10;
       int i11;
       boolean b = this;
       if (PatchProxy.isSupport(ReactScrollView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), b, ReactScrollView.class, "28")) {
          return;
       }
       if (this.getChildCount() <= 0) {
          return;
       }
       boolean b1 = true;
       if (b.s == null && b.u == null) {
          if (!PatchProxy.isSupport(ReactScrollView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), b, ReactScrollView.class, "27")) {
             double d = (double)this.getSnapInterval();
             double d1 = (double)this.getScrollY();
             d2 = d1 / d;
             i = (int)Math.floor(d2);
             i1 = (int)Math.ceil(d2);
             i2 = (int)Math.round(d2);
             i3 = (int)Math.round(((double)this.f(p0) / d));
             if (p0 > 0 && i1 == i) {
                i1 = i1 + 1;
             }else if(p0 < 0 && i == i1){
                i = i - 1;
             }
             if (p0 > 0 && (i2 < i1 && i3 > i)) {
                i2 = i1;
             }else if(p0 < 0 && (i2 > i && i3 < i1)){
                i2 = i;
             }
             d3 = (double)i2 * d;
             if (d3 - d1) {
                b.f = b1;
                b.smoothScrollTo(this.getScrollX(), (int)d3);
             }
          }
          return;
       }else {
          i = this.getMaxScrollY();
          int i4 = this.f(p0);
          int i5 = (this.getHeight() - this.getPaddingBottom()) - this.getPaddingTop();
          ReactScrollView u = b.u;
          int i6 = 0;
          if (u != null) {
             i7 = u.get(i6).intValue();
             u1 = b.u;
             i8 = u1.get((u1.size() - b1)).intValue();
             i2 = i;
             i3 = 0;
             i9 = 0;
             while (i3 < b.u.size()) {
                i1 = b.u.get(i3).intValue();
                if (i1 <= i4) {
                   i10 = i4 - i1;
                   i11 = i4 - i9;
                   if (i10 < i11) {
                      i9 = i1;
                   }
                }
                if (i1 >= i4) {
                   i10 = i1 - i4;
                   i11 = i2 - i4;
                   if (i10 < i11) {
                      i2 = i1;
                   }
                }
                i3 = i3 + 1;
             }
          }else {
             d3 = (double)this.getSnapInterval();
             d2 = (double)i4 / d3;
             i2 = Math.min((int)(Math.ceil(d2) * d3), i);
             i8 = i;
             i9 = (int)(Math.floor(d2) * d3);
             i7 = 0;
          }
          i3 = i4 - i9;
          i1 = i2 - i4;
          i10 = (i3 < i1)? i9: i2;
          if (b.w == null && i4 >= i8) {
             if (this.getScrollY() >= i8) {
             label_0138 :
                i7 = i4;
             label_0139 :
                i4 = p0;
             }else {
                i4 = p0;
                i7 = i8;
             }
          }else if(b.v == null && i4 <= i7){
             if (this.getScrollY() <= i7) {
                goto label_0138 ;
             }else {
                goto label_0139 ;
             }
          }else {
             double d4 = 10.00f;
             if (p0 > 0) {
                i4 = p0 + (int)((double)i1 * d4);
                i7 = i2;
             }else if(p0 < 0){
                i4 = p0 - (int)((double)i3 * d4);
                i7 = i9;
             }else {
                i4 = p0;
                i7 = i10;
             }
          }
          int i12 = Math.min(Math.max(i6, i7), i);
          u1 = b.c;
          if (u1 != null) {
             b.f = b1;
             i3 = this.getScrollX();
             i9 = this.getScrollY();
             if (!i4) {
                i4 = i12 - this.getScrollY();
             }
             i1 = i4;
             int i13 = (!i12 || i12 == i)? i5 / 2: 0;
             u1.fling(i3, i9, 0, i1, 0, 0, i12, i12, 0, i13);
             this.postInvalidateOnAnimation();
          }else {
             b.smoothScrollTo(this.getScrollX(), i12);
          }
          return;
       }
    }
    public final void d(int p0,int p1){
       if (PatchProxy.isSupport(ReactScrollView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ReactScrollView.class, "25")) {
          return;
       }
       if (this.n == null && (this.j == null && !this.e())) {
          return;
       }
       if (this.k != null) {
          return;
       }
       if (this.n != null) {
          this.a();
          b.f(this, p0, p1);
       }
       this.f = false;
       ReactScrollView$a uoa = new ReactScrollView$a(this);
       this.k = uoa;
       i0.l0(this, uoa, 20);
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactScrollView.class, "24")) {
          return;
       }
       if (this.r != null) {
          int i = 0;
          View childAt = this.getChildAt(i);
          if (this.q != null && (childAt != null && childAt.getBottom() < this.getHeight())) {
             this.q.setBounds(i, childAt.getBottom(), this.getWidth(), this.getHeight());
             this.q.draw(p0);
          }
       }
       this.getDrawingRect(this.e);
       ReactScrollView th = this.h;
       Objects.requireNonNull(th);
       if (!th.equals("visible")) {
          p0.clipRect(this.e);
       }
       super.draw(p0);
       return;
    }
    public final boolean e(){
       boolean b;
       ReactScrollView obj = PatchProxy.apply(null, this, ReactScrollView.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.o != null) {
          obj = this.p;
          if (obj != null && (!obj.isEmpty() && e.k.get())) {
             b = true;
          label_002d :
             return b;
          }
       }
       b = false;
       goto label_002d ;
    }
    public boolean executeKeyEvent(KeyEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactScrollView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int keyCode = p0.getKeyCode();
       if (this.m == null && (keyCode == 19 || keyCode == 20)) {
          return false;
       }
       return super.executeKeyEvent(p0);
    }
    public final int f(int p0){
       if (PatchProxy.isSupport(ReactScrollView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ReactScrollView.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       OverScroller overScroller = new OverScroller(this.getContext());
       overScroller.setFriction((0x3f800000 - this.t));
       overScroller.fling(this.getScrollX(), this.getScrollY(), 0, p0, 0, 0, 0, this.getMaxScrollY(), 0, (((this.getHeight() - this.getPaddingBottom()) - this.getPaddingTop()) / 2));
       return overScroller.getFinalY();
    }
    public void fling(int p0){
       if (PatchProxy.isSupport(ReactScrollView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactScrollView.class, "19")) {
          return;
       }
       float f = Math.signum(this.b.b());
       if (!f) {
          f = Math.signum((float)p0);
       }
       p0 = (int)((float)Math.abs(p0) * f);
       if (this.j != null) {
          this.c(p0);
       }else if(this.c != null){
          this.c.fling(this.getScrollX(), this.getScrollY(), 0, p0, 0, 0, 0, Integer.MAX_VALUE, 0, (((this.getHeight() - this.getPaddingBottom()) - this.getPaddingTop()) / 2));
          i0.j0(this);
       }else {
          super.fling(p0);
       }
       this.d(0, p0);
       return;
    }
    public boolean getChildVisibleRect(View p0,Rect p1,Point p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ReactScrollView.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (e.L)? r.b(p0, p1, p2, this, this.h): super.getChildVisibleRect(p0, p1, p2);
       return b;
    }
    public void getClippingRect(Rect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactScrollView.class, "17")) {
          return;
       }
       ReactScrollView tg = this.g;
       a.c(tg);
       p0.set(tg);
       return;
    }
    public final int getMaxScrollY(){
       Object obj = PatchProxy.apply(null, this, ReactScrollView.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Math.max(0, (this.x.getHeight() - ((this.getHeight() - this.getPaddingBottom()) - this.getPaddingTop())));
    }
    public final OverScroller getOverScrollerFromParent(){
       Object obj1;
       Object[] objArray = null;
       Field obj = PatchProxy.apply(objArray, this, ReactScrollView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!ReactScrollView.C) {
          boolean b = true;
          ReactScrollView.C = b;
          try{
             Field declaredFiel = ScrollView.class.getDeclaredField("mScroller");
             ReactScrollView.B = declaredFiel;
             declaredFiel.setAccessible(b);
          }catch(java.lang.NoSuchFieldException e0){
          }
       }
    }
    public boolean getRemoveClippedSubviews(){
       return this.l;
    }
    public final int getSnapInterval(){
       ReactScrollView obj = PatchProxy.apply(null, this, ReactScrollView.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.s;
       if (obj != null) {
          return obj;
       }
       return this.getHeight();
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, ReactScrollView.class, "8")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.l != null) {
          this.updateClippingRect();
       }
       return;
    }
    public void onChildViewAdded(View p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactScrollView.class, "32")) {
          return;
       }
       this.x = p1;
       p1.addOnLayoutChangeListener(this);
       return;
    }
    public void onChildViewRemoved(View p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactScrollView.class, "33")) {
          return;
       }
       this.x.removeOnLayoutChangeListener(this);
       this.x = null;
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactScrollView.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.m == null) {
          return false;
       }
       if (this.z != null) {
          if (!p0.getAction()) {
             this.A = p0.getY();
          }
          if (p0.getAction() == 1 || p0.getAction() == 3) {
             this.A = 0;
          }
          if (p0.getAction() == 2 && ((p0.getY() - this.A) <= 0 || (!this.canScrollVertically(-1) || ((p0.getY() - this.A) < 0 && !this.canScrollVertically(1))))) {
             return false;
          }
       }
       try{
       label_0065 :
          if (super.onInterceptTouchEvent(p0)) {
             g.a(this, p0);
             b.a(this);
             this.i = true;
             this.a();
             return 1;
          }else {
             return false;
          }
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ReactScrollView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ReactScrollView.class, "6")) {
             return;
          }
       }
       this.scrollTo(this.getScrollX(), this.getScrollY());
       return;
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(ReactScrollView.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, ReactScrollView.class, "34")) {
             return;
          }
       }
       if (this.x == null) {
          return;
       }else {
          p1 = this.getMaxScrollY();
          if (this.getScrollY() > p1) {
             this.scrollTo(this.getScrollX(), p1);
          }
          return;
       }
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ReactScrollView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ReactScrollView.class, "5")) {
          return;
       }
       k.a(p0, p1);
       this.setMeasuredDimension(View$MeasureSpec.getSize(p0), View$MeasureSpec.getSize(p1));
       return;
    }
    public void onOverScrolled(int p0,int p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(ReactScrollView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, ReactScrollView.class, "31")) {
          return;
       }
       ReactScrollView tc = this.c;
       if (tc != null && (this.x != null && (!tc.isFinished() && this.c.getCurrY() != this.c.getFinalY()))) {
          int maxScrollY = this.getMaxScrollY();
          if (p1 >= maxScrollY) {
             this.c.abortAnimation();
             p1 = maxScrollY;
          }
       }
    label_004c :
       super.onOverScrolled(p0, p1, p2, p3);
       return;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ReactScrollView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ReactScrollView.class, "11")) {
          return;
       }
       super.onScrollChanged(p0, p1, p2, p3);
       this.f = true;
       if (this.b.c(p0, p1)) {
          if (this.l != null) {
             this.updateClippingRect();
          }
          b.c(this, this.b.a(), this.b.b());
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ReactScrollView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ReactScrollView.class, "7")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (this.l != null) {
          this.updateClippingRect();
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactScrollView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.m == null) {
          return b;
       }
       this.d.a(p0);
       if ((p0.getAction() & 0x00ff) == 1 && this.i != null) {
          float f = this.d.b();
          float f1 = this.d.c();
          b.b(this, f, f1);
          this.i = b;
          this.d(Math.round(f), Math.round(f1));
       }
       return super.onTouchEvent(p0);
    }
    public void requestChildFocus(View p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactScrollView.class, "9")) {
          return;
       }
       if (p1 != null && !PatchProxy.applyVoidOneRefs(p1, this, ReactScrollView.class, "10")) {
          Rect rect = new Rect();
          p1.getDrawingRect(rect);
          this.offsetDescendantRectToMyCoords(p1, rect);
          int i = this.computeScrollDeltaToGetChildRectOnScreen(rect);
          if (i) {
             this.scrollBy(0, i);
          }
       }
       super.requestChildFocus(p0, p1);
       return;
    }
    public void setBackgroundColor(int p0){
       if (PatchProxy.isSupport(ReactScrollView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactScrollView.class, "35")) {
          return;
       }
       this.y.b(p0);
       return;
    }
    public void setBorderRadius(float p0){
       if (PatchProxy.isSupport(ReactScrollView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ReactScrollView.class, "38")) {
          return;
       }
       this.y.d(p0);
       return;
    }
    public void setBorderStyle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactScrollView.class, "40")) {
          return;
       }
       this.y.f(p0);
       return;
    }
    public void setDecelerationRate(float p0){
       if (PatchProxy.isSupport(ReactScrollView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ReactScrollView.class, "2")) {
          return;
       }
       this.t = p0;
       ReactScrollView tc = this.c;
       if (tc != null) {
          tc.setFriction((0x3f800000 - p0));
       }
       return;
    }
    public void setEndFillColor(int p0){
       if (PatchProxy.isSupport(ReactScrollView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactScrollView.class, "30")) {
          return;
       }
       if (p0 != this.r) {
          this.r = p0;
          this.q = new ColorDrawable(this.r);
       }
       return;
    }
    public void setOverflow(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactScrollView.class, "4")) {
          return;
       }
       this.h = p0;
       this.invalidate();
       return;
    }
    public void setPagingEnabled(boolean p0){
       this.j = p0;
    }
    public void setParentPriorityHandlerTouch(boolean p0){
       this.z = p0;
    }
    public void setRemoveClippedSubviews(boolean p0){
       if (PatchProxy.isSupport(ReactScrollView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ReactScrollView.class, "15")) {
          return;
       }
       if (p0 && this.g == null) {
          this.g = new Rect();
       }
       this.l = p0;
       this.updateClippingRect();
       return;
    }
    public void setScrollEnabled(boolean p0){
       this.m = p0;
    }
    public void setScrollPerfTag(String p0){
       this.p = p0;
    }
    public void setSendMomentumEvents(boolean p0){
       this.n = p0;
    }
    public void setSnapInterval(int p0){
       this.s = p0;
    }
    public void setSnapOffsets(List p0){
       this.u = p0;
    }
    public void setSnapToEnd(boolean p0){
       this.w = p0;
    }
    public void setSnapToStart(boolean p0){
       this.v = p0;
    }
    public void updateClippingRect(){
       if (PatchProxy.applyVoid(null, this, ReactScrollView.class, "16")) {
          return;
       }
       if (this.l == null) {
          return;
       }
       a.c(this.g);
       r.a(this, this.g);
       View childAt = this.getChildAt(0);
       if (childAt instanceof q) {
          childAt.updateClippingRect();
       }
       return;
    }
}
