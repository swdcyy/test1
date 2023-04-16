package m5a.d$a;
import d6a.a;
import m5a.d;
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

public class d$a extends a	// class@002f3b
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void F1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$a.class, "2")) {
          return;
       }
       d$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, d.class, "5")) {
          tb.P8();
          if (tb.G != null) {
             d w = tb.w;
             if (w != null) {
                tb.F.b.v(w);
             }
          }
       }
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$a.class, "1")) {
          return;
       }
       d$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, d.class, "4")) {
          tb.P8();
          d g = tb.G;
          if (g != null) {
             g.h(tb.q.getDetailCommonParam().getUnserializableBundleId());
             tb.G.g(tb.N);
             g = tb.w;
             if (g != null) {
                tb.F.b.m(g);
             }
          }
       }
       return;
    }
}
