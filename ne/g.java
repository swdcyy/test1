package ne.g;
import java.lang.Runnable;
import com.facebook.react.modules.diskcache.MetaDiskCache;
import com.facebook.cache.common.CacheKey;
import ne.a;
import java.lang.Object;
import ne.k;

public final class g implements Runnable	// class@0026fa
{
    public final MetaDiskCache b;
    public final CacheKey c;
    public final a d;

    public void g(MetaDiskCache p0,CacheKey p1,a p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       g tb = this.b;
       g tc = this.c;
       g td = this.d;
       tb.i(tc, td);
       tb.e.d(tc, td);
       a.b(td);
    }
}
