package in8.b;
import in8.m;
import com.facebook.react.bridge.ReadableMap;
import hn8.b;
import java.lang.String;
import hn8.a;
import in8.b$a;
import java.lang.Object;
import java.lang.Double;
import android.graphics.PointF;
import java.lang.Math;

public class b extends m	// class@0026b5
{
    public final int a;
    public final b$a b;

    public void b(int p0,ReadableMap p1,b p2){
       super(p0, p1, p2);
       this.a = a.a(p1, "input", "Reanimated: Argument passed to bezier node is either of wrong type or is missing.");
       this.b = new b$a((float)p1.getDouble("mX1"), (float)p1.getDouble("mY1"), (float)p1.getDouble("mX2"), (float)p1.getDouble("mY2"));
    }
    public Object evaluate(){
       b$a a;
       float f3;
       float f6;
       b tb = this.b;
       float f = this.mNodesManager.b(this.a).floatValue();
       b$a uoa = 1;
       float f1 = f;
       float f2 = 0x3f800000;
       while (uoa < 14) {
          b$a e = tb.e;
          a = tb.a;
          f3 = a.x * 3.00f;
          e.x = f3;
          b$a d = tb.d;
          float f4 = tb.b.x - a.x;
          f4 = f4 * 3.00f;
          f4 = f4 - f3;
          d.x = f4;
          f3 = f2 - e.x;
          f3 = f3 - f4;
          tb.c.x = f3;
          f3 = f3 * f1;
          float f5 = d.x + f3;
          f5 = f5 * f1;
          f6 = e.x + f5;
          f6 = f6 * f1;
          f6 = f6 - f;
          if ((double)Math.abs(f6) - 0x3f50624dd2f1a9fc < 0) {
             break ;
          }else {
             f5 = tb.d.x * 2.00f;
             f3 = tb.c.x * 3.00f;
             f3 = f3 * f1;
             f5 = f5 + f3;
             f5 = f5 * f1;
             f2 = tb.e.x + f5;
             f6 = f6 / f2;
             f1 = f1 - f6;
             uoa = uoa + 1;
          }
       }
       b$a e1 = tb.e;
       uoa = tb.a;
       f6 = uoa.y * 3.00f;
       e1.y = f6;
       a = tb.d;
       f3 = ((tb.b.y - uoa.y) * 3.00f) - f6;
       a.y = f3;
       f2 = (f2 - e1.y) - f3;
       tb.c.y = f2;
       return Double.valueOf((double)(f1 * (e1.y + ((a.y + (f2 * f1)) * f1))));
    }
}
