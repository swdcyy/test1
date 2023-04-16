package com.yxcorp.gifshow.widget.SectionPressedSpanTextView;
import com.yxcorp.gifshow.widget.textview.PressedSpanTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.text.TextPaint;
import android.graphics.Paint$FontMetrics;
import android.text.Layout;
import java.lang.Math;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.res.Resources;
import ll8.c$b;
import android.content.res.TypedArray;

public class SectionPressedSpanTextView extends PressedSpanTextView	// class@0018c1
{
    public Drawable l;
    public int m;

    public void SectionPressedSpanTextView(Context p0){
       super(p0);
    }
    public void SectionPressedSpanTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.u(p0, p1);
    }
    public void SectionPressedSpanTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.u(p0, p1);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SectionPressedSpanTextView.class, "5")) {
          return;
       }
       SectionPressedSpanTextView tl = this.l;
       if (tl != null) {
          float f = 2.00f;
          float f1 = (float)tl.getIntrinsicHeight() / f;
          int intrinsicWid = tl.getIntrinsicWidth();
          int paddingLeft = this.getPaddingLeft();
          int i = paddingLeft + intrinsicWid;
          Paint$FontMetrics ascent = this.getPaint().getFontMetrics().ascent;
          Paint$FontMetrics descent = this.getPaint().getFontMetrics().descent;
          int i1 = 0;
          if (this.getLayout() != null) {
             i1 = this.getTotalPaddingTop();
          }
          float f2 = ((descent - ascent) / f) + (float)Math.max(this.getPaddingTop(), i1);
          f = f2 - f1;
          int i2 = (int)f;
          tl.setBounds(paddingLeft, i2, i, (int)(f2 + f1));
          i2 = this.getScrollX();
          int scrollY = this.getScrollY();
          if (!i2 && !scrollY) {
             tl.draw(p0);
          }else {
             p0.translate((float)i2, (float)scrollY);
             tl.draw(p0);
             p0.translate((float)(- i2), (float)(- scrollY));
          }
          p0.translate((float)(this.m + intrinsicWid), 0);
          super.onDraw(p0);
          p0.translate((float)((- intrinsicWid) - this.m), 0);
       }else {
          super.onDraw(p0);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(SectionPressedSpanTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SectionPressedSpanTextView.class, "4")) {
          return;
       }
       if (this.l != null) {
          p0 = View$MeasureSpec.getSize(p0);
          super.onMeasure(View$MeasureSpec.makeMeasureSpec(((p0 - this.l.getIntrinsicWidth()) - this.m), View$MeasureSpec.getMode(p0)), p1);
          this.setMeasuredDimension(Math.min(((this.getMeasuredWidth() + this.l.getIntrinsicWidth()) + this.m), p0), this.getMeasuredHeight());
       }else {
          super.onMeasure(p0, p1);
       }
       return;
    }
    public void setLeftDrawable(int p0){
       if (PatchProxy.isSupport(SectionPressedSpanTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SectionPressedSpanTextView.class, "3")) {
          return;
       }
       this.setLeftDrawable(this.getResources().getDrawable(p0));
       return;
    }
    public void setLeftDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SectionPressedSpanTextView.class, "2")) {
          return;
       }
       this.l = p0;
       this.requestLayout();
       return;
    }
    public final void u(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SectionPressedSpanTextView.class, "1")) {
          return;
       }
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.V4);
       this.l = typedArray.getDrawable(0);
       this.m = typedArray.getDimensionPixelOffset(1, 0);
       typedArray.recycle();
       return;
    }
}
