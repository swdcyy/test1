package id.n0;
import id.b0;
import id.o0;
import java.lang.Object;
import ab.e;
import id.i;
import id.c0;
import com.facebook.imagepipeline.request.ImageRequest;
import uc.d;
import id.n0$a;

public class n0 implements b0	// class@0021c0
{
    public final o0[] a;

    public void n0(o0[] p0){
       super();
       e.d(p0);
       this.a = p0;
       e.c(0, p0.length);
    }
    public boolean b(int p0,i p1,c0 p2){
       d uod = p2.b().p();
       while (true) {
          n0 ta = this.a;
          if (p0 < ta.length) {
             if (ta[p0].a(uod)) {
             label_001b :
                if (p0 == -1) {
                   break ;
                }else {
                   this.a[p0].produceResults(new n0$a(this, p1, p2, p0), p2);
                   return true;
                }
             }else {
                p0++;
             }
          }else {
             p0 = -1;
             goto label_001b ;
          }
       }
       return false;
    }
    public void produceResults(i p0,c0 p1){
       if (p1.b().p() == null) {
          p0.d(null, 1);
       }else if(!this.b(0, p0, p1)){
          p0.d(null, 1);
       }
       return;
    }
}
