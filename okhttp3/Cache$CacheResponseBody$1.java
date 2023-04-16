package okhttp3.Cache$CacheResponseBody$1;
import okio.g;
import okhttp3.Cache$CacheResponseBody;
import okio.n;
import okhttp3.internal.cache.DiskLruCache$Snapshot;

public class Cache$CacheResponseBody$1 extends g	// class@001f33
{
    public final Cache$CacheResponseBody this$0;
    public final DiskLruCache$Snapshot val$snapshot;

    public void Cache$CacheResponseBody$1(Cache$CacheResponseBody p0,n p1,DiskLruCache$Snapshot p2){
       this.this$0 = p0;
       this.val$snapshot = p2;
       super(p1);
    }
    public void close(){
       this.val$snapshot.close();
       super.close();
    }
}
