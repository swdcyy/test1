package lk0.g;
import rg.e;
import rg.d;
import com.kuaishou.krn.utils.a;
import rg.d$d;
import com.kuaishou.krn.c;
import kj0.l;
import kj0.j;
import java.lang.String;
import android.os.Build$VERSION;
import android.os.Build;
import java.util.Locale;
import java.lang.CharSequence;
import java.lang.Object;

public final class g	// class@002f89
{
    public static e a;
    public static String b;

    static {
       e uoe = d.c();
       uoe.l(a.a);
       g.a = uoe;
       g.b = c.b().g().getCommonParams().getAppVersion();
       if (Build$VERSION.SDK_INT < 23 && !((Build.MANUFACTURER).toLowerCase(Locale.US)).contains("gionee")) {
          g.a.c();
          g.b = null;
       }
    }
    public void g(){
       super();
    }
}
