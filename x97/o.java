package x97.o;
import okhttp3.Request;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.util.HashMap;
import okhttp3.Request$Builder;

public class o	// class@0027d6
{

    public static Request a(Request p0,String p1,Object p2){
       HashMap hashMap = p0.tag();
       if (hashMap instanceof Map) {
       }else {
          hashMap = new HashMap();
       }
       hashMap.put(p1, p2);
       return p0.newBuilder().tag(hashMap).build();
    }
}
