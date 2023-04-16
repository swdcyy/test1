package id.w;
import id.b0;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.io.Closeable;
import id.w$a;
import java.util.Map;
import id.c0;
import id.i;
import kd.b;
import id.e0;
import com.facebook.common.util.TriState;

public abstract class w implements b0	// class@0021d0
{
    public final String mDedupedRequestsCountKey;
    public final b0 mInputProducer;
    public final boolean mKeepCancelledFetchAsLowPriority;
    public final Map mMultiplexers;
    public final String mProducerName;

    public void w(b0 p0,String p1,String p2){
       super(p0, p1, p2, false);
    }
    public void w(b0 p0,String p1,String p2,boolean p3){
       super();
       this.mInputProducer = p0;
       this.mMultiplexers = new HashMap();
       this.mKeepCancelledFetchAsLowPriority = p3;
       this.mProducerName = p1;
       this.mDedupedRequestsCountKey = p2;
    }
    public abstract Closeable cloneOrNull(Closeable p0);
    public synchronized final w$a createAndPutNewMultiplexer(Object p0){
       w$a uoa = new w$a(this, p0);
       this.mMultiplexers.put(p0, uoa);
       return uoa;
    }
    public synchronized w$a getExistingMultiplexer(Object p0){
       return this.mMultiplexers.get(p0);
    }
    public abstract Object getKey(c0 p0);
    public void produceResults(i p0,c0 p1){
       w$a existingMult;
       if (b.d()) {
          b.a("MultiplexProducer#produceResults");
       }
       p1.l().onProducerStart(p1, this.mProducerName);
       Object key = this.getKey(p1);
       do {
          int i = 0;
          _monitor_enter(this);
          existingMult = this.getExistingMultiplexer(key);
          if (existingMult == null) {
             existingMult = this.createAndPutNewMultiplexer(key);
             i = 1;
          }
          _monitor_exit(this);
       } while (existingMult.a(p0, p1));
       if (i) {
          existingMult.i(TriState.valueOf(p1.p()));
       }
       if (b.d()) {
          b.b();
       }
       return;
    }
    public synchronized void removeMultiplexer(Object p0,w$a p1){
       if (this.mMultiplexers.get(p0) == p1) {
          this.mMultiplexers.remove(p0);
       }
       return;
    }
}
