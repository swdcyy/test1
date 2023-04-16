package ujd.d;
import okhttp3.Request;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.util.HashMap;
import okhttp3.Request$Builder;

public class d	// class@0025ef
{

    public static Object a(Request p0,String p1){
       p0 = p0.tag();
       if (p0 instanceof Map) {
          return p0.get(p1);
       }
       return null;
    }
    public static Request b(Request p0,String p1,Object p2){
       HashMap hashMap = p0.tag();
       if (hashMap instanceof Map) {
       }else {
          hashMap = new HashMap();
       }
       hashMap.put(p1, p2);
       return p0.newBuilder().tag(hashMap).build();
    }
}
