package com.yxcorp.gifshow.relation.select.half.HalfSelectFriendBottomSheet;
import com.google.android.material.bottomsheet.BottomSheetMultiChildBehavior;
import com.yxcorp.gifshow.relation.select.half.HalfPanelState;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a2.i0;
import java.lang.Boolean;
import androidx.viewpager.widget.ViewPager;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.Integer;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.Float;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import android.view.ViewGroup$LayoutParams;

public class HalfSelectFriendBottomSheet extends BottomSheetMultiChildBehavior	// class@00199c
{
    public int a;
    public int b;
    public int c;
    public boolean d;
    public HalfPanelState e;

    public void HalfSelectFriendBottomSheet(){
       super();
       this.d = false;
       this.e = HalfPanelState.NORMAL;
    }
    public void HalfSelectFriendBottomSheet(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = false;
       this.e = HalfPanelState.NORMAL;
    }
    public void c(boolean p0){
       this.d = p0;
    }
    public void d(HalfPanelState p0){
       this.e = p0;
    }
    public View findScrollingChild(View p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HalfSelectFriendBottomSheet halfSelectFr = HalfSelectFriendBottomSheet.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, halfSelectFr, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0 != null) {
          int i = 0;
          if (i0.Z(p0)) {
             View obj1 = PatchProxy.applyOneRefs(p0, this, halfSelectFr, "3");
             boolean b = true;
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(this.d == null && (!"search".equals(p0.getTag(0x7f0a051e)) && (i0.e(p0, b) || i0.e(p0, -1)))){
                b = false;
             }
             if (!b && (this.d == null || !"search".equals(p0.getTag(0x7f0a051e)))) {
             label_005b :
                if (p0 instanceof ViewPager) {
                   return this.findScrollingChild(p0.getChildAt(p0.getCurrentItem()));
                }else if(p0 instanceof ViewGroup){
                   int childCount = p0.getChildCount();
                   while (true) {
                      if (i < childCount) {
                         obj1 = this.findScrollingChild(p0.getChildAt(i));
                         if (obj1 != null) {
                            return obj1;
                         }else {
                            i = i + 1;
                         }
                      }
                   }
                }
                p0 = null;
             }
          }else {
             goto label_005b ;
          }
       }
       return p0;
    }
    public boolean onLayoutChild(CoordinatorLayout p0,View p1,int p2){
       if (PatchProxy.isSupport(HalfSelectFriendBottomSheet.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, HalfSelectFriendBottomSheet.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.updateScrollingChild();
       return super.onLayoutChild(p0, p1, p2);
    }
    public boolean onNestedFling(CoordinatorLayout p0,View p1,View p2,float p3,float p4,boolean p5){
       HalfSelectFriendBottomSheet halfSelectFr = HalfSelectFriendBottomSheet.class;
       if (PatchProxy.isSupport(halfSelectFr)) {
          Object[] objArray = new Object[]{p0,p1,p2,Float.valueOf(p3),Float.valueOf(p4),Boolean.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, halfSelectFr, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return super.onNestedFling(p0, p1, p2, p3, p4, p5);
    }
    public boolean onNestedPreFling(CoordinatorLayout p0,View p1,View p2,float p3,float p4){
       HalfSelectFriendBottomSheet halfSelectFr = HalfSelectFriendBottomSheet.class;
       if (PatchProxy.isSupport(halfSelectFr)) {
          Object[] objArray = new Object[]{p0,p1,p2,Float.valueOf(p3),Float.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, halfSelectFr, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return super.onNestedPreFling(p0, p1, p2, p3, p4);
    }
    public void onNestedPreScroll(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int[] p5,int p6){
       HalfSelectFriendBottomSheet halfSelectFr = HalfSelectFriendBottomSheet.class;
       if (PatchProxy.isSupport(halfSelectFr)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),p5,Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, halfSelectFr, "5")) {
             return;
          }
       }
       super.onNestedPreScroll(p0, p1, p2, p3, p4, p5, p6);
       return;
    }
    public boolean onStartNestedScroll(CoordinatorLayout p0,View p1,View p2,View p3,int p4,int p5){
       HalfSelectFriendBottomSheet halfSelectFr = HalfSelectFriendBottomSheet.class;
       if (PatchProxy.isSupport(halfSelectFr)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, halfSelectFr, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return super.onStartNestedScroll(p0, p1, p2, p3, p4, p5);
    }
    public void onStopNestedScroll(CoordinatorLayout p0,View p1,View p2,int p3){
       if (PatchProxy.isSupport(HalfSelectFriendBottomSheet.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, HalfSelectFriendBottomSheet.class, "6")) {
          return;
       }
       if (this.e == HalfPanelState.STRETCH && p1.getTop() > this.c) {
          this.d(HalfPanelState.NORMAL);
          i0.e0(p1, (this.b - p1.getTop()));
          ViewGroup$LayoutParams layoutParams = p1.getLayoutParams();
          HalfSelectFriendBottomSheet ta = this.a;
          layoutParams.height = ta;
          this.setPeekHeight(ta);
          p1.setLayoutParams(layoutParams);
       }else {
          super.onStopNestedScroll(p0, p1, p2, p3);
       }
       return;
    }
}
