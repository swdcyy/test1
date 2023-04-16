package bz7.b;
import erd.g;
import java.lang.Object;
import bz7.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bz7.d;
import java.util.Objects;
import java.lang.StringBuilder;
import java.util.List;
import java.lang.Integer;
import yz7.r;
import java.util.Collection;
import jr4.b$a;
import yz7.e;
import nz7.c;
import com.google.protobuf.nano.MessageNano;
import nz7.c$a;

public final class b implements g	// class@0003a5
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public void accept(Object p0){
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          d d = d.d;
          int i = 0;
          p0 = (p0 != null)? p0.a: i;
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoidOneRefs(p0, d, d.class, "3")) {
             StringBuilder str = "reportBatchEvents, start, size: ";
             if (p0) {
                i = Integer.valueOf(p0.size());
             }
             r.h("YodaBatchLogManager", str+i);
             b$a uoa = (!p0 || p0.isEmpty())? 1: null;
             if (!uoa) {
                uoa = new b$a();
                uoa.a = 2;
                uoa.b = d.a;
                uoa.f = e.f(p0);
                c.a.a(uoa, "YodaSDKSupplement", "hybrid_batch_stat_event");
             }
          }
       }
       return;
    }
}
