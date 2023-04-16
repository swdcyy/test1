package id.p$a;
import id.k;
import id.i;
import tc.v;
import com.facebook.cache.common.CacheKey;
import java.lang.Object;
import bd.d;
import kd.b;
import java.lang.String;
import id.b;
import com.facebook.imageformat.a;
import com.facebook.common.references.a;

public class p$a extends k	// class@0021c4
{
    public final v c;
    public final CacheKey d;
    public final boolean e;
    public final boolean f;

    public void p$a(i p0,v p1,CacheKey p2,boolean p3,boolean p4){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public void i(Object p0,int p1){
       if (b.d()) {
          b.a("EncodedMemoryCacheProducer#onNewResultImpl");
       }
       if (!b.f(p1) && (p0 != null && (b.l(p1, 10) || p0.j() == a.c))) {
          this.n().d(p0, p1);
          if (b.d()) {
          label_0066 :
             b.b();
          }
       }else {
          a uoa = p0.e();
          if (uoa != null) {
             p$a uoa1 = null;
             if (this.f != null && this.e != null) {
                uoa1 = this.c.j(this.d, uoa);
             }
             a.f(uoa);
             if (uoa1 != null) {
                d uod = new d(uoa1);
                uod.c(p0);
                a.f(uoa1);
                this.n().a(0x3f800000);
                this.n().d(uod, p1);
                d.b(uod);
                if (b.d()) {
                   goto label_0066 ;
                }
             }
          }
          this.n().d(p0, p1);
          if (b.d()) {
             goto label_0066 ;
          }
       }
    label_0095 :
       return;
    }
}
