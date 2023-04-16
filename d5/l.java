package d5.l;
import d5.a;
import java.util.List;
import i5.g;
import android.graphics.Path;
import n5.a;
import java.lang.Object;
import android.graphics.PointF;
import java.lang.StringBuilder;
import java.lang.String;
import a5.d;
import java.lang.Math;
import g5.a;
import m5.e;

public class l extends a	// class@001e09
{
    public final g l;
    public final Path m;

    public void l(List p0){
       super(p0);
       this.l = new g();
       this.m = new Path();
    }
    public Object i(a p0,float p1){
       int i2;
       a b = p0.b;
       p0 = p0.c;
       l tl = this.l;
       if (tl.b == null) {
          tl.b = new PointF();
       }
       int i = 0;
       int i1 = 1;
       int b1 = (b.c() || p0.c())? true: false;
       tl.c = b1;
       if (b.a().size() != p0.a().size()) {
          d.c("Curves must have the same number of control points. Shape 1: "+b.a().size()+"\tShape 2: "+p0.a().size());
       }
       b1 = Math.min(b.a().size(), p0.a().size());
       if (tl.a.size() < b1) {
          for (i2 = tl.a.size(); i2 < b1; i2 = i2 + 1) {
             tl.a.add(new a());
          }
       }else if(tl.a.size() > b1){
          for (i2 = tl.a.size() - i1; i2 >= b1; i2 = i2 - 1) {
             g a = tl.a;
             int i3 = a.size() - i1;
             a.remove(i3);
          }
       }
       PointF pointF = b.b();
       PointF pointF1 = p0.b();
       float f = e.e(pointF.x, pointF1.x, p1);
       float f1 = e.e(pointF.y, pointF1.y, p1);
       if (tl.b == null) {
          tl.b = new PointF();
       }
       tl.b.set(f, f1);
       for (b1 = tl.a.size() - i1; b1 >= 0; b1 = b1 - 1) {
          a uoa = b.a().get(b1);
          a uoa1 = p0.a().get(b1);
          PointF pointF2 = uoa.a();
          PointF pointF3 = uoa.b();
          PointF pointF4 = uoa.c();
          PointF pointF5 = uoa1.a();
          PointF pointF6 = uoa1.b();
          pointF1 = uoa1.c();
          tl.a.get(b1).a.set(e.e(pointF2.x, pointF5.x, p1), e.e(pointF2.y, pointF5.y, p1));
          tl.a.get(b1).b.set(e.e(pointF3.x, pointF6.x, p1), e.e(pointF3.y, pointF6.y, p1));
          tl.a.get(b1).c.set(e.e(pointF4.x, pointF1.x, p1), e.e(pointF4.y, pointF1.y, p1));
       }
       l tl1 = this.l;
       l tm = this.m;
       tm.reset();
       PointF pointF7 = tl1.b();
       tm.moveTo(pointF7.x, pointF7.y);
       e.a.set(pointF7.x, pointF7.y);
       for (; i < tl1.a().size(); i = i + 1) {
          b = tl1.a().get(i);
          PointF pointF8 = b.a();
          pointF = b.b();
          pointF7 = b.c();
          if (pointF8.equals(e.a) && pointF.equals(pointF7)) {
             tm.lineTo(pointF7.x, pointF7.y);
          }else {
             tm.cubicTo(pointF8.x, pointF8.y, pointF.x, pointF.y, pointF7.x, pointF7.y);
          }
          e.a.set(pointF7.x, pointF7.y);
       }
       if (tl1.c()) {
          tm.close();
       }
       return this.m;
    }
}
