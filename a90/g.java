package a90.g;
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
import android.text.TextPaint;
import android.graphics.Paint$FontMetricsInt;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class g extends ReplacementSpan	// class@000105
{
    public int b;

    public void g(){
       super();
       this.b = 0;
    }
    public void g(int p0){
       super();
       this.b = 0;
       this.b = p0;
    }
    public void draw(Canvas p0,CharSequence p1,int p2,int p3,float p4,int p5,int p6,int p7,Paint p8){
       if (PatchProxy.isSupport(g.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, g.class, "2")) {
             return;
          }
       }
       TextPaint textPaint = new TextPaint(p8);
       textPaint.setFakeBoldText(0);
       p0.drawText(p1.subSequence(p2, p3).toString(), p4, (float)(p6 + this.b), textPaint);
       return;
    }
    public int getSize(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       if (PatchProxy.isSupport(g.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, g.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0.getFontMetricsInt(p4);
       return (int)p0.measureText(p1.subSequence(p2, p3).toString());
    }
}
