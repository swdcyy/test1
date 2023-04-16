package com.kwai.library.widget.layout.SquareChildLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Math;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;

public class SquareChildLinearLayout extends LinearLayout	// class@00095f
{
    public int b;
    public int c;

    public void SquareChildLinearLayout(Context p0){
       super(p0);
       this.c = 1;
    }
    public void SquareChildLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = 1;
       this.a(p0, p1, 0);
    }
    public void SquareChildLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = 1;
       this.a(p0, p1, p2);
    }
    public final void a(Context p0,AttributeSet p1,int p2){
       if (p1 == null) {
          return;
       }
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.q5, p2, 0);
       this.b = typedArray.getDimensionPixelSize(1, 0);
       this.c = Math.max(typedArray.getInteger(0, 1), 1);
       typedArray.recycle();
       return;
    }
    public void onMeasure(int p0,int p1){
       if (this.getOrientation()) {
          super.onMeasure(p0, p1);
       }else {
          int mode = View$MeasureSpec.getMode(p0);
          if (View$MeasureSpec.getMode(p1) || !mode) {
             super.onMeasure(p0, p1);
          }else {
             mode = 0;
             p0 = LinearLayout.resolveSizeAndState(View$MeasureSpec.getSize(p0), p0, mode);
             SquareChildLinearLayout tc = this.c;
             p1 = ((p0 - this.getPaddingLeft()) - this.getPaddingRight()) - ((tc - 1) * this.b);
             if (tc > null) {
                p1 = p1 / tc;
             }
             int i = 0;
             int i1 = 0;
             while (i < this.getChildCount()) {
                View childAt = this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                   childAt.measure(View$MeasureSpec.makeMeasureSpec(p1, 0x40000000), View$MeasureSpec.makeMeasureSpec(p1, 0x40000000));
                   LinearLayout$LayoutParams layoutParams = childAt.getLayoutParams();
                   SquareChildLinearLayout tb = (i > 0)? this.b: 0;
                   layoutParams.leftMargin = tb;
                   layoutParams.rightMargin = mode;
                   int i2 = layoutParams.topMargin + p1;
                   i2 = i2 + layoutParams.bottomMargin;
                   i1 = Math.max(i1, i2);
                }
                i = i + 1;
             }
             this.setMeasuredDimension(p0, (i1 + (this.getPaddingTop() + this.getPaddingBottom())));
          }
       }
       return;
    }
}
