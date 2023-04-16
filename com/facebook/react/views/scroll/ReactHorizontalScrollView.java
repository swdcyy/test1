package com.facebook.react.views.scroll.ReactHorizontalScrollView;
import ze.q;
import android.widget.HorizontalScrollView;
import android.content.Context;
import com.facebook.react.views.scroll.FpsListener;
import uf.a;
import uf.d;
import android.graphics.Rect;
import bg.d;
import android.view.View;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import android.widget.OverScroller;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.lang.Integer;
import android.view.ViewGroup;
import java.util.Iterator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import android.view.FocusFinder;
import android.view.ViewParent;
import a2.i0;
import java.util.Locale;
import y1.f;
import java.util.List;
import java.lang.Number;
import uf.b;
import com.facebook.react.views.scroll.ReactHorizontalScrollView$a;
import java.lang.Runnable;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import yd.e;
import java.util.concurrent.atomic.AtomicBoolean;
import android.view.KeyEvent;
import android.graphics.Point;
import ze.r;
import od.a;
import java.lang.reflect.Field;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.util.Objects;
import android.view.MotionEvent;
import df.g;
import ze.k;
import android.view.View$MeasureSpec;
import java.lang.Float;
import android.graphics.drawable.ColorDrawable;

public class ReactHorizontalScrollView extends HorizontalScrollView implements q	// class@0013e4
{
    public final Rect A;
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
    public boolean s;
    public int t;
    public float u;
    public List v;
    public boolean w;
    public boolean x;
    public d y;
    public boolean z;
    public static Field B;
    public static boolean C;

    public void ReactHorizontalScrollView(Context p0){
       super(p0, null);
    }
    public void ReactHorizontalScrollView(Context p0,FpsListener p1){
       super(p0);
       this.b = new a();
       this.d = new d();
       this.e = new Rect();
       this.h = "hidden";
       this.j = false;
       this.m = true;
       this.o = null;
       this.r = 0;
       this.s = false;
       this.t = 0;
       this.u = 0x3f7c28f6;
       this.w = true;
       this.x = true;
       this.z = false;
       this.A = new Rect();
       this.y = new d(this);
       this.o = p1;
       this.p = "AndroidHorizontalScrollView:"+this.hashCode();
       this.c = this.getOverScrollerFromParent();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ReactHorizontalScrollView.class, "4")) {
          return;
       }
       this.awakenScrollBars();
       return;
    }
    public void addFocusables(ArrayList p0,int p1,int p2){
       int b;
       if (PatchProxy.isSupport(ReactHorizontalScrollView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ReactHorizontalScrollView.class, "10")) {
          return;
       }
       if (this.j != null && this.z == null) {
          ArrayList uArrayList = new ArrayList();
          super.addFocusables(uArrayList, p1, p2);
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             View view = iterator.next();
             if (!this.f(view)) {
                Object obj = PatchProxy.applyOneRefs(view, this, ReactHorizontalScrollView.class, "13");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else {
                   b = this.c(view);
                   view.getDrawingRect(this.A);
                   b = (b && Math.abs(b) < this.A.width())? true: false;
                }
                if (!b && !view.isFocused()) {
                }
             }
          label_0078 :
             p0.add(view);
          }
       }else {
          super.addFocusables(p0, p1, p2);
       }
       return;
    }
    public boolean arrowScroll(int p0){
       boolean b;
       int b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(ReactHorizontalScrollView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ReactHorizontalScrollView.class, "19");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (this.j != null) {
          b = true;
          this.z = b;
          if (this.getChildCount() > 0) {
             View view = FocusFinder.getInstance().findNextFocus(this, this.findFocus(), p0);
             View childAt = this.getChildAt(0);
             if (childAt != null && (view != null && view.getParent() == childAt)) {
                if (!this.f(view)) {
                   Object obj1 = PatchProxy.applyOneRefs(view, this, ReactHorizontalScrollView.class, "14");
                   if (obj1 != patchProxyRe) {
                      b1 = obj1.booleanValue();
                   }else {
                      b1 = this.c(view);
                      view.getDrawingRect(this.A);
                      b1 = (b1 && Math.abs(b1) < (this.A.width() / 2))? true: false;
                   }
                   if (!b1) {
                      this.h(p0);
                   }
                }
                view.requestFocus();
             }else {
                this.h(p0);
             }
          }else {
             b = false;
          }
          this.z = false;
       }else {
          b = super.arrowScroll(p0);
       }
       return b;
    }
    public void b(int p0){
       double d2;
       int i1;
       int i2;
       int i3;
       int i4;
       int i9;
       int i10;
       int i11;
       int i12;
       int i13;
       boolean b = this;
       int i = p0;
       if (PatchProxy.isSupport(ReactHorizontalScrollView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), b, ReactHorizontalScrollView.class, "38")) {
          return;
       }
       if (this.getChildCount() <= 0) {
          return;
       }
       int b1 = true;
       if (b.t == null && b.v == null) {
          if (!PatchProxy.isSupport(ReactHorizontalScrollView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), b, ReactHorizontalScrollView.class, "37")) {
             double d = (double)this.getSnapInterval();
             double d1 = (double)this.getScrollX();
             d2 = d1 / d;
             i1 = (int)Math.floor(d2);
             i2 = (int)Math.ceil(d2);
             i3 = (int)Math.round(d2);
             i4 = (int)Math.round(((double)this.g(p0) / d));
             if (i > 0 && i2 == i1) {
                i2 = i2 + 1;
             }else if(i < 0 && i1 == i2){
                i1 = i1 - 1;
             }
             if (i > 0 && (i3 < i2 && i4 > i1)) {
                i3 = i2;
             }else if(i < 0 && (i3 > i1 && i4 < i2)){
                i3 = i1;
             }
             double d3 = (double)i3 * d;
             if (d3 - d1) {
                b.f = b1;
                b.smoothScrollTo((int)d3, this.getScrollY());
             }
          }
          return;
       }else {
          int i5 = 0;
          i1 = Math.max(i5, (this.computeHorizontalScrollRange() - this.getWidth()));
          int i6 = this.g(p0);
          if (b.s != null) {
             i6 = this.getScrollX();
          }
          int i7 = (this.getWidth() - i0.H(this)) - i0.G(this);
          int i8 = (f.a(Locale.getDefault()) == b1)? 1: 0;
          if (i8) {
             i6 = i1 - i6;
             i = - i;
          }
          ReactHorizontalScrollView v = b.v;
          if (v != null) {
             i9 = v.get(i5).intValue();
             ReactHorizontalScrollView v1 = b.v;
             i4 = v1.get((v1.size() - b1)).intValue();
             i2 = i1;
             i10 = 0;
             i3 = 0;
             while (i10 < b.v.size()) {
                i11 = b.v.get(i10).intValue();
                if (i11 <= i6) {
                   i12 = i6 - i11;
                   i13 = i6 - i3;
                   if (i12 < i13) {
                      i3 = i11;
                   }
                }
                if (i11 >= i6) {
                   i12 = i11 - i6;
                   i13 = i2 - i6;
                   if (i12 < i13) {
                      i2 = i11;
                   }
                }
                i10 = i10 + 1;
             }
          }else {
             double d4 = (double)this.getSnapInterval();
             d2 = (double)i6 / d4;
             i4 = i1;
             i3 = (int)(Math.floor(d2) * d4);
             i2 = Math.min((int)(Math.ceil(d2) * d4), i1);
             i9 = 0;
          }
          i10 = i6 - i3;
          i11 = i2 - i6;
          i12 = (i10 < i11)? i3: i2;
          i13 = this.getScrollX();
          if (i8) {
             i13 = i1 - i13;
          }
          if (b.x == null && i6 >= i4) {
             if (i13 < i4) {
                i6 = i4;
             }
          }else if(b.w == null && i6 <= i9){
             if (i13 > i9) {
                i6 = i9;
             }
          }else if(i > 0){
             i = i + (int)((double)i11 * 10.00f);
             i6 = i2;
          }else if(i < 0){
             i = i - (int)((double)i10 * 10.00f);
             i6 = i3;
          }else {
             i6 = i12;
          }
          b1 = Math.min(Math.max(i5, i6), i1);
          if (i8) {
             b1 = i1 - b1;
             i = - i;
          }
          ReactHorizontalScrollView c = b.c;
          if (c != null) {
             b.f = true;
             int scrollX = this.getScrollX();
             int scrollY = this.getScrollY();
             if (!i) {
                i = b1 - this.getScrollX();
             }
             int i14 = i;
             int i15 = (!b1 || b1 == i1)? i7 / 2: 0;
             c.fling(scrollX, scrollY, i14, 0, b1, b1, 0, 0, i15, 0);
             this.postInvalidateOnAnimation();
          }else {
             b.smoothScrollTo(b1, this.getScrollY());
          }
          return;
       }
    }
    public final int c(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactHorizontalScrollView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       p0.getDrawingRect(this.A);
       this.offsetDescendantRectToMyCoords(p0, this.A);
       return this.computeScrollDeltaToGetChildRectOnScreen(this.A);
    }
    public final void d(int p0,int p1){
       if (PatchProxy.isSupport(ReactHorizontalScrollView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ReactHorizontalScrollView.class, "35")) {
          return;
       }
       if (this.n == null && (this.j == null && !this.e())) {
          return;
       }
       if (this.k != null) {
          return;
       }
       if (this.n != null) {
          b.f(this, p0, p1);
       }
       this.f = false;
       ReactHorizontalScrollView$a uoa = new ReactHorizontalScrollView$a(this);
       this.k = uoa;
       i0.l0(this, uoa, 20);
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactHorizontalScrollView.class, "34")) {
          return;
       }
       if (this.r != null) {
          int i = 0;
          View childAt = this.getChildAt(i);
          if (this.q != null && (childAt != null && childAt.getRight() < this.getWidth())) {
             this.q.setBounds(childAt.getRight(), i, this.getWidth(), this.getHeight());
             this.q.draw(p0);
          }
       }
       super.draw(p0);
       return;
    }
    public final boolean e(){
       boolean b;
       ReactHorizontalScrollView obj = PatchProxy.apply(null, this, ReactHorizontalScrollView.class, "33");
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
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactHorizontalScrollView.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int keyCode = p0.getKeyCode();
       if (this.m == null && (keyCode == 21 || keyCode == 22)) {
          return false;
       }
       return super.executeKeyEvent(p0);
    }
    public final boolean f(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactHorizontalScrollView.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.c(p0))? true: false;
       return b;
    }
    public void fling(int p0){
       if (PatchProxy.isSupport(ReactHorizontalScrollView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactHorizontalScrollView.class, "22")) {
          return;
       }
       p0 = (int)((float)Math.abs(p0) * Math.signum(this.b.a()));
       if (this.j != null) {
          this.b(p0);
       }else if(this.c != null){
          this.c.fling(this.getScrollX(), this.getScrollY(), p0, 0, 0, Integer.MAX_VALUE, 0, 0, (((this.getWidth() - i0.H(this)) - i0.G(this)) / 2), 0);
          i0.j0(this);
       }else {
          super.fling(p0);
       }
       this.d(p0, 0);
       return;
    }
    public final int g(int p0){
       if (PatchProxy.isSupport(ReactHorizontalScrollView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ReactHorizontalScrollView.class, "36");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       OverScroller overScroller = new OverScroller(this.getContext());
       overScroller.setFriction((0x3f800000 - this.u));
       overScroller.fling(this.getScrollX(), this.getScrollY(), p0, 0, 0, Math.max(0, (this.computeHorizontalScrollRange() - this.getWidth())), 0, 0, (((this.getWidth() - i0.H(this)) - i0.G(this)) / 2), 0);
       return overScroller.getFinalX();
    }
    public boolean getChildVisibleRect(View p0,Rect p1,Point p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ReactHorizontalScrollView.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (e.L)? r.b(p0, p1, p2, this, this.h): super.getChildVisibleRect(p0, p1, p2);
       return b;
    }
    public void getClippingRect(Rect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactHorizontalScrollView.class, "26")) {
          return;
       }
       ReactHorizontalScrollView tg = this.g;
       a.c(tg);
       p0.set(tg);
       return;
    }
    public final OverScroller getOverScrollerFromParent(){
       Object obj1;
       Object[] objArray = null;
       Field obj = PatchProxy.apply(objArray, this, ReactHorizontalScrollView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!ReactHorizontalScrollView.C) {
          boolean b = true;
          ReactHorizontalScrollView.C = b;
          try{
             Field declaredFiel = HorizontalScrollView.class.getDeclaredField("mScroller");
             ReactHorizontalScrollView.B = declaredFiel;
             declaredFiel.setAccessible(b);
          }catch(java.lang.NoSuchFieldException e0){
          }
       }
    }
    public boolean getRemoveClippedSubviews(){
       return this.l;
    }
    public final int getSnapInterval(){
       ReactHorizontalScrollView obj = PatchProxy.apply(null, this, ReactHorizontalScrollView.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.t;
       if (obj != null) {
          return obj;
       }
       return this.getWidth();
    }
    public final void h(int p0){
       if (PatchProxy.isSupport(ReactHorizontalScrollView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactHorizontalScrollView.class, "39")) {
          return;
       }
       int width = this.getWidth();
       int scrollX = this.getScrollX();
       int i = scrollX / width;
       if (scrollX % width) {
          i = i + 1;
       }
       i = (p0 == 17)? i - 1: i + 1;
       if (i < 0) {
          i = 0;
       }
       this.smoothScrollTo((i * width), this.getScrollY());
       this.d(0, 0);
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, ReactHorizontalScrollView.class, "24")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.l != null) {
          this.updateClippingRect();
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactHorizontalScrollView.class, "6")) {
          return;
       }
       this.getDrawingRect(this.e);
       ReactHorizontalScrollView th = this.h;
       Objects.requireNonNull(th);
       if (!th.equals("visible")) {
          p0.clipRect(this.e);
       }
       super.onDraw(p0);
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactHorizontalScrollView.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.m == null) {
          return false;
       }
       try{
          if (!super.onInterceptTouchEvent(p0)) {
             return false;
          }
          g.a(this, p0);
          b.a(this);
          this.i = true;
          if (!PatchProxy.applyVoid(null, this, ReactHorizontalScrollView.class, "31") && this.e()) {
             a.c(this.o);
             a.c(this.p);
             this.o.enable(this.p);
          }
          return true;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ReactHorizontalScrollView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ReactHorizontalScrollView.class, "8")) {
             return;
          }
       }
       this.scrollTo(this.getScrollX(), this.getScrollY());
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ReactHorizontalScrollView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ReactHorizontalScrollView.class, "7")) {
          return;
       }
       k.a(p0, p1);
       this.setMeasuredDimension(View$MeasureSpec.getSize(p0), View$MeasureSpec.getSize(p1));
       return;
    }
    public void onOverScrolled(int p0,int p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(ReactHorizontalScrollView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, ReactHorizontalScrollView.class, "30")) {
          return;
       }
       ReactHorizontalScrollView tc = this.c;
       if (tc != null && (!tc.isFinished() && this.c.getCurrX() != this.c.getFinalX())) {
          int i = this.computeHorizontalScrollRange() - this.getWidth();
          if (p0 >= i) {
             this.c.abortAnimation();
             p0 = i;
          }
       }
       super.onOverScrolled(p0, p1, p2, p3);
       return;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ReactHorizontalScrollView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ReactHorizontalScrollView.class, "16")) {
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
       if (PatchProxy.isSupport(ReactHorizontalScrollView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ReactHorizontalScrollView.class, "23")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (this.l != null) {
          this.updateClippingRect();
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactHorizontalScrollView.class, "20");
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
    public boolean pageScroll(int p0){
       if (PatchProxy.isSupport(ReactHorizontalScrollView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ReactHorizontalScrollView.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = super.pageScroll(p0);
       if (this.j != null && b) {
          this.d(0, 0);
       }
       return b;
    }
    public void requestChildFocus(View p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactHorizontalScrollView.class, "9")) {
          return;
       }
       if (p1 == null || (this.j == null && !PatchProxy.applyVoidOneRefs(p1, this, ReactHorizontalScrollView.class, "15"))) {
          int i = this.c(p1);
          if (i) {
             this.scrollBy(i, 0);
          }
       }
       super.requestChildFocus(p0, p1);
       return;
    }
    public void setBackgroundColor(int p0){
       if (PatchProxy.isSupport(ReactHorizontalScrollView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactHorizontalScrollView.class, "40")) {
          return;
       }
       this.y.b(p0);
       return;
    }
    public void setBorderRadius(float p0){
       if (PatchProxy.isSupport(ReactHorizontalScrollView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ReactHorizontalScrollView.class, "43")) {
          return;
       }
       this.y.d(p0);
       return;
    }
    public void setBorderStyle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactHorizontalScrollView.class, "45")) {
          return;
       }
       this.y.f(p0);
       return;
    }
    public void setDecelerationRate(float p0){
       if (PatchProxy.isSupport(ReactHorizontalScrollView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ReactHorizontalScrollView.class, "3")) {
          return;
       }
       this.u = p0;
       ReactHorizontalScrollView tc = this.c;
       if (tc != null) {
          tc.setFriction((0x3f800000 - p0));
       }
       return;
    }
    public void setDisableIntervalMomentum(boolean p0){
       this.s = p0;
    }
    public void setEndFillColor(int p0){
       if (PatchProxy.isSupport(ReactHorizontalScrollView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactHorizontalScrollView.class, "29")) {
          return;
       }
       if (p0 != this.r) {
          this.r = p0;
          this.q = new ColorDrawable(this.r);
       }
       return;
    }
    public void setOverflow(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactHorizontalScrollView.class, "5")) {
          return;
       }
       this.h = p0;
       this.invalidate();
       return;
    }
    public void setPagingEnabled(boolean p0){
       this.j = p0;
    }
    public void setRemoveClippedSubviews(boolean p0){
       if (PatchProxy.isSupport(ReactHorizontalScrollView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ReactHorizontalScrollView.class, "2")) {
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
       this.t = p0;
    }
    public void setSnapOffsets(List p0){
       this.v = p0;
    }
    public void setSnapToEnd(boolean p0){
       this.x = p0;
    }
    public void setSnapToStart(boolean p0){
       this.w = p0;
    }
    public void updateClippingRect(){
       if (PatchProxy.applyVoid(null, this, ReactHorizontalScrollView.class, "25")) {
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
