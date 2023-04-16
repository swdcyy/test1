package ne.i;
import java.util.concurrent.Callable;
import com.facebook.react.modules.diskcache.MetaDiskCache;
import com.facebook.cache.common.CacheKey;
import java.lang.Object;
import ne.k;
import com.facebook.cache.disk.f;

public final class i implements Callable	// class@0026fc
{
    public final MetaDiskCache b;
    public final CacheKey c;

    public void i(MetaDiskCache p0,CacheKey p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       i tb = this.b;
       i tc = this.c;
       tb.e.c(tc);
       tb.a.g(tc);
       return null;
    }
}
