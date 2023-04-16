package com.tachikoma.component.viewpager.widget.RecyclerViewPager;
import jo8.a;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import jo8.b;
import androidx.recyclerview.widget.t;
import androidx.recyclerview.widget.z;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import android.view.MotionEvent;
import java.lang.Float;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$r;
import com.tachikoma.component.viewpager.widget.RecyclerViewPager$a;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Math;
import jo8.b$a;
import com.tachikoma.component.viewpager.widget.RecyclerViewPager$b;
import java.lang.Runnable;

public class RecyclerViewPager extends RecyclerView implements a	// class@000d33
{
    public final String b;
    public b c;
    public a d;
    public t e;
    public int f;
    public boolean g;
    public boolean h;

    public void RecyclerViewPager(Context p0){
       super(p0, null);
    }
    public void RecyclerViewPager(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RecyclerViewPager(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = this.getClass().getSimpleName();
       this.c = new b();
       this.g = true;
       t ot = new t();
       this.e = ot;
       ot.b(this);
    }
    public boolean fling(int p0,int p1){
       if (PatchProxy.isSupport(RecyclerViewPager.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, RecyclerViewPager.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return super.fling(p0, p1);
    }
    public int getCurrentItem(){
       return this.f;
    }
    public int getScrollState(){
       Object obj = PatchProxy.apply(null, this, RecyclerViewPager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.h != null) {
          return 0;
       }
       return this.c.e;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecyclerViewPager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.g == null) {
          return false;
       }
       return super.onInterceptTouchEvent(p0);
    }
    public void onPageScrollStateChanged(int p0){
       if (PatchProxy.isSupport(RecyclerViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecyclerViewPager.class, "8")) {
          return;
       }
       RecyclerViewPager td = this.d;
       if (td != null) {
          td.onPageScrollStateChanged(p0);
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(RecyclerViewPager.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, RecyclerViewPager.class, "6")) {
          return;
       }
       RecyclerViewPager td = this.d;
       if (td != null) {
          td.onPageScrolled(p0, p1, p2);
       }
       return;
    }
    public void onPageSelected(int p0){
       if (PatchProxy.isSupport(RecyclerViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecyclerViewPager.class, "7")) {
          return;
       }
       this.f = p0;
       RecyclerViewPager td = this.d;
       if (td != null) {
          td.onPageSelected(p0);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecyclerViewPager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.g == null) {
          return false;
       }
       return super.onTouchEvent(p0);
    }
    public void setCurrent(int p0){
       if (PatchProxy.isSupport(RecyclerViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecyclerViewPager.class, "3")) {
          return;
       }
       this.x(p0, false);
       return;
    }
    public void setDirection(int p0){
       if (PatchProxy.isSupport(RecyclerViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecyclerViewPager.class, "10")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       LinearLayoutManager linearLayout = new LinearLayoutManager(this.getContext(), p0, false);
       super.setLayoutManager(linearLayout);
       RecyclerViewPager tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(linearLayout, tc, b.class, "2")) {
          tc.c = linearLayout;
          tc.i();
       }
       return;
    }
    public void setLayoutManager(RecyclerView$LayoutManager p0){
    }
    public void setOnPageListener(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecyclerViewPager.class, "11")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       this.addOnScrollListener(this.c);
       this.d = p0;
       p0.b = this;
       return;
    }
    public void setScrollEnable(boolean p0){
       this.g = p0;
    }
    public void smoothScrollToPosition(int p0){
       if (PatchProxy.isSupport(RecyclerViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecyclerViewPager.class, "9")) {
          return;
       }
       super.smoothScrollToPosition(p0);
       RecyclerViewPager$a uoa = new RecyclerViewPager$a(this, this.getContext());
       uoa.p(p0);
       this.getLayoutManager().startSmoothScroll(uoa);
       return;
    }
    public final void x(int p0,boolean p1){
       RecyclerViewPager obj;
       b uob = b.class;
       if (PatchProxy.isSupport(RecyclerViewPager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, RecyclerViewPager.class, "4")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       RecyclerView$Adapter adapter = this.getAdapter();
       if (adapter != null && adapter.getItemCount() > 0) {
          int i = 0;
          p0 = Math.min(Math.max(p0, i), (adapter.getItemCount() - 1));
          if (p0 == this.f && this.c.g()) {
             return;
          }else {
             RecyclerViewPager tf = this.f;
             if (p0 == tf && p1) {
                return;
             }else {
                float f = (float)tf;
                if (!this.c.g()) {
                   tf = this.c;
                   Objects.requireNonNull(tf);
                   obj = PatchProxy.apply(null, tf, uob, "9");
                   if (obj != PatchProxyResult.class) {
                      f = obj.floatValue();
                   }else {
                      tf.j();
                      b f2 = tf.f;
                      f = (float)f2.a + f2.b;
                   }
                }
                obj = this.c;
                Objects.requireNonNull(obj);
                if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), obj, uob, "6")) {
                   int i2 = 2;
                   int i3 = (p1)? 2: 3;
                   obj.d = i3;
                   if (obj.h != p0) {
                      i = 1;
                   }
                   obj.h = p0;
                   obj.e(i2);
                   if (i) {
                      obj.d(p0);
                   }
                }
                if (!p1) {
                   this.scrollToPosition(p0);
                   return;
                }else {
                   float f1 = (float)p0;
                   if (Math.abs((f1 - f)) - 0x40400000 > 0) {
                      int i1 = (f1 - f > 0)? p0 - 3: p0 + 3;
                      this.scrollToPosition(i1);
                      this.post(new RecyclerViewPager$b(p0, this));
                   }else {
                      this.smoothScrollToPosition(p0);
                   }
                }
             }
          }
       }
       return;
    }
    public void y(){
       this.h = true;
    }
}
