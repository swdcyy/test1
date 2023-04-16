package ab7.i;
import erd.o;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.middleware.resourcemanager.cache.type.Result$SOURCE;
import com.kwai.middleware.resourcemanager.cache.type.Result;

public final class i implements o	// class@000098
{
    public final BaseResourceCacheRepo b;
    public final CachePolicy c;

    public void i(BaseResourceCacheRepo p0,CachePolicy p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "it");
       i tb = this.b;
       Result$SOURCE nET = Result$SOURCE.NET;
       boolean b = (this.c == CachePolicy.CACHE_THEN_NETWORK)? true: false;
       return tb.d(nET, p0, b);
    }
}
