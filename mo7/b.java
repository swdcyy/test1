package mo7.b;
import java.util.HashMap;
import java.lang.Boolean;
import java.util.Map;
import java.lang.Class;
import java.lang.Byte;
import java.lang.Character;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Short;
import java.lang.Void;
import java.util.Collections;
import java.lang.Object;

public class b	// class@001eb4
{
    public static final Map a;
    public static final Map b;

    static {
       HashMap hashMap = new HashMap(16);
       HashMap hashMap1 = new HashMap(16);
       b.a(hashMap, hashMap1, Boolean.TYPE, Boolean.class);
       b.a(hashMap, hashMap1, Byte.TYPE, Byte.class);
       b.a(hashMap, hashMap1, Character.TYPE, Character.class);
       b.a(hashMap, hashMap1, Double.TYPE, Double.class);
       b.a(hashMap, hashMap1, Float.TYPE, Float.class);
       b.a(hashMap, hashMap1, Integer.TYPE, Integer.class);
       b.a(hashMap, hashMap1, Long.TYPE, Long.class);
       b.a(hashMap, hashMap1, Short.TYPE, Short.class);
       b.a(hashMap, hashMap1, Void.TYPE, Void.class);
       b.a = Collections.unmodifiableMap(hashMap);
       b.b = Collections.unmodifiableMap(hashMap1);
    }
    public static void a(Map p0,Map p1,Class p2,Class p3){
       p0.put(p2, p3);
       p1.put(p3, p2);
    }
}
