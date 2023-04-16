package com.yxcorp.plugin.search.result.widget.BottomSheetCoordinatorLayout$DummyBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.plugin.search.result.widget.BottomSheetCoordinatorLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import java.lang.Float;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.Integer;

public class BottomSheetCoordinatorLayout$DummyBehavior extends CoordinatorLayout$Behavior	// class@000756
{

    public void BottomSheetCoordinatorLayout$DummyBehavior(){
       super();
    }
    public void BottomSheetCoordinatorLayout$DummyBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public final boolean c(BottomSheetCoordinatorLayout p0,boolean p1){
       BottomSheetCoordinatorLayout$DummyBehavior uDummyBehavi = BottomSheetCoordinatorLayout$DummyBehavior.class;
       if (PatchProxy.isSupport(uDummyBehavi)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uDummyBehavi, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int state = p0.getState();
       boolean b = true;
       if (state != b && state != 2) {
          if (state != 3) {
             if (state != 4) {
                return false;
             }
          }else if(!p0.Z() && !p1){
             b = false;
          }
       }
       return b;
    }
    public boolean onNestedPreFling(CoordinatorLayout p0,View p1,View p2,float p3,float p4){
       BottomSheetCoordinatorLayout$DummyBehavior uDummyBehavi = BottomSheetCoordinatorLayout$DummyBehavior.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(uDummyBehavi)) {
          Object[] objArray = new Object[]{p0,p1,p2,Float.valueOf(p3),Float.valueOf(p4)};
          p1 = PatchProxy.apply(objArray, this, uDummyBehavi, "5");
          if (p1 != PatchProxyResult.class) {
             return p1.booleanValue();
          }
       }
       BottomSheetCoordinatorLayout uBottomSheet = p0;
       if (p4 <= 0) {
          i = false;
       }
       if (this.c(uBottomSheet, i)) {
          return uBottomSheet.getBehavior().onNestedPreFling(p0, uBottomSheet, p2, p3, p4);
       }else {
          return i1;
       }
    }
    public void onNestedPreScroll(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int[] p5){
       BottomSheetCoordinatorLayout$DummyBehavior uDummyBehavi = BottomSheetCoordinatorLayout$DummyBehavior.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(uDummyBehavi)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, uDummyBehavi, "3")) {
             return;
          }
       }
       BottomSheetCoordinatorLayout uBottomSheet = p0;
       if (p4 <= 0) {
          i = false;
       }
       if (this.c(uBottomSheet, i)) {
          uBottomSheet.getBehavior().onNestedPreScroll(p0, uBottomSheet, p2, p3, p4, p5);
       }
       return;
    }
    public boolean onStartNestedScroll(CoordinatorLayout p0,View p1,View p2,View p3,int p4){
       BottomSheetCoordinatorLayout$DummyBehavior uDummyBehavi = BottomSheetCoordinatorLayout$DummyBehavior.class;
       int i = 0;
       if (PatchProxy.isSupport(uDummyBehavi)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          p1 = PatchProxy.apply(objArray, this, uDummyBehavi, "2");
          if (p1 != PatchProxyResult.class) {
             return p1.booleanValue();
          }
       }
       BottomSheetCoordinatorLayout uBottomSheet = p0;
       if (this.c(uBottomSheet, i)) {
          return uBottomSheet.getBehavior().onStartNestedScroll(p0, uBottomSheet, p2, p3, p4);
       }else {
          return i;
       }
    }
    public void onStopNestedScroll(CoordinatorLayout p0,View p1,View p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, BottomSheetCoordinatorLayout$DummyBehavior.class, "4")) {
          return;
       }
       BottomSheetCoordinatorLayout uBottomSheet = p0;
       if (this.c(uBottomSheet, false)) {
          uBottomSheet.getBehavior().onStopNestedScroll(p0, uBottomSheet, p2);
       }
       return;
    }
}
