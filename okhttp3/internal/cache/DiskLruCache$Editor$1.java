package okhttp3.internal.cache.DiskLruCache$Editor$1;
import okhttp3.internal.cache.FaultHidingSink;
import okhttp3.internal.cache.DiskLruCache$Editor;
import okio.m;
import java.io.IOException;

public class DiskLruCache$Editor$1 extends FaultHidingSink	// class@001f7a
{
    public final DiskLruCache$Editor this$1;

    public void DiskLruCache$Editor$1(DiskLruCache$Editor p0,m p1){
       this.this$1 = p0;
       super(p1);
    }
    public void onException(IOException p0){
       DiskLruCache$Editor this$0 = this.this$1.this$0;
       _monitor_enter(this$0);
       this.this$1.detach();
       _monitor_exit(this$0);
    }
}
