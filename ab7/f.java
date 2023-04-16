package ab7.f;
import java.util.concurrent.Callable;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.utility.Log;
import java.lang.System;
import com.kwai.middleware.resourcemanager.cache.adt.UnionResponse;
import db7.a;
import java.lang.StringBuilder;
import ekd.k1;

public final class f implements Callable	// class@000095
{
    public final BaseResourceCacheRepo b;

    public void f(BaseResourceCacheRepo p0){
       this.b = p0;
       super();
    }
    public Object call(){
       f tb = this.b;
       Log.g(tb.f(), "loadCache\(\) called");
       Log.g(tb.f(), "loadCache cost = "+k1.t(System.currentTimeMillis()));
       return tb.l.a();
    }
}
