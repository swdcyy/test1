package com.kwai.library.widget.textview.ExtraSpaceFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import android.text.Layout;
import android.graphics.Rect;
import android.text.TextPaint;
import android.graphics.Paint$FontMetricsInt;
import android.view.View;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import com.yxcorp.utility.RomUtils;
import com.kwai.library.widget.textview.ExtraSpaceFrameLayout$a;

public class ExtraSpaceFrameLayout extends FrameLayout	// class@000a35
{

    public void ExtraSpaceFrameLayout(Context p0){
       super(p0);
    }
    public void ExtraSpaceFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void ExtraSpaceFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public int a(TextView p0){
       int i = p0.getLineCount() - 1;
       if (i >= 0) {
          Rect rect = new Rect();
          i = rect.bottom - (p0.getLineBounds(i, rect) + p0.getLayout().getPaint().getFontMetricsInt().descent);
       }else {
          i = 0;
       }
       return i;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (this.getChildCount() != 1 || !this.getChildAt(0) instanceof SizeAdjustableTextView) {
          super.onLayout(p0, p1, p2, p3, p4);
          return;
       }else {
          this.getChildAt(0).layout(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
          return;
       }
    }
    public void onMeasure(int p0,int p1){
       int i = 1;
       if (this.getChildCount() < i) {
          super.onMeasure(p0, p1);
          return;
       }else {
          View childAt = this.getChildAt(0);
          v3 = childAt instanceof TextView;
          if (!RomUtils.s() && !RomUtils.o()) {
             i = 0;
          }
          if (v3 && (i && childAt instanceof ExtraSpaceFrameLayout$a)) {
             childAt.measure(p0, p1);
             this.setMeasuredDimension(childAt.getMeasuredWidth(), (childAt.getMeasuredHeight() - this.a(childAt)));
             return;
          }else {
             super.onMeasure(p0, p1);
             return;
          }
       }
    }
}
