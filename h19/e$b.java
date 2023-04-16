package h19.e$b;
import d6a.a;
import h19.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ge5.d;
import joc.b0;
import joc.c;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import joc.g;
import foc.m$d;

public class e$b extends a	// class@00253c
{
    public final e b;

    public void e$b(e p0){
       this.b = p0;
       super();
    }
    public void F1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e$b.class, "2")) {
          return;
       }
       e$b tb = this.b;
       tb.C = false;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, e.class, "5")) {
          tb.P8();
          if (tb.B != null) {
             e v = tb.v;
             if (v != null) {
                tb.F.b.v(v);
             }
          }
       }
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e$b.class, "1")) {
          return;
       }
       e$b tb = this.b;
       tb.C = true;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, e.class, "4")) {
          tb.P8();
          e b = tb.B;
          if (b != null) {
             b.h(tb.q.getDetailCommonParam().getUnserializableBundleId());
             tb.B.g(tb.I);
             b = tb.v;
             if (b != null) {
                tb.F.b.m(b);
             }
          }
       }
       return;
    }
}
