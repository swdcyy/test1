package com.kuaishou.live.basic.richtext.c;
import android.text.style.ReplacementSpan;
import com.kuaishou.live.basic.richtext.c$a;
import android.text.TextPaint;
import android.graphics.Typeface;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.RectF;
import android.graphics.Canvas;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import android.graphics.Paint$FontMetrics;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Paint$FontMetricsInt;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class c extends ReplacementSpan	// class@000d03
{
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int[] i;
    public final Typeface j;
    public final TextPaint k;
    public final Paint l;
    public final RectF m;

    public void c(c$a p0){
       super();
       c$a a = p0.a;
       this.b = a;
       c$a b = p0.b;
       this.c = b;
       this.d = p0.c;
       this.e = p0.d;
       this.f = p0.e;
       this.g = p0.f;
       this.h = p0.g;
       this.i = p0.h;
       p0 = p0.i;
       this.j = p0;
       TextPaint textPaint = new TextPaint(1);
       this.k = textPaint;
       textPaint.setColor(a);
       textPaint.setTextSize((float)b);
       textPaint.setTypeface(p0);
       Paint paint = new Paint(1);
       this.l = paint;
       paint.setStyle(Paint$Style.FILL);
       this.m = new RectF();
    }
    public void draw(Canvas p0,CharSequence p1,int p2,int p3,float p4,int p5,int p6,int p7,Paint p8){
       float f3;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       float f = p4;
       int i = 0;
       int i1 = 1;
       if (PatchProxy.isSupport(c.class)) {
          Object[] objArray = new Object[9];
          objArray[i] = oobject;
          objArray[i1] = oobject1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Float.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, obj, c.class, "2")) {
             return;
          }
       }
       Paint$FontMetrics fontMetrics = obj.k.getFontMetrics();
       float f1 = ((float)p6 - p8.getFontMetrics().descent) + fontMetrics.descent;
       float f2 = ((obj.k.measureText(oobject1, p2, p3) + f) + (float)obj.e) + (float)obj.f;
       c i2 = obj.i;
       if (i2.length == i1) {
          obj.l.setColor(i2[i]);
          f3 = f2;
       }else {
          LinearGradient linearGradie = v8;
          LinearGradient linearGradie1 = v8;
          f3 = f2;
          linearGradie = new LinearGradient(p4, 0, f2, 0, obj.i, 0, Shader$TileMode.CLAMP);
          obj.l.setShader(linearGradie1);
       }
       obj.m.set(f, ((fontMetrics.ascent + f1) - (float)obj.g), f3, ((fontMetrics.descent + f1) + (float)obj.h));
       i2 = obj.d;
       float f4 = (float)i2;
       oobject.drawRoundRect(obj.m, f4, (float)i2, obj.l);
       p0.drawText(p1, p2, p3, (f + (float)obj.e), f1, obj.k);
       return;
    }
    public int getSize(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       if (PatchProxy.isSupport(c.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          p0 = PatchProxy.apply(objArray, this, c.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.intValue();
          }
       }
       return (((int)this.k.measureText(p1, p2, p3) + this.e) + this.f);
    }
}
