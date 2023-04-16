package com.kuaishou.live.widget.page2.ViewPager2;
import android.view.ViewGroup;
import android.content.Context;
import android.graphics.Rect;
import com.kuaishou.live.widget.page2.a;
import com.kuaishou.live.widget.page2.ViewPager2$a;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kuaishou.live.widget.page2.ViewPager2$h;
import com.kuaishou.live.widget.page2.ViewPager2$e;
import com.kuaishou.live.widget.page2.ViewPager2$RecyclerViewImpl;
import a2.i0;
import com.kuaishou.live.widget.page2.ViewPager2$LinearLayoutManagerImpl;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup$LayoutParams;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$o;
import vq3.d;
import com.kuaishou.live.widget.page2.c;
import vq3.c;
import com.kuaishou.live.widget.page2.ViewPager2$j;
import androidx.recyclerview.widget.z;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.widget.page2.ViewPager2$b;
import com.kuaishou.live.widget.page2.ViewPager2$c;
import com.kuaishou.live.widget.page2.ViewPager2$g;
import com.kuaishou.live.widget.page2.ViewPager2$d;
import com.kuaishou.live.widget.page2.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Integer;
import android.util.SparseArray;
import android.os.Parcelable;
import com.kuaishou.live.widget.page2.ViewPager2$SavedState;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import i3.b;
import java.lang.Math;
import java.lang.IllegalStateException;
import com.kuaishou.live.widget.page2.ViewPager2$k;
import java.lang.Runnable;
import java.lang.CharSequence;
import java.lang.Number;
import androidx.recyclerview.widget.t;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.Gravity;
import android.view.View$BaseSavedState;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView$i;
import java.lang.IllegalArgumentException;
import com.kuaishou.live.widget.page2.ViewPager2$i;
import androidx.recyclerview.widget.RecyclerView$l;

public final class ViewPager2 extends ViewGroup	// class@00103a
{
    public final Rect b;
    public final Rect c;
    public a d;
    public int e;
    public boolean f;
    public RecyclerView$i g;
    public LinearLayoutManager h;
    public int i;
    public Parcelable j;
    public RecyclerView k;
    public t l;
    public c m;
    public a n;
    public c o;
    public b p;
    public RecyclerView$l q;
    public boolean r;
    public boolean s;
    public int t;
    public ViewPager2$d u;
    public float v;
    public static boolean w = true;

    public void ViewPager2(Context p0){
       super(p0);
       this.b = new Rect();
       this.c = new Rect();
       this.d = new a(3);
       this.f = false;
       this.g = new ViewPager2$a(this);
       this.i = -1;
       this.q = null;
       this.r = false;
       this.s = true;
       this.t = -1;
       this.v = 25.00f;
       this.a(p0, null);
    }
    public void ViewPager2(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new Rect();
       this.c = new Rect();
       this.d = new a(3);
       this.f = false;
       this.g = new ViewPager2$a(this);
       this.i = -1;
       this.q = null;
       this.r = false;
       this.s = true;
       this.t = -1;
       this.v = 25.00f;
       this.a(p0, p1);
    }
    public void ViewPager2(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new Rect();
       this.c = new Rect();
       this.d = new a(3);
       this.f = false;
       this.g = new ViewPager2$a(this);
       this.i = -1;
       this.q = null;
       this.r = false;
       this.s = true;
       this.t = -1;
       this.v = 25.00f;
       this.a(p0, p1);
    }
    public final void a(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ViewPager2.class, "1")) {
          return;
       }
       int[] a6 = c$b.a6;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, a6);
       this.v = typedArray.getFloat(0, 25.00f);
       typedArray.recycle();
       ViewPager2$h oh = (ViewPager2.w)? new ViewPager2$h(this): new ViewPager2$e(this);
       this.u = oh;
       ViewPager2$RecyclerViewImpl recyclerView = new ViewPager2$RecyclerViewImpl(this, p0);
       this.k = recyclerView;
       recyclerView.setId(i0.l());
       this.k.setDescendantFocusability(0x20000);
       ViewPager2$LinearLayoutManagerImpl linearLayout = new ViewPager2$LinearLayoutManagerImpl(this, p0);
       this.h = linearLayout;
       this.k.setLayoutManager(linearLayout);
       this.k.setScrollingTouchSlop(1);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, ViewPager2.class, "4")) {
          TypedArray typedArray1 = p0.obtainStyledAttributes(p1, a6);
          this.setOrientation(typedArray1.getInt(0, 0));
          typedArray1.recycle();
       }
       this.k.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       ViewPager2 tk = this.k;
       d uod = PatchProxy.apply(null, this, ViewPager2.class, "2");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d(this);
       }
       tk.addOnChildAttachStateChangeListener(uod);
       c uoc = new c(this);
       this.m = uoc;
       this.o = new c(this, uoc, this.k);
       ViewPager2$j oj = new ViewPager2$j(this);
       this.l = oj;
       oj.b(this.k);
       this.k.addOnScrollListener(this.m);
       a uoa = new a(3);
       this.n = uoa;
       uod.a = uoa;
       this.n.d(new ViewPager2$b(this));
       this.n.d(new ViewPager2$c(this));
       this.u.f(this.n, this.k);
       this.n.d(this.d);
       b uob = new b(this.h);
       this.p = uob;
       this.n.d(uob);
       tk = this.k;
       this.attachViewToParent(tk, 0, tk.getLayoutParams());
       return;
    }
    public boolean b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ViewPager2 obj = PatchProxy.apply(objArray, this, ViewPager2.class, "28");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.o;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, c.class, "1");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.b.m;
       return b;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, ViewPager2.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.h.getLayoutDirection() != b) {
          b = false;
       }
       return b;
    }
    public boolean canScrollHorizontally(int p0){
       if (PatchProxy.isSupport(ViewPager2.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ViewPager2.class, "32");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.k.canScrollHorizontally(p0);
    }
    public boolean canScrollVertically(int p0){
       if (PatchProxy.isSupport(ViewPager2.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ViewPager2.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.k.canScrollVertically(p0);
    }
    public boolean d(){
       return this.s;
    }
    public void dispatchRestoreInstanceState(SparseArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewPager2.class, "8")) {
          return;
       }
       Parcelable parcelable = p0.get(this.getId());
       if (parcelable instanceof ViewPager2$SavedState) {
          ViewPager2$SavedState b = parcelable.b;
          p0.put(this.k.getId(), p0.get(b));
          p0.remove(b);
       }
       super.dispatchRestoreInstanceState(p0);
       this.e();
       return;
    }
    public final void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ViewPager2.class, "7")) {
          return;
       }
       if (this.i == -1) {
          return;
       }
       RecyclerView$Adapter adapter = this.getAdapter();
       if (adapter == null) {
          return;
       }
       ViewPager2 tj = this.j;
       if (tj != null) {
          if (adapter instanceof b) {
             adapter.I(tj);
          }
          this.j = objArray;
       }
       int i = Math.max(0, Math.min(this.i, (adapter.getItemCount() - 1)));
       this.e = i;
       this.i = -1;
       this.k.scrollToPosition(i);
       this.u.k();
       return;
    }
    public void f(int p0,boolean p1){
       if (PatchProxy.isSupport(ViewPager2.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, ViewPager2.class, "22")) {
          return;
       }
       if (this.b()) {
          throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
       }
       this.g(p0, p1);
       return;
    }
    public void g(int p0,boolean p1){
       if (PatchProxy.isSupport(ViewPager2.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, ViewPager2.class, "23")) {
          return;
       }
       RecyclerView$Adapter adapter = this.getAdapter();
       int i = 0;
       if (adapter == null) {
          if (this.i != -1) {
             this.i = Math.max(p0, i);
          }
          return;
       }else if(adapter.getItemCount() <= 0){
          return;
       }else {
          p0 = Math.min(Math.max(p0, i), (adapter.getItemCount() - 1));
          if (p0 == this.e && this.m.g()) {
             return;
          }
          ViewPager2 te = this.e;
          if (p0 == te && p1) {
             return;
          }
          double d = (double)te;
          this.e = p0;
          this.u.n();
          if (!this.m.g()) {
             d = this.m.f();
          }
          te = this.m;
          Objects.requireNonNull(te);
          c uoc = c.class;
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), te, uoc, "6")) {
             int i2 = 2;
             int i3 = (p1)? 2: 3;
             te.e = i3;
             te.m = i;
             if (te.i != p0) {
                i = 1;
             }
             te.i = p0;
             te.e(i2);
             if (i) {
                te.d(p0);
             }
          }
          if (!p1) {
             this.k.scrollToPosition(p0);
             return;
          }else {
             double d1 = (double)p0;
             if (Math.abs((d1 - d)) - 0x4008000000000000 > 0) {
                ViewPager2 tk = this.k;
                int i1 = (d1 - d > 0)? p0 - 3: p0 + 3;
                tk.scrollToPosition(i1);
                tk = this.k;
                tk.post(new ViewPager2$k(p0, tk));
             }else {
                this.k.smoothScrollToPosition(p0);
             }
             return;
          }
       }
    }
    public CharSequence getAccessibilityClassName(){
       ViewPager2 obj = PatchProxy.apply(null, this, ViewPager2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u;
       Objects.requireNonNull(obj);
       if (obj instanceof ViewPager2$h) {
          return this.u.e();
       }
       return super.getAccessibilityClassName();
    }
    public RecyclerView$Adapter getAdapter(){
       Object obj = PatchProxy.apply(null, this, ViewPager2.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getAdapter();
    }
    public int getCurrentItem(){
       return this.e;
    }
    public int getItemDecorationCount(){
       Object obj = PatchProxy.apply(null, this, ViewPager2.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.k.getItemDecorationCount();
    }
    public int getOffscreenPageLimit(){
       return this.t;
    }
    public int getOrientation(){
       Object obj = PatchProxy.apply(null, this, ViewPager2.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.h.getOrientation();
    }
    public int getPageSize(){
       int i;
       int paddingRight;
       ViewPager2 obj = PatchProxy.apply(null, this, ViewPager2.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.k;
       if (!this.getOrientation()) {
          i = obj.getWidth() - obj.getPaddingLeft();
          paddingRight = obj.getPaddingRight();
       }else {
          i = obj.getHeight() - obj.getPaddingTop();
          paddingRight = obj.getPaddingBottom();
       }
       return (i - paddingRight);
    }
    public int getScrollState(){
       Object obj = PatchProxy.apply(null, this, ViewPager2.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.m.f;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, ViewPager2.class, "16")) {
          return;
       }
       ViewPager2 tl = this.l;
       if (tl == null) {
          throw new IllegalStateException("Design assumption violated.");
       }
       View view = tl.h(this.h);
       if (view == null) {
          return;
       }
       int position = this.h.getPosition(view);
       if (position != this.e && !this.getScrollState()) {
          this.n.c(position);
       }
       this.f = false;
       return;
    }
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewPager2.class, "39")) {
          return;
       }
       super.onInitializeAccessibilityNodeInfo(p0);
       this.u.g(p0);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ViewPager2.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ViewPager2.class, "15")) {
             return;
          }
       }
       this.b.left = this.getPaddingLeft();
       this.b.right = (p3 - p1) - this.getPaddingRight();
       p1.top = this.getPaddingTop();
       p1.bottom = (p4 - p2) - this.getPaddingBottom();
       Gravity.apply(0x800033, this.k.getMeasuredWidth(), this.k.getMeasuredHeight(), this.b, this.c);
       ViewPager2 tc = this.c;
       this.k.layout(tc.left, tc.top, tc.right, tc.bottom);
       if (this.f != null) {
          this.h();
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ViewPager2.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ViewPager2.class, "14")) {
          return;
       }
       this.measureChild(this.k, p0, p1);
       int measuredStat = this.k.getMeasuredState();
       this.setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max((this.k.getMeasuredWidth() + (this.getPaddingLeft() + this.getPaddingRight())), this.getSuggestedMinimumWidth()), p0, measuredStat), ViewGroup.resolveSizeAndState(Math.max((this.k.getMeasuredHeight() + (this.getPaddingTop() + this.getPaddingBottom())), this.getSuggestedMinimumHeight()), p1, (measuredStat << 16)));
       return;
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewPager2.class, "6")) {
          return;
       }
       if (!p0 instanceof ViewPager2$SavedState) {
          super.onRestoreInstanceState(p0);
          return;
       }else {
          super.onRestoreInstanceState(p0.getSuperState());
          this.i = p0.c;
          this.j = p0.d;
          return;
       }
    }
    public Parcelable onSaveInstanceState(){
       ViewPager2 obj = PatchProxy.apply(null, this, ViewPager2.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ViewPager2$SavedState savedState = new ViewPager2$SavedState(super.onSaveInstanceState());
       savedState.b = this.k.getId();
       obj = this.i;
       if (obj == -1) {
          obj = this.e;
       }
       savedState.c = obj;
       obj = this.j;
       if (obj != null) {
          savedState.d = obj;
       }else {
          RecyclerView$Adapter adapter = this.k.getAdapter();
          if (adapter instanceof b) {
             savedState.d = adapter.g();
          }
       }
       return savedState;
    }
    public void onViewAdded(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewPager2.class, "13")) {
          return;
       }
       throw new IllegalStateException("ViewPager2 does not support direct child views");
    }
    public boolean performAccessibilityAction(int p0,Bundle p1){
       if (PatchProxy.isSupport(ViewPager2.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, ViewPager2.class, "40");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.u.b(p0, p1)) {
          return this.u.j(p0, p1);
       }else {
          return super.performAccessibilityAction(p0, p1);
       }
    }
    public void setAdapter(RecyclerView$Adapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewPager2.class, "9")) {
          return;
       }
       RecyclerView$Adapter adapter = this.k.getAdapter();
       this.u.d(adapter);
       if (!PatchProxy.applyVoidOneRefs(adapter, this, ViewPager2.class, "11") && adapter != null) {
          adapter.I0(this.g);
       }
       this.k.setAdapter(p0);
       this.e = 0;
       this.e();
       this.u.c(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, ViewPager2.class, "10") && p0 != null) {
          p0.F0(this.g);
       }
       return;
    }
    public void setCurrentItem(int p0){
       if (PatchProxy.isSupport(ViewPager2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ViewPager2.class, "21")) {
          return;
       }
       this.f(p0, true);
       return;
    }
    public void setLayoutDirection(int p0){
       if (PatchProxy.isSupport(ViewPager2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ViewPager2.class, "38")) {
          return;
       }
       super.setLayoutDirection(p0);
       this.u.m();
       return;
    }
    public void setMillisecondPerInch(float p0){
       this.v = p0;
    }
    public void setOffscreenPageLimit(int p0){
       if (PatchProxy.isSupport(ViewPager2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ViewPager2.class, "31")) {
          return;
       }
       if (p0 < 1 && p0 != -1) {
          throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
       }
       this.t = p0;
       this.k.requestLayout();
       return;
    }
    public void setOrientation(int p0){
       if (PatchProxy.isSupport(ViewPager2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ViewPager2.class, "18")) {
          return;
       }
       this.h.setOrientation(p0);
       this.u.o();
       return;
    }
    public void setPageTransformer(ViewPager2$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewPager2.class, "36")) {
          return;
       }
       RecyclerView$l ol = null;
       if (p0 != null) {
          if (this.r == null) {
             this.q = this.k.getItemAnimator();
             this.r = true;
          }
          this.k.setItemAnimator(ol);
       }else if(this.r != null){
          this.k.setItemAnimator(this.q);
          this.q = ol;
          this.r = false;
       }
       if (p0 == this.p.d()) {
          return;
       }else {
          this.p.b = p0;
          if (!PatchProxy.applyVoid(ol, this, ViewPager2.class, "37") && this.p.d() != null) {
             double d = this.m.f();
             int i = (int)d;
             float f = (float)(d - (double)i);
             this.p.b(i, f, Math.round(((float)this.getPageSize() * f)));
          }
          return;
       }
    }
    public void setUserInputEnabled(boolean p0){
       if (PatchProxy.isSupport(ViewPager2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ViewPager2.class, "30")) {
          return;
       }
       this.s = p0;
       this.u.p();
       return;
    }
}
