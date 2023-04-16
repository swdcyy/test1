package okhttp3.internal.cache.CacheStrategy;
import okhttp3.Request;
import okhttp3.Response;
import java.lang.Object;
import java.lang.String;
import okhttp3.CacheControl;

public final class CacheStrategy	// class@0020a6
{
    public final Response cacheResponse;
    public final Request networkRequest;

    public void CacheStrategy(Request p0,Response p1){
       super();
       this.networkRequest = p0;
       this.cacheResponse = p1;
    }
    public static boolean isCacheable(Response p0,Request p1){
       int i = p0.code();
       boolean b = false;
       if (i != 200 && (i != 410 && (i != 414 && (i != 501 && (i != 203 && i != 204))))) {
          if (i != 307) {
             if (i != 308 && (i != 404 && i != 405)) {
                switch (i){
                    case 300:
                    case 301:
                      break;
                    case 302:
                      break;
                    default:
                }
                return b;
             }
          }
          if (p0.header("Expires") != null || (p0.cacheControl().maxAgeSeconds() != -1 || (!p0.cacheControl().isPublic() && !p0.cacheControl().isPrivate()))) {
          }
       }
    label_005a :
       if (!p0.cacheControl().noStore() && !p1.cacheControl().noStore()) {
          b = true;
       }
       return b;
    }
}
