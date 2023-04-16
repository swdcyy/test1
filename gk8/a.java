package gk8.a;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.soc.arch.rubas.base.Rubas;
import ek8.c;
import ek8.e;
import java.lang.StringBuilder;

public final class a	// class@00248f
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static void a(a p0,String p1,Object p2,Object p3,String p4,int p5,Object p6){
       p4 = null;
       if (p5 & 0x02) {
          p2 = p4;
       }
       Objects.requireNonNull(p0);
       a.p(p1, "event");
       Rubas.e(p1, p2, p4, p4);
       c.b.b(e.a("Report"), "[Report]report event["+p1+"],payload["+p2+"]]");
       return;
    }
}
