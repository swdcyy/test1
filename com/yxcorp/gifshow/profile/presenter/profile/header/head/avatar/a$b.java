package com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.a$b;
import android.text.style.ReplacementSpan;
import android.graphics.Canvas;
import java.lang.CharSequence;
import android.graphics.Paint;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import android.graphics.RectF;
import android.graphics.Paint$FontMetricsInt;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class a$b extends ReplacementSpan	// class@0014e3
{
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public void a$b(int p0,int p1,int p2,int p3,int p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public void draw(Canvas p0,CharSequence p1,int p2,int p3,float p4,int p5,int p6,int p7,Paint p8){
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       float f = p4;
       object oobject2 = p8;
       int i = 2;
       if (PatchProxy.isSupport(a$b.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[i] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Float.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = oobject2;
          if (PatchProxy.applyVoid(objArray, obj, a$b.class, "2")) {
             return;
          }
       }
       float textSize = p8.getTextSize();
       oobject2.setColor(obj.b);
       a$b d = obj.d;
       float f1 = (textSize - (float)d) / 2.00f;
       oobject2.setTextSize((float)d);
       a$b e = obj.e;
       float f2 = (float)e;
       oobject.drawRoundRect(new RectF(f, ((float)p5 + f1), ((float)((int)oobject2.measureText(oobject1, p2, p3) + (obj.f * 2)) + f), ((float)p7 - f1)), f2, (float)e, oobject2);
       oobject2.setColor(obj.c);
       p0.drawText(p1, p2, p3, (f + (float)obj.f), (((float)p6 - f1) + 2.00f), p8);
       oobject2.setColor(p8.getColor());
       oobject2.setTextSize(textSize);
       return;
    }
    public int getSize(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       if (PatchProxy.isSupport(a$b.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          p4 = PatchProxy.apply(objArray, this, a$b.class, "1");
          if (p4 != PatchProxyResult.class) {
             return p4.intValue();
          }
       }
       p0.setTextSize((float)this.d);
       p0.setTextSize(p0.getTextSize());
       return ((int)p0.measureText(p1, p2, p3) + (this.f * 2));
    }
}
