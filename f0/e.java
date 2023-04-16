package f0.e;
import f0.f;
import java.lang.Object;
import f0.f$a;
import java.lang.AssertionError;

public final class e	// class@001fa6
{

    public static boolean a(f p0){
       Object obj = p0.get();
       if (!f$a.a && obj != p0.get()) {
          throw new AssertionError("Value provided by #get\(\) must not change.");
       }
       boolean b = (obj != null)? true: false;
       return b;
    }
}
