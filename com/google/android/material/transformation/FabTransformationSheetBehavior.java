package com.google.android.material.transformation.FabTransformationSheetBehavior;
import com.google.android.material.transformation.FabTransformationBehavior;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.ViewGroup;
import java.util.HashMap;
import android.view.ViewGroup$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.lang.Object;
import java.util.Map;
import java.lang.Integer;
import a2.i0;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import com.google.android.material.transformation.FabTransformationBehavior$e;
import rj.h;
import rj.j;

public class FabTransformationSheetBehavior extends FabTransformationBehavior	// class@0016f3
{
    public Map g;

    public void FabTransformationSheetBehavior(){
       super();
    }
    public void FabTransformationSheetBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public final void A(View p0,boolean p1){
       ViewParent parent = p0.getParent();
       if (!parent instanceof CoordinatorLayout) {
          return;
       }
       int childCount = parent.getChildCount();
       if (p1) {
          this.g = new HashMap(childCount);
       }
       int i = 0;
       while (i < childCount) {
          View childAt = parent.getChildAt(i);
          ViewGroup$LayoutParams layoutParams = (childAt.getLayoutParams() instanceof CoordinatorLayout$LayoutParams && childAt.getLayoutParams().f() instanceof FabTransformationScrimBehavior)? 1: null;
          if (childAt != p0 && !layoutParams) {
             if (!p1) {
                FabTransformationSheetBehavior tg = this.g;
                if (tg != null && tg.containsKey(childAt)) {
                   i0.D0(childAt, this.g.get(childAt).intValue());
                }
             }else {
                this.g.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                i0.D0(childAt, 4);
             }
          }
          i = i + 1;
       }
       if (!p1) {
          this.g = null;
       }
       return;
    }
    public boolean e(View p0,View p1,boolean p2,boolean p3){
       this.A(p1, p2);
       super.e(p0, p1, p2, p3);
       return true;
    }
    public FabTransformationBehavior$e y(Context p0,boolean p1){
       int i = (p1)? 0x7f020009: 0x7f020008;
       FabTransformationBehavior$e uoe = new FabTransformationBehavior$e();
       uoe.a = h.c(p0, i);
       uoe.b = new j(17, 0, 0);
       return uoe;
    }
}
