package com.yxcorp.plugin.search.widget.EllipsizeLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View$MeasureSpec;
import android.view.View;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;

public class EllipsizeLayout extends LinearLayout	// class@0007c1
{

    public void EllipsizeLayout(Context p0){
       super(p0, null);
    }
    public void EllipsizeLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void onMeasure(int p0,int p1){
       View view1;
       if (PatchProxy.isSupport(EllipsizeLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, EllipsizeLayout.class, "1")) {
          return;
       }
       if (!this.getOrientation() && View$MeasureSpec.getMode(p0) == 0x40000000) {
          ViewGroup$LayoutParams layoutParams = null;
          int childCount = this.getChildCount();
          int i = 0;
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          int i4 = 1;
          while (i2 < childCount && !i1) {
             View childAt = this.getChildAt(i2);
             if (childAt != null && childAt.getVisibility() != 8) {
                if (childAt instanceof TextView) {
                   View view = childAt;
                   if (view.getEllipsize() != null) {
                      if (layoutParams == null) {
                         view.setMaxWidth(Integer.MAX_VALUE);
                         view1 = view;
                      }else {
                         view1 = layoutParams;
                         i1 = 1;
                      }
                   }else {
                   label_0060 :
                      view1 = layoutParams;
                   }
                }else {
                   goto label_0060 ;
                }
                ViewGroup$LayoutParams layoutParams1 = childAt.getLayoutParams();
                if (layoutParams1.weight <= 0) {
                   i4 = 0;
                }
                int i5 = i1 | i4;
                this.measureChildWithMargins(childAt, p0, 0, p1, 0);
                int i6 = childAt.getMeasuredWidth() + layoutParams1.leftMargin;
                i6 = i6 + layoutParams1.rightMargin;
                i3 = i3 + i6;
                layoutParams = view1;
                i1 = i5;
             }
             i2 = i2 + 1;
          }
          if (layoutParams != null && i3) {
             i4 = 0;
          }
          i4 = View$MeasureSpec.getSize(p0);
          if (!(i1 | i4) && i3 > i4) {
             i1 = layoutParams.getMeasuredWidth() - (i3 - i4);
             if (i1 >= 0) {
                i = i1;
             }
             layoutParams.setMaxWidth(i);
          }
       }
    label_00aa :
       super.onMeasure(p0, p1);
       return;
    }
}
