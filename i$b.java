package i$b;
import java.util.HashMap;
import j.a;
import java.lang.Object;
import java.lang.String;
import okhttp3.Dns;
import java.util.Map;
import a.a.a.a.b.e.b$b;
import java.lang.StringBuilder;
import a.a.a.a.b.e.b;
import j.b;

public final class i$b	// class@00214a
{
    public static final Map a;

    static {
       HashMap hashMap = new HashMap();
       i$b.a = hashMap;
       hashMap.put("DEFAULT", new a());
    }
    public void i$b(){
       super();
    }
    public static Dns a(String p0){
       b uob;
       if (p0.equals("KUAISHOU") || p0.equals("NEBULA")) {
          uob = new b();
       }else if(p0.equals("TEST")){
          uob = new a();
       }else {
          b.a(b$b.a, "DNSResolverFactory getResolver "+p0+" undefined, use default resolver", 217);
          return i$b.a.get("DEFAULT");
       }
       i$b.a.put(p0, uob);
       return uob;
    }
}
