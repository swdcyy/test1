package com.meizu.cloud.pushsdk.a.a;
import android.content.Context;
import com.meizu.cloud.pushsdk.d.a.c;
import com.meizu.cloud.pushsdk.a.b;
import java.util.Map;
import java.lang.String;
import java.lang.Object;
import com.meizu.cloud.pushsdk.b.c.a;
import com.meizu.cloud.pushsdk.a.a$1;
import java.lang.Runnable;
import com.meizu.cloud.pushsdk.a.b$a;

public class a	// class@001491
{

    public static c a(Context p0){
       c uoc = new c();
       b uob = a.c(p0);
       Map map = uob.a();
       Map map1 = uob.b();
       Map map2 = uob.c();
       if (map.size() > 0) {
          uoc.a("di", map);
       }
       if (map1.size() > 0) {
          uoc.a("ai", map1);
       }
       if (map2.size() > 0) {
          uoc.a("li", map2);
       }
       return uoc;
    }
    public static void b(Context p0){
       a.a().execute(new a$1(p0));
    }
    public static b c(Context p0){
       return new b$a().a(p0).a();
    }
}
