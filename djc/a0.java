package djc.a0;
import djc.t;
import java.lang.Object;
import com.google.gson.JsonObject;
import androidx.fragment.app.KwaiDialogFragment;
import mhc.q;
import djc.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.google.gson.JsonElement;
import ekd.k0;
import com.google.gson.Gson;
import djc.y;
import java.util.List;
import java.util.Collection;
import ekd.q;
import djc.b0;
import djc.z;
import java.lang.Exception;
import o56.a;
import com.yxcorp.utility.SystemUtil;

public final class a0 implements t	// class@0021cf
{

    public void a0(){
       super();
    }
    public w a(JsonObject p0,KwaiDialogFragment p1,q p2){
       Collection uCollection;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a0.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "extParam");
       a.p(p1, "fragment");
       try{
          int i = 0;
          JsonElement jsonElement = k0.e(p0, "forwardCards");
          if (jsonElement != null) {
             y oy = new Gson().c(jsonElement, y.class);
             List list = (oy != null)? oy.b(): i;
             if (q.f(list)) {
                list = (oy != null)? oy.d(): i;
                if (q.f(list)) {
                label_006d :
                   return i;
                }
             }
             a.o(oy, "forwardCards");
             b0.b(oy);
             return new z(oy);
          }else {
             goto label_006d ;
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
          if (!a.d() || !SystemUtil.I()) {
             goto label_006d ;
          }else {
             throw e8;
          }
       }
    }
}
