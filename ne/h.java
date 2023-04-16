package ne.h;
import java.util.concurrent.Callable;
import com.facebook.react.modules.diskcache.MetaDiskCache;
import com.facebook.cache.common.CacheKey;
import java.lang.Object;
import com.facebook.cache.disk.f;

public final class h implements Callable	// class@0026fb
{
    public final MetaDiskCache b;
    public final CacheKey c;

    public void h(MetaDiskCache p0,CacheKey p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       this.b.a.h(this.c);
       return null;
    }
}
