package ba6.e;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.content.SharedPreferences;
import k85.c;

public final class e	// class@00044f
{
    public static final z a;
    public static final SharedPreferences b;
    public static String c;
    public static final e d;

    static {
       e.d = new e();
       z oz = b.b(c.f("UrtConfig"));
       a.o(oz, "Schedulers.from\(\n    Asy¡­eadExecutor\(\"UrtConfig\"\)\)");
       e.a = oz;
       e.b = c.a(a.b(), "URT_CONFIG", 4);
       e.c = "";
    }
    public void e(){
       super();
    }
}
