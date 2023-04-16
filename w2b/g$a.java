package w2b.g$a;
import tq.f;
import w2b.g;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import vid.b;

public class g$a implements f	// class@002715
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public SharedPreferences a(Context p0,String p1,int p2){
       if (PatchProxy.isSupport(g$a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, g$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.c(p0, p1, p2);
    }
}
