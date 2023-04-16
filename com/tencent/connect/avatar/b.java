package com.tencent.connect.avatar.b;
import android.view.View;
import android.content.Context;
import android.graphics.Rect;
import java.lang.Math;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.graphics.Color;

public class b extends View	// class@000e3b
{
    public Rect a;
    public Paint b;

    public void b(Context p0){
       super(p0);
       this.b();
    }
    public Rect a(){
       if (this.a == null) {
          this.a = new Rect();
          int measuredWidt = this.getMeasuredWidth();
          int measuredHeig = this.getMeasuredHeight();
          int i = Math.min(Math.min(((measuredHeig - 60) - 80), measuredWidt), 640);
          measuredWidt = (measuredWidt - i) / 2;
          measuredHeig = (measuredHeig - i) / 2;
          int i1 = measuredWidt + i;
          this.a.set(measuredWidt, measuredHeig, i1, (i + measuredHeig));
       }
       return this.a;
    }
    public final void b(){
       this.b = new Paint();
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       Rect rect = this.a();
       this.b.setStyle(Paint$Style.FILL);
       this.b.setColor(Color.argb(100, 0, 0, 0));
       float f = (float)this.getMeasuredWidth();
       Canvas uCanvas = p0;
       float f1 = f;
       uCanvas.drawRect(0, 0, f1, (float)rect.top, this.b);
       uCanvas.drawRect(0, (float)rect.bottom, f1, (float)this.getMeasuredHeight(), this.b);
       p0.drawRect(0, (float)rect.top, (float)rect.left, (float)rect.bottom, this.b);
       p0.drawRect((float)rect.right, (float)rect.top, f, (float)rect.bottom, this.b);
       p0.drawColor(Color.argb(100, 0, 0, 0));
       this.b.setStyle(Paint$Style.STROKE);
       this.b.setColor(-1);
       p0.drawRect((float)rect.left, (float)rect.top, (float)(rect.right - 1), (float)rect.bottom, this.b);
    }
}
