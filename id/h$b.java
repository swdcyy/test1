package id.h$b;
import id.k;
import id.h;
import id.i;
import id.c0;
import id.h$a;
import java.lang.Throwable;
import id.b0;
import java.lang.Object;
import bd.d;
import com.facebook.imagepipeline.request.ImageRequest;
import id.b;
import uc.d;
import id.p0;

public class h$b extends k	// class@0021ac
{
    public c0 c;
    public final h d;

    public void h$b(h p0,i p1,c0 p2,h$a p3){
       this.d = p0;
       super(p1);
       this.c = p2;
    }
    public void h(Throwable p0){
       this.d.b.produceResults(this.n(), this.c);
    }
    public void i(Object p0,int p1){
       ImageRequest imageRequest = this.c.b();
       boolean b = b.e(p1);
       boolean b1 = p0.c(p0, imageRequest.p());
       if (p0 != null && (b1 || imageRequest.h())) {
          if (b && b1) {
             this.n().d(p0, p1);
          }else {
             this.n().d(p0, (p1 & 0xfe));
          }
       }
       if (b && !b1) {
          d.b(p0);
          this.d.b.produceResults(this.n(), this.c);
       }
       return;
    }
}
