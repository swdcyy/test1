package okhttp3.internal.cache.DiskLruCache$1;
import java.lang.Runnable;
import okhttp3.internal.cache.DiskLruCache;
import java.lang.Object;
import okio.m;
import okio.l;
import okio.c;

public class DiskLruCache$1 implements Runnable	// class@001f77
{
    public final DiskLruCache this$0;

    public void DiskLruCache$1(DiskLruCache p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       DiskLruCache$1 tthis$0 = this.this$0;
       _monitor_enter(tthis$0);
       DiskLruCache$1 tthis$01 = this.this$0;
       int i = (tthis$01.initialized == null)? 1: 0;
       if (i | tthis$01.closed) {
          _monitor_exit(tthis$0);
          return;
       }else {
          try{
             tthis$01.trimToSize();
          }catch(java.io.IOException e0){
             this.this$0.mostRecentTrimFailed = true;
          }
          try{
             if (this.this$0.journalRebuildRequired()) {
                this.this$0.rebuildJournal();
                this.this$0.redundantOpCount = 0;
             }
          }catch(java.io.IOException e0){
             tthis$01 = this.this$0;
             tthis$01.mostRecentRebuildFailed = true;
             tthis$01.journalWriter = l.c(l.b());
          }
          _monitor_exit(e0);
          return;
       }
    }
}
