package yf7.k;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import yf7.f;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Field;
import com.kwai.performance.monitor.base.Monitor;
import kotlin.TypeCastException;
import java.util.Map;
import com.kwai.performance.monitor.base.d;
import java.util.Objects;
import android.app.Application;
import yf7.p;
import java.util.LinkedHashMap;
import yf7.i;
import org.json.JSONObject;
import yf7.d;
import yf7.d$a;
import java.lang.RuntimeException;

public final class k	// class@0028a2
{
    public static final ConcurrentHashMap a;
    public static d b;
    public static final k c;

    static {
       k.c = new k();
       k.a = new ConcurrentHashMap();
    }
    public void k(){
       super();
    }
    public static final k a(f p0){
       String str = "null cannot be cast to non-null type com.kwai.performance.monitor.base.Monitor<M>";
       a.q(p0, "config");
       k c = k.c;
       Type genericSuper = p0.getClass().getGenericSuperclass();
       while (genericSuper instanceof Class) {
          genericSuper = genericSuper.getGenericSuperclass();
       }
       if (!genericSuper instanceof ParameterizedType) {
          throw new RuntimeException("config must be parameterized");
       }
       object oobject = genericSuper.getActualTypeArguments()[0];
       if (oobject == null) {
          throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<com.kwai.performance.monitor.base.Monitor<M>>");
       }
       if (!k.a.containsKey(oobject)) {
          Object obj = oobject.getDeclaredField("INSTANCE").get(null);
          if (obj != null) {
             k.a.put(oobject, obj);
             d b = k.b;
             if (b == null) {
                a.S("commonConfig");
             }
             obj.init(b, p0);
             Objects.requireNonNull(c);
             if (p.b(k.b())) {
                LinkedHashMap linkedHashMa = new LinkedHashMap();
                linkedHashMa.putAll(obj.getLogParams());
                d$a.c(i.a, "switch-stat", new JSONObject(linkedHashMa).toString(), false, 4, null);
             }
          }else {
             throw new TypeCastException(str);
          }
       }
       return c;
    }
    public static final Application b(){
       d b = k.b;
       if (b == null) {
          a.S("commonConfig");
       }
       return b.a();
    }
    public static final Monitor d(Class p0){
       a.q(p0, "clazz");
       p0 = k.a.get(p0);
       if (p0 != null) {
          return p0;
       }
       throw new TypeCastException("null cannot be cast to non-null type M");
    }
    public static final boolean e(){
       boolean b = (k.b != null)? true: false;
       return b;
    }
    public final d c(){
       d b = k.b;
       if (b == null) {
          a.S("commonConfig");
       }
       return b;
    }
}
