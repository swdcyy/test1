package com.kds.headertabscrollview.layout.FlingViewPager;
import sj.i;
import android.widget.FrameLayout;
import com.kds.headertabscrollview.layout.FlingViewPager$b;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import com.google.android.material.appbar.KdsCustomScrollingViewBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import android.view.ViewGroup$LayoutParams;
import androidx.viewpager2.widget.ViewPager2;
import android.view.ViewGroup;
import hn.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kds.headertabscrollview.layout.FlingViewPager$a;
import androidx.viewpager2.widget.ViewPager2$h;
import android.view.View;
import android.util.AttributeSet;
import a2.r;
import java.util.LinkedList;
import android.view.MotionEvent;
import android.view.ViewParent;
import java.lang.Math;
import java.lang.StringBuilder;
import cb.a;
import kotlin.TypeCastException;
import java.lang.Integer;
import android.view.View$MeasureSpec;

public final class FlingViewPager extends FrameLayout implements i	// class@000726
{
    public Integer b;
    public ViewPager2 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public static final FlingViewPager$b i;

    static {
       FlingViewPager.i = new FlingViewPager$b(null);
    }
    public void FlingViewPager(Context p0){
       a.q(p0, "context");
       super(p0);
       CoordinatorLayout$LayoutParams layoutParams = new CoordinatorLayout$LayoutParams(-1, -1);
       layoutParams.o(new KdsCustomScrollingViewBehavior());
       this.setLayoutParams(layoutParams);
       this.setSaveEnabled(false);
       ViewPager2 viewPager2 = new ViewPager2(this.getContext());
       this.c = viewPager2;
       viewPager2.setTag("ViewPager2");
       this.c.setAdapter(new a());
       this.c.setSaveEnabled(false);
       this.c.j(new FlingViewPager$a(this));
       this.addView(this.c);
    }
    public void FlingViewPager(Context p0,AttributeSet p1){
       a.q(p0, "context");
       super(p0, p1);
       CoordinatorLayout$LayoutParams layoutParams = new CoordinatorLayout$LayoutParams(-1, -1);
       layoutParams.o(new KdsCustomScrollingViewBehavior());
       this.setLayoutParams(layoutParams);
       this.setSaveEnabled(false);
       ViewPager2 viewPager2 = new ViewPager2(this.getContext());
       this.c = viewPager2;
       viewPager2.setTag("ViewPager2");
       this.c.setAdapter(new a());
       this.c.setSaveEnabled(false);
       this.c.j(new FlingViewPager$a(this));
       this.addView(this.c);
    }
    public void a(){
       this.d();
    }
    public final r b(View p0){
       if (p0 == null) {
          return null;
       }
       LinkedList linkedList = new LinkedList();
       while (true) {
          if (p0 == null) {
             return null;
          }
          if (p0 instanceof r) {
             break ;
          }else if(p0 instanceof ViewGroup){
             int childCount = p0.getChildCount();
             for (int i = 0; i < childCount; i = i + 1) {
                linkedList.offer(p0.getChildAt(i));
             }
          }
          p0 = linkedList.poll();
       }
       return p0;
    }
    public final String c(int p0){
       if (!p0) {
          return "IDLE";
       }
       if (p0 == 1) {
          return "DRAGGING";
       }
       if (p0 != 2) {
          return "none";
       }
       return "SETTLING";
    }
    public final void d(){
       r or = this.b(this.getCurrentPage());
       if (or != null) {
          or.stopNestedScroll(1);
       }
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       a.q(p0, "ev");
       int i = (int)p0.getX();
       int i1 = (int)p0.getY();
       int action = p0.getAction();
       if (action) {
          FlingViewPager uFlingViewPa = 2;
          if (action == uFlingViewPa) {
             action = i - this.e;
             if (!this.c.getCurrentItem() && action > 0) {
                this.getParent().requestDisallowInterceptTouchEvent(false);
             }
             if (this.h == uFlingViewPa && (this.g == true && Math.abs((i1 - this.f)) > Math.abs((i - this.e)))) {
                this.e = i;
                this.f = i1;
                return true;
             }
          }
       }else {
          this.getParent().requestDisallowInterceptTouchEvent(true);
       }
       this.e = i;
       this.f = i1;
       return super.dispatchTouchEvent(p0);
    }
    public void f(int p0,int p1){
       View currentPage = this.getCurrentPage();
       if (!p0 && !p1) {
          return;
       }
       r or = this.b(currentPage);
       if (or != null) {
          or.scrollBy(p0, p1);
       }
       return;
    }
    public final View getCurrentPage(){
       View view = null;
       if (!this.c.getAdapter() instanceof a) {
          return view;
       }
       RecyclerView$Adapter adapter = this.c.getAdapter();
       if (adapter == null) {
          throw new TypeCastException("null cannot be cast to non-null type com.kds.headertabscrollview.adapter.ViewPagerAdapter");
       }
       if (adapter.getItemCount() > 0) {
          return adapter.J0(this.c.getCurrentItem());
       }
       a.x("FlingViewPager", "ViewPager children size is "+adapter.getItemCount());
       return view;
    }
    public final Integer getInitialIndex(){
       return this.b;
    }
    public final int getMaxHeight(){
       return this.d;
    }
    public final ViewPager2 getViewPager(){
       return this.c;
    }
    public void onMeasure(int p0,int p1){
       View$MeasureSpec.getSize(p1);
       FlingViewPager td = this.d;
       if (td > null) {
          p1 = View$MeasureSpec.makeMeasureSpec(td, 0x40000000);
       }
       super.onMeasure(p0, p1);
       return;
    }
    public final void setInitialIndex(Integer p0){
       this.b = p0;
    }
    public final void setMaxHeight(int p0){
       this.d = p0;
    }
    public final void setViewPager(ViewPager2 p0){
       a.q(p0, "<set-?>");
       this.c = p0;
    }
}
