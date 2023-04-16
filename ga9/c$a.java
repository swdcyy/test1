package ga9.c$a;
import java.lang.Object;
import nsd.u;
import android.os.Bundle;
import ga9.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.util.ArrayList;
import ic7.c;
import java.util.Map;
import java.util.Collection;

public final class c$a	// class@00245f
{

    public void c$a(){
       super();
    }
    public void c$a(u p0){
       super();
    }
    public final c a(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "bundle");
       c uoc = new c(null, null, false, 7, null);
       String str = "vb_op_key";
       if (p0.containsKey(str)) {
          HashMap hashMap = c.c().a(p0.getString(str), new HashMap().getClass());
          if (hashMap != null) {
             obj.a.putAll(hashMap);
          }
       }
       str = "vb_pl_key";
       if (p0.containsKey(str)) {
          ArrayList integerArray = p0.getIntegerArrayList(str);
          if (integerArray != null) {
             obj.c().addAll(integerArray);
          }
       }
       if (p0.containsKey("vb_has_pl_key")) {
          obj.c = p0.getBoolean("vb_has_pl_key", false);
       }
       return obj;
    }
}
