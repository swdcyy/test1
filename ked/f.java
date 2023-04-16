package ked.f;
import erd.g;
import ked.h;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import nfd.k1;
import uy5.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import uy5.a;
import q87.c;

public final class f implements g	// class@00176e
{
    public final h b;

    public void f(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       boolean b = false;
       tb.v = b;
       k1.a(tb.u, "search_sky_fall_cdns_timeout", true);
       if (PatchProxy.applyVoidOneRefs("fail to prefetch cdns", null, b.class, "12")) {
       }else {
          b = new Object[b];
          a.C().A("search_sky_fall_cdns", "fail to prefetch cdns", b);
       }
       return;
    }
}
