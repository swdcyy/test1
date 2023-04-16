package okhttp3.Cache$CacheRequestImpl;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.Cache;
import okhttp3.internal.cache.DiskLruCache$Editor;
import java.lang.Object;
import okio.m;
import okhttp3.Cache$CacheRequestImpl$1;
import java.io.Closeable;
import okhttp3.internal.Util;

public final class Cache$CacheRequestImpl implements CacheRequest	// class@001f32
{
    public m body;
    public m cacheOut;
    public boolean done;
    public final DiskLruCache$Editor editor;
    public final Cache this$0;

    public void Cache$CacheRequestImpl(Cache p0,DiskLruCache$Editor p1){
       this.this$0 = p0;
       super();
       this.editor = p1;
       m om = p1.newSink(1);
       this.cacheOut = om;
       this.body = new Cache$CacheRequestImpl$1(this, om, p0, p1);
    }
    public void abort(){
       Cache$CacheRequestImpl tthis$0 = this.this$0;
       _monitor_enter(tthis$0);
       if (this.done != null) {
          _monitor_exit(tthis$0);
          return;
       }else {
          this.done = true;
          Cache$CacheRequestImpl tthis$01 = this.this$0;
          tthis$01.writeAbortCount = tthis$01.writeAbortCount + true;
          _monitor_exit(tthis$0);
          tthis$0 = this.cacheOut;
          try{
             Util.closeQuietly(tthis$0);
             this.editor.abort();
             return;
          }catch(java.io.IOException e0){
          }
       }
    }
    public m body(){
       return this.body;
    }
}
