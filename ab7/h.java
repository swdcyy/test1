package ab7.h;
import erd.o;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.middleware.resourcemanager.cache.type.Result$SOURCE;
import java.util.ArrayList;
import java.util.List;
import com.kwai.middleware.resourcemanager.cache.type.Result;

public final class h implements o	// class@000097
{
    public final BaseResourceCacheRepo b;

    public void h(BaseResourceCacheRepo p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "it");
       return BaseResourceCacheRepo.e(this.b, Result$SOURCE.CACHE, new ArrayList(), false, 4, null);
    }
}
