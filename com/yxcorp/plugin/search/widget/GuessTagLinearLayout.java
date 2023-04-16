package com.yxcorp.plugin.search.widget.GuessTagLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class GuessTagLinearLayout extends LinearLayout	// class@0007c5
{
    public View b;
    public View c;
    public static final int d = 2131378870;
    public static final int e = 2131366783;

    public void GuessTagLinearLayout(Context p0){
       super(p0);
    }
    public void GuessTagLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void GuessTagLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, GuessTagLinearLayout.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.b = this.findViewById(GuessTagLinearLayout.d);
       this.c = this.findViewById(GuessTagLinearLayout.e);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(GuessTagLinearLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, GuessTagLinearLayout.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       p0 = (View$MeasureSpec.getSize(p0) - this.getPaddingLeft()) - this.getPaddingRight();
       p1 = this.getChildCount();
       if (p1 > 0) {
          GuessTagLinearLayout tb = this.b;
          tb = (tb != null && !tb.getVisibility())? this.b: this.c;
          if (tb != null && !tb.getVisibility()) {
             int i = 0;
             int i1 = 0;
             while (i < p1) {
                View childAt = this.getChildAt(i);
                if (childAt == tb) {
                   childAt.measure(View$MeasureSpec.makeMeasureSpec(0, 0), View$MeasureSpec.makeMeasureSpec(0, 0));
                }
                i1 = i1 + childAt.getMeasuredWidth();
                if (childAt.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
                   ViewGroup$MarginLayoutParams layoutParams = childAt.getLayoutParams();
                   int i2 = layoutParams.leftMargin + layoutParams.rightMargin;
                   i1 = i1 + i2;
                }
                i = i + 1;
             }
             if (i1 >= p0) {
                tb.setVisibility(8);
             }else {
                tb.setVisibility(0);
             }
          }
       }
    label_0082 :
       return;
    }
}
