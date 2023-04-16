package k6.a$b;
import android.content.Context;
import k6.c;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import k6.a$a;
import java.lang.Thread;
import k6.b;
import java.lang.Runnable;
import java.lang.StringBuilder;
import u6.c;
import m6.a;
import q6.d;
import q6.e;
import s6.a;
import p6.b;
import p6.e;
import java.lang.Throwable;

public final class a$b	// class@002489
{

    public static synchronized void a(Context p0,c p1,String p2,String p3){
       _monitor_enter(a$b.class);
       if (p1 == null || p2 == null) {
          _monitor_exit(a$b.class);
          return;
       }else {
          String str = p1.b(p2);
          _monitor_enter(a$b.class);
          if (!TextUtils.isEmpty(str)) {
             a$a.b(p0, str, p3);
          }
          new Thread(new b(str, p0)).start();
          _monitor_exit(a$b.class);
          _monitor_exit(a$b.class);
          return;
       }
    }
    public static boolean b(Context p0,String p1){
       _monitor_enter(a$b.class);
       c.e("mspl", "stat sub "+p1);
       d uod = (a.A().i())? new d(): new e();
       boolean b = false;
       if (uod.h(null, p0, p1) != null) {
          a$a.a(p0, p1);
          b = true;
       }
       _monitor_exit(a$b.class);
       return b;
    }
}
