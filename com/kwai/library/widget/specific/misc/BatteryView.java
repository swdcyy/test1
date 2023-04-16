package com.kwai.library.widget.specific.misc.BatteryView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import android.graphics.Rect;

public class BatteryView extends View	// class@000a01
{
    public Paint b;
    public float c;
    public Rect d;

    public void BatteryView(Context p0){
       super(p0);
       this.c = 0;
       this.a();
    }
    public void BatteryView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = 0;
       this.a();
    }
    public void BatteryView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = 0;
       this.a();
    }
    public final void a(){
       Paint paint = new Paint(7);
       this.b = paint;
       paint.setStyle(Paint$Style.FILL);
       this.b.setAntiAlias(true);
    }
    public void onDraw(Canvas p0){
       if (this.d == null) {
          this.d = new Rect();
       }
       this.d.set(2, (int)((float)this.getHeight() * (0x3f800000 - this.c)), (this.getWidth() - 1), this.getHeight());
       p0.drawRect(this.d, this.b);
       return;
    }
    public void setFillColor(int p0){
       this.b.setColor(p0);
    }
    public void setProgress(float p0){
       this.c = p0;
       this.invalidate();
    }
}
