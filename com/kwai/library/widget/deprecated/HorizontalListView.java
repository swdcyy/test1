package com.kwai.library.widget.deprecated.HorizontalListView;
import android.widget.AdapterView;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Scroller;
import com.kwai.library.widget.deprecated.HorizontalListView$d;
import java.util.ArrayList;
import android.graphics.Rect;
import com.kwai.library.widget.deprecated.HorizontalListView$OnScrollStateChangedListener$ScrollState;
import com.kwai.library.widget.deprecated.HorizontalListView$b;
import com.kwai.library.widget.deprecated.HorizontalListView$c;
import e2.c;
import android.view.GestureDetector;
import android.view.GestureDetector$OnGestureListener;
import com.kwai.library.widget.deprecated.HorizontalListView$e;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import com.kwai.library.widget.deprecated.HorizontalListView$a;
import android.view.View$OnTouchListener;
import com.kwai.library.widget.deprecated.HorizontalListView$f;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import java.util.List;
import java.lang.Object;
import java.util.Queue;
import android.widget.Adapter;
import java.lang.Boolean;
import android.view.ViewParent;
import android.widget.ListView;
import android.widget.ScrollView;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Integer;
import com.kwai.library.widget.deprecated.HorizontalListView$g;
import java.lang.Runnable;
import a2.i0;
import android.os.Parcelable;
import android.os.Bundle;
import java.lang.String;
import android.view.MotionEvent;
import android.database.DataSetObserver;
import java.util.LinkedList;
import com.kwai.library.widget.deprecated.HorizontalListView$OnScrollStateChangedListener;
import android.view.View$OnClickListener;

public class HorizontalListView extends AdapterView	// class@00091b
{
    public int A;
    public boolean B;
    public boolean C;
    public View$OnClickListener D;
    public DataSetObserver E;
    public Runnable F;
    public Scroller b;
    public final HorizontalListView$d c;
    public GestureDetector d;
    public int e;
    public ListAdapter f;
    public List g;
    public boolean h;
    public Rect i;
    public View j;
    public int k;
    public Drawable l;
    public int m;
    public int n;
    public Integer o;
    public int p;
    public int q;
    public int r;
    public int s;
    public HorizontalListView$g t;
    public int u;
    public boolean v;
    public HorizontalListView$OnScrollStateChangedListener w;
    public HorizontalListView$OnScrollStateChangedListener$ScrollState x;
    public c y;
    public c z;

    public void HorizontalListView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new Scroller(this.getContext());
       HorizontalListView$d uod = new HorizontalListView$d(this);
       this.c = uod;
       this.g = new ArrayList();
       this.h = false;
       this.i = new Rect();
       this.j = null;
       this.k = 0;
       this.l = null;
       this.o = null;
       this.p = Integer.MAX_VALUE;
       this.t = null;
       this.u = 0;
       this.v = false;
       this.w = null;
       this.x = HorizontalListView$OnScrollStateChangedListener$ScrollState.SCROLL_STATE_IDLE;
       this.B = false;
       this.C = false;
       this.E = new HorizontalListView$b(this);
       this.F = new HorizontalListView$c(this);
       this.y = new c(p0);
       this.z = new c(p0);
       this.d = new GestureDetector(p0, uod);
       this.b();
       this.h();
       this.m(p0, p1);
       this.setWillNotDraw(false);
       HorizontalListView$e.a(this.b, 0.01f);
    }
    public final void a(View p0,int p1){
       this.addViewInLayout(p0, p1, this.f(p0), true);
       ViewGroup$LayoutParams layoutParams = this.f(p0);
       int childMeasure = ViewGroup.getChildMeasureSpec(this.A, (this.getPaddingTop() + this.getPaddingBottom()), layoutParams.height);
       layoutParams = layoutParams.width;
       layoutParams = (layoutParams > null)? View$MeasureSpec.makeMeasureSpec(layoutParams, 0x40000000): View$MeasureSpec.makeMeasureSpec(0, 0);
       p0.measure(layoutParams, childMeasure);
       return;
    }
    public final void b(){
       this.setOnTouchListener(new HorizontalListView$a(this));
    }
    public final float c(){
       return HorizontalListView$f.a(this.b);
    }
    public final void d(Canvas p0,Rect p1){
       HorizontalListView tl = this.l;
       if (tl != null) {
          tl.setBounds(p1);
          this.l.draw(p0);
       }
       return;
    }
    public void dispatchDraw(Canvas p0){
       super.dispatchDraw(p0);
    }
    public void dispatchSetPressed(boolean p0){
    }
    public int e(int p0,int p1){
       int childCount = this.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return -1;
          }
          this.getChildAt(i).getHitRect(this.i);
          if (this.i.contains(p0, p1)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public final ViewGroup$LayoutParams f(View p0){
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams == null) {
          layoutParams = new ViewGroup$LayoutParams(-2, -1);
       }
       return layoutParams;
    }
    public final View g(int p0){
       p0 = this.f.getItemViewType(p0);
       HorizontalListView horizontalLi = (p0 < this.g.size())? 1: null;
       if (horizontalLi) {
          return this.g.get(p0).poll();
       }else {
          return null;
       }
    }
    public Adapter getAdapter(){
       return this.getAdapter();
    }
    public ListAdapter getAdapter(){
       return this.f;
    }
    public int getFirstVisiblePosition(){
       return this.q;
    }
    public int getLastVisiblePosition(){
       return this.r;
    }
    public float getLeftFadingEdgeStrength(){
       int horizontalFa = this.getHorizontalFadingEdgeLength();
       HorizontalListView tm = this.m;
       if (tm == null) {
          return 0;
       }
       if (tm < horizontalFa) {
          return ((float)tm / (float)horizontalFa);
       }
       return 0x3f800000;
    }
    public final View getLeftmostChild(){
       return this.getChildAt(0);
    }
    public final int getRenderHeight(){
       return ((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom());
    }
    public final int getRenderWidth(){
       return ((this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight());
    }
    public float getRightFadingEdgeStrength(){
       int horizontalFa = this.getHorizontalFadingEdgeLength();
       HorizontalListView tm = this.m;
       HorizontalListView tp = this.p;
       if (tm == tp) {
          return 0;
       }
       if ((tp - tm) < horizontalFa) {
          return ((float)(tp - tm) / (float)horizontalFa);
       }
       return 0x3f800000;
    }
    public final View getRightmostChild(){
       return this.getChildAt((this.getChildCount() - 1));
    }
    public View getSelectedView(){
       HorizontalListView ts = this.s;
       HorizontalListView tq = this.q;
       View childAt = (ts >= tq && ts <= this.r)? this.getChildAt((ts - tq)): null;
       return childAt;
    }
    public final void h(){
       this.q = -1;
       this.r = -1;
       this.e = 0;
       this.m = 0;
       this.n = 0;
       this.p = Integer.MAX_VALUE;
       this.setCurrentScrollState(HorizontalListView$OnScrollStateChangedListener$ScrollState.SCROLL_STATE_IDLE);
    }
    public final boolean i(int p0){
       int i = 1;
       if (p0 == (this.f.getCount() - i)) {
       }else {
          i = false;
       }
       return i;
    }
    public final void j(){
       HorizontalListView ty = this.y;
       if (ty != null) {
          ty.h();
       }
       ty = this.z;
       if (ty != null) {
          ty.h();
       }
       return;
    }
    public void k(Boolean p0){
       if (this.C != p0.booleanValue()) {
          View view = this;
          while (view.getParent() instanceof View) {
             if (view.getParent() instanceof ListView || view.getParent() instanceof ScrollView) {
                view.getParent().requestDisallowInterceptTouchEvent(p0.booleanValue());
                this.C = p0.booleanValue();
                break ;
             }
             view = view.getParent();
          }
       }
       return;
    }
    public void l(){
       this.h();
       this.removeAllViewsInLayout();
       this.requestLayout();
    }
    public final void m(Context p0,AttributeSet p1){
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.f1);
          Drawable drawable = typedArray.getDrawable(1);
          if (drawable != null) {
             this.setDivider(drawable);
          }
          int dimensionPix = typedArray.getDimensionPixelSize(3, 0);
          if (dimensionPix) {
             this.setDividerWidth(dimensionPix);
          }
          typedArray.recycle();
       }
       return;
    }
    public void n(){
       HorizontalListView tj = this.j;
       if (tj != null) {
          tj.setPressed(false);
          this.refreshDrawableState();
          this.j = null;
       }
       return;
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       int childCount = this.getChildCount();
       HorizontalListView ti = this.i;
       ti.top = this.getPaddingTop();
       HorizontalListView ti1 = this.i;
       ti1.bottom = ti1.top + this.getRenderHeight();
       int i = 0;
       while (i < childCount) {
          int i1 = childCount - 1;
          if (i != i1 || !this.i(this.r)) {
             View childAt = this.getChildAt(i);
             ti.left = childAt.getRight();
             int i2 = childAt.getRight() + this.k;
             ti.right = i2;
             if (ti.left < this.getPaddingLeft()) {
                ti.left = this.getPaddingLeft();
             }
             int i3 = this.getWidth() - this.getPaddingRight();
             if (ti.right > i3) {
                i2 = this.getWidth() - this.getPaddingRight();
                ti.right = i2;
             }
             this.d(p0, ti);
             if (!i && childAt.getLeft() > this.getPaddingLeft()) {
                ti.left = this.getPaddingLeft();
                ti.right = childAt.getLeft();
                this.d(p0, ti);
             }
          }
       label_0080 :
          i = i + 1;
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       HorizontalListView te;
       int measuredWidt;
       int i2;
       View view;
       int i3;
       HorizontalListView tf;
       HorizontalListView tp;
       super.onLayout(p0, p1, p2, p3, p4);
       if (this.f == null) {
          return;
       }
       this.invalidate();
       boolean b = false;
       if (this.h != null) {
          this.h();
          this.removeAllViewsInLayout();
          this.n = this.m;
          this.h = b;
       }
       HorizontalListView to = this.o;
       if (to != null) {
          this.n = to.intValue();
          this.o = null;
       }
       if (this.b.computeScrollOffset()) {
          this.n = this.b.getCurrX();
       }
       to = this.n;
       if (to < null) {
          this.n = b;
          if (this.y.c()) {
             this.y.d((int)this.c());
          }
          this.b.forceFinished(true);
          this.setCurrentScrollState(HorizontalListView$OnScrollStateChangedListener$ScrollState.SCROLL_STATE_IDLE);
       }else {
          tp = this.p;
          if (to > tp) {
             this.n = tp;
             if (this.z.c()) {
                this.z.d((int)this.c());
             }
             this.b.forceFinished(true);
             this.setCurrentScrollState(HorizontalListView$OnScrollStateChangedListener$ScrollState.SCROLL_STATE_IDLE);
          }
       }
       int i = this.m - this.n;
       View leftmostChil = this.getLeftmostChild();
       while (true) {
          if (leftmostChil != null) {
             int i1 = leftmostChil.getRight() + i;
             if (i1 <= 0) {
                te = this.e;
                measuredWidt = (this.i(this.q))? leftmostChil.getMeasuredWidth(): this.k + leftmostChil.getMeasuredWidth();
                i1 = te + measuredWidt;
                this.e = i1;
                this.removeViewInLayout(leftmostChil);
                i2 = this.q + true;
                this.q = i2;
                leftmostChil = this.getLeftmostChild();
             }else {
             label_00b7 :
                leftmostChil = this.getRightmostChild();
                i1 = -1;
                while (leftmostChil != null) {
                   measuredWidt = leftmostChil.getLeft() + i;
                   if (measuredWidt >= this.getWidth()) {
                      this.removeViewInLayout(leftmostChil);
                      i2 = this.r + i1;
                      this.r = i2;
                      leftmostChil = this.getRightmostChild();
                   }else {
                   }
                }
                leftmostChil = this.getRightmostChild();
                i2 = (leftmostChil != null)? leftmostChil.getRight(): 0;
                while (true) {
                   measuredWidt = i2 + i;
                   measuredWidt = measuredWidt + this.k;
                   if (measuredWidt < this.getWidth()) {
                      measuredWidt = this.r + true;
                      if (measuredWidt < this.f.getCount()) {
                         measuredWidt = this.r + true;
                         this.r = measuredWidt;
                         if (this.q < null) {
                            this.q = measuredWidt;
                         }
                         view = this.f.getView(measuredWidt, this.g(measuredWidt), this);
                         this.a(view, i1);
                         i3 = (this.r == null)? 0: this.k;
                         i3 = i3 + view.getMeasuredWidth();
                         i2 = i2 + i3;
                         if (this.t != null) {
                            tf = this.f;
                            if (tf != null) {
                               i3 = this.r + true;
                               measuredWidt = tf.getCount() - i3;
                               if (measuredWidt < this.u && this.v == null) {
                                  this.v = true;
                                  this.t.a();
                               }else {
                                  continue ;
                               }
                            }else {
                               continue ;
                            }
                         }else {
                            continue ;
                         }
                      }else {
                      label_013e :
                         leftmostChil = this.getLeftmostChild();
                         i2 = (leftmostChil != null)? leftmostChil.getLeft(): 0;
                         while (true) {
                            i1 = i2 + i;
                            i1 = i1 - this.k;
                            if (i1 > 0) {
                               te = this.q;
                               if (te >= true) {
                                  i1 = te - 1;
                                  this.q = i1;
                                  View view1 = this.f.getView(i1, this.g(i1), this);
                                  this.a(view1, b);
                                  measuredWidt = (this.q == null)? view1.getMeasuredWidth(): this.k + view1.getMeasuredWidth();
                                  i2 = i2 - measuredWidt;
                                  tf = this.e;
                                  i3 = i2 + i;
                                  i1 = (!i3)? view1.getMeasuredWidth(): view1.getMeasuredWidth() + this.k;
                                  measuredWidt = tf - i1;
                                  this.e = measuredWidt;
                               }else {
                               label_018d :
                                  i2 = this.getChildCount();
                                  if (i2 > 0) {
                                     i1 = this.e + i;
                                     this.e = i1;
                                     for (i = 0; i < i2; i = i + 1) {
                                        view = this.getChildAt(i);
                                        i3 = this.getPaddingLeft() + i1;
                                        int paddingTop = this.getPaddingTop();
                                        int i4 = view.getMeasuredWidth() + i3;
                                        int i5 = view.getMeasuredHeight() + paddingTop;
                                        view.layout(i3, paddingTop, i4, i5);
                                        measuredWidt = view.getMeasuredWidth() + this.k;
                                        i1 = i1 + measuredWidt;
                                     }
                                  }
                                  this.m = this.n;
                                  if (this.i(this.r)) {
                                     View rightmostChi = this.getRightmostChild();
                                     if (rightmostChi != null) {
                                        tp = this.p;
                                        i1 = (this.m + (rightmostChi.getRight() - this.getPaddingLeft())) - this.getRenderWidth();
                                        this.p = i1;
                                        if (i1 < 0) {
                                           this.p = b;
                                        }
                                        if (this.p != tp) {
                                           b = true;
                                        }
                                     }
                                  }
                                  if (b) {
                                     this.onLayout(p0, p1, p2, p3, p4);
                                     return;
                                  }else if(this.b.isFinished()){
                                     if (this.x == HorizontalListView$OnScrollStateChangedListener$ScrollState.SCROLL_STATE_FLING) {
                                        this.setCurrentScrollState(HorizontalListView$OnScrollStateChangedListener$ScrollState.SCROLL_STATE_IDLE);
                                        break ;
                                     }
                                  }else {
                                     i0.k0(this, this.F);
                                     break ;
                                  }
                                  break ;
                               }
                            }else {
                               goto label_018d ;
                            }
                         }
                         return;
                      }
                   }else {
                      goto label_013e ;
                   }
                }
             }
          }else {
             goto label_00b7 ;
          }
       }
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       this.A = p1;
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (p0 instanceof Bundle) {
          this.o = Integer.valueOf(p0.getInt("BUNDLE_ID_CURRENT_X"));
          super.onRestoreInstanceState(p0.getParcelable("BUNDLE_ID_PARENT_STATE"));
       }
       return;
    }
    public Parcelable onSaveInstanceState(){
       Bundle uBundle = new Bundle();
       uBundle.putParcelable("BUNDLE_ID_PARENT_STATE", super.onSaveInstanceState());
       uBundle.putInt("BUNDLE_ID_CURRENT_X", this.m);
       return uBundle;
    }
    public boolean onTouchEvent(MotionEvent p0){
       if (p0.getAction() == 1) {
          HorizontalListView tb = this.b;
          if (tb == null || tb.isFinished()) {
             this.setCurrentScrollState(HorizontalListView$OnScrollStateChangedListener$ScrollState.SCROLL_STATE_IDLE);
          }
          this.k(Boolean.FALSE);
          this.j();
       }else if(p0.getAction() == 3){
          this.n();
          this.j();
          this.k(Boolean.FALSE);
       }
       return super.onTouchEvent(p0);
    }
    public void setAdapter(Adapter p0){
       this.setAdapter(p0);
    }
    public void setAdapter(ListAdapter p0){
       HorizontalListView tf = this.f;
       if (tf != null) {
          tf.unregisterDataSetObserver(this.E);
       }
       boolean b = false;
       if (p0 != null) {
          this.v = b;
          this.f = p0;
          p0.registerDataSetObserver(this.E);
       }
       HorizontalListView tf1 = this.f;
       if (tf1 != null) {
          int viewTypeCoun = tf1.getViewTypeCount();
          this.g.clear();
          for (; b < viewTypeCoun; b = b + 1) {
             this.g.add(new LinkedList());
          }
       }
       this.l();
       return;
    }
    public void setCurrentScrollState(HorizontalListView$OnScrollStateChangedListener$ScrollState p0){
       if (this.x != p0) {
          HorizontalListView tw = this.w;
          if (tw != null) {
             tw.a(p0);
          }
       }
       this.x = p0;
       return;
    }
    public void setDivider(Drawable p0){
       this.l = p0;
       if (p0 != null) {
          this.setDividerWidth(p0.getIntrinsicWidth());
       }else {
          this.setDividerWidth(0);
       }
       return;
    }
    public void setDividerWidth(int p0){
       this.k = p0;
       this.requestLayout();
       this.invalidate();
    }
    public void setOnClickListener(View$OnClickListener p0){
       this.D = p0;
    }
    public void setOnScrollStateChangedListener(HorizontalListView$OnScrollStateChangedListener p0){
       this.w = p0;
    }
    public void setSelection(int p0){
       this.s = p0;
    }
}
