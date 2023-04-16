package com.yxcorp.gifshow.widget.SectionEmojiTextView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.widget.TextView;
import android.text.TextPaint;
import android.graphics.Paint$FontMetrics;
import android.text.Layout;
import java.lang.Math;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import android.content.res.Resources;

public class SectionEmojiTextView extends EmojiTextView	// class@0018c0
{
    public Drawable v;
    public int w;

    public void SectionEmojiTextView(Context p0){
       super(p0);
    }
    public void SectionEmojiTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SectionEmojiTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SectionEmojiTextView.class, "1")) {
       }else {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.U4);
          this.v = typedArray.getDrawable(0);
          this.w = typedArray.getDimensionPixelOffset(1, 0);
          typedArray.recycle();
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SectionEmojiTextView.class, "5")) {
          return;
       }
       SectionEmojiTextView tv = this.v;
       if (tv != null) {
          float f = 2.00f;
          float f1 = (float)tv.getIntrinsicHeight() / f;
          int intrinsicWid = tv.getIntrinsicWidth();
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
          tv.setBounds(paddingLeft, i2, i, (int)(f2 + f1));
          i2 = this.getScrollX();
          int scrollY = this.getScrollY();
          if (!i2 && !scrollY) {
             tv.draw(p0);
          }else {
             p0.translate((float)i2, (float)scrollY);
             tv.draw(p0);
             p0.translate((float)(- i2), (float)(- scrollY));
          }
          p0.translate((float)(this.w + intrinsicWid), 0);
          super.onDraw(p0);
          p0.translate((float)((- intrinsicWid) - this.w), 0);
       }else {
          super.onDraw(p0);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(SectionEmojiTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SectionEmojiTextView.class, "4")) {
          return;
       }
       if (this.v != null) {
          p0 = View$MeasureSpec.getSize(p0);
          super.onMeasure(View$MeasureSpec.makeMeasureSpec(((p0 - this.v.getIntrinsicWidth()) - this.w), View$MeasureSpec.getMode(p0)), p1);
          this.setMeasuredDimension(Math.min(((this.getMeasuredWidth() + this.v.getIntrinsicWidth()) + this.w), p0), this.getMeasuredHeight());
       }else {
          super.onMeasure(p0, p1);
       }
       return;
    }
    public void setLeftDrawable(int p0){
       if (PatchProxy.isSupport(SectionEmojiTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SectionEmojiTextView.class, "3")) {
          return;
       }
       this.setLeftDrawable(this.getResources().getDrawable(p0));
       return;
    }
    public void setLeftDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SectionEmojiTextView.class, "2")) {
          return;
       }
       this.v = p0;
       this.requestLayout();
       return;
    }
}
