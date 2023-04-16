package ekd.b0;
import java.lang.Object;
import android.graphics.Rect;
import java.lang.String;
import java.lang.Integer;

public final class b0	// class@000d28
{
    public int a;
    public int b;

    public void b0(){
       super();
    }
    public void b0(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static Rect a(long p0,long p1,long p2,long p3){
       long l1;
       long l2;
       long l3;
       long l = 0;
       if (p0 - l && p1 - l) {
          l1 = p0 * p3;
          l2 = p2 * p1;
          l3 = 2;
          if (l1 - l2 > 0) {
             l2 = l2 / p0;
             l1 = (p3 - l2) / l3;
             l2 = l2 + l1;
             l3 = l1;
             l1 = p2;
          }else {
             l1 = l1 / p1;
             l2 = (p2 - l1) / l3;
             l1 = l1 + l2;
             l3 = l;
             l = l2;
             l2 = p3;
          }
       }else {
          l1 = p2;
          l2 = p3;
          l3 = l;
       }
       return new Rect((int)l, (int)l3, (int)l1, (int)l2);
    }
    public String toString(){
       Object[] objArray = new Object[]{Integer.valueOf(this.a),Integer.valueOf(this.b)};
       return String.format("Dimension[width=%d,height=%d]", objArray);
    }
}
