package com.kuaishou.merchant.home2.basic.widget.AutoHideFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.merchant.home2.basic.widget.AutoHideFrameLayout$b;
import com.kuaishou.merchant.home2.basic.widget.AutoHideFrameLayout$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;

public class AutoHideFrameLayout extends FrameLayout	// class@0016ef
{
    public final AutoHideFrameLayout$b b;

    public void AutoHideFrameLayout(Context p0){
       super(p0, null);
    }
    public void AutoHideFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new AutoHideFrameLayout$b(null);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(AutoHideFrameLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, AutoHideFrameLayout.class, "1")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       AutoHideFrameLayout tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(this, tb, AutoHideFrameLayout$b.class, "1")) {
          int i = 0;
          while (i < this.getChildCount()) {
             View childAt = this.getChildAt(i);
             if (childAt.getVisibility() != 8) {
                ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams.width < null || layoutParams.height < null) {
                   childAt.measure(View$MeasureSpec.makeMeasureSpec(0, 0), View$MeasureSpec.makeMeasureSpec(0, 0));
                }
                float f = 0;
                float f1 = (layoutParams.width < null)? (float)childAt.getMeasuredWidth(): 0;
                if (layoutParams.height < null) {
                   f = (float)childAt.getMeasuredHeight();
                }
                layoutParams = childAt.getHeight();
                f1 = (f1 - (float)childAt.getWidth() > 0)? 1: 0;
                layoutParams = (f - (float)layoutParams > 0)? 1: 0;
                layoutParams = layoutParams | f1;
                if (layoutParams) {
                   childAt.setVisibility(4);
                }else {
                   childAt.setVisibility(0);
                }
             }
             i++;
          }
       }
       return;
    }
}
