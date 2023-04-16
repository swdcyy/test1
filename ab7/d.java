package ab7.d;
import erd.g;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.System;
import com.kwai.middleware.resourcemanager.cache.type.Result$SOURCE;
import java.util.List;
import com.yxcorp.utility.Log;
import com.kwai.middleware.resourcemanager.cache.type.RequestState;

public final class d implements g	// class@000093
{
    public final BaseResourceCacheRepo b;

    public void d(BaseResourceCacheRepo p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       String str = this.b.f();
       StringBuilder str1 = "fetch success cost="+(System.currentTimeMillis() - this.b.i)+" source="+p0.b()+' '+"isChanged="+p0.c()+' '+"size=";
       p0 = p0.a();
       int i = (p0 != null)? p0.size(): 0;
       Log.g(str, str1+i);
       i.c = RequestState.SUCCESS;
       return;
    }
}
