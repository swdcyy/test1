package id.n0$a;
import id.k;
import id.n0;
import id.i;
import id.c0;
import com.facebook.imagepipeline.request.ImageRequest;
import uc.d;
import java.lang.Throwable;
import java.lang.Object;
import bd.d;
import id.b;
import id.p0;

public class n0$a extends k	// class@0021bf
{
    public final c0 c;
    public final int d;
    public final d e;
    public final n0 f;

    public void n0$a(n0 p0,i p1,c0 p2,int p3){
       this.f = p0;
       super(p1);
       this.c = p2;
       this.d = p3;
       this.e = p2.b().p();
    }
    public void h(Throwable p0){
       if (!this.f.b((this.d + 1), this.n(), this.c)) {
          this.n().onFailure(p0);
       }
       return;
    }
    public void i(Object p0,int p1){
       if (p0 != null && (b.f(p1) || p0.c(p0, this.e))) {
          this.n().d(p0, p1);
       }else if(b.e(p1)){
          d.b(p0);
          if (!this.f.b((this.d + 1), this.n(), this.c)) {
             this.n().d(null, 1);
          }
       }
       return;
    }
}
