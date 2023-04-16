package com.kuaishou.pagedy.container.widget.DynamicRootRecyclerView;
import a2.w;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import com.kwai.sdk.switchconfig.a;
import msd.l;
import androidx.viewpager2.widget.ViewPager2;
import android.view.View;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.view.ViewParent;
import com.kuaishou.pagedy.container.widget.DynamicNestedRecyclerView;
import go4.a;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import a2.i0;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import java.lang.Float;
import androidx.fragment.app.FragmentActivity;
import jo4.i;
import jo4.i$b;
import android.app.Activity;
import java.util.HashMap;
import java.lang.Number;
import java.lang.Math;
import qrd.l1;
import com.kuaishou.pagedy.container.widget.DynamicRootRecyclerView$a;
import java.lang.Runnable;

public class DynamicRootRecyclerView extends RecyclerView implements w	// class@000a71
{
    public ViewPager2 b;
    public View c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public l h;
    public boolean i;
    public boolean j;

    public void DynamicRootRecyclerView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void DynamicRootRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void DynamicRootRecyclerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.f = true;
       this.setOverScrollMode(2);
       this.setNestedScrollingEnabled(false);
       this.j = a.t().d("merchantPgyNestScroll", false);
    }
    public void DynamicRootRecyclerView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final int getCeilingHeight(){
       return this.g;
    }
    public final l getCeilingListener(){
       return this.h;
    }
    public final ViewPager2 getViewPager2(){
       return this.b;
    }
    public final View getViewPager2Container(){
       return this.c;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DynamicRootRecyclerView obj = PatchProxy.applyOneRefs(p0, this, DynamicRootRecyclerView.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       boolean b = false;
       if (!p0.getAction()) {
          int i = -1;
          boolean b1 = true;
          if (this.c == null) {
             if (this.canScrollVertically(i)) {
                this.getParent().requestDisallowInterceptTouchEvent(b1);
             }
             return super.onInterceptTouchEvent(p0);
          }else {
             obj = this.b;
             DynamicNestedRecyclerView uDynamicNest = (obj != null)? a.c(obj): null;
             if (uDynamicNest == null && this.canScrollVertically(i)) {
                this.getParent().requestDisallowInterceptTouchEvent(b1);
                return super.onInterceptTouchEvent(p0);
             }else if(uDynamicNest != null && this.canScrollVertically(i)){
                this.getParent().requestDisallowInterceptTouchEvent(b1);
             }
             DynamicRootRecyclerView obj1 = PatchProxy.applyTwoRefs(uDynamicNest, p0, this, DynamicRootRecyclerView.class, "4");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                Object[] objArray = new Object[b1];
                objArray[b] = this.c;
                if (ArraysKt___ArraysKt.qa(objArray).size() == b1) {
                   DynamicRootRecyclerView tc = this.c;
                   a.m(tc);
                   if (i0.X(tc)) {
                      int[] ointArray = new int[2];
                      obj1 = this.c;
                      a.m(obj1);
                      obj1.getLocationOnScreen(ointArray);
                      if ((float)ointArray[b1] - p0.getRawY() >= 0) {
                      }
                   }else {
                      tc = this.c;
                      a.m(tc);
                      if (i0.X(tc)) {
                         tc = this.c;
                         a.m(tc);
                         if (tc.getTop() != this.g) {
                         }
                      }else {
                      }
                   }
                }else {
                }
             }
          label_00c1 :
             this.e = b1;
             a.q(this);
             if (uDynamicNest != null) {
                a.q(uDynamicNest);
             }
          }
       }
       if (this.e == null) {
          b = super.onInterceptTouchEvent(p0);
       }
       return b;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(DynamicRootRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, DynamicRootRecyclerView.class, "18")) {
          return;
       }
       this.setMeasuredDimension(View$MeasureSpec.getSize(p0), View$MeasureSpec.getSize(p1));
       return;
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       if (PatchProxy.isSupport(DynamicRootRecyclerView.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, DynamicRootRecyclerView.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       try{
          a.p(p0, "target");
          return super.onNestedPreFling(p0, p1, p2);
       }catch(java.lang.Exception e0){
          return true;
       }
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3,int p4){
       DynamicRootRecyclerView tc;
       Context context;
       int i;
       if (PatchProxy.isSupport(DynamicRootRecyclerView.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, DynamicRootRecyclerView.class, "14")) {
             return;
          }
       }
       a.p(p0, "p0");
       a.p(p3, "p3");
       if (this.x(p0)) {
          tc = this.c;
          if (tc != null && tc.getTop() == this.g) {
             String str = "context";
             if (this.d == null || (this.f != null && p2 > 0)) {
                this.d = true;
                this.f = false;
                context = this.getContext();
                a.o(context, str);
                if (a.g(context) != null) {
                   context = this.getContext();
                   a.o(context, str);
                   i.c(i.f.a(), this.d, a.g(context), null, 4, null);
                }
             }
             if (p2 < 0 && (this.d != null || this.f != null)) {
                this.f = false;
                this.d = false;
                context = this.getContext();
                a.o(context, str);
                if (a.g(context) != null) {
                   context = this.getContext();
                   a.o(context, str);
                   i.c(i.f.a(), this.d, a.g(context), null, 4, null);
                }
             }
          }
       }
    label_00b7 :
       if (!this.canScrollVertically(-1) && p2 < 0) {
          return;
       }else if(!this.x(p0)){
          return;
       }else {
          tc = this.c;
          if (tc != null) {
             if (PatchProxy.isSupport(DynamicRootRecyclerView.class)) {
                Object obj = PatchProxy.applyThreeRefs(tc, p0, Integer.valueOf(p2), this, DynamicRootRecyclerView.class, "15");
                if (obj != PatchProxyResult.class) {
                   i = obj.intValue();
                label_0132 :
                   Integer integer = Integer.valueOf(i);
                   context = (integer.intValue())? 1: 0;
                   if (!context) {
                      integer = null;
                   }
                   if (integer != null) {
                      i = integer.intValue();
                      p3[1] = i;
                      this.scrollBy(0, i);
                   }
                }
             }
             i = (p0 instanceof RecyclerView)? p0.computeVerticalScrollOffset(): Math.max(0, p0.getScrollY());
             if (tc.getTop() > this.g) {
                if (i > 0 && p2 < 0) {
                label_0130 :
                   p2 = 0;
                }else if((tc.getTop() - p2) < this.g){
                   p2 = tc.getTop() - this.g;
                }
             }else if(tc.getTop() == this.g){
                p2 = p2 + i;
                if (p2 > 0) {
                   goto label_0130 ;
                }
             }else if(this.j != null){
                goto label_0130 ;
             }
             i = p2;
             goto label_0132 ;
          }
          return;
       }
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5){
       if (PatchProxy.isSupport(DynamicRootRecyclerView.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, DynamicRootRecyclerView.class, "12")) {
             return;
          }
       }
       a.p(p0, "p0");
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5,int[] p6){
       if (PatchProxy.isSupport(DynamicRootRecyclerView.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, this, DynamicRootRecyclerView.class, "11")) {
             return;
          }
       }
       a.p(p0, "p0");
       a.p(p6, "p6");
       return;
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2,int p3){
       if (PatchProxy.isSupport(DynamicRootRecyclerView.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, DynamicRootRecyclerView.class, "9")) {
          return;
       }
       a.p(p0, "p0");
       a.p(p1, "p1");
       return;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(DynamicRootRecyclerView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, DynamicRootRecyclerView.class, "5")) {
          return;
       }
       super.onScrollChanged(p0, p1, p2, p3);
       p0 = 1;
       Object[] objArray = new Object[p0];
       objArray[0] = this.c;
       if (ArraysKt___ArraysKt.qa(objArray).size() == p0) {
          DynamicRootRecyclerView tc = this.c;
          a.m(tc);
          if (tc.getTop() != this.g) {
             p0 = 0;
          }
          if (p0 != this.i) {
             this.i = p0;
             tc = this.h;
             if (tc != null) {
                tc.invoke(Boolean.valueOf(p0));
             }
          }
       }
    label_005c :
       return;
    }
    public void onScrollStateChanged(int p0){
       if (PatchProxy.isSupport(DynamicRootRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DynamicRootRecyclerView.class, "6")) {
          return;
       }
       Integer integer = Integer.valueOf(p0);
       int i = 1;
       float f = (!integer.intValue())? Float.MIN_VALUE: 0;
       Number number = null;
       if (!f) {
          integer = number;
       }
       if (integer != null) {
          integer.intValue();
          Float uFloat = Float.valueOf(a.m(this));
          if (uFloat.floatValue() - (float)0 <= 0) {
             i = 0;
          }
          if (i) {
             number = uFloat;
          }
          if (number != null) {
             float f1 = number.floatValue();
             DynamicRootRecyclerView tb = this.b;
             if (tb != null) {
                DynamicNestedRecyclerView uDynamicNest = a.c(tb);
                if (uDynamicNest != null) {
                   uDynamicNest.fling(0, (int)f1);
                }
             }
          }
       }
    label_005a :
       return;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2,int p3){
       if (PatchProxy.isSupport(DynamicRootRecyclerView.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, DynamicRootRecyclerView.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "p0");
       a.p(p1, "p1");
       return this.x(p1);
    }
    public void onStopNestedScroll(View p0,int p1){
       if (PatchProxy.isSupport(DynamicRootRecyclerView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, DynamicRootRecyclerView.class, "10")) {
          return;
       }
       a.p(p0, "p0");
       return;
    }
    public final void setCeilingHeight(int p0){
       if (PatchProxy.isSupport(DynamicRootRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DynamicRootRecyclerView.class, "1")) {
          return;
       }
       this.g = p0;
       if (this.c == null) {
          this.g = 0;
          return;
       }else {
          this.post(new DynamicRootRecyclerView$a(this));
          return;
       }
    }
    public final void setCeilingListener(l p0){
       this.h = p0;
    }
    public final void setViewPager2(ViewPager2 p0){
       this.b = p0;
    }
    public final void setViewPager2Container(View p0){
       this.c = p0;
    }
    public boolean x(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicRootRecyclerView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "target");
       return p0 instanceof DynamicNestedRecyclerView;
    }
    public final boolean y(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicRootRecyclerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       return super.onInterceptTouchEvent(p0);
    }
    public final void z(View p0,int p1,int p2,int[] p3){
       if (PatchProxy.isSupport(DynamicRootRecyclerView.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, DynamicRootRecyclerView.class, "13")) {
          return;
       }
       a.p(p0, "p0");
       a.p(p3, "p3");
       super.onNestedPreScroll(p0, p1, p2, p3);
       return;
    }
}
