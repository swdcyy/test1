package d5.i;
import d5.f;
import java.util.List;
import android.graphics.PointF;
import android.graphics.PathMeasure;
import n5.a;
import java.lang.Object;
import d5.h;
import d5.a;
import java.lang.Float;
import n5.c;
import android.graphics.Path;

public class i extends f	// class@001e06
{
    public final PointF l;
    public final float[] m;
    public h n;
    public PathMeasure o;

    public void i(List p0){
       super(p0);
       this.l = new PointF();
       float[] uofloatArray = new float[2];
       this.m = uofloatArray;
       this.o = new PathMeasure();
    }
    public Object i(a p0,float p1){
       h oh = p0;
       h o = oh.o;
       if (o == null) {
          p0 = p0.b;
       }else {
          a te = this.e;
          if (te != null) {
             PointF pointF = te.a(oh.e, oh.f.floatValue(), oh.b, oh.c, this.e(), p1, this.f());
             if (pointF == null) {
             }
          }else if(this.n != oh){
             this.o.setPath(o, false);
             this.n = oh;
          }
          i to = this.o;
          to.getPosTan((p1 * to.getLength()), this.m, null);
          i tm = this.m;
          this.l.set(tm[0], tm[1]);
          to = this.l;
       }
       return p0;
    }
}
