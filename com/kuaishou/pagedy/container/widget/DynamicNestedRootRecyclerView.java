package com.kuaishou.pagedy.container.widget.DynamicNestedRootRecyclerView;
import com.kuaishou.pagedy.container.widget.DynamicRootRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import java.lang.Integer;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import go4.a;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.kuaishou.pagedy.container.widget.DynamicNestedRecyclerView;
import java.lang.Float;
import java.lang.reflect.Field;
import java.util.Objects;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Math;
import android.widget.ScrollView;

public final class DynamicNestedRootRecyclerView extends DynamicRootRecyclerView	// class@000a6d
{
    public boolean k;

    public void DynamicNestedRootRecyclerView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void DynamicNestedRootRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void DynamicNestedRootRecyclerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void DynamicNestedRootRecyclerView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Integer obj = PatchProxy.applyOneRefs(p0, this, DynamicNestedRootRecyclerView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.k == null) {
          return super.dispatchTouchEvent(p0);
       }
       obj = (p0 != null)? Integer.valueOf(p0.getAction()): null;
       boolean b = true;
       if (obj != null && !obj.intValue()) {
          this.getParent().requestDisallowInterceptTouchEvent(b);
       }else if(obj != null && obj.intValue() == b){
          this.getParent().requestDisallowInterceptTouchEvent(false);
       }
       return super.dispatchTouchEvent(p0);
    }
    public void onAttachedToWindow(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, DynamicNestedRootRecyclerView.class, "10")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.k != null && !PatchProxy.applyVoidOneRefs(this, null, a.class, "4")) {
          a.p(this, "$this$setupRootRecyclerView");
          ViewParent parent = this.getParent();
          if (!parent instanceof View) {
             parent = null;
          }
          ViewParent viewParent = this;
          for (; parent != null; parent = objArray) {
             if (a.g(parent.getClass().getCanonicalName(), "androidx.viewpager2.widget.ViewPager2.RecyclerViewImpl")) {
                int i = a.g(viewParent, this) ^ 0x01;
                if (i) {
                   viewParent.setTag(R.id.dynamic_nested_root_recycler_view, this);
                }
             }else if(parent instanceof DynamicRootRecyclerView){
             }
             viewParent = parent;
          }
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       ViewPager2 obj = PatchProxy.applyOneRefs(p0, this, DynamicNestedRootRecyclerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       if (this.k == null) {
          return super.onInterceptTouchEvent(p0);
       }
       if (!p0.getAction()) {
          if (this.getViewPager2Container() == null) {
             if (this.canScrollVertically(-1)) {
                this.getParent().requestDisallowInterceptTouchEvent(true);
             }
             return this.y(p0);
          }else {
             obj = this.getViewPager2();
             DynamicNestedRecyclerView uDynamicNest = (obj != null)? a.c(obj): null;
             if (uDynamicNest == null && this.canScrollVertically(-1)) {
                this.getParent().requestDisallowInterceptTouchEvent(true);
                return this.y(p0);
             }
          }
       }
       return super.onInterceptTouchEvent(p0);
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       View obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(DynamicNestedRootRecyclerView.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, DynamicNestedRootRecyclerView.class, "9");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "target");
       if (this.k == null) {
          return super.onNestedPreFling(p0, p1, p2);
       }else {
          obj = this.getViewPager2Container();
          if (obj != null) {
             ViewPager2 viewPager2 = this.getViewPager2();
             Object obj1 = null;
             DynamicNestedRecyclerView uDynamicNest = (viewPager2 != null)? a.c(viewPager2): obj1;
             if (uDynamicNest == null) {
                viewPager2 = this.getViewPager2();
                if (viewPager2 != null) {
                   Object obj2 = PatchProxy.applyOneRefs(viewPager2, obj1, a.class, "2");
                   if (obj2 != patchProxyRe) {
                      obj1 = obj2;
                   }else {
                      a.p(viewPager2, "$this$findDynamicNestedRootRecyclerView");
                      Field declaredFiel = ViewPager2.class.getDeclaredField("h");
                      declaredFiel.setAccessible(true);
                      View obj3 = declaredFiel.get(viewPager2);
                      Objects.requireNonNull(obj3, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                      obj3 = obj3.findViewByPosition(viewPager2.getCurrentItem());
                      if (obj3 != null) {
                         if (obj3 instanceof DynamicNestedRootRecyclerView) {
                         }else {
                            obj3 = obj3.getTag(R.id.dynamic_nested_root_recycler_view);
                            if (obj3 instanceof DynamicNestedRootRecyclerView) {
                            }
                         }
                         obj1 = obj3;
                      }
                   }
                }
                if (obj1 == null && obj.getTop() != this.getCeilingHeight()) {
                   this.fling((int)p1, (int)p2);
                   return true;
                }
             }
          }
       label_00aa :
          return super.onNestedPreFling(p0, p1, p2);
       }
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3){
       if (PatchProxy.isSupport(DynamicNestedRootRecyclerView.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, DynamicNestedRootRecyclerView.class, "6")) {
          return;
       }
       a.p(p0, "target");
       a.p(p3, "consumed");
       this.onNestedPreScroll(p0, p1, p2, p3, 0);
       return;
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3,int p4){
       int i;
       if (PatchProxy.isSupport(DynamicNestedRootRecyclerView.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, DynamicNestedRootRecyclerView.class, "7")) {
             return;
          }
       }
       a.p(p0, "p0");
       a.p(p3, "p3");
       if (this.k == null) {
          super.onNestedPreScroll(p0, p1, p2, p3, p4);
          return;
       }else if(p0 instanceof RecyclerView){
          i = p0.computeVerticalScrollOffset();
       }else {
          i = Math.max(0, p0.getScrollY());
       }
       if (i > 0 && p2 < 0) {
          super.onNestedPreScroll(p0, p1, p2, p3, p4);
          return;
       }else {
          this.z(p0, p1, p2, p3);
          if (!p3[0] && !p3[1]) {
             super.onNestedPreScroll(p0, p1, p2, p3, p4);
          }
          return;
       }
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       if (PatchProxy.isSupport(DynamicNestedRootRecyclerView.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, DynamicNestedRootRecyclerView.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "p0");
       a.p(p1, "p1");
       return this.onStartNestedScroll(p0, p1, p2, 0);
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2,int p3){
       if (PatchProxy.isSupport(DynamicNestedRootRecyclerView.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, DynamicNestedRootRecyclerView.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "p0");
       a.p(p1, "p1");
       if (this.k == null) {
          return super.onStartNestedScroll(p0, p1, p2, p3);
       }else if(this.x(p1)){
          this.startNestedScroll(p2, p3);
          return true;
       }else {
          return false;
       }
    }
    public final void setNest(boolean p0){
       if (PatchProxy.isSupport(DynamicNestedRootRecyclerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DynamicNestedRootRecyclerView.class, "1")) {
          return;
       }
       this.k = p0;
       this.setNestedScrollingEnabled(p0);
       return;
    }
    public boolean x(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicNestedRootRecyclerView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "target");
       boolean b = (!p0 instanceof DynamicNestedRecyclerView && (p0 instanceof DynamicRootRecyclerView || p0 instanceof ScrollView))? true: false;
       return b;
    }
}
