package com.yxcorp.gifshow.home.block.topbar.appbar.NoNestedScrollAppBarBehavior;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public class NoNestedScrollAppBarBehavior extends AppBarLayout$Behavior	// class@00165f
{

    public void NoNestedScrollAppBarBehavior(){
       super();
    }
    public void onNestedPreScroll(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int[] p5,int p6){
       this.r(p0, p1, p2, p3, p4, p5, p6);
    }
    public void onNestedScroll(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int p5,int p6,int p7){
       this.s(p0, p1, p2, p3, p4, p5, p6, p7);
    }
    public boolean onStartNestedScroll(CoordinatorLayout p0,View p1,View p2,View p3,int p4,int p5){
       return this.v(p0, p1, p2, p3, p4, p5);
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       boolean b;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, NoNestedScrollAppBarBehavior.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "parent");
          a.p(p1, "child");
          a.p(p2, "ev");
          b = false;
       }
       return b;
    }
    public void r(CoordinatorLayout p0,AppBarLayout p1,View p2,int p3,int p4,int[] p5,int p6){
       if (PatchProxy.isSupport(NoNestedScrollAppBarBehavior.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),p5,Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, NoNestedScrollAppBarBehavior.class, "3")) {
             return;
          }
       }
       a.p(p0, "coordinatorLayout");
       a.p(p1, "child");
       a.p(p2, "target");
       a.p(p5, "consumed");
       return;
    }
    public void s(CoordinatorLayout p0,AppBarLayout p1,View p2,int p3,int p4,int p5,int p6,int p7){
       if (PatchProxy.isSupport(NoNestedScrollAppBarBehavior.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6),Integer.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, NoNestedScrollAppBarBehavior.class, "4")) {
             return;
          }
       }
       a.p(p0, "coordinatorLayout");
       a.p(p1, "child");
       a.p(p2, "target");
       return;
    }
    public boolean v(CoordinatorLayout p0,AppBarLayout p1,View p2,View p3,int p4,int p5){
       if (PatchProxy.isSupport(NoNestedScrollAppBarBehavior.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, NoNestedScrollAppBarBehavior.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "parent");
       a.p(p1, "child");
       a.p(p2, "directTargetChild");
       a.p(p3, "target");
       return 0;
    }
}
