package com.vivo.push.util.e;
import java.util.HashMap;
import com.vivo.push.b.x;
import com.vivo.push.e;
import com.vivo.push.o;
import android.content.Context;
import java.lang.StringBuilder;
import java.lang.String;
import com.vivo.push.util.p;
import java.lang.Object;
import com.vivo.push.util.z;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class e	// class@0010b3
{

    public static boolean a(long p0,HashMap p1){
       x ox = new x(p0);
       ox.a(p1);
       ox.d();
       e.a().a(ox);
       return true;
    }
    public static boolean a(Context p0,long p1,long p2){
       p.d("ClientReportUtil", "report message: "+p1+", reportType: "+p2);
       x ox = new x(p2);
       HashMap hashMap = new HashMap();
       hashMap.put("messageID", String.valueOf(p1));
       String str = z.b(p0, p0.getPackageName());
       if (!TextUtils.isEmpty(str)) {
          hashMap.put("remoteAppId", str);
       }
       ox.a(hashMap);
       e.a().a(ox);
       return true;
    }
}
