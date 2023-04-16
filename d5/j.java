package d5.j;
import d5.f;
import java.util.List;
import android.graphics.PointF;
import n5.a;
import java.lang.Object;
import d5.a;
import java.lang.Float;
import n5.c;
import java.lang.IllegalStateException;
import java.lang.String;

public class j extends f	// class@001e07
{
    public final PointF l;

    public void j(List p0){
       super(p0);
       this.l = new PointF();
    }
    public Object i(a p0,float p1){
       PointF pointF;
       a b = p0.b;
       if (b != null) {
          a c = p0.c;
          if (c != null) {
             a te = this.e;
             if (te != null) {
                pointF = te.a(p0.e, p0.f.floatValue(), b, c, p1, this.e(), this.f());
                if (pointF != null) {
                label_0043 :
                   return pointF;
                }
             }
             PointF x = b.x;
             PointF y = b.y;
             this.l.set((x + ((c.x - x) * p1)), (y + (p1 * (c.y - y))));
             pointF = this.l;
             goto label_0043 ;
          }
       }
       throw new IllegalStateException("Missing values for keyframe.");
    }
}
