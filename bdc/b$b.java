package bdc.b$b;
import java.lang.Runnable;
import bdc.b;
import la6.b;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import ekd.k1;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import bdc.c;
import java.lang.reflect.Type;
import zcc.o;
import q87.c;

public final class b$b implements Runnable	// class@000451
{
    public final b b;
    public final b c;
    public final Class d;

    public void b$b(b p0,b p1,Class p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$b.class, "1")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       this.b.j("Cached saved", objArray1);
       Object obj = b.a(0x5f2ddeb4);
       String cacheKey = this.b.getCacheKey();
       b$b tc = this.c;
       b$b td = this.d;
       long l = k1.i();
       b$b tb = this.b;
       Objects.requireNonNull(tb);
       Object obj1 = PatchProxy.apply(objArray, tb, b.class, "6");
       long l1 = (obj1 != PatchProxyResult.class)? obj1.longValue(): tb.a.e;
       obj.c(cacheKey, tc, td, (l + l1));
       return;
    }
}
