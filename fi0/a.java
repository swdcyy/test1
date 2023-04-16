package fi0.a;
import java.lang.Object;
import com.google.gson.Gson;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;

public final class a	// class@002341
{
    public static Gson a;
    public static Context b;

    public void a(){
       super();
    }
    public static Gson a(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.a == null) {
          a.a = new Gson();
       }
       return a.a;
    }
    public static void b(Context p0){
       a.b = p0;
    }
    public static void c(Gson p0){
       a.a = p0;
    }
}
