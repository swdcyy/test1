package r87.j;
import q87.d;
import android.content.Context;
import com.kwai.logger.KwaiLog;
import java.lang.String;
import b97.d;
import java.lang.StringBuilder;
import android.os.Process;
import java.lang.Thread;
import java.lang.System;
import ca7.u;
import java.lang.Object;
import r87.t;
import java.lang.ThreadLocal;
import java.lang.Throwable;
import android.util.Log;

public class j	// class@002321
{
    public static String a;
    public static String b;

    public static void a(d p0){
       if (j.a == null) {
          Context uContext = KwaiLog.h();
          String str = "";
          String str1 = (uContext != null)? d.a(uContext): str;
          j.a = str1;
          j.b = str+Process.myPid();
       }
       p0.g = j.a;
       p0.h = j.b;
       p0.i = Thread.currentThread().getName();
       p0.j = Process.myTid();
       return;
    }
    public static d b(int p0,String p1,String p2){
       d uod = new d();
       uod.d = System.currentTimeMillis();
       uod.a = p0;
       uod.b = u.a(p2);
       uod.c = u.a(p1);
       j.a(uod);
       return uod;
    }
    public static d c(String p0,int p1,String p2,String p3,Object[] p4){
       d uod = j.b(p1, p3, p2);
       uod.e = p0;
       if (p4 != null && p4.length > 0) {
          int i = 0;
          if (p4.length == 1) {
             p0 = j.d(p4[i]);
          }else {
             p0 = t.b.get();
             p0.setLength(i);
             int len = p4.length;
             while (i < len) {
                object oobject = p4[i];
                if (oobject != null) {
                   if (p0.length() > 0) {
                      p0 = p0+",";
                   }
                   p0 = p0+j.d(oobject);
                }
                i++;
             }
             p0 = p0;
          }
          uod.f = p0;
       }
       return uod;
    }
    public static String d(Object p0){
       if (p0 == null) {
          return "null";
       }
       if (p0 instanceof Throwable) {
          return Log.getStackTraceString(p0);
       }
       return p0.toString();
    }
}
