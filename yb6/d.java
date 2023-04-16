package yb6.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import wkd.b;
import com.kwai.framework.network.sntp.a;
import java.lang.Long;
import pb6.o;
import java.lang.System;

public class d	// class@002877
{

    public void d(){
       super();
    }
    public static long a(){
       Long obj = PatchProxy.apply(null, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = b.a(0x3b1f7b44).a();
       if (obj != null) {
          return obj.longValue();
       }
       long serverTimest = b.a(0x3d855db5).getServerTimestamp();
       if (serverTimest > 0) {
          return serverTimest;
       }
       return System.currentTimeMillis();
    }
}
