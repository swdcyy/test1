package com.kwai.library.widget.deprecated.IndicatorSeekBar;
import android.widget.SeekBar;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import java.lang.String;
import android.graphics.Color;
import android.graphics.Canvas;
import android.widget.AbsSeekBar;

public class IndicatorSeekBar extends SeekBar	// class@00091c
{
    public Drawable b;

    public void IndicatorSeekBar(Context p0){
       super(p0);
    }
    public void IndicatorSeekBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void IndicatorSeekBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.s1);
       this.b = typedArray.getDrawable(0);
       typedArray.recycle();
       return;
    }
    public synchronized void onDraw(Canvas p0){
       super.onDraw(p0);
       if (this.b != null) {
          p0.save();
          IndicatorSeekBar tb = this.b;
          tb.setBounds(0, 0, tb.getIntrinsicWidth(), this.b.getIntrinsicHeight());
          p0.translate((float)(((this.getWidth() * this.getProgress()) / this.getMax()) - (this.b.getIntrinsicWidth() / 2)), (float)this.getPaddingTop());
          this.b.draw(p0);
          p0.restore();
       }
       return;
    }
    public synchronized void onMeasure(int p0,int p1){
       try{
          super.onMeasure(p0, p1);
       }catch(java.lang.NoSuchMethodError e0){
          e0.setMeasuredDimension(0, 0);
          e0.setVisibility(8);
       }
       _monitor_exit(e0);
       return;
    }
}
