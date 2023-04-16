package com.kwai.library.widget.deprecated.StrokeTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import lnc.a1;
import android.text.TextPaint;
import android.widget.TextView;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Paint$Join;
import android.graphics.Paint$Style;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Object;

public class StrokeTextView extends AppCompatTextView	// class@00091d
{
    public boolean f;
    public int g;
    public int h;
    public int i;
    public Paint j;

    public void StrokeTextView(Context p0){
       super(p0);
    }
    public void StrokeTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.x5);
       this.f = typedArray.getBoolean(0, 0);
       this.g = typedArray.getColor(1, 0x26000000);
       this.i = typedArray.getColor(3, -1);
       this.h = typedArray.getColor(3, a1.e(0x3fc00000));
       typedArray.recycle();
       TextPaint paint = this.getPaint();
       this.j = paint;
       paint.setColor(this.i);
       this.setGravity(17);
    }
    public void onDraw(Canvas p0){
       if (this.f == null) {
          super.onDraw(p0);
          return;
       }else {
          this.setCurrentColor(this.g);
          this.j.setStrokeMiter(10.00f);
          this.j.setStrokeJoin(Paint$Join.ROUND);
          this.j.setStrokeWidth((float)this.h);
          this.j.setStyle(Paint$Style.FILL_AND_STROKE);
          super.onDraw(p0);
          this.setCurrentColor(this.i);
          this.j.setStyle(Paint$Style.FILL);
          this.j.setStrokeWidth(0);
          this.j.setFakeBoldText(false);
          super.onDraw(p0);
          return;
       }
    }
    public final void setCurrentColor(int p0){
       try{
          Field declaredFiel = TextView.class.getDeclaredField("mCurTextColor");
          declaredFiel.setAccessible(true);
          declaredFiel.set(this, Integer.valueOf(p0));
          return;
       }catch(java.lang.NoSuchFieldException e0){
       }catch(java.lang.IllegalAccessException e0){
       }
    }
}
