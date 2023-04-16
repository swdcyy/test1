package com.yxcorp.gifshow.recycler.widget.NestedScrollViewPager;
import sj.d;
import com.yxcorp.gifshow.log.widget.a;
import com.kwai.library.widget.viewpager.ScrollViewPager;
import com.yxcorp.gifshow.log.widget.a$a;
import java.lang.String;
import android.content.Context;
import com.yxcorp.gifshow.recycler.widget.NestedScrollViewPager$a;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.recycler.widget.NestedScrollViewPager$b;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import com.kwai.library.widget.viewpager.tabstrip.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.View;
import androidx.viewpager.widget.ViewPager$i;
import android.os.SystemClock;
import java.lang.System;
import android.view.MotionEvent;

public class NestedScrollViewPager extends ScrollViewPager implements d, a	// class@0017be
{
    public NestedScrollViewPager$b d;
    public int e;
    public String f;
    public long g;
    public long h;
    public boolean i;
    public final ViewPager$i j;
    public static final a$a k;
    public static final a$a l;

    static {
       a$a uoa = new a$a("NoReason", 0, 0);
       NestedScrollViewPager.k = v6;
       a$a uoa1 = new a$a("REASON_EXPIRED", 0, 0);
       NestedScrollViewPager.l = uoa;
    }
    public void NestedScrollViewPager(Context p0){
       super(p0);
       this.e = -1;
       this.j = new NestedScrollViewPager$a(this);
       this.i();
    }
    public void NestedScrollViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = -1;
       this.j = new NestedScrollViewPager$a(this);
       this.i();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, NestedScrollViewPager.class, "3")) {
          return;
       }
       this.k();
       return;
    }
    public void f(int p0,int p1){
       if (PatchProxy.isSupport(NestedScrollViewPager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, NestedScrollViewPager.class, "2")) {
          return;
       }
       boolean b = false;
       NestedScrollViewPager td = this.d;
       if (td != null) {
          b = td.a(p0, p1);
       }
       if (!b) {
          a adapter = this.getAdapter();
          if (adapter instanceof a) {
             Fragment uFragment = adapter.t();
             if (uFragment instanceof RecyclerFragment) {
                uFragment.h0().scrollBy(p0, p1);
             }
          }
       }
       return;
    }
    public a$a g(boolean p0){
       a$a obj;
       if (PatchProxy.isSupport(NestedScrollViewPager.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, NestedScrollViewPager.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.getItemSelectionReasonInternal();
       if (p0) {
          ViewParent parent = this.getParent();
          while (parent instanceof View) {
             if (parent instanceof NestedScrollViewPager) {
                a$a itemSelectio = parent.getItemSelectionReasonInternal();
                if (obj.b - itemSelectio.b < 0) {
                   obj = itemSelectio;
                }
             }
             parent = parent.getParent();
          }
       }
       return obj;
    }
    public final a$a getItemSelectionReasonInternal(){
       Object obj = PatchProxy.apply(null, this, NestedScrollViewPager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getCurrentItem() < 0) {
          return NestedScrollViewPager.k;
       }
       if (this.getCurrentItem() != this.e) {
          return NestedScrollViewPager.l;
       }
       a$a uoa = new a$a(this.f, this.g, this.h);
       return obj;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, NestedScrollViewPager.class, "1")) {
          return;
       }
       this.addOnPageChangeListener(this.j);
       return;
    }
    public void j(int p0,String p1){
       if (PatchProxy.isSupport(NestedScrollViewPager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, NestedScrollViewPager.class, "10")) {
          return;
       }
       this.e = p0;
       this.f = p1;
       this.g = SystemClock.currentThreadTimeMillis();
       this.h = System.currentTimeMillis();
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, NestedScrollViewPager.class, "4")) {
          return;
       }
       a adapter = this.getAdapter();
       if (adapter instanceof a) {
          Fragment uFragment = adapter.t();
          if (uFragment instanceof RecyclerFragment) {
             uFragment.h0().stopNestedScroll(1);
          }
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NestedScrollViewPager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if ((p0.getAction() & 0x00ff) != b) {
          b = false;
       }
       this.i = b;
       this.i = false;
       return super.onTouchEvent(p0);
    }
    public void setAdapter(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NestedScrollViewPager.class, "5")) {
          return;
       }
       this.j(-1, null);
       super.setAdapter(p0);
       return;
    }
    public void setAppBarFlingConsumer(NestedScrollViewPager$b p0){
       this.d = p0;
    }
    public void setCurrentItem(int p0){
       if (PatchProxy.isSupport(NestedScrollViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, NestedScrollViewPager.class, "6")) {
          return;
       }
       this.j(p0, "unknown");
       super.setCurrentItem(p0);
       return;
    }
    public void setCurrentItem(int p0,boolean p1){
       if (PatchProxy.isSupport(NestedScrollViewPager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, NestedScrollViewPager.class, "7")) {
          return;
       }
       if (!PatchProxy.isSupport(NestedScrollViewPager.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), "unknown", this, NestedScrollViewPager.class, "9")) {
          this.j(p0, "unknown");
          super.setCurrentItem(p0, p1);
       }
       return;
    }
}
