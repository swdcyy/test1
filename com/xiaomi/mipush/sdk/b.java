package com.xiaomi.mipush.sdk.b;
import android.content.Context;
import com.xiaomi.push.hl;
import java.lang.StringBuilder;
import java.lang.String;
import rs8.c;
import com.xiaomi.mipush.sdk.b$a;

public class b	// class@0010ec
{

    public static boolean a(Context p0,hl p1){
       c.t("MiTinyDataClient.upload "+p1.d());
       if (!b$a.b().e()) {
          b$a.b().c(p0);
       }
       return b$a.b().g(p1);
    }
    public static boolean b(String p0,String p1,long p2,String p3){
       hl ohl = new hl();
       ohl.d(p0);
       ohl.c(p1);
       ohl.a(p2);
       ohl.b(p3);
       return b$a.b().g(ohl);
    }
}
