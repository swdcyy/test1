package pb6.d;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.lang.Object;

public class d	// class@00218e
{
    public long delayTimeMs;
    public List featureName;
    public long randTimeMs;
    public static final long a;
    public static final long b;

    static {
       d.a = TimeUnit.MINUTES.toMillis(5);
       d.b = TimeUnit.SECONDS.toMillis(10);
    }
    public void d(List p0,long p1,long p2){
       super();
       this.featureName = p0;
       this.delayTimeMs = p1;
       this.randTimeMs = p2;
    }
    public final long a(long p0,long p1,long p2,long p3){
       if (p0 - p1 < 0 || p0 - p2 > 0) {
          return p3;
       }
       return p0;
    }
}
