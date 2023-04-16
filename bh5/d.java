package bh5.d;
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
import android.graphics.Paint$FontMetricsInt;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class d extends ReplacementSpan	// class@0004a6
{
    public final int b;

    public void d(int p0){
       this.b = p0;
       super();
    }
    public void draw(Canvas p0,CharSequence p1,int p2,int p3,float p4,int p5,int p6,int p7,Paint p8){
       if (PatchProxy.isSupport(d.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Float.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, this, d.class, "2")) {
             return;
          }
       }
       Paint$FontMetricsInt fontMetricsI = p8.getFontMetricsInt();
       p0.drawText(p1.subSequence(p2, p3).toString(), (p4 + (float)this.b), ((float)p6 - (((float)(((fontMetricsI.descent + p6) + p6) + fontMetricsI.ascent) / 2.00f) - ((float)(p7 + p5) / 2.00f))), p8);
       return;
    }
    public int getSize(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       if (PatchProxy.isSupport(d.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, d.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0.getFontMetricsInt(p4);
       return ((int)(p0.measureText(p1.subSequence(p2, p3).toString()) + (float)this.b) + 1);
    }
}
