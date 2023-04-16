package g19.k$b;
import d6a.a;
import g19.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rf5.u;
import java.util.Objects;
import java.util.BitSet;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import androidx.fragment.app.Fragment;
import oo5.a;

public class k$b extends a	// class@0023c4
{
    public final k b;

    public void k$b(k p0){
       this.b = p0;
       super();
    }
    public void F1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k$b.class, "1")) {
          return;
       }
       k$b tb = this.b;
       boolean b = false;
       tb.w = b;
       if (tb.r.v()) {
          tb = this.b;
          Objects.requireNonNull(tb);
          k ok = k.class;
          if (!PatchProxy.applyVoid(objArray, tb, ok, "6")) {
             tb.y.clear();
             if (!PatchProxy.applyVoid(objArray, tb, ok, "5")) {
                if (tb.y.cardinality() > 0) {
                   tb.q.onNext(Boolean.FALSE);
                   a.e(tb.p, b);
                   if (tb.w != null && tb.x == null) {
                      tb.v = a.d(tb.p);
                      a.a(tb.p, 0);
                   }
                   tb.x = true;
                }else {
                   tb.q.onNext(Boolean.TRUE);
                   a.j(tb.p, b);
                   if (tb.w != null && tb.x != null) {
                      a.a(tb.p, tb.v);
                   }
                   tb.x = b;
                }
             }
             tb.P8(0x3f800000);
          }
       }
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, k$b.class, "2")) {
          return;
       }
       this.b.w = true;
       return;
    }
}
