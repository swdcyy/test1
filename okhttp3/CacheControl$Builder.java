package okhttp3.CacheControl$Builder;
import java.lang.Object;
import okhttp3.CacheControl;
import java.util.concurrent.TimeUnit;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class CacheControl$Builder	// class@00205d
{
    public boolean immutable;
    public int maxAgeSeconds;
    public int maxStaleSeconds;
    public int minFreshSeconds;
    public boolean noCache;
    public boolean noStore;
    public boolean noTransform;
    public boolean onlyIfCached;

    public void CacheControl$Builder(){
       super();
       this.maxAgeSeconds = -1;
       this.maxStaleSeconds = -1;
       this.minFreshSeconds = -1;
    }
    public CacheControl build(){
       return new CacheControl(this);
    }
    public CacheControl$Builder immutable(){
       this.immutable = true;
       return this;
    }
    public CacheControl$Builder maxAge(int p0,TimeUnit p1){
       if (p0 < 0) {
          throw new IllegalArgumentException("maxAge < 0: "+p0);
       }
       long l = p1.toSeconds((long)p0);
       l = (l - 0x7fffffff > 0)? Integer.MAX_VALUE: (int)l;
       this.maxAgeSeconds = l;
       return this;
    }
    public CacheControl$Builder maxStale(int p0,TimeUnit p1){
       if (p0 < 0) {
          throw new IllegalArgumentException("maxStale < 0: "+p0);
       }
       long l = p1.toSeconds((long)p0);
       l = (l - 0x7fffffff > 0)? Integer.MAX_VALUE: (int)l;
       this.maxStaleSeconds = l;
       return this;
    }
    public CacheControl$Builder minFresh(int p0,TimeUnit p1){
       if (p0 < 0) {
          throw new IllegalArgumentException("minFresh < 0: "+p0);
       }
       long l = p1.toSeconds((long)p0);
       l = (l - 0x7fffffff > 0)? Integer.MAX_VALUE: (int)l;
       this.minFreshSeconds = l;
       return this;
    }
    public CacheControl$Builder noCache(){
       this.noCache = true;
       return this;
    }
    public CacheControl$Builder noStore(){
       this.noStore = true;
       return this;
    }
    public CacheControl$Builder noTransform(){
       this.noTransform = true;
       return this;
    }
    public CacheControl$Builder onlyIfCached(){
       this.onlyIfCached = true;
       return this;
    }
}
