package kw1.d;
import java.util.HashMap;
import java.lang.Object;
import kw1.d$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.lang.Boolean;
import w51.a;
import java.lang.Number;
import xf6.l;
import kw1.d$a;

public class d	// class@002e0e
{
    public static final Map a;
    public static final Map b;
    public static String c;

    static {
       d.a = new HashMap();
       d.b = new HashMap();
       d.c = "";
    }
    public void d(){
       super();
    }
    public static d$b a(){
       Object obj = PatchProxy.apply(null, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.b.get(d.c);
    }
    public static boolean b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, d.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, a.class, "88");
       boolean b = false;
       int i = (obj != patchProxyRe)? obj.intValue(): l.e("live_pk_skin_opponent_honor", b);
       if (!i) {
          d$a uoa = d.a.get(d.c);
          if (uoa != null && uoa.b != null) {
             b = true;
          }
          return b;
       }else if(i == 1){
          b = true;
       }
       return b;
    }
}
