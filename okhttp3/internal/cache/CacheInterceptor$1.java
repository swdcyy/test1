package okhttp3.internal.cache.CacheInterceptor$1;
import okio.n;
import okhttp3.internal.cache.CacheInterceptor;
import okio.d;
import okhttp3.internal.cache.CacheRequest;
import okio.c;
import java.lang.Object;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okio.b;
import okio.m;
import okio.o;

public class CacheInterceptor$1 implements n	// class@001f73
{
    public boolean cacheRequestClosed;
    public final CacheInterceptor this$0;
    public final c val$cacheBody;
    public final CacheRequest val$cacheRequest;
    public final d val$source;

    public void CacheInterceptor$1(CacheInterceptor p0,d p1,CacheRequest p2,c p3){
       this.this$0 = p0;
       this.val$source = p1;
       this.val$cacheRequest = p2;
       this.val$cacheBody = p3;
       super();
    }
    public void close(){
       if (this.cacheRequestClosed == null && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
          this.cacheRequestClosed = true;
          this.val$cacheRequest.abort();
       }
       this.val$source.close();
       return;
    }
    public long read(b p0,long p1){
       boolean b = true;
       try{
          p1 = this.val$source.read(p0, p1);
          if (!p1 - -1) {
             if (this.cacheRequestClosed == null) {
                this.cacheRequestClosed = b;
                this.val$cacheBody.close();
             }
             return -1;
          }else {
             p0.f(this.val$cacheBody.buffer(), (p0.p() - p1), p1);
             this.val$cacheBody.emitCompleteSegments();
             return p1;
          }
       }catch(java.io.IOException e9){
          if (this.cacheRequestClosed == null) {
             this.cacheRequestClosed = b;
             this.val$cacheRequest.abort();
          }
          throw e9;
       }
    }
    public o timeout(){
       return this.val$source.timeout();
    }
}
