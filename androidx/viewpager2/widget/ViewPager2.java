package androidx.viewpager2.widget.ViewPager2;
import android.view.ViewGroup;
import android.content.Context;
import android.graphics.Rect;
import androidx.viewpager2.widget.a;
import androidx.viewpager2.widget.ViewPager2$a;
import android.util.AttributeSet;
import j3.b;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.viewpager2.widget.ViewPager2$d;
import android.util.SparseArray;
import java.lang.Object;
import android.os.Parcelable;
import androidx.viewpager2.widget.ViewPager2$SavedState;
import androidx.viewpager2.widget.ViewPager2$i;
import androidx.viewpager2.widget.ViewPager2$f;
import androidx.viewpager2.widget.ViewPager2$RecyclerViewImpl;
import a2.i0;
import androidx.viewpager2.widget.ViewPager2$LinearLayoutManagerImpl;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup$LayoutParams;
import androidx.viewpager2.widget.e;
import androidx.viewpager2.widget.ViewPager2$k;
import androidx.recyclerview.widget.z;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.viewpager2.widget.ViewPager2$h;
import androidx.viewpager2.widget.ViewPager2$b;
import androidx.viewpager2.widget.ViewPager2$c;
import androidx.viewpager2.widget.ViewPager2$e;
import androidx.viewpager2.widget.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import java.lang.CharSequence;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$i;
import androidx.viewpager2.widget.ViewPager2$j;
import java.lang.Math;
import i3.b;
import java.lang.IllegalStateException;
import androidx.viewpager2.widget.ViewPager2$l;
import java.lang.Runnable;
import ll8.c$b;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.Gravity;
import android.view.View$BaseSavedState;
import androidx.recyclerview.widget.t;
import android.os.Bundle;
import java.lang.IllegalArgumentException;
import androidx.recyclerview.widget.RecyclerView$l;

public final class ViewPager2 extends ViewGroup	// class@000a3d
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
    public e m;
    public a n;
    public b o;
    public d p;
    public RecyclerView$l q;
    public boolean r;
    public boolean s;
    public int t;
    public ViewPager2$e u;
    public static boolean v = true;

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
       this.e(p0, null);
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
       this.e(p0, p1);
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
       this.e(p0, p1);
    }
    public boolean a(){
       return this.o.b();
    }
    public boolean b(){
       return this.o.d();
    }
    public final RecyclerView$o c(){
       return new ViewPager2$d(this);
    }
    public boolean canScrollHorizontally(int p0){
       return this.k.canScrollHorizontally(p0);
    }
    public boolean canScrollVertically(int p0){
       return this.k.canScrollVertically(p0);
    }
    public boolean d(float p0){
       return this.o.e(p0);
    }
    public void dispatchRestoreInstanceState(SparseArray p0){
       Parcelable parcelable = p0.get(this.getId());
       if (parcelable instanceof ViewPager2$SavedState) {
          ViewPager2$SavedState b = parcelable.b;
          p0.put(this.k.getId(), p0.get(b));
          p0.remove(b);
       }
       super.dispatchRestoreInstanceState(p0);
       this.l();
       return;
    }
    public final void e(Context p0,AttributeSet p1){
       ViewPager2$i oi = (ViewPager2.v)? new ViewPager2$i(this): new ViewPager2$f(this);
       this.u = oi;
       ViewPager2$RecyclerViewImpl recyclerView = new ViewPager2$RecyclerViewImpl(this, p0);
       this.k = recyclerView;
       recyclerView.setId(i0.l());
       this.k.setDescendantFocusability(0x20000);
       ViewPager2$LinearLayoutManagerImpl linearLayout = new ViewPager2$LinearLayoutManagerImpl(this, p0);
       this.h = linearLayout;
       this.k.setLayoutManager(linearLayout);
       this.k.setScrollingTouchSlop(1);
       this.o(p0, p1);
       this.k.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       this.k.addOnChildAttachStateChangeListener(this.c());
       e uoe = new e(this);
       this.m = uoe;
       this.o = new b(this, uoe, this.k);
       ViewPager2$k ok = new ViewPager2$k(this);
       this.l = ok;
       ok.b(this.k);
       this.k.addOnScrollListener(this.m);
       a uoa = new a(3);
       this.n = uoa;
       this.m.r(uoa);
       this.n.d(new ViewPager2$b(this));
       this.n.d(new ViewPager2$c(this));
       this.u.h(this.n, this.k);
       this.n.d(this.d);
       d uod = new d(this.h);
       this.p = uod;
       this.n.d(uod);
       ViewPager2 tk = this.k;
       this.attachViewToParent(tk, 0, tk.getLayoutParams());
       return;
    }
    public boolean f(){
       return this.o.f();
    }
    public boolean g(){
       boolean b = true;
       if (this.h.getLayoutDirection() == b) {
       }else {
          b = false;
       }
       return b;
    }
    public CharSequence getAccessibilityClassName(){
       if (this.u.a()) {
          return this.u.g();
       }
       return super.getAccessibilityClassName();
    }
    public RecyclerView$Adapter getAdapter(){
       return this.k.getAdapter();
    }
    public int getCurrentItem(){
       return this.e;
    }
    public int getItemDecorationCount(){
       return this.k.getItemDecorationCount();
    }
    public int getOffscreenPageLimit(){
       return this.t;
    }
    public int getOrientation(){
       return this.h.getOrientation();
    }
    public int getPageSize(){
       int i;
       int paddingRight;
       ViewPager2 tk = this.k;
       if (!this.getOrientation()) {
          i = tk.getWidth() - tk.getPaddingLeft();
          paddingRight = tk.getPaddingRight();
       }else {
          i = tk.getHeight() - tk.getPaddingTop();
          paddingRight = tk.getPaddingBottom();
       }
       return (i - paddingRight);
    }
    public int getScrollState(){
       return this.m.h();
    }
    public boolean h(){
       return this.s;
    }
    public final void i(RecyclerView$Adapter p0){
       if (p0 != null) {
          p0.F0(this.g);
       }
       return;
    }
    public void j(ViewPager2$h p0){
       this.d.d(p0);
    }
    public void k(){
       if (this.p.d() == null) {
          return;
       }
       double d = this.m.g();
       int i = (int)d;
       float f = (float)(d - (double)i);
       this.p.b(i, f, Math.round(((float)this.getPageSize() * f)));
       return;
    }
    public final void l(){
       int i = -1;
       if (this.i == i) {
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
          this.j = null;
       }
       int i1 = Math.max(0, Math.min(this.i, (adapter.getItemCount() - 1)));
       this.e = i1;
       this.i = i;
       this.k.scrollToPosition(i1);
       this.u.m();
       return;
    }
    public void m(int p0,boolean p1){
       if (this.f()) {
          throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
       }
       this.n(p0, p1);
       return;
    }
    public void n(int p0,boolean p1){
       RecyclerView$Adapter adapter = this.getAdapter();
       if (adapter == null) {
          if (this.i != -1) {
             this.i = Math.max(p0, 0);
          }
          return;
       }else if(adapter.getItemCount() <= 0){
          return;
       }else {
          p0 = Math.min(Math.max(p0, 0), (adapter.getItemCount() - 1));
          if (p0 == this.e && this.m.k()) {
             return;
          }
          ViewPager2 te = this.e;
          if (p0 == te && p1) {
             return;
          }
          double d = (double)te;
          this.e = p0;
          this.u.p();
          if (!this.m.k()) {
             d = this.m.g();
          }
          this.m.p(p0, p1);
          if (!p1) {
             this.k.scrollToPosition(p0);
             return;
          }else {
             double d1 = (double)p0;
             if (Math.abs((d1 - d)) - 0x4008000000000000 > 0) {
                ViewPager2 tk = this.k;
                int i = (d1 - d > 0)? p0 - 3: p0 + 3;
                tk.scrollToPosition(i);
                tk = this.k;
                tk.post(new ViewPager2$l(p0, tk));
             }else {
                this.k.smoothScrollToPosition(p0);
             }
             return;
          }
       }
    }
    public final void o(Context p0,AttributeSet p1){
       int[] a6 = c$b.a6;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, a6);
       if (Build$VERSION.SDK_INT >= 29) {
          this.saveAttributeDataForStyleable(p0, a6, p1, typedArray, 0, 0);
       }
       this.setOrientation(typedArray.getInt(0, 0));
       typedArray.recycle();
       return;
    }
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo p0){
       super.onInitializeAccessibilityNodeInfo(p0);
       this.u.i(p0);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       this.b.left = this.getPaddingLeft();
       this.b.right = (p3 - p1) - this.getPaddingRight();
       p1.top = this.getPaddingTop();
       p1.bottom = (p4 - p2) - this.getPaddingBottom();
       Gravity.apply(0x800033, this.k.getMeasuredWidth(), this.k.getMeasuredHeight(), this.b, this.c);
       ViewPager2 tc = this.c;
       this.k.layout(tc.left, tc.top, tc.right, tc.bottom);
       if (this.f != null) {
          this.s();
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       this.measureChild(this.k, p0, p1);
       int measuredStat = this.k.getMeasuredState();
       this.setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max((this.k.getMeasuredWidth() + (this.getPaddingLeft() + this.getPaddingRight())), this.getSuggestedMinimumWidth()), p0, measuredStat), ViewGroup.resolveSizeAndState(Math.max((this.k.getMeasuredHeight() + (this.getPaddingTop() + this.getPaddingBottom())), this.getSuggestedMinimumHeight()), p1, (measuredStat << 16)));
    }
    public void onRestoreInstanceState(Parcelable p0){
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
       ViewPager2$SavedState savedState = new ViewPager2$SavedState(super.onSaveInstanceState());
       savedState.b = this.k.getId();
       ViewPager2 ti = this.i;
       if (ti == -1) {
          ti = this.e;
       }
       savedState.c = ti;
       ti = this.j;
       if (ti != null) {
          savedState.d = ti;
       }else {
          RecyclerView$Adapter adapter = this.k.getAdapter();
          if (adapter instanceof b) {
             savedState.d = adapter.g();
          }
       }
       return savedState;
    }
    public void onViewAdded(View p0){
       throw new IllegalStateException("ViewPager2 does not support direct child views");
    }
    public void p(){
       View view = this.l.h(this.h);
       if (view == null) {
          return;
       }
       int[] ointArray = this.l.c(this.h, view);
       int i = 0;
       if (ointArray[i] || ointArray[1]) {
          this.k.smoothScrollBy(ointArray[i], ointArray[1]);
       }
       return;
    }
    public boolean performAccessibilityAction(int p0,Bundle p1){
       if (this.u.c(p0, p1)) {
          return this.u.l(p0, p1);
       }
       return super.performAccessibilityAction(p0, p1);
    }
    public final void q(RecyclerView$Adapter p0){
       if (p0 != null) {
          p0.I0(this.g);
       }
       return;
    }
    public void r(ViewPager2$h p0){
       this.d.e(p0);
    }
    public void s(){
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
    public void setAdapter(RecyclerView$Adapter p0){
       RecyclerView$Adapter adapter = this.k.getAdapter();
       this.u.f(adapter);
       this.q(adapter);
       this.k.setAdapter(p0);
       this.e = 0;
       this.l();
       this.u.e(p0);
       this.i(p0);
    }
    public void setCurrentItem(int p0){
       this.m(p0, true);
    }
    public void setLayoutDirection(int p0){
       super.setLayoutDirection(p0);
       this.u.o();
    }
    public void setOffscreenPageLimit(int p0){
       if (p0 < 1 && p0 != -1) {
          throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
       }
       this.t = p0;
       this.k.requestLayout();
       return;
    }
    public void setOrientation(int p0){
       this.h.setOrientation(p0);
       this.u.q();
    }
    public void setPageTransformer(ViewPager2$j p0){
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
          this.p.e(p0);
          this.k();
          return;
       }
    }
    public void setUserInputEnabled(boolean p0){
       this.s = p0;
       this.u.r();
    }
}
