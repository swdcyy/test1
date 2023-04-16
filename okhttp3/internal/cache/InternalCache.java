package okhttp3.internal.cache.InternalCache;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;

public interface abstract InternalCache	// class@001f80
{

    Response get(Request p0);
    CacheRequest put(Response p0);
    void remove(Request p0);
    void trackConditionalCacheHit();
    void trackResponse(CacheStrategy p0);
    void update(Response p0,Response p1);
}
