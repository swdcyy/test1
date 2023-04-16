package okhttp3.Cache$2;
import java.util.Iterator;
import okhttp3.Cache;
import java.lang.Object;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.cache.DiskLruCache$Snapshot;
import okio.n;
import okio.d;
import okio.l;
import cud.k;
import java.lang.String;
import java.util.NoSuchElementException;
import java.lang.IllegalStateException;

public class Cache$2 implements Iterator	// class@001f30
{
    public boolean canRemove;
    public final Iterator delegate;
    public String nextUrl;
    public final Cache this$0;

    public void Cache$2(Cache p0){
       this.this$0 = p0;
       super();
       this.delegate = p0.cache.snapshots();
    }
    public boolean hasNext(){
       if (this.nextUrl != null) {
          return true;
       }
       this.canRemove = false;
    label_0009 :
       if (!this.delegate.hasNext()) {
          return false;
       }
       DiskLruCache$Snapshot snapshot = this.delegate.next();
       try{
          this.nextUrl = l.d(snapshot.getSource(false)).readUtf8LineStrict();
          snapshot.close();
          return true;
       }catch(java.io.IOException e0){
          snapshot.close();
          goto label_0009 ;
       }
    }
    public Object next(){
       return this.next();
    }
    public String next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       Cache$2 tnextUrl = this.nextUrl;
       this.nextUrl = null;
       this.canRemove = true;
       return tnextUrl;
    }
    public void remove(){
       if (this.canRemove == null) {
          throw new IllegalStateException("remove\(\) before next\(\)");
       }
       this.delegate.remove();
       return;
    }
}
