package a2b.g;
import erd.g;
import a2b.h;
import java.lang.Object;
import com.yxcorp.gifshow.local.sub.entrance.function.model.FunctionCardResponse;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import java.lang.System;
import java.lang.String;
import java.lang.reflect.Type;

public final class g implements g	// class@000028
{
    public final h b;

    public void g(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       FunctionCardResponse uFunctionCar = p0;
       this.b.R8(uFunctionCar);
       b.a(0x5f2ddeb4).c("nearby_topcard_cache", uFunctionCar, FunctionCardResponse.class, (System.currentTimeMillis() + 0x757b12c00));
    }
}
