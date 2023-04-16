package er.i;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import er.c;

public abstract class i	// class@001590
{
    public static final long a;
    public static final long b;
    public static final long c;

    static {
       TimeUnit sECONDS = TimeUnit.SECONDS;
       i.a = sECONDS.toMillis(5);
       i.b = sECONDS.toMillis(1);
       i.c = sECONDS.toMillis(10);
    }
    public void i(){
       super();
    }
    public static i a(long p0,long p1,long p2,long p3){
       Object obj;
       if (PatchProxy.isSupport(i.class)) {
          obj = PatchProxy.applyFourRefs(Long.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), Long.valueOf(p3), null, i.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       c uoc = new c(p0, p1, p2, p3);
       return obj;
    }
    public abstract long b();
    public abstract long c();
    public abstract long d();
    public abstract long e();
}
