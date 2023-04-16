package k6.a$a;
import android.content.Context;
import java.lang.String;
import java.lang.StringBuilder;
import u6.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import k6.a$a$a;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import java.lang.Throwable;
import java.util.UUID;
import s6.a;
import u6.g;

public final class a$a	// class@002488
{

    public static synchronized int a(Context p0,String p1){
       _monitor_enter(a$a.class);
       c.e("RecordPref", "stat remove "+p1);
       int i = 0;
       if (p0 == null || TextUtils.isEmpty(p1)) {
          _monitor_exit(a$a.class);
          return i;
       }else {
          a$a$a uoa$a = a$a.c(p0);
          if (uoa$a.a.isEmpty()) {
             _monitor_exit(a$a.class);
             return i;
          }else {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = uoa$a.a.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                if (p1.equals(uEntry.getValue())) {
                   uArrayList.add(uEntry.getKey());
                }
             }
             Iterator iterator1 = uArrayList.iterator();
             while (iterator1.hasNext()) {
                uoa$a.a.remove(iterator1.next());
             }
             a$a.d(p0, uoa$a);
             _monitor_exit(a$a.class);
             return uArrayList.size();
          }
       }
    }
    public static synchronized String b(Context p0,String p1,String p2){
       _monitor_enter(a$a.class);
       c.e("RecordPref", "stat append "+p2+" , "+p1);
       if (TextUtils.isEmpty(p1)) {
          _monitor_exit(a$a.class);
          return null;
       }else if(TextUtils.isEmpty(p2)){
          p2 = UUID.randomUUID().toString();
       }
       a$a$a uoa$a = a$a.c(p0);
       if (uoa$a.a.size() > 20) {
          uoa$a.a.clear();
       }
       uoa$a.a.put(p2, p1);
       a$a.d(p0, uoa$a);
       _monitor_exit(a$a.class);
       return p2;
    }
    public static synchronized a$a$a c(Context p0){
       _monitor_enter(a$a.class);
       String str = g.b(null, p0, "alipay_cashier_statistic_record", null);
       if (TextUtils.isEmpty(str)) {
          _monitor_exit(a$a.class);
          return new a$a$a();
       }else {
          _monitor_exit(a$a.class);
          return new a$a$a(str);
       }
    }
    public static synchronized void d(Context p0,a$a$a p1){
       _monitor_enter(a$a.class);
       g.c(null, p0, "alipay_cashier_statistic_record", p1.a());
       _monitor_exit(a$a.class);
       return;
    }
}
