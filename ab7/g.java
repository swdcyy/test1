package ab7.g;
import erd.o;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.middleware.resourcemanager.cache.type.Result$SOURCE;
import com.kwai.middleware.resourcemanager.cache.type.Result;

public final class g implements o	// class@000096
{
    public final BaseResourceCacheRepo b;

    public void g(BaseResourceCacheRepo p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Object obj = p0;
       a.p(obj, "it");
       return BaseResourceCacheRepo.e(this.b, Result$SOURCE.CACHE, obj, false, 4, null);
    }
}
