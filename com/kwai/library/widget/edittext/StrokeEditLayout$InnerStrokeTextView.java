package com.kwai.library.widget.edittext.StrokeEditLayout$InnerStrokeTextView;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.graphics.Paint$Join;
import android.graphics.Paint$Style;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Exception;

public class StrokeEditLayout$InnerStrokeTextView extends TextView	// class@00092a
{
    public int b;
    public int c;

    public void StrokeEditLayout$InnerStrokeTextView(Context p0){
       super(p0);
       this.b = 0;
       this.c = 2;
    }
    public void StrokeEditLayout$InnerStrokeTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 0;
       this.c = 2;
    }
    public void StrokeEditLayout$InnerStrokeTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0;
       this.c = 2;
    }
    public void onDraw(Canvas p0){
       this.setCurrentColor(this.b);
       this.getPaint().setStrokeMiter(10.00f);
       this.getPaint().setStrokeJoin(Paint$Join.ROUND);
       this.getPaint().setStrokeWidth((float)this.c);
       this.getPaint().setStyle(Paint$Style.FILL_AND_STROKE);
       super.onDraw(p0);
       this.setCurrentColor(this.getCurrentTextColor());
       this.getPaint().setStyle(Paint$Style.FILL);
       this.getPaint().setStrokeWidth(0);
       this.getPaint().setFakeBoldText(false);
       super.onDraw(p0);
    }
    public final void setCurrentColor(int p0){
       try{
          Field declaredFiel = TextView.class.getDeclaredField("mCurTextColor");
          declaredFiel.setAccessible(true);
          declaredFiel.set(this, Integer.valueOf(p0));
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          this.setTextColor(p0);
       }
       return;
    }
    public void setStrokeColor(int p0){
       this.b = p0;
    }
    public void setStrokeSize(int p0){
       this.c = p0;
    }
}
