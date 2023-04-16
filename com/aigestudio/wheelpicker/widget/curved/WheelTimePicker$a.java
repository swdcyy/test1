package com.aigestudio.wheelpicker.widget.curved.WheelTimePicker$a;
import s4.a;
import com.aigestudio.wheelpicker.widget.curved.WheelTimePicker;
import java.lang.String;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Paint;
import android.graphics.Paint$Align;

public class WheelTimePicker$a extends a	// class@000d77
{
    public final String a;
    public final WheelTimePicker b;

    public void WheelTimePicker$a(WheelTimePicker p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(Canvas p0,Rect p1,Rect p2,Paint p3){
       p3.setColor(this.b.g);
       p3.setTextAlign(Paint$Align.CENTER);
       p3.setTextSize((this.b.j * 0x3fc00000));
       p0.drawText(this.a, (float)p2.centerX(), ((float)p2.centerY() - ((p3.ascent() + p3.descent()) / 2.00f)), p3);
    }
}
