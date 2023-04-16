package k56.a;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.gson.c;
import com.google.gson.JsonElement;
import com.google.gson.Gson;

public class a	// class@001bcd
{
    public static final Map a;
    public static final ConcurrentHashMap b;

    static {
       a.a = new HashMap();
       a.b = new ConcurrentHashMap();
    }
    public void a(){
       super();
    }
    public static Object a(String p0,Type p1,String p2,Object p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object obj1 = null;
       if (TextUtils.isEmpty(p2) && p3 == null) {
          return obj1;
       }
       if (p3 != null && (p1.equals(p3.getClass()) || (p1 instanceof Class && p1.isAssignableFrom(p3.getClass())))) {
          return p3;
       }
       if (p2 != null) {
          obj1 = new Gson().d(new c().a(p2), p1);
          a.b.put(p0, obj1);
       }
       return obj1;
    }
}
