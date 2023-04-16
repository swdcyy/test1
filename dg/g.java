package dg.g;
import java.lang.Object;
import java.util.HashMap;
import dg.f;
import java.util.Map;
import java.lang.IllegalArgumentException;
import java.lang.String;

public class g	// class@001e65
{
    public final Map a;
    public static final g b;

    static {
       g.b = new g(true);
    }
    public void g(boolean p0){
       super();
       HashMap hashMap = new HashMap();
       this.a = hashMap;
       if (p0) {
          f c = f.c;
          if (c != null) {
             if (!hashMap.containsKey(c)) {
                hashMap.put(c, "default config");
             }
          }else {
             throw new IllegalArgumentException("springConfig is required");
          }
       }
       return;
    }
}
