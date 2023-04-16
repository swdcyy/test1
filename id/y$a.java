package id.y$a;
import id.k;
import id.i;
import com.facebook.cache.common.CacheKey;
import tc.v;
import java.lang.Object;
import com.facebook.common.references.a;
import id.b;

public class y$a extends k	// class@0021d2
{
    public final CacheKey c;
    public final boolean d;
    public final v e;
    public final boolean f;

    public void y$a(i p0,CacheKey p1,boolean p2,v p3,boolean p4){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public void i(Object p0,int p1){
       a uoa = null;
       if (p0 == null) {
          if (b.e(p1)) {
             this.n().d(uoa, p1);
          }
       }else if(b.f(p1) && this.d == null){
          if (this.f != null) {
             uoa = this.e.j(this.c, p0);
          }
          this.n().a(0x3f800000);
          i oi = this.n();
          if (uoa != null) {
             p0 = uoa;
          }
          oi.d(p0, p1);
          a.f(uoa);
       }
       return;
    }
}
