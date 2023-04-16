package com.kuaishou.locallife.half_container.view.LocalLifeHalfContainerBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kuaishou.locallife.half_container.view.LocalLifeHalfContainerBehavior$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.IllegalArgumentException;

public final class LocalLifeHalfContainerBehavior extends BottomSheetBehavior	// class@001497
{
    public boolean a;
    public static final LocalLifeHalfContainerBehavior$a b;

    static {
       LocalLifeHalfContainerBehavior.b = new LocalLifeHalfContainerBehavior$a(null);
    }
    public void LocalLifeHalfContainerBehavior(){
       super();
       this.a = true;
    }
    public void LocalLifeHalfContainerBehavior(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attrs");
       super(p0, p1);
       this.a = true;
    }
    public final void c(boolean p0){
       this.a = p0;
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LocalLifeHalfContainerBehavior.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "parent");
       a.p(p1, "child");
       a.p(p2, "event");
       boolean b = (this.a != null && super.onInterceptTouchEvent(p0, p1, p2))? true: false;
       return b;
    }
    public boolean onStartNestedScroll(CoordinatorLayout p0,View p1,View p2,View p3,int p4,int p5){
       LocalLifeHalfContainerBehavior localLifeHal = LocalLifeHalfContainerBehavior.class;
       int i = 1;
       if (PatchProxy.isSupport(localLifeHal)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, localLifeHal, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "coordinatorLayout");
       a.p(p1, "child");
       a.p(p2, "directTargetChild");
       a.p(p3, "target");
       if (this.a == null || !super.onStartNestedScroll(p0, p1, p2, p3, p4, p5)) {
          i = false;
       }
       return i;
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       boolean b;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LocalLifeHalfContainerBehavior.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "parent");
       a.p(p1, "child");
       a.p(p2, "event");
       try{
          obj = 0;
          if (this.a != null && super.onTouchEvent(p0, p1, p2)) {
             b = true;
          }
          return b;
       }catch(java.lang.IllegalArgumentException e7){
          e7.printStackTrace();
          return obj;
       }
    }
}
