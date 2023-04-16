package ed.y;
import eb.b;
import com.facebook.common.memory.MemoryTrimType;
import java.util.concurrent.Semaphore;
import fb.b;

public class y implements b	// class@001f3a
{
    public final int a;
    public final int b;
    public final b c;
    public final Semaphore d;
    public final c e;

    public void o(MemoryTrimType p0){
       if (!this.d.tryAcquire()) {
          return;
       }
       this.c.a();
       this.d.release();
       return;
    }
}
