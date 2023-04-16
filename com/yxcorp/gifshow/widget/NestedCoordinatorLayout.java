package com.yxcorp.gifshow.widget.NestedCoordinatorLayout;
import a2.r;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.content.Context;
import android.util.AttributeSet;
import a2.u;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.yxcorp.gifshow.widget.NestedCoordinatorLayout$a;

public class NestedCoordinatorLayout extends CoordinatorLayout implements r	// class@001888
{
    public NestedCoordinatorLayout$a A;
    public final u z;

    public void NestedCoordinatorLayout(Context p0){
       super(p0, null);
    }
    public void NestedCoordinatorLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void NestedCoordinatorLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       u ou = new u(this);
       this.z = ou;
       ou.n(true);
    }
    public boolean dispatchNestedFling(float p0,float p1,boolean p2){
       if (PatchProxy.isSupport(NestedCoordinatorLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Boolean.valueOf(p2), this, NestedCoordinatorLayout.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.z.a(p0, p1, p2);
    }
    public boolean dispatchNestedPreFling(float p0,float p1){
       if (PatchProxy.isSupport(NestedCoordinatorLayout.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, NestedCoordinatorLayout.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.z.b(p0, p1);
    }
    public boolean dispatchNestedPreScroll(int p0,int p1,int[] p2,int[] p3,int p4){
       if (PatchProxy.isSupport(NestedCoordinatorLayout.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),p2,p3,Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, NestedCoordinatorLayout.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.z.d(p0, p1, p2, p3, p4);
    }
    public boolean dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4,int p5){
       if (PatchProxy.isSupport(NestedCoordinatorLayout.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4,Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, NestedCoordinatorLayout.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.z.g(p0, p1, p2, p3, p4, p5);
    }
    public boolean hasNestedScrollingParent(int p0){
       if (PatchProxy.isSupport(NestedCoordinatorLayout.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, NestedCoordinatorLayout.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.z.l(p0);
    }
    public boolean isNestedScrollingEnabled(){
       Object obj = PatchProxy.apply(null, this, NestedCoordinatorLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.z.m();
    }
    public boolean onNestedFling(View p0,float p1,float p2,boolean p3){
       if (PatchProxy.isSupport(NestedCoordinatorLayout.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Boolean.valueOf(p3), this, NestedCoordinatorLayout.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = super.onNestedFling(p0, p1, p2, p3);
       b = (this.dispatchNestedFling(p1, p2, p3) || b)? true: false;
       return b;
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       if (PatchProxy.isSupport(NestedCoordinatorLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, NestedCoordinatorLayout.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = super.onNestedPreFling(p0, p1, p2);
       b = (this.dispatchNestedPreFling(p1, p2) || b)? true: false;
       return b;
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3,int p4){
       int i = 2;
       if (PatchProxy.isSupport(NestedCoordinatorLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, NestedCoordinatorLayout.class, "4")) {
             return;
          }
       }
       NestedCoordinatorLayout tA = this.A;
       int i1 = (tA != null)? tA.a(this, p0, p1, p2): 0;
       if (!i1) {
          super.onNestedPreScroll(p0, p1, p2, p3, p4);
          return;
       }else if(i1 == 1){
          this.dispatchNestedPreScroll(p1, p2, p3, null, p4);
          i1 = p3[0];
          i = p3[1];
          if (i1 != p1 || i != p2) {
             super.onNestedPreScroll(p0, (p1 - i1), (p2 - i), p3, p4);
             p3[0] = p3[0] + i1;
             p3[1] = p3[1] + i;
          }
          return;
       }else if(i1 == i){
          super.onNestedPreScroll(p0, p1, p2, p3, p4);
          int i2 = p3[0];
          i1 = p3[1];
          if (i2 != p1 || i1 != p2) {
             this.dispatchNestedPreScroll((p1 - i2), (p2 - i1), p3, null, p4);
             p3[0] = p3[0] + i2;
             p3[1] = p3[1] + i1;
          }
       }
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5){
       if (PatchProxy.isSupport(NestedCoordinatorLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, NestedCoordinatorLayout.class, "5")) {
             return;
          }
       }
       super.onNestedScroll(p0, p1, p2, p3, p4, p5);
       this.dispatchNestedScroll(p1, p2, p3, p4, null, p5);
       return;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2,int p3){
       if (PatchProxy.isSupport(NestedCoordinatorLayout.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, NestedCoordinatorLayout.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = super.onStartNestedScroll(p0, p1, p2, p3);
       b = (this.startNestedScroll(p2, p3) || b)? true: false;
       return b;
    }
    public void onStopNestedScroll(View p0,int p1){
       if (PatchProxy.isSupport(NestedCoordinatorLayout.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, NestedCoordinatorLayout.class, "6")) {
          return;
       }
       super.onStopNestedScroll(p0, p1);
       this.stopNestedScroll(p1);
       return;
    }
    public void setBubbleScrollOrderSupplier(NestedCoordinatorLayout$a p0){
       this.A = p0;
    }
    public boolean startNestedScroll(int p0,int p1){
       if (PatchProxy.isSupport(NestedCoordinatorLayout.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, NestedCoordinatorLayout.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.z.q(p0, p1);
    }
    public void stopNestedScroll(int p0){
       if (PatchProxy.isSupport(NestedCoordinatorLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, NestedCoordinatorLayout.class, "10")) {
          return;
       }
       this.z.s(p0);
       return;
    }
}
