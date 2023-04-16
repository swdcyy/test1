package com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;

public final class Snackbar$SnackbarLayout extends BaseTransientBottomBar$SnackbarBaseLayout	// class@0016ad
{

    public void Snackbar$SnackbarLayout(Context p0){
       super(p0);
    }
    public void Snackbar$SnackbarLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       p0 = this.getChildCount();
       p1 = (this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight();
       int i = 0;
       while (i < p0) {
          View childAt = this.getChildAt(i);
          if (childAt.getLayoutParams().width == -1) {
             childAt.measure(View$MeasureSpec.makeMeasureSpec(p1, 0x40000000), View$MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 0x40000000));
          }
          i = i + 1;
       }
       return;
    }
}
