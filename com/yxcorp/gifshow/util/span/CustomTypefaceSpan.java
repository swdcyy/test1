package com.yxcorp.gifshow.util.span.CustomTypefaceSpan;
import android.text.style.TypefaceSpan;
import java.lang.String;
import android.graphics.Typeface;
import android.graphics.Paint;
import android.text.TextPaint;

public class CustomTypefaceSpan extends TypefaceSpan	// class@000d03
{
    public final Typeface b;

    public void CustomTypefaceSpan(String p0,Typeface p1){
       super(p0);
       this.b = p1;
    }
    public static void a(Paint p0,Typeface p1){
       if (p1 == null) {
          return;
       }
       Typeface typeface = p0.getTypeface();
       int i = (typeface == null)? 0: typeface.getStyle();
       i = i & (~ p1.getStyle());
       if (i & 0x01) {
          p0.setFakeBoldText(true);
       }
       if (i & 0x02) {
          p0.setTextSkewX(-0.25f);
       }
       p0.setTypeface(p1);
       return;
    }
    public void updateDrawState(TextPaint p0){
       CustomTypefaceSpan.a(p0, this.b);
    }
    public void updateMeasureState(TextPaint p0){
       CustomTypefaceSpan.a(p0, this.b);
    }
}
