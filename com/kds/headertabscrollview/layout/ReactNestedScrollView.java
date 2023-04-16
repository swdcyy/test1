package com.kds.headertabscrollview.layout.ReactNestedScrollView;
import ze.q;
import android.view.ViewGroup$OnHierarchyChangeListener;
import android.view.View$OnLayoutChangeListener;
import com.kds.headertabscrollview.layout.FixedFlingNestedScrollView;
import com.kds.headertabscrollview.layout.ReactNestedScrollView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.graphics.Rect;
import bg.d;
import android.view.View;
import uf.a;
import uf.d;
import android.widget.FrameLayout;
import java.lang.Math;
import java.util.List;
import java.lang.Number;
import java.util.Iterator;
import usd.q;
import android.widget.OverScroller;
import android.view.ViewGroup;
import uf.b;
import com.kds.headertabscrollview.layout.ReactNestedScrollView$b;
import java.lang.Runnable;
import a2.i0;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import od.a;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewParent;
import df.g;
import java.lang.Throwable;
import cb.a;
import ze.k;
import android.view.View$MeasureSpec;
import qsd.d;
import android.graphics.drawable.ColorDrawable;
import ze.r;

public final class ReactNestedScrollView extends FixedFlingNestedScrollView implements q, ViewGroup$OnHierarchyChangeListener, View$OnLayoutChangeListener	// class@000729
{
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public boolean I;
    public List J;
    public float K;
    public String L;
    public int M;
    public int N;
    public boolean O;
    public final Rect P;
    public Rect Q;
    public Drawable R;
    public final d S;
    public final a T;
    public final d U;
    public boolean U0;
    public View V;
    public boolean V0;
    public Runnable W;
    public float W0;
    public float X0;
    public static final ReactNestedScrollView$a Y0;

    static {
       ReactNestedScrollView.Y0 = new ReactNestedScrollView$a(null);
    }
    public void ReactNestedScrollView(Context p0){
       a.q(p0, "context");
       super(p0, null, 0x1010080);
       this.D = true;
       this.H = true;
       this.I = true;
       this.K = 0x3f7c28f6;
       this.L = "hidden";
       this.N = 30;
       this.P = new Rect();
       this.S = new d(this);
       this.T = new a();
       this.U = new d();
       this.setOnHierarchyChangeListener(this);
       this.setScrollBarStyle(0x2000000);
    }
    public final void C(){
       this.awakenScrollBars();
    }
    public final void D(int p0){
       double d2;
       int i;
       int i1;
       int i2;
       int i3;
       double d3;
       int i7;
       int i8;
       int i9;
       int i10;
       ReactNestedScrollView reactNestedS = this;
       if (this.getChildCount() <= 0) {
          return;
       }
       boolean b = true;
       if (reactNestedS.G == null && reactNestedS.J == null) {
          double d = (double)this.getSnapToInterval1();
          double d1 = (double)this.getScrollY();
          d2 = d1 / d;
          i = (int)Math.floor(d2);
          i1 = (int)Math.ceil(d2);
          i2 = (int)Math.rint(d2);
          i3 = (int)Math.rint(((double)this.F(p0) / d));
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
             reactNestedS.U0 = b;
             reactNestedS.z(this.getScrollX(), (int)d3);
          }
          return;
       }else {
          i = this.getMaxScrollY();
          int i4 = this.F(p0);
          int i5 = (this.getHeight() - this.getPaddingBottom()) - this.getPaddingTop();
          ReactNestedScrollView j = reactNestedS.J;
          int i6 = 0;
          if (j != null) {
             if (j == null) {
                a.L();
             }
             i3 = j.get(i6).intValue();
             i7 = j.get((j.size() - b)).intValue();
             Iterator iterator = j.iterator();
             i8 = i;
             i2 = 0;
             while (iterator.hasNext()) {
                i1 = iterator.next().intValue();
                if (i1 <= i4) {
                   i9 = i4 - i1;
                   i10 = i4 - i2;
                   if (i9 < i10) {
                      i2 = i1;
                   }
                }
                if (i1 >= i4) {
                   i9 = i1 - i4;
                   i10 = i8 - i4;
                   if (i9 < i10) {
                      i8 = i1;
                   }
                }
             }
          }else {
             d3 = (double)this.getSnapToInterval1();
             d2 = (double)i4 / d3;
             i8 = q.u(i, (int)(Math.ceil(d2) * d3));
             i7 = i;
             i2 = (int)(Math.floor(d2) * d3);
             i3 = 0;
          }
          int i11 = i4 - i2;
          i1 = i8 - i4;
          i9 = (i11 < i1)? i2: i8;
          if (reactNestedS.I == null && i4 >= i7) {
             if (this.getScrollY() < i7) {
                i4 = p0;
                i3 = i7;
             }else {
             label_010a :
                i3 = i4;
             label_010b :
                i4 = p0;
             }
          }else if(reactNestedS.H == null && i4 <= i3){
             if (this.getScrollY() > i3) {
                goto label_010b ;
             }else {
                goto label_010a ;
             }
          }else {
             d3 = 10.00f;
             if (p0 > 0) {
                i4 = p0 + (int)((double)i1 * d3);
                i3 = i8;
             }else if(p0 < 0){
                i4 = p0 - (int)((double)i11 * d3);
                i3 = i2;
             }else {
                i4 = p0;
                i3 = i9;
             }
          }
          int i12 = q.u(q.n(i6, i3), i);
          if (!i4) {
             i4 = i12 - this.getScrollY();
          }
          i1 = i4;
          int i13 = (!i12 || i12 == i)? i5 / 2: 0;
          reactNestedS.U0 = b;
          reactNestedS.d.fling(this.getScrollX(), this.getScrollY(), 0, i1, 0, 0, i12, i12, 0, i13);
          reactNestedS.u(b);
          return;
       }
    }
    public final void E(int p0,int p1){
       ReactNestedScrollView tE = this.E;
       if (tE == null && this.F == null) {
          return;
       }
       if (this.W != null) {
          return;
       }
       if (tE != null) {
          b.f(this, p0, p1);
       }
       this.U0 = false;
       ReactNestedScrollView$b uob = new ReactNestedScrollView$b(this);
       this.W = uob;
       i0.l0(this, uob, 20);
       return;
    }
    public final int F(int p0){
       OverScroller overScroller = new OverScroller(this.getContext());
       overScroller.setFriction((0x3f800000 - this.K));
       overScroller.fling(this.getScrollX(), this.getScrollY(), 0, p0, 0, 0, 0, this.getMaxScrollY(), 0, (((this.getHeight() - this.getPaddingBottom()) - this.getPaddingTop()) / 2));
       return overScroller.getFinalY();
    }
    public void draw(Canvas p0){
       a.q(p0, "canvas");
       if (this.M != null) {
          int i = 0;
          View childAt = this.getChildAt(i);
          if (this.R != null && (childAt != null && childAt.getBottom() < this.getHeight())) {
             ReactNestedScrollView tR = this.R;
             if (tR == null) {
                a.L();
             }
             tR.setBounds(i, childAt.getBottom(), this.getWidth(), this.getHeight());
             ReactNestedScrollView tR1 = this.R;
             if (tR1 == null) {
                a.L();
             }
             tR1.draw(p0);
          }
       }
       this.getDrawingRect(this.P);
       if (a.g(this.L, "visible") ^ 0x01) {
          p0.clipRect(this.P);
       }
       super.draw(p0);
       return;
    }
    public void getClippingRect(Rect p0){
       a.q(p0, "outClippingRect");
       ReactNestedScrollView tQ = this.Q;
       a.c(tQ);
       p0.set(tQ);
    }
    public final float getDecelerateRate(){
       return this.K;
    }
    public final int getEndFillColor(){
       return this.M;
    }
    public final int getInterceptVerticalScrollAngle(){
       return this.N;
    }
    public final int getMaxScrollY(){
       ReactNestedScrollView tV = this.V;
       int height = (tV != null)? tV.getHeight(): 0;
       return q.n(0, (height - ((this.getHeight() - this.getPaddingBottom()) - this.getPaddingTop())));
    }
    public final boolean getNeedSendMomentumEvents(){
       return this.E;
    }
    public final String getOverflow(){
       return this.L;
    }
    public final boolean getPagingEnabled(){
       return this.F;
    }
    public boolean getRemoveClippedSubviews(){
       return this.O;
    }
    public final boolean getScrollEnabled(){
       return this.D;
    }
    public final List getSnapOffsets(){
       return this.J;
    }
    public final boolean getSnapToEnd(){
       return this.I;
    }
    public final int getSnapToInterval(){
       return this.G;
    }
    public final int getSnapToInterval1(){
       ReactNestedScrollView tG = this.G;
       if (tG != null) {
          return tG;
       }
       return this.getHeight();
    }
    public final boolean getSnapToStart(){
       return this.H;
    }
    public boolean h(KeyEvent p0){
       a.q(p0, "event");
       int keyCode = p0.getKeyCode();
       if (this.D == null && (keyCode == 19 || keyCode == 20)) {
          return false;
       }
       return super.h(p0);
    }
    public void i(int p0){
       float f = Math.signum(this.T.b());
       if (!f) {
          f = Math.signum((float)p0);
       }
       if (this.getScaleY() - (float)0 < 0) {
          p0 = (int)((float)Math.abs(p0) * f);
       }
       if (this.F != null) {
          this.D(p0);
       }else {
          this.d.fling(this.getScrollX(), this.getScrollY(), 0, p0, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, (((this.getHeight() - this.getPaddingBottom()) - this.getPaddingTop()) / 2));
          this.u(true);
       }
       this.E(0, p0);
       return;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       if (this.O != null) {
          this.updateClippingRect();
       }
       return;
    }
    public void onChildViewAdded(View p0,View p1){
       a.q(p0, "parent");
       a.q(p1, "child");
       this.V = p1;
       if (p1 == null) {
          a.L();
       }
       p1.addOnLayoutChangeListener(this);
       return;
    }
    public void onChildViewRemoved(View p0,View p1){
       a.q(p0, "parent");
       a.q(p1, "child");
       ReactNestedScrollView tV = this.V;
       if (tV == null) {
          a.L();
       }
       tV.removeOnLayoutChangeListener(this);
       this.V = null;
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       ViewParent viewParent;
       a.q(p0, "ev");
       if (this.D == null) {
          return false;
       }
       if (this.l((int)p0.getX(), (int)p0.getY())) {
          float x = p0.getX();
          float y = p0.getY();
          float f = x - this.W0;
          float f1 = y - this.X0;
          if (!p0.getAction()) {
             this.W0 = x;
             this.X0 = y;
          }else if(p0.getAction() == -0.00f || (p0.getAction() == 1 && Math.abs(Math.rint(((double)((float)Math.atan((double)(f1 / f)) * (float)180) / 0x400921fb54442d18))) - (double)Math.abs(this.N) < 0)){
             viewParent = 1;
          label_006d :
             if (!viewParent) {
                this.getParent().requestDisallowInterceptTouchEvent(true);
                try{
                label_007e :
                   if (super.onInterceptTouchEvent(p0)) {
                      g.a(this, p0);
                      b.a(this);
                      this.V0 = true;
                      return true;
                   }
                }catch(java.lang.IllegalArgumentException e8){
                   a.y("ReactNestedScrollView", "Error intercepting touch event.", e8);
                }
                return false;
             }
          }
          viewParent = null;
          goto label_006d ;
       }
       this.getParent().requestDisallowInterceptTouchEvent(false);
       goto label_007e ;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       this.scrollTo(this.getScrollX(), this.getScrollY());
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       a.q(p0, "v");
       if (this.V == null) {
          return;
       }
       int maxScrollY = this.getMaxScrollY();
       if (this.getScrollY() > maxScrollY) {
          this.scrollTo(this.getScrollX(), maxScrollY);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       k.a(p0, p1);
       this.setMeasuredDimension(View$MeasureSpec.getSize(p0), View$MeasureSpec.getSize(p1));
    }
    public void onOverScrolled(int p0,int p1,boolean p2,boolean p3){
       if (this.V != null) {
          FixedFlingNestedScrollView td = this.d;
          String str = "mScroller";
          a.h(td, str);
          if (!td.isFinished()) {
             td = this.d;
             a.h(td, str);
             FixedFlingNestedScrollView td1 = this.d;
             a.h(td1, str);
             if (td.getCurrY() != td1.getFinalY()) {
                int maxScrollY = this.getMaxScrollY();
                if (p1 >= maxScrollY) {
                   this.a();
                   p1 = maxScrollY;
                }
             }
          }
       }
       super.onOverScrolled(p0, p1, p2, p3);
       return;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       super.onScrollChanged(p0, p1, p2, p3);
       this.U0 = true;
       if (this.T.c(p0, p1)) {
          if (this.O != null) {
             this.updateClippingRect();
          }
          b.c(this, this.T.a(), this.T.b());
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       if (this.O != null) {
          this.updateClippingRect();
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       a.q(p0, "ev");
       boolean b = false;
       if (this.D == null) {
          return b;
       }
       this.U.a(p0);
       if ((p0.getAction() & 0x00ff) == 1 && this.V0 != null) {
          float f = this.U.b();
          float f1 = this.U.c();
          b.b(this, f, f1);
          this.V0 = b;
          this.E(d.H0(f), d.H0(f1));
       }
       return super.onTouchEvent(p0);
    }
    public void requestChildFocus(View p0,View p1){
       a.q(p0, "child");
       if (p1 != null) {
          Rect rect = new Rect();
          p1.getDrawingRect(rect);
          this.offsetDescendantRectToMyCoords(p1, rect);
          int i = this.d(rect);
          if (i) {
             this.scrollBy(0, i);
          }
       }
       super.requestChildFocus(p0, p1);
       return;
    }
    public void setBackgroundColor(int p0){
       this.S.b(p0);
    }
    public final void setBorderRadius(float p0){
       this.S.d(p0);
    }
    public final void setBorderStyle(String p0){
       this.S.f(p0);
    }
    public final void setDecelerateRate(float p0){
       this.K = p0;
       this.d.setFriction((0x3f800000 - p0));
    }
    public final void setEndFillColor(int p0){
       if (p0 != this.M) {
          this.M = p0;
          this.R = new ColorDrawable(this.M);
       }
       return;
    }
    public final void setInterceptVerticalScrollAngle(int p0){
       this.N = p0;
    }
    public final void setNeedSendMomentumEvents(boolean p0){
       this.E = p0;
    }
    public final void setOverflow(String p0){
       this.L = p0;
       this.invalidate();
    }
    public final void setPagingEnabled(boolean p0){
       this.F = p0;
    }
    public void setRemoveClippedSubviews(boolean p0){
       if (p0 && this.Q == null) {
          this.Q = new Rect();
       }
       this.O = p0;
       this.updateClippingRect();
       return;
    }
    public final void setScrollEnabled(boolean p0){
       this.D = p0;
    }
    public final void setSnapOffsets(List p0){
       this.J = p0;
    }
    public final void setSnapToEnd(boolean p0){
       this.I = p0;
    }
    public final void setSnapToInterval(int p0){
       this.G = p0;
    }
    public final void setSnapToStart(boolean p0){
       this.H = p0;
    }
    public void updateClippingRect(){
       if (this.O == null) {
          return;
       }
       a.c(this.Q);
       ReactNestedScrollView tQ = this.Q;
       if (tQ == null) {
          a.L();
       }
       r.a(this, tQ);
       View childAt = this.getChildAt(0);
       if (childAt instanceof q) {
          childAt.updateClippingRect();
       }
       return;
    }
}
