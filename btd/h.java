package btd.h;
import java.lang.Object;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import kotlin.jvm.internal.a;

public class h	// class@0002e8
{

    public void h(){
       super();
    }
    public static void a(){
    }
    public static final double b(double p0,TimeUnit p1,TimeUnit p2){
       a.p(p1, "sourceUnit");
       a.p(p2, "targetUnit");
       long l = p2.convert(1, p1);
       if (l > 0) {
          return (p0 * (double)l);
       }
       return (p0 / (double)p1.convert(1, p2));
    }
}
