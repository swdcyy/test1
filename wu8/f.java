package wu8.f;
import java.util.concurrent.TimeUnit;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import yb7.n;
import java.lang.Boolean;

public class f	// class@002788
{
    public static final long a;
    public static Boolean b;
    public static boolean c;

    static {
       f.a = TimeUnit.MINUTES.toMillis(30);
       f.b = null;
       f.c = false;
    }
    public static boolean a(){
       return Azeroth2.B.u();
    }
    public static boolean b(){
       return f.c;
    }
    public static boolean c(){
       if (f.b == null) {
          f.b = Boolean.valueOf((n.c(Azeroth2.B.d()) ^ 0x01));
       }
       return f.b.booleanValue();
    }
}
