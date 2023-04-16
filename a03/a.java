package a03.a;
import w51.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xf6.l;
import a03.a$b;
import a03.a$a;
import a03.a$c;
import android.os.Handler;
import android.os.Looper;
import java.lang.Runnable;

public class a	// class@00000a
{
    public static final a$c a;

    static {
       Object obj = PatchProxy.apply(null, null, a.class, "42");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): l.c("enableLiveEffectToast", false);
       a.a = (b)? new a$b(null): a$c.a;
    }
    public void a(){
       super();
    }
    public static a$c a(){
       return a.a;
    }
    public static void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "1")) {
          return;
       }
       new Handler(Looper.getMainLooper()).post(new a$a(p0));
       return;
    }
}
