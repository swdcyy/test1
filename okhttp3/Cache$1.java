package okhttp3.Cache$1;
import okhttp3.internal.cache.InternalCache;
import okhttp3.Cache;
import java.lang.Object;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;

public class Cache$1 implements InternalCache	// class@001f2f
{
    public final Cache this$0;

    public void Cache$1(Cache p0){
       this.this$0 = p0;
       super();
    }
    public Response get(Request p0){
       return this.this$0.get(p0);
    }
    public CacheRequest put(Response p0){
       return this.this$0.put(p0);
    }
    public void remove(Request p0){
       this.this$0.remove(p0);
    }
    public void trackConditionalCacheHit(){
       this.this$0.trackConditionalCacheHit();
    }
    public void trackResponse(CacheStrategy p0){
       this.this$0.trackResponse(p0);
    }
    public void update(Response p0,Response p1){
       this.this$0.update(p0, p1);
    }
}
