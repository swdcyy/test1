package com.alipay.apmobilesecuritysdk.d.b;
import android.content.Context;
import java.util.Map;
import java.util.HashMap;
import java.lang.String;
import x6.a;
import com.alipay.apmobilesecuritysdk.e.h;
import java.lang.Object;

public final class b	// class@000e68
{

    public static synchronized Map a(Context p0,Map p1){
       _monitor_enter(b.class);
       HashMap hashMap = new HashMap();
       String str = a.b(p1, "sessionId", "");
       hashMap.put("AC1", a.b(p1, "tid", ""));
       hashMap.put("AC2", a.b(p1, "utdid", ""));
       hashMap.put("AC3", "");
       hashMap.put("AC4", h.f(p0));
       hashMap.put("AC5", a.b(p1, "userId", ""));
       hashMap.put("AC6", a.b(p1, "tmxSessionId", ""));
       hashMap.put("AC7", "");
       hashMap.put("AC8", a.b(p1, "appName", ""));
       hashMap.put("AC9", a.b(p1, "appKeyClient", ""));
       if (a.e(str)) {
          hashMap.put("AC10", str);
       }
       _monitor_exit(b.class);
       return hashMap;
    }
}
