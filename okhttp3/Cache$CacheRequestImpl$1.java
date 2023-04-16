package okhttp3.Cache$CacheRequestImpl$1;
import okio.f;
import okhttp3.Cache$CacheRequestImpl;
import okio.m;
import okhttp3.Cache;
import okhttp3.internal.cache.DiskLruCache$Editor;

public class Cache$CacheRequestImpl$1 extends f	// class@001f31
{
    public final Cache$CacheRequestImpl this$1;
    public final DiskLruCache$Editor val$editor;
    public final Cache val$this$0;

    public void Cache$CacheRequestImpl$1(Cache$CacheRequestImpl p0,m p1,Cache p2,DiskLruCache$Editor p3){
       this.this$1 = p0;
       this.val$this$0 = p2;
       this.val$editor = p3;
       super(p1);
    }
    public void close(){
       Cache$CacheRequestImpl this$0 = this.this$1.this$0;
       _monitor_enter(this$0);
       Cache$CacheRequestImpl$1 tthis$1 = this.this$1;
       if (tthis$1.done != null) {
          _monitor_exit(this$0);
          return;
       }else {
          tthis$1.done = true;
          Cache$CacheRequestImpl this$01 = tthis$1.this$0;
          this$01.writeSuccessCount = this$01.writeSuccessCount + true;
          _monitor_exit(this$0);
          super.close();
          this.val$editor.commit();
          return;
       }
    }
}
