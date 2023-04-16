package com.kuaishou.live.common.core.basic.widget.ConstrainLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.view.View$MeasureSpec;

public class ConstrainLinearLayout extends LinearLayout	// class@000f04
{
    public int b;
    public int c;
    public int d;

    public void ConstrainLinearLayout(Context p0){
       super(p0);
    }
    public void ConstrainLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void ConstrainLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void measureChild(View p0,int p1,int p2){
       ConstrainLinearLayout tc;
       ConstrainLinearLayout td;
       if (PatchProxy.isSupport(ConstrainLinearLayout.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ConstrainLinearLayout.class, "4")) {
          return;
       }
       ConstrainLinearLayout uConstrainLi = -1;
       if (this.b != uConstrainLi && (this.d != uConstrainLi && (this.c != uConstrainLi && p0.getId() != this.b))) {
          tc = this.c;
          td = this.d;
       }
    label_0036 :
       super.measureChild(p0, tc, td);
       return;
    }
    public void measureChildWithMargins(View p0,int p1,int p2,int p3,int p4){
       ConstrainLinearLayout tc;
       ConstrainLinearLayout td;
       if (PatchProxy.isSupport(ConstrainLinearLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ConstrainLinearLayout.class, "5")) {
             return;
          }
       }
       ConstrainLinearLayout uConstrainLi = -1;
       if (this.b != uConstrainLi && (this.d != uConstrainLi && (this.c != uConstrainLi && p0.getId() != this.b))) {
          tc = this.c;
          td = this.d;
       }
    label_004e :
       super.measureChildWithMargins(p0, tc, p2, td, p4);
       return;
    }
    public void onMeasure(int p0,int p1){
       View view;
       int mode;
       if (PatchProxy.isSupport(ConstrainLinearLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ConstrainLinearLayout.class, "2")) {
          return;
       }
       this.c = p0;
       this.d = p1;
       ConstrainLinearLayout tb = this.b;
       if (tb != -1) {
          if (PatchProxy.isSupport(ConstrainLinearLayout.class)) {
             view = PatchProxy.applyOneRefs(Integer.valueOf(tb), this, ConstrainLinearLayout.class, "3");
             if (view != PatchProxyResult.class) {
             }else {
             label_003f :
                int i = this.getChildCount() - 1;
                while (true) {
                   if (i >= 0) {
                      if (this.getChildAt(i).getId() == tb) {
                         view = this.getChildAt(i);
                      }else {
                         i = i - 1;
                      }
                   }else {
                      view = null;
                   }
                }
             }
          }else {
             goto label_003f ;
          }
          if (view != null && view.getVisibility() != 8) {
             if (this.getOrientation() == 1) {
                mode = View$MeasureSpec.getMode(p1);
                if (mode) {
                   this.measureChild(view, p0, p1);
                   this.d = View$MeasureSpec.makeMeasureSpec((View$MeasureSpec.getSize(p1) - view.getMeasuredHeight()), mode);
                }
             }else {
                mode = View$MeasureSpec.getMode(p0);
                if (mode) {
                   this.measureChild(view, p0, p1);
                   this.c = View$MeasureSpec.makeMeasureSpec((View$MeasureSpec.getSize(p0) - view.getMeasuredWidth()), mode);
                }
             }
          }
       }
    label_009b :
       super.onMeasure(p0, p1);
       this.c = -1;
       this.d = -1;
       return;
    }
    public void setPlaceHolder(int p0){
       if (PatchProxy.isSupport(ConstrainLinearLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ConstrainLinearLayout.class, "1")) {
          return;
       }
       this.b = p0;
       this.requestLayout();
       return;
    }
}
