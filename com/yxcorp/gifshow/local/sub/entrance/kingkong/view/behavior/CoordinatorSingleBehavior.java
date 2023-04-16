package com.yxcorp.gifshow.local.sub.entrance.kingkong.view.behavior.CoordinatorSingleBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c2b.a;
import d2b.c;
import android.view.MotionEvent;
import java.lang.Integer;
import java.lang.Float;

public class CoordinatorSingleBehavior extends CoordinatorLayout$Behavior	// class@001ac1
{
    public a a;

    public void CoordinatorSingleBehavior(){
       super();
    }
    public void CoordinatorSingleBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean layoutDependsOn(CoordinatorLayout p0,View p1,View p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, CoordinatorSingleBehavior.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = false;
       if (p2 instanceof a) {
          this.a = p2;
          if (p2.getBehaviorView().getVisibility() != 8) {
             b = true;
          }
       }
       return b;
    }
    public boolean onDependentViewChanged(CoordinatorLayout p0,View p1,View p2){
       CoordinatorSingleBehavior obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, CoordinatorSingleBehavior.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       if (obj == null) {
          return super.onDependentViewChanged(p0, p1, p2);
       }
       return obj.getBehaviorControl().g(p0, p1, p2);
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, CoordinatorSingleBehavior.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.a == null) {
          super.onInterceptTouchEvent(p0, p1, p2);
       }
       boolean b = (this.a.getBehaviorControl().m(p0, p1, p2) || super.onInterceptTouchEvent(p0, p1, p2))? true: false;
       return b;
    }
    public boolean onLayoutChild(CoordinatorLayout p0,View p1,int p2){
       CoordinatorSingleBehavior obj;
       boolean b;
       if (PatchProxy.isSupport(CoordinatorSingleBehavior.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, CoordinatorSingleBehavior.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.a;
       if (obj == null) {
          return super.onLayoutChild(p0, p1, p2);
       }else if(obj.getBehaviorControl().i(p0, p1, p2) || super.onLayoutChild(p0, p1, p2)){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public boolean onNestedPreFling(CoordinatorLayout p0,View p1,View p2,float p3,float p4){
       CoordinatorSingleBehavior uCoordinator = CoordinatorSingleBehavior.class;
       int i = 1;
       if (PatchProxy.isSupport(uCoordinator)) {
          Object[] objArray = new Object[]{p0,p1,p2,Float.valueOf(p3),Float.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uCoordinator, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uCoordinator = this.a;
       if (uCoordinator == null) {
          return super.onNestedPreFling(p0, p1, p2, p3, p4);
       }else if(uCoordinator.getBehaviorControl().j(p0, p1, p2, p3, p4) || super.onNestedPreFling(p0, p1, p2, p3, p4)){
          i = false;
       }
       return i;
    }
    public void onNestedPreScroll(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int[] p5,int p6){
       CoordinatorSingleBehavior uCoordinator = this;
       CoordinatorSingleBehavior uCoordinator1 = CoordinatorSingleBehavior.class;
       if (PatchProxy.isSupport(uCoordinator1)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),p5,Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, uCoordinator1, "3")) {
             return;
          }
       }
       super.onNestedPreScroll(p0, p1, p2, p3, p4, p5, p6);
       uCoordinator1 = uCoordinator.a;
       if (uCoordinator1 == null) {
          return;
       }else {
          uCoordinator1.getBehaviorControl().o(p0, p1, p2, p3, p4, p5, p6);
          return;
       }
    }
    public void onNestedScroll(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int p5,int p6,int p7){
       CoordinatorSingleBehavior uCoordinator = this;
       CoordinatorSingleBehavior uCoordinator1 = CoordinatorSingleBehavior.class;
       if (PatchProxy.isSupport(uCoordinator1)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6),Integer.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, uCoordinator1, "4")) {
             return;
          }
       }
       uCoordinator1 = uCoordinator.a;
       if (uCoordinator1 == null) {
          super.onNestedScroll(p0, p1, p2, p3, p4, p5, p6, p7);
       }else {
          uCoordinator1.getBehaviorControl().b(p0, p1, p2, p3, p4, p5, p6, p7);
       }
       return;
    }
    public boolean onStartNestedScroll(CoordinatorLayout p0,View p1,View p2,View p3,int p4,int p5){
       boolean b = (p4 & 0x02)? true: false;
       return b;
    }
    public void onStopNestedScroll(CoordinatorLayout p0,View p1,View p2,int p3){
       if (PatchProxy.isSupport(CoordinatorSingleBehavior.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, CoordinatorSingleBehavior.class, "9")) {
          return;
       }
       super.onStopNestedScroll(p0, p1, p2, p3);
       CoordinatorSingleBehavior ta = this.a;
       if (ta != null) {
          ta.getBehaviorControl().d(p0, p1, p2, p3);
       }
       return;
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       CoordinatorSingleBehavior obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, CoordinatorSingleBehavior.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       if (obj == null) {
          return super.onTouchEvent(p0, p1, p2);
       }
       boolean b = (obj.getBehaviorControl().h(p0, p1, p2) || super.onTouchEvent(p0, p1, p2))? true: false;
       return b;
    }
}
