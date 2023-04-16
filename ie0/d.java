package ie0.d;
import erd.o;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import java.lang.System;
import ce0.b;
import java.lang.StringBuilder;
import java.lang.Boolean;
import brd.t;

public final class d implements o	// class@0028a2
{
    public final long b;

    public void d(long p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          Object[] objArray = new Object[0];
          b.C().w("PendantCore", "‘§º”‘ÿ ±º‰:"+(System.currentTimeMillis() - this.b), objArray);
          ot = t.just(Boolean.TRUE);
       }
       return ot;
    }
}
