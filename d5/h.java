package d5.h;
import n5.a;
import a5.e;
import java.lang.Object;
import android.view.animation.Interpolator;
import java.lang.Float;
import android.graphics.PointF;
import m5.f;
import android.graphics.Path;

public class h extends a	// class@001e05
{
    public Path o;
    public final a p;

    public void h(e p0,a p1){
       super(p0, p1.b, p1.c, p1.d, p1.e, p1.f);
       this.p = p1;
       this.e();
    }
    public void e(){
       a tc = this.c;
       if (tc != null) {
          a tb = this.b;
          if (tb != null && tb.equals(tc.x, tc.y)) {
             tc = 1;
          label_001c :
             tb = this.c;
             if (tb != null && !tc) {
                tc = this.b;
                h tp = this.p;
                a m = tp.m;
                a n = tp.n;
                Path path = new Path();
                path.moveTo(tc.x, tc.y);
                if (m != null && n != null) {
                   PointF pointF = null;
                   if (m.length() - pointF || n.length() - pointF) {
                      PointF x = tb.x;
                      PointF y = tb.y;
                      path.cubicTo((m.x + tc.x), (tc.y + m.y), (x + n.x), (y + n.y), x, y);
                   label_0074 :
                      this.o = path;
                   }
                }
                path.lineTo(tb.x, tb.y);
                goto label_0074 ;
             }
             return;
          }
       }
       tc = null;
       goto label_001c ;
    }
}
