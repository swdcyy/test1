package com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import com.yxcorp.gifshow.log.widget.a;
import androidx.viewpager.widget.CorrectOffsetViewPager;
import com.yxcorp.gifshow.log.widget.a$a;
import java.lang.String;
import android.content.Context;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager$a;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager$i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.viewpager.widget.ViewPager;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Integer;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager$b;
import java.lang.Runnable;
import android.os.SystemClock;
import java.lang.System;
import android.view.MotionEvent;
import h3.a;
import java.lang.IllegalStateException;

public class CommonLogViewPager extends CorrectOffsetViewPager implements a	// class@001b5e
{
    public ViewPager$i f;
    public boolean g;
    public boolean h;
    public CopyOnWriteArrayList i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public String o;
    public long p;
    public long q;
    public final ViewPager$i r;
    public static final a$a s;
    public static final a$a t;

    static {
       a$a uoa = new a$a("NoReason", 0, 0);
       CommonLogViewPager.s = v6;
       a$a uoa1 = new a$a("REASON_EXPIRED", 0, 0);
       CommonLogViewPager.t = uoa;
    }
    public void CommonLogViewPager(Context p0){
       super(p0);
       this.j = false;
       this.k = true;
       this.n = -1;
       this.r = new CommonLogViewPager$a(this);
       this.k(p0);
    }
    public void CommonLogViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.j = false;
       this.k = true;
       this.n = -1;
       this.r = new CommonLogViewPager$a(this);
       this.k(p0);
    }
    public void addOnPageChangeListener(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonLogViewPager.class, "16")) {
          return;
       }
       if (this.h == null) {
          super.addOnPageChangeListener(p0);
          return;
       }else if(this.i == null){
          this.i = new CopyOnWriteArrayList();
       }
       this.i.add(p0);
       return;
    }
    public void clearOnPageChangeListeners(){
       if (PatchProxy.applyVoid(null, this, CommonLogViewPager.class, "18")) {
          return;
       }
       if (this.h == null) {
          super.clearOnPageChangeListeners();
          return;
       }else {
          CommonLogViewPager ti = this.i;
          if (ti == null) {
             return;
          }
          ti.clear();
          return;
       }
    }
    public final a$a g(boolean p0){
       a$a obj;
       if (PatchProxy.isSupport(CommonLogViewPager.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, CommonLogViewPager.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.getItemSelectionReasonInternal();
       if (p0) {
          ViewParent parent = this.getParent();
          while (parent instanceof View) {
             if (parent instanceof CommonLogViewPager) {
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
       Object obj = PatchProxy.apply(null, this, CommonLogViewPager.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getCurrentItem() < 0) {
          return CommonLogViewPager.s;
       }
       if (this.getCurrentItem() != this.n) {
          return CommonLogViewPager.t;
       }
       a$a uoa = new a$a(this.o, this.p, this.q);
       return obj;
    }
    public String getItemSelectionReasonStr(){
       Object obj = PatchProxy.apply(null, this, CommonLogViewPager.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g(true).a;
    }
    public final void k(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonLogViewPager.class, "3")) {
          return;
       }
       super.addOnPageChangeListener(this.r);
       return;
    }
    public void l(int p0){
       if (PatchProxy.isSupport(CommonLogViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CommonLogViewPager.class, "6")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       this.j = true;
       this.post(new CommonLogViewPager$b(this, p0));
       return;
    }
    public void m(int p0,String p1){
       if (PatchProxy.isSupport(CommonLogViewPager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, CommonLogViewPager.class, "12")) {
          return;
       }
       this.n = p0;
       this.o = p1;
       this.p = SystemClock.currentThreadTimeMillis();
       this.q = System.currentTimeMillis();
       return;
    }
    public void n(int p0,boolean p1,String p2){
       if (PatchProxy.isSupport(CommonLogViewPager.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, CommonLogViewPager.class, "11")) {
          return;
       }
       this.m(p0, p2);
       super.setCurrentItem(p0, p1);
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonLogViewPager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.k == null) {
          return false;
       }
       return super.onInterceptTouchEvent(p0);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(CommonLogViewPager.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, CommonLogViewPager.class, "4")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (this.g == null && this.j == null) {
          this.l(this.getCurrentItem());
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonLogViewPager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.k == null) {
          return false;
       }
       boolean b = true;
       if ((p0.getAction() & 0x00ff) != b) {
          b = false;
       }
       this.m = b;
       this.m = false;
       return super.onTouchEvent(p0);
    }
    public void removeOnPageChangeListener(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonLogViewPager.class, "17")) {
          return;
       }
       if (this.h == null) {
          super.removeOnPageChangeListener(p0);
          return;
       }else {
          CommonLogViewPager ti = this.i;
          if (ti == null) {
             return;
          }
          ti.remove(p0);
          return;
       }
    }
    public void setAdapter(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonLogViewPager.class, "7")) {
          return;
       }
       this.m(-1, null);
       super.setAdapter(p0);
       return;
    }
    public void setCurrentItem(int p0){
       if (PatchProxy.isSupport(CommonLogViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CommonLogViewPager.class, "8")) {
          return;
       }
       if (this.l != null) {
          throw new IllegalStateException("请使用带 reason 的 setCurrentItem 方法");
       }
       if (!PatchProxy.isSupport(CommonLogViewPager.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), "unknown", this, CommonLogViewPager.class, "10")) {
          this.m(p0, "unknown");
          super.setCurrentItem(p0);
       }
       return;
    }
    public void setCurrentItem(int p0,boolean p1){
       if (PatchProxy.isSupport(CommonLogViewPager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, CommonLogViewPager.class, "9")) {
          return;
       }
       if (this.l != null) {
          throw new IllegalStateException("请使用带 reason 的 setCurrentItem 方法");
       }
       this.n(p0, p1, "unknown");
       return;
    }
    public final void setForbidCallSetCurrentItemWithoutReason(boolean p0){
       this.l = p0;
    }
    public void setOnPageChangeListener(ViewPager$i p0){
       this.f = p0;
    }
    public void setScrollable(boolean p0){
       this.k = p0;
    }
}
