package ho8.a;
import java.lang.Object;
import com.google.gson.Gson;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class a	// class@0025c2
{
    public static Gson a;

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
}
