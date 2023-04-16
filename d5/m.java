package d5.m;
import d5.a;
import java.util.List;
import java.util.Collections;
import android.graphics.PointF;
import java.lang.Object;
import n5.a;
import java.lang.Float;
import d5.a$a;

public class m extends a	// class@001e0a
{
    public final PointF l;
    public final a m;
    public final a n;

    public void m(a p0,a p1){
       super(Collections.emptyList());
       this.l = new PointF();
       this.m = p0;
       this.n = p1;
       this.k(this.f());
    }
    public Object h(){
       return this.m(null, 0);
    }
    public Object i(a p0,float p1){
       return this.m(p0, p1);
    }
    public void k(float p0){
       this.m.k(p0);
       this.n.k(p0);
       this.l.set(this.m.h().floatValue(), this.n.h().floatValue());
       for (int i = 0; i < this.a.size(); i++) {
          this.a.get(i).e();
       }
       return;
    }
    public PointF m(a p0,float p1){
       return this.l;
    }
}
