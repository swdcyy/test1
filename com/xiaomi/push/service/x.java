package com.xiaomi.push.service.x;
import com.xiaomi.push.service.XMPushService$n;
import java.lang.String;
import android.util.Log;
import java.util.HashMap;
import android.content.Context;
import java.lang.Object;
import com.xiaomi.push.ig;
import java.lang.StringBuilder;
import rs8.c;
import ws8.k;
import ys8.n0;
import java.lang.Runnable;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.lang.Integer;
import java.util.List;
import java.util.Collection;
import ws8.g7;
import ys8.u;
import com.xiaomi.push.hr;

public class x implements XMPushService$n	// class@001198
{
    public static final boolean a;
    public static final Map b;
    public static Context c;

    static {
       x.a = Log.isLoggable("UNDatas", 3);
       x.b = new HashMap();
    }
    public void x(Context p0){
       super();
       x.c = p0;
    }
    public static Context b(){
       return x.c;
    }
    public static ig c(String p0,String p1,String p2,String p3){
       ig oig = new ig();
       if (p2 != null) {
          oig.c(p2);
       }
       if (p1 != null) {
          oig.a(p1);
       }
       oig.a(false);
       return oig;
    }
    public static void d(Context p0,ig p1){
       if (x.a) {
          c.s("UNDatas upload message notification:"+p1);
       }
       k.f(p0).g(new n0(p1));
       return;
    }
    public static void e(){
       HashMap hashMap = new HashMap();
       hashMap.putAll(x.b);
       if (hashMap.size() > 0) {
          Iterator iterator = hashMap.keySet().iterator();
          while (iterator.hasNext()) {
             Integer integer = iterator.next();
             Map map = hashMap.get(integer);
             if (map != null && map.size() > 0) {
                StringBuilder str = "";
                Iterator iterator1 = map.keySet().iterator();
                while (iterator1.hasNext()) {
                   String str1 = iterator1.next();
                   str = str+str1+":";
                   List list = map.get(str1);
                   if (!g7.d(list)) {
                      for (int i = 0; i < list.size(); i = i + 1) {
                         if (i) {
                            str = str+",";
                         }
                         str = str+list.get(i);
                      }
                   }
                   str = str+";";
                }
                ig oig = x.c(null, u.a(), hr.Y.a, null);
                oig.a("removed_reason", String.valueOf(integer));
                oig.a("all_delete_msgId_appId", str);
                c.s("UNDatas upload all removed messages reason: "+integer+" allIds: "+str);
                x.d(x.c, oig);
             }
             x.b.remove(integer);
          }
       }
       return;
    }
    public void a(){
       Map b = x.b;
       if (b.size() > 0) {
          _monitor_enter(b);
          x.e();
          _monitor_exit(b);
       }
       return;
    }
}
