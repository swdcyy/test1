package com.yxcorp.plugin.search.result.widget.HalfPageNestedScrollViewPager;
import sj.d;
import com.yxcorp.gifshow.log.widget.a;
import com.yxcorp.plugin.search.result.widget.HalfPageScrollViewPager;
import com.yxcorp.gifshow.log.widget.a$a;
import java.lang.String;
import android.content.Context;
import com.yxcorp.plugin.search.result.widget.HalfPageNestedScrollViewPager$a;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import com.kwai.library.widget.viewpager.tabstrip.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Integer;
import com.yxcorp.gifshow.recycler.widget.NestedScrollViewPager$b;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.View;
import androidx.viewpager.widget.ViewPager$i;
import android.os.SystemClock;
import java.lang.System;
import android.view.MotionEvent;

public class HalfPageNestedScrollViewPager extends HalfPageScrollViewPager implements d, a	// class@00075e
{
    public NestedScrollViewPager$b c;
    public int d;
    public String e;
    public long f;
    public long g;
    public boolean h;
    public final ViewPager$i i;
    public static final a$a j;
    public static final a$a k;

    static {
       a$a uoa = new a$a("NoReason", 0, 0);
       HalfPageNestedScrollViewPager.j = v6;
       a$a uoa1 = new a$a("REASON_EXPIRED", 0, 0);
       HalfPageNestedScrollViewPager.k = uoa;
    }
    public void HalfPageNestedScrollViewPager(Context p0){
       super(p0);
       this.d = -1;
       this.i = new HalfPageNestedScrollViewPager$a(this);
       this.i();
    }
    public void HalfPageNestedScrollViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = -1;
       this.i = new HalfPageNestedScrollViewPager$a(this);
       this.i();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HalfPageNestedScrollViewPager.class, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, HalfPageNestedScrollViewPager.class, "4")) {
          a adapter = this.getAdapter();
          if (adapter instanceof a) {
             Fragment uFragment = adapter.t();
             if (uFragment instanceof RecyclerFragment) {
                uFragment.h0().stopNestedScroll(1);
             }
          }
       }
       return;
    }
    public void f(int p0,int p1){
       if (PatchProxy.isSupport(HalfPageNestedScrollViewPager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, HalfPageNestedScrollViewPager.class, "2")) {
          return;
       }
       boolean b = false;
       HalfPageNestedScrollViewPager tc = this.c;
       if (tc != null) {
          b = tc.a(p0, p1);
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
       if (PatchProxy.isSupport(HalfPageNestedScrollViewPager.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, HalfPageNestedScrollViewPager.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.getItemSelectionReasonInternal();
       if (p0) {
          ViewParent parent = this.getParent();
          while (parent instanceof View) {
             if (parent instanceof HalfPageNestedScrollViewPager) {
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
       Object obj = PatchProxy.apply(null, this, HalfPageNestedScrollViewPager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getCurrentItem() < 0) {
          return HalfPageNestedScrollViewPager.j;
       }
       if (this.getCurrentItem() != this.d) {
          return HalfPageNestedScrollViewPager.k;
       }
       a$a uoa = new a$a(this.e, this.f, this.g);
       return obj;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, HalfPageNestedScrollViewPager.class, "1")) {
          return;
       }
       this.addOnPageChangeListener(this.i);
       return;
    }
    public void j(int p0,String p1){
       if (PatchProxy.isSupport(HalfPageNestedScrollViewPager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, HalfPageNestedScrollViewPager.class, "10")) {
          return;
       }
       this.d = p0;
       this.e = p1;
       this.f = SystemClock.currentThreadTimeMillis();
       this.g = System.currentTimeMillis();
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HalfPageNestedScrollViewPager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if ((p0.getAction() & 0x00ff) != b) {
          b = false;
       }
       this.h = b;
       this.h = false;
       return super.onTouchEvent(p0);
    }
    public void setAdapter(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HalfPageNestedScrollViewPager.class, "5")) {
          return;
       }
       this.j(-1, null);
       super.setAdapter(p0);
       return;
    }
    public void setAppBarFlingConsumer(NestedScrollViewPager$b p0){
       this.c = p0;
    }
    public void setCurrentItem(int p0){
       if (PatchProxy.isSupport(HalfPageNestedScrollViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HalfPageNestedScrollViewPager.class, "6")) {
          return;
       }
       this.j(p0, "unknown");
       super.setCurrentItem(p0);
       return;
    }
    public void setCurrentItem(int p0,boolean p1){
       if (PatchProxy.isSupport(HalfPageNestedScrollViewPager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, HalfPageNestedScrollViewPager.class, "7")) {
          return;
       }
       if (!PatchProxy.isSupport(HalfPageNestedScrollViewPager.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), "unknown", this, HalfPageNestedScrollViewPager.class, "9")) {
          this.j(p0, "unknown");
          super.setCurrentItem(p0, p1);
       }
       return;
    }
}
