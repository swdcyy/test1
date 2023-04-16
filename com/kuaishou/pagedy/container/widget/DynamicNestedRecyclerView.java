package com.kuaishou.pagedy.container.widget.DynamicNestedRecyclerView;
import lo4.i;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Math;
import android.view.ViewParent;
import android.view.ViewGroup;
import java.lang.Float;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.bowl.core.component.a;
import android.graphics.RectF;
import do4.d;
import androidx.recyclerview.widget.RecyclerView$r;
import lo4.h;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import go4.a;
import java.util.Objects;
import usd.q;
import java.lang.StringBuilder;
import nv.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kuaishou.pagedy.container.widget.DynamicRootRecyclerView;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import com.kuaishou.pagedy.container.widget.DynamicNestedRecyclerView$a;
import java.lang.Runnable;
import ekd.k1;
import to4.f;
import com.kwai.sdk.switchconfig.a;
import java.util.List;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Exception;

public final class DynamicNestedRecyclerView extends RecyclerView implements i	// class@000a6c
{
    public DynamicRootRecyclerView b;
    public float c;
    public float d;
    public View e;
    public int f;

    public void DynamicNestedRecyclerView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void DynamicNestedRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void DynamicNestedRecyclerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.f = -1;
    }
    public void DynamicNestedRecyclerView(Context p0,AttributeSet p1,int p2,int p3,u p4){
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
       RecyclerView$Adapter obj1;
       a obj2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicNestedRecyclerView.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "ev");
       if (this.b == null) {
          return super.dispatchTouchEvent(p0);
       }
       float rawX = p0.getRawX();
       float rawY = p0.getRawY();
       int action = p0.getAction();
       int i = 1;
       if (action) {
          if (action == 2) {
             rawX = rawX - this.c;
             rawY = rawY - this.d;
             if (Math.abs(rawX) - Math.abs(rawY) > 0 && rawX - (float)0 > 0) {
                this.getParent().requestDisallowInterceptTouchEvent(this.x(-1));
             }else if(Math.abs(rawX) - Math.abs(rawY) > 0 && rawX - (float)0 < 0){
                this.getParent().requestDisallowInterceptTouchEvent(this.x(i));
             }else if(Math.abs(rawX) - Math.abs(rawY) < 0 && rawY - (float)0 > 0){
                if (!this.canScrollVertically(-1)) {
                   DynamicNestedRecyclerView tb = this.b;
                   if (tb == null || tb.canScrollVertically(-1) != i) {
                      this.getParent().requestDisallowInterceptTouchEvent(0);
                   }
                }
                this.getParent().requestDisallowInterceptTouchEvent(i);
             }else if(Math.abs(rawX) - Math.abs(rawY) < 0 && rawY - (float)0 < 0){
                this.getParent().requestDisallowInterceptTouchEvent(i);
             }
          }
       }else {
          this.c = rawX;
          this.d = rawY;
          this.getParent().requestDisallowInterceptTouchEvent(i);
          if (PatchProxy.isSupport(DynamicNestedRecyclerView.class)) {
             obj1 = PatchProxy.applyTwoRefs(Float.valueOf(rawX), Float.valueOf(rawY), this, DynamicNestedRecyclerView.class, "12");
             if (obj1 != patchProxyRe) {
             }else {
             label_00eb :
                obj1 = this.getAdapter();
                if (!obj1 instanceof DynamicComponentAdapter) {
                   obj1 = null;
                }
                if (obj1 != null) {
                   DynamicComponentAdapter uDynamicComp = DynamicComponentAdapter.class;
                   if (PatchProxy.isSupport(uDynamicComp)) {
                      obj2 = PatchProxy.applyTwoRefs(Float.valueOf(rawX), Float.valueOf(rawY), obj1, uDynamicComp, "34");
                      if (obj2 != patchProxyRe) {
                         obj1 = obj2;
                      }
                   }
                   Iterator iterator = obj1.f.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         a uoa = iterator.next();
                         obj2 = uoa.rootView;
                         if (obj2 != null) {
                            RectF rectF = d.a(obj2);
                            Boolean uBoolean = (rectF != null)? Boolean.valueOf(rectF.contains(rawX, rawY)): null;
                            if (a.g(uBoolean, Boolean.TRUE)) {
                               if ((uoa.getComponentType()).equals("TK")) {
                                  a rootView = uoa.rootView;
                                  a.o(rootView, "it.rootView");
                                  obj1 = d.b(rootView);
                                  break ;
                               }
                            }
                         }
                      }
                   }
                }
             label_015c :
                obj1 = null;
             }
          }else {
             goto label_00eb ;
          }
          this.e = obj1;
       }
    label_015f :
       return super.dispatchTouchEvent(p0);
    }
    public void e(RecyclerView$r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicNestedRecyclerView.class, "15")) {
          return;
       }
       a.p(p0, "listener");
       this.removeOnScrollListener(p0);
       return;
    }
    public ViewGroup getCeilingContainer(){
       return h.a(this);
    }
    public int getFirstVisiblePosition(){
       Object[] objArray = null;
       RecyclerView$LayoutManager obj = PatchProxy.apply(objArray, this, DynamicNestedRecyclerView.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.getLayoutManager();
       if (obj instanceof StaggeredGridLayoutManager) {
          objArray = obj;
       }
       int i = (objArray != null)? a.d(objArray): -1;
       return i;
    }
    public final int getLastVisibleItemPos(){
       Object[] objArray = null;
       RecyclerView$LayoutManager obj = PatchProxy.apply(objArray, this, DynamicNestedRecyclerView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       if (this.getLayoutManager() instanceof StaggeredGridLayoutManager) {
          RecyclerView$LayoutManager layoutManage = this.getLayoutManager();
          Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
          int[] ointArray = layoutManage.findLastVisibleItemPositions(objArray);
          int len = ointArray.length;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             i = q.n(ointArray[i1], i);
          }
          c.f("getLastVisibleItemPos "+i);
       }else if(this.getLayoutManager() instanceof LinearLayoutManager){
          obj = this.getLayoutManager();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
          i = obj.c();
       }
       return i;
    }
    public final DynamicRootRecyclerView getRootRecyclerView(){
       return this.b;
    }
    public void n(RecyclerView$r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicNestedRecyclerView.class, "14")) {
          return;
       }
       a.p(p0, "listener");
       this.addOnScrollListener(p0);
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, DynamicNestedRecyclerView.class, "1")) {
          return;
       }
       super.onAttachedToWindow();
       if (!PatchProxy.applyVoidOneRefs(this, null, a.class, "3")) {
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
                   viewParent.setTag(R.id.dynamic_nested_recycler_view, this);
                }
             }else if(parent instanceof DynamicRootRecyclerView){
                this.setRootRecyclerView(parent);
                break ;
             }
             viewParent = parent.getParent();
             if (!viewParent instanceof View) {
                Object[] objArray = null;
             }
             viewParent = parent;
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(DynamicNestedRecyclerView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, DynamicNestedRecyclerView.class, "9")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(DynamicNestedRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, DynamicNestedRecyclerView.class, "8")) {
          return;
       }
       this.setMeasuredDimension(View$MeasureSpec.getSize(p0), View$MeasureSpec.getSize(p1));
       return;
    }
    public void onScrollStateChanged(int p0){
       if (PatchProxy.isSupport(DynamicNestedRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DynamicNestedRecyclerView.class, "2")) {
          return;
       }
       super.onScrollStateChanged(p0);
       if (!p0) {
          float f = a.m(this);
          if (f - (float)0 < 0 && !this.computeVerticalScrollOffset()) {
             DynamicNestedRecyclerView tb = this.b;
             if (tb != null) {
                tb.fling(0, (int)f);
             }
          }
          this.y();
       }
       return;
    }
    public final void setRootRecyclerView(DynamicRootRecyclerView p0){
       this.b = p0;
    }
    public void smoothScrollToPosition(int p0){
       if (PatchProxy.isSupport(DynamicNestedRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DynamicNestedRecyclerView.class, "10")) {
          return;
       }
       k1.r(new DynamicNestedRecyclerView$a(this, p0), 100);
       return;
    }
    public final boolean x(int p0){
       DynamicNestedRecyclerView obj;
       if (PatchProxy.isSupport(DynamicNestedRecyclerView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, DynamicNestedRecyclerView.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.e;
       if (obj == null) {
          return false;
       }else {
          a.m(obj);
          return obj.canScrollHorizontally(p0);
       }
    }
    public final void y(){
       boolean b1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DynamicNestedRecyclerView.class, "3")) {
          return;
       }
       RecyclerView$Adapter obj = PatchProxy.apply(objArray, objArray, f.class, "1");
       int b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().d("merchant_home_shelf_goods_report_opt", 0);
       if (!b) {
          return;
       }else {
          b = q.n(this.getLastVisibleItemPos(), this.f);
          this.f = b;
          if (b == -1) {
             return;
          }else if(this.getAdapter() == null){
             return;
          }else {
             obj = this.getAdapter();
             Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter");
             int i = q.u(this.f, (obj.getItemCount() - 1));
             List list = null;
             while (i >= 0) {
                if (!list) {
                   if (obj.M0().get(i).rootView != null) {
                      a rootView = obj.M0().get(i).rootView;
                      a.o(rootView, "curAdapter.getData\(\)[i].rootView");
                      RectF rectF = PatchProxy.applyOneRefs(rootView, this, DynamicNestedRecyclerView.class, "5");
                      if (rectF != PatchProxyResult.class) {
                      }else {
                         int[] ointArray = new int[2];
                         rootView.getLocationOnScreen(ointArray);
                         int i1 = ointArray[0] + rootView.getWidth();
                         int i2 = ointArray[1] + rootView.getHeight();
                         rectF = new RectF((float)ointArray[0], (float)ointArray[1], (float)i1, (float)i2);
                      }
                      if (rectF != null) {
                         RectF top = rectF.top;
                         if (PatchProxy.isSupport(DynamicNestedRecyclerView.class)) {
                            Resources obj1 = PatchProxy.applyOneRefs(Float.valueOf(top), this, DynamicNestedRecyclerView.class, "4");
                            if (obj1 != PatchProxyResult.class) {
                               b1 = obj1.booleanValue();
                            }else {
                            label_00d3 :
                               obj1 = Resources.getSystem();
                               a.o(obj1, "Resources.getSystem\(\)");
                               b1 = (top - (float)c.c(obj1).heightPixels < 0)? true: false;
                            }
                         }else {
                            goto label_00d3 ;
                         }
                         if (b1) {
                            try{
                               obj.M0().get(i).reportRealShow();
                            }catch(java.lang.Exception e4){
                               c.b("reportRealShowItems error : "+e4.getMessage());
                            }
                            list = 1;
                         }
                      }
                   }
                }else {
                   try{
                      obj.M0().get(i).reportRealShow();
                   }catch(java.lang.Exception e7){
                      c.b("reportRealShowItems error : "+e7.getMessage());
                   }
                }
                i = i - 1;
             }
             return;
          }
       }
    }
}
