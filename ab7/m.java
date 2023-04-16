package ab7.m;
import erd.o;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.Log;
import java.util.List;
import java.util.Collection;
import com.kwai.middleware.resourcemanager.cache.type.Result$SOURCE;
import com.kwai.middleware.resourcemanager.cache.type.Result;

public final class m implements o	// class@00009c
{
    public final BaseResourceCacheRepo b;

    public void m(BaseResourceCacheRepo p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "throwable");
       Log.b(this.b.f(), "onErrorReturn\(\) called");
       List list = this.b.c();
       list = (list == null || list.isEmpty())? 1: 0;
       if (!list) {
          m tb = this.b;
          return BaseResourceCacheRepo.e(tb, Result$SOURCE.CACHE, tb.c(), false, 4, null);
       }else {
          throw p0;
       }
    }
}
