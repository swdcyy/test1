package okhttp3.internal.cache.DiskLruCache$3;
import java.util.Iterator;
import okhttp3.internal.cache.DiskLruCache;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import okhttp3.internal.cache.DiskLruCache$Entry;
import okhttp3.internal.cache.DiskLruCache$Snapshot;
import java.util.NoSuchElementException;
import java.lang.String;
import java.lang.IllegalStateException;

public class DiskLruCache$3 implements Iterator	// class@001f79
{
    public final Iterator delegate;
    public DiskLruCache$Snapshot nextSnapshot;
    public DiskLruCache$Snapshot removeSnapshot;
    public final DiskLruCache this$0;

    public void DiskLruCache$3(DiskLruCache p0){
       this.this$0 = p0;
       super();
       this.delegate = new ArrayList(p0.lruEntries.values()).iterator();
    }
    public boolean hasNext(){
       DiskLruCache$Snapshot snapshot;
       if (this.nextSnapshot != null) {
          return true;
       }
       DiskLruCache$3 tthis$0 = this.this$0;
       _monitor_enter(tthis$0);
       if (this.this$0.closed != null) {
          _monitor_exit(tthis$0);
          return false;
       }else {
          while (true) {
             if (this.delegate.hasNext()) {
                DiskLruCache$Entry uEntry = this.delegate.next();
                if (uEntry.readable == null) {
                   continue ;
                }else {
                   snapshot = uEntry.snapshot();
                   if (snapshot == null) {
                      continue ;
                   }else {
                      break ;
                   }
                }
             }else {
                _monitor_exit(tthis$0);
                return false;
             }
          }
          this.nextSnapshot = snapshot;
          _monitor_exit(tthis$0);
          return true;
       }
    }
    public Object next(){
       return this.next();
    }
    public DiskLruCache$Snapshot next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       DiskLruCache$3 tnextSnapsho = this.nextSnapshot;
       this.removeSnapshot = tnextSnapsho;
       this.nextSnapshot = null;
       return tnextSnapsho;
    }
    public void remove(){
       DiskLruCache$3 tremoveSnaps = this.removeSnapshot;
       if (tremoveSnaps == null) {
          throw new IllegalStateException("remove\(\) before next\(\)");
       }
       DiskLruCache$Snapshot snapshot = null;
       try{
          this.this$0.remove(tremoveSnaps.key);
          this.removeSnapshot = snapshot;
          return;
       }catch(java.io.IOException e0){
       }
    }
}
