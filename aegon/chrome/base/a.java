package aegon.chrome.base.a;
import aegon.chrome.base.Callback;
import java.lang.Object;
import java.lang.Runnable;
import a0.b;

public final class a	// class@00015f
{

    public static Runnable a(Callback p0,Object p1){
       return new b(p0, p1);
    }
    public static void b(Callback p0,Object p1){
       p0.onResult(p1);
    }
    public static void c(Callback p0,Object p1){
       a.b(p0, p1);
    }
}
