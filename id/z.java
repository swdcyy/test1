package id.z;
import id.b0;
import sc.d;
import java.util.concurrent.Executor;
import java.lang.Object;
import ab.e;
import id.i;
import id.c0;
import id.e0;
import com.facebook.imagepipeline.request.ImageRequest;
import jd.c;
import id.z$b;
import jd.d;
import id.z$c;
import id.z$a;
import id.z$d;

public class z implements b0	// class@0021da
{
    public final b0 a;
    public final d b;
    public final Executor c;

    public void z(b0 p0,d p1,Executor p2){
       super();
       e.d(p0);
       this.a = p0;
       this.b = p1;
       e.d(p2);
       this.c = p2;
    }
    public void produceResults(i p0,c0 p1){
       c uoc = p1.b().j();
       z$b uob = new z$b(this, p0, p1.l(), uoc, p1);
       if (uoc instanceof d) {
          z$c uoc1 = new z$c(this, v9, uoc, p1, null);
       }else {
          z$d uod = new z$d(this, v9, null);
       }
       this.a.produceResults(uoc instanceof d, p1);
       return;
    }
}
