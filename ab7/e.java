package ab7.e;
import erd.g;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.System;
import com.yxcorp.utility.Log;
import com.kwai.middleware.resourcemanager.cache.type.RequestState;

public final class e implements g	// class@000094
{
    public final BaseResourceCacheRepo b;

    public void e(BaseResourceCacheRepo p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Log.d(this.b.f(), "fetch cost="+(System.currentTimeMillis() - this.b.i)+" error="+p0);
       p0.c = RequestState.FAILED;
    }
}
