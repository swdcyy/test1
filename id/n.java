package id.n;
import id.b0;
import tc.g;
import tc.h;
import java.lang.Object;
import id.i;
import id.c0;
import com.facebook.imagepipeline.request.ImageRequest$RequestLevel;
import java.lang.String;
import com.facebook.imagepipeline.request.ImageRequest;
import id.n$b;
import id.n$a;

public class n implements b0	// class@0021c1
{
    public final g a;
    public final g b;
    public final h c;
    public final b0 d;

    public void n(g p0,g p1,h p2,b0 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void produceResults(i p0,c0 p1){
       n$b uob1;
       if (p1.q().getValue() >= ImageRequest$RequestLevel.DISK_CACHE.getValue()) {
          p1.n("disk", "nil-result_write");
          p0.d(null, 1);
       }else if(p1.b().u()){
          n$b uob = new n$b(p0, p1, this.a, this.b, this.c, null);
          uob1 = v0;
       }
       this.d.produceResults(uob1, p1);
       return;
    }
}
