package a75.a;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h75.h;
import android.app.Application;
import android.os.Handler;

public class a	// class@000031
{
    public static Context a;
    public static Application b;
    public static Handler c;
    public static boolean d;

    public void a(){
       super();
    }
    public static Context a(){
       return a.a;
    }
    public static void b(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "1")) {
          return;
       }
       boolean b = (p0 != null)? true: false;
       h.a(b, "Ary you kidding me ? context is null");
       a.a = (p0 instanceof Application)? p0.getApplicationContext(): p0;
       if (a.c == null) {
          a.c = new Handler();
       }
       return;
    }
}
