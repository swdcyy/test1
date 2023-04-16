package b6c.h;
import android.text.style.ReplacementSpan;
import android.graphics.Paint;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Canvas;
import java.lang.CharSequence;
import java.lang.Integer;
import java.lang.Float;
import android.graphics.Paint$FontMetricsInt;
import java.lang.Number;

public class h extends ReplacementSpan	// class@0003c0
{
    public float b;

    public void h(float p0){
       super();
       this.b = p0;
    }
    public final TextPaint a(Paint p0){
       TextPaint obj = PatchProxy.applyOneRefs(p0, this, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TextPaint(p0);
       obj.setTextSize(this.b);
       return obj;
    }
    public void draw(Canvas p0,CharSequence p1,int p2,int p3,float p4,int p5,int p6,int p7,Paint p8){
       if (PatchProxy.isSupport(h.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, h.class, "2")) {
             return;
          }
       }
       TextPaint textPaint = this.a(p8);
       Paint$FontMetricsInt fontMetricsI = textPaint.getFontMetricsInt();
       p0.drawText(p1.subSequence(p2, p3).toString(), p4, (float)((p6 - (((((fontMetricsI.descent + p6) + p6) + fontMetricsI.ascent) / 2) - ((p7 + p5) / 2))) + 2), textPaint);
       return;
    }
    public int getSize(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       if (PatchProxy.isSupport(h.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          p4 = PatchProxy.apply(objArray, this, h.class, "1");
          if (p4 != PatchProxyResult.class) {
             return p4.intValue();
          }
       }
       return (int)this.a(p0).measureText(p1.subSequence(p2, p3).toString());
    }
}
