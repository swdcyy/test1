package g59.o;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;
import java.lang.Throwable;
import yx.j0;
import java.lang.Long;

public class o	// class@002410
{

    public void o(){
       super();
    }
    public static int a(String p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, oo, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return Integer.parseInt(p0);
    }
    public static long b(String p0,long p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, oo, "2");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return Long.parseLong(p0);
    }
}
