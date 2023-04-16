package ab7.k;
import erd.o;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import brd.t;

public final class k implements o	// class@00009a
{
    public final BaseResourceCacheRepo b;

    public void k(BaseResourceCacheRepo p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "throwable");
       if (!this.b.c().isEmpty()) {
          return t.empty();
       }
       throw p0;
    }
}
