package okhttp3.internal.cache.DiskLruCache$Snapshot;
import java.io.Closeable;
import okhttp3.internal.cache.DiskLruCache;
import java.lang.String;
import okio.n;
import java.lang.Object;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache$Editor;

public final class DiskLruCache$Snapshot implements Closeable	// class@001f7d
{
    public final String key;
    public final long[] lengths;
    public final long sequenceNumber;
    public final n[] sources;
    public final DiskLruCache this$0;

    public void DiskLruCache$Snapshot(DiskLruCache p0,String p1,long p2,n[] p3,long[] p4){
       this.this$0 = p0;
       super();
       this.key = p1;
       this.sequenceNumber = p2;
       this.sources = p3;
       this.lengths = p4;
    }
    public void close(){
       DiskLruCache$Snapshot tsources = this.sources;
       int len = tsources.length;
       for (int i = 0; i < len; i = i + 1) {
          Util.closeQuietly(tsources[i]);
       }
       return;
    }
    public DiskLruCache$Editor edit(){
       return this.this$0.edit(this.key, this.sequenceNumber);
    }
    public long getLength(int p0){
       return this.lengths[p0];
    }
    public n getSource(int p0){
       return this.sources[p0];
    }
    public String key(){
       return this.key;
    }
}
