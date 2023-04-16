package okhttp3.WebInternalCache;
import okhttp3.internal.cache.InternalCache;
import okhttp3.Cache;
import java.lang.Object;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;

public class WebInternalCache implements InternalCache	// class@001f67
{
    public final Cache mCache;

    public void WebInternalCache(Cache p0){
       super();
       this.mCache = p0;
    }
    public Response get(Request p0){
       return this.mCache.get(p0);
    }
    public CacheRequest put(Response p0){
       return this.mCache.put(p0);
    }
    public void remove(Request p0){
       this.mCache.remove(p0);
    }
    public void trackConditionalCacheHit(){
       this.mCache.trackConditionalCacheHit();
    }
    public void trackResponse(CacheStrategy p0){
       this.mCache.trackResponse(p0);
    }
    public void update(Response p0,Response p1){
       this.mCache.update(p0, p1);
    }
}
