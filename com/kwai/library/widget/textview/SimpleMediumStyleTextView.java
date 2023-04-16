package com.kwai.library.widget.textview.SimpleMediumStyleTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.widget.TextView;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Style;
import android.graphics.Typeface;

public class SimpleMediumStyleTextView extends AppCompatTextView	// class@000a5c
{
    public boolean f;

    public void SimpleMediumStyleTextView(Context p0){
       super(p0);
       this.f = true;
    }
    public void SimpleMediumStyleTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = true;
    }
    public void SimpleMediumStyleTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = true;
    }
    public void onDraw(Canvas p0){
       if (this.getPaint().isFakeBoldText()) {
          this.getPaint().setFakeBoldText(false);
          this.f = true;
       }
       if (this.f != null) {
          TextPaint paint = this.getPaint();
          paint.setColor(paint.getColor());
          paint.setStrokeCap(Paint$Cap.ROUND);
          paint.setStrokeWidth((paint.getTextSize() / 36.00f));
          paint.setStyle(Paint$Style.FILL_AND_STROKE);
       }
       super.onDraw(p0);
       return;
    }
    public void setEnableMediumBold(boolean p0){
       this.f = p0;
       this.requestLayout();
       this.invalidate();
    }
    public void setTypeface(Typeface p0,int p1){
       if (p1 == 1) {
          this.setEnableMediumBold(1);
       }else {
          this.setEnableMediumBold(false);
       }
       super.setTypeface(p0);
       return;
    }
}
