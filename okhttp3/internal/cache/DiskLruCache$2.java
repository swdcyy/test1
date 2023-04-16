package okhttp3.internal.cache.DiskLruCache$2;
import okhttp3.internal.cache.FaultHidingSink;
import okhttp3.internal.cache.DiskLruCache;
import okio.m;
import java.io.IOException;

public class DiskLruCache$2 extends FaultHidingSink	// class@001f78
{
    public final DiskLruCache this$0;
    public static final boolean $assertionsDisabled;

    static {
    }
    public void DiskLruCache$2(DiskLruCache p0,m p1){
       this.this$0 = p0;
       super(p1);
    }
    public void onException(IOException p0){
       p0.hasJournalErrors = true;
    }
}
