package bp6.b2;
import i85.f;
import com.kwai.imsdk.internal.v;
import java.lang.StringBuilder;
import java.lang.String;
import xp6.k;
import java.util.concurrent.atomic.AtomicInteger;

public class b2 extends f	// class@000504
{
    public final v a;

    public void b2(v p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       k.a("onSendAvailable changed: "+p0);
       this.a.G((p0 ^ 0x01));
       if (p0) {
          this.a.e.set(0);
       }
       return;
    }
}
