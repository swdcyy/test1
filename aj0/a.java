package aj0.a;
import p55.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.krn.c;
import kotlin.jvm.internal.a;
import com.google.gson.Gson;
import aj0.b;
import java.lang.CharSequence;
import com.kwai.bridge.a;
import java.util.Map;
import java.util.List;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Exception;

public final class a	// class@0000aa
{

    public static final boolean a(a p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          c uoc = c.b();
          a.o(uoc, "KrnManager.get\(\)");
          b uob = uoc.e().h(p1, b.class);
          String str = uob.a();
          if (str == null || !str.length()) {
             str = 1;
          label_003b :
             if (!str) {
                str = uob.a();
                a uoa = (str == null || !str.length())? 1: null;
                if (!uoa) {
                   List list = a.n.e(p0).get(uob.a());
                   if (list != null && CollectionsKt___CollectionsKt.H1(list, uob.method) == true) {
                      b = true;
                   }
                }
             }
          }else {
             str = null;
             goto label_003b ;
          }
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return b;
    }
}
