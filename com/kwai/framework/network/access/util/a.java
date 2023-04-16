package com.kwai.framework.network.access.util.a;
import java.lang.Object;
import okhttp3.Request;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import okhttp3.RequestBody;
import okhttp3.MultipartBody;
import okhttp3.FormBody;
import ojd.c;
import com.yxcorp.retrofit.c$b;
import java.util.Map;
import java.util.HashMap;
import ua6.b;
import ua6.b$a;
import ia0.c;
import ab6.c;
import ekd.a0;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import android.util.Pair;
import java.lang.CharSequence;
import android.text.TextUtils;

public class a	// class@00179d
{

    public void a(){
       super();
    }
    public static boolean a(Request p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       RequestBody requestBody = p0.body();
       boolean b = a.b(p0);
       b = (!("GET").equalsIgnoreCase(p0.method()) && (!requestBody instanceof MultipartBody && (!requestBody instanceof FormBody && (requestBody != null && (requestBody.contentLength() && (!requestBody instanceof c && !b))))))? true: false;
       return b;
    }
    public static boolean b(Request p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (Boolean.parseBoolean(p0.header("useSig3")))? true: false;
       return b;
    }
    public static void c(c$b p0,Request p1,Map p2,byte[] p3,String p4){
       boolean b;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uoa, "2")) {
             return;
          }
       }
       HashMap hashMap = new HashMap();
       b$a c = b.c;
       c uoc = c.a().e();
       c l = c.l;
       l.c(p2, "os", uoc.w0());
       l.c(p2, "client_key", uoc.n());
       p2.putAll(c.a().d());
       hashMap.put("bodyMd5", a0.d(p3));
       String str = uoc.F();
       b = uoc.f();
       hashMap.putAll(c.a().c());
       Iterator iterator = p2.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          hashMap.put(key, uEntry.getValue());
       }
       Pair second = p0.a(p1, hashMap, new HashMap(), p4).second;
       c l1 = c.l;
       l1.c(p2, "sig2", second);
       if (b && !TextUtils.isEmpty(str)) {
          l1.c(p2, "__NStokensig", p0.b(second, str).second);
       }
       return;
    }
}
