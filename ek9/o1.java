package ek9.o1;
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

public class o1 extends ReplacementSpan	// class@002198
{
    public final int b;
    public final int c;
    public final int d;
    public boolean e;

    public void o1(int p0){
       super(0, p0, 0);
       this.e = false;
    }
    public void o1(int p0,int p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = true;
    }
    public void draw(Canvas p0,CharSequence p1,int p2,int p3,float p4,int p5,int p6,int p7,Paint p8){
       o1 oo1 = this;
       object oobject = p8;
       if (PatchProxy.isSupport(o1.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Float.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = oobject;
          if (PatchProxy.applyVoid(objArray, this, o1.class, "2")) {
             return;
          }
       }
       oobject.setColor(oo1.b);
       p0.drawText(p1, p2, p3, (p4 + (float)oo1.c), (float)(p6 + oo1.d), p8);
       if (oo1.e != null) {
          oobject.setColor(oo1.b);
          p0.drawText(p1, p2, p3, (p4 + (float)oo1.c), (float)(p6 + oo1.d), p8);
       }
       return;
    }
    public int getSize(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       if (PatchProxy.isSupport(o1.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          p4 = PatchProxy.apply(objArray, this, o1.class, "1");
          if (p4 != PatchProxyResult.class) {
             return p4.intValue();
          }
       }
       String str = p1.subSequence(p2, p3).toString();
       int i = (this.e != null)? (int)((float)this.c + p0.measureText(str)): this.c;
       return i;
    }
}
