package androidx.appcompat.widget.ButtonBarLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.View;
import a2.i0;
import java.lang.Math;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;

public class ButtonBarLayout extends LinearLayout	// class@0005fa
{
    public boolean b;
    public int c;
    public int d;

    public void ButtonBarLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = -1;
       this.d = 0;
       int[] f = c$b.F;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, f);
       i0.q0(this, p0, f, p1, typedArray, 0, 0);
       this.b = typedArray.getBoolean(0, true);
       typedArray.recycle();
    }
    public final int a(int p0){
       int childCount = this.getChildCount();
       while (true) {
          if (p0 >= childCount) {
             return -1;
          }
          if (!this.getChildAt(p0).getVisibility()) {
             break ;
          }else {
             p0++;
          }
       }
       return p0;
    }
    public final boolean b(){
       boolean b = true;
       if (this.getOrientation() == b) {
       }else {
          b = false;
       }
       return b;
    }
    public int getMinimumHeight(){
       return Math.max(this.d, super.getMinimumHeight());
    }
    public void onMeasure(int p0,int p1){
       int i;
       LinearLayout$LayoutParams layoutParams;
       int size = View$MeasureSpec.getSize(p0);
       boolean b = false;
       if (this.b != null) {
          if (size > this.c && this.b()) {
             this.setStacked(b);
          }
          this.c = size;
       }
       if (!this.b() && View$MeasureSpec.getMode(p0) == 0x40000000) {
          size = View$MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
          i = 1;
       }else {
          size = p0;
          i = 0;
       }
       super.onMeasure(size, p1);
       if (this.b != null && !this.b()) {
          layoutParams = ((this.getMeasuredWidthAndState() & 0xff000000) == 0x1000000)? 1: null;
          if (layoutParams) {
             this.setStacked(true);
             i = 1;
          }
       }
    label_0052 :
       if (i) {
          super.onMeasure(p0, p1);
       }
       p0 = this.a(b);
       if (p0 >= 0) {
          View childAt = this.getChildAt(p0);
          layoutParams = childAt.getLayoutParams();
          i = (((this.getPaddingTop() + childAt.getMeasuredHeight()) + layoutParams.topMargin) + layoutParams.bottomMargin) + b;
          if (this.b()) {
             p0 = this.a((p0 + true));
             if (p0 >= 0) {
                i = i + (this.getChildAt(p0).getPaddingTop() + (int)(c.c(this.getResources()).density * 16.00f));
             }
             b = i;
          }else {
             b = i + this.getPaddingBottom();
          }
       }
       if (i0.C(this) != b) {
          this.setMinimumHeight(b);
       }
       return;
    }
    public void setAllowStacking(boolean p0){
       if (this.b != p0) {
          this.b = p0;
          if (!p0 && this.getOrientation() == 1) {
             this.setStacked(false);
          }
          this.requestLayout();
       }
       return;
    }
    public final void setStacked(boolean p0){
       int i1;
       this.setOrientation(p0);
       int i = (p0)? 5: 80;
       this.setGravity(i);
       View view = this.findViewById(R.id.spacer);
       if (view != null) {
          i1 = (p0)? 8: 4;
          view.setVisibility(i1);
       }
       for (i1 = this.getChildCount() - 2; i1 >= 0; i1--) {
          this.bringChildToFront(this.getChildAt(i1));
       }
       return;
    }
}
