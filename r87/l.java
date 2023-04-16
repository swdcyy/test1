package r87.l;
import java.util.ArrayList;
import q87.d;
import java.lang.Object;
import java.util.List;
import r87.o;
import com.kwai.logger.KwaiLog;
import q87.b;
import java.lang.String;
import com.kwai.logger.internal.LogService;
import q87.e;
import q87.f;

public class l	// class@002323
{
    public static o a;
    public static final List b;
    public static boolean c;

    static {
       l.b = new ArrayList();
       l.c = false;
    }
    public static void a(d p0){
       List b = l.b;
       _monitor_enter(b);
       b.add(p0);
       _monitor_exit(b);
    }
    public static void b(){
       l.a = new o(KwaiLog.a.c(), KwaiLog.a.a(), KwaiLog.a.d());
       LogService.b = f.b("app");
       l.c = true;
    }
}
