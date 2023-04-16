package okhttp3.internal.cache.DiskLruCache$Editor;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.cache.DiskLruCache$Entry;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.io.File;
import okhttp3.internal.io.FileSystem;
import okio.m;
import okio.l;
import okhttp3.internal.cache.DiskLruCache$Editor$1;
import okio.n;

public final class DiskLruCache$Editor	// class@001f7b
{
    public boolean done;
    public final DiskLruCache$Entry entry;
    public final DiskLruCache this$0;
    public final boolean[] written;

    public void DiskLruCache$Editor(DiskLruCache p0,DiskLruCache$Entry p1){
       this.this$0 = p0;
       super();
       this.entry = p1;
       boolean[] uobooleanArr = (p1.readable != null)? null: new boolean[p0.valueCount];
       this.written = uobooleanArr;
       return;
    }
    public void abort(){
       DiskLruCache$Editor tthis$0 = this.this$0;
       _monitor_enter(tthis$0);
       if (this.done != null) {
          throw new IllegalStateException();
       }
       if (this.entry.currentEditor == this) {
          this.this$0.completeEdit(this, false);
       }
       this.done = true;
       _monitor_exit(tthis$0);
       return;
    }
    public void abortUnlessCommitted(){
       try{
          DiskLruCache$Editor tthis$0 = this.this$0;
          _monitor_enter(tthis$0);
          if (this.done == null && this.entry.currentEditor == this) {
             this.this$0.completeEdit(this, false);
          }
       label_0013 :
          _monitor_exit(e0);
          return;
       }catch(java.io.IOException e0){
       }
    }
    public void commit(){
       DiskLruCache$Editor tthis$0 = this.this$0;
       _monitor_enter(tthis$0);
       if (this.done != null) {
          throw new IllegalStateException();
       }
       if (this.entry.currentEditor == this) {
          this.this$0.completeEdit(this, true);
       }
       this.done = true;
       _monitor_exit(tthis$0);
       return;
    }
    public void detach(){
       if (this.entry.currentEditor == this) {
          int i = 0;
          DiskLruCache$Editor tthis$0 = this.this$0;
          while (i < tthis$0.valueCount) {
             try{
                tthis$0.fileSystem.delete(this.entry.dirtyFiles[i]);
                i = e0 + 1;
             }catch(java.io.IOException e0){
             }
          }
          this.entry.currentEditor = null;
       }
       return;
    }
    public m newSink(int p0){
       DiskLruCache$Editor tthis$0 = this.this$0;
       _monitor_enter(tthis$0);
       if (this.done != null) {
          throw new IllegalStateException();
       }
       DiskLruCache$Editor tentry = this.entry;
       if (tentry.currentEditor != this) {
          _monitor_exit(tthis$0);
          return l.b();
       }else if(tentry.readable == null){
          this.written[p0] = true;
       }
       object oobject = tentry.dirtyFiles[p0];
       try{
          _monitor_exit(tthis$0);
          return new DiskLruCache$Editor$1(this, this.this$0.fileSystem.sink(oobject));
       }catch(java.io.FileNotFoundException e0){
          _monitor_exit(e0);
          return l.b();
       }
    }
    public n newSource(int p0){
       DiskLruCache$Editor tthis$0 = this.this$0;
       _monitor_enter(tthis$0);
       if (this.done != null) {
          throw new IllegalStateException();
       }
       DiskLruCache$Editor tentry = this.entry;
       if (tentry.readable == null || tentry.currentEditor != this) {
          _monitor_exit(tthis$0);
          return null;
       }else {
          try{
             _monitor_exit(tthis$0);
             return this.this$0.fileSystem.source(tentry.cleanFiles[p0]);
          }catch(java.io.FileNotFoundException e0){
             _monitor_exit(e0);
             return v3;
          }
       }
    }
}
