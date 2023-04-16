package o3.a;
import java.lang.String;
import k3.h;
import android.content.Context;
import l3.i;
import androidx.work.impl.WorkDatabase;
import u3.j;
import u3.i;
import java.lang.Object;
import java.lang.Throwable;
import android.app.AlarmManager;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.a;
import android.app.PendingIntent;
import java.lang.Integer;
import v3.c;

public class a	// class@00274f
{
    public static final String a;

    static {
       a.a = h.f("Alarms");
    }
    public static void a(Context p0,i p1,String p2){
       j oj = p1.H().L();
       i oi = oj.b(p2);
       if (oi != null) {
          a.b(p0, p2, oi.b);
          Object[] objArray = new Object[]{p2};
          Throwable[] throwableArr = new Throwable[0];
          h.c().a(a.a, String.format("Removing SystemIdInfo for workSpecId \(%s\)", objArray), throwableArr);
          oj.c(p2);
       }
       return;
    }
    public static void b(Context p0,String p1,int p2){
       AlarmManager systemServic = p0.getSystemService("alarm");
       PendingIntent service = PendingIntent.getService(p0, p2, a.b(p0, p1), 0x20000000);
       if (service != null && systemServic != null) {
          Object[] objArray = new Object[]{p1,Integer.valueOf(p2)};
          Throwable[] throwableArr = new Throwable[0];
          h.c().a(a.a, String.format("Cancelling existing alarm with \(workSpecId, systemId\) \(%s, %s\)", objArray), throwableArr);
          systemServic.cancel(service);
       }
       return;
    }
    public static void c(Context p0,i p1,String p2,long p3){
       WorkDatabase workDatabase = p1.H();
       j oj = workDatabase.L();
       i oi = oj.b(p2);
       if (oi != null) {
          a.b(p0, p2, oi.b);
          a.d(p0, p2, oi.b, p3);
       }else {
          int i = new c(workDatabase).b();
          oj.a(new i(p2, i));
          a.d(p0, p2, i, p3);
       }
       return;
    }
    public static void d(Context p0,String p1,int p2,long p3){
       AlarmManager systemServic = p0.getSystemService("alarm");
       PendingIntent service = PendingIntent.getService(p0, p2, a.b(p0, p1), 0x8000000);
       if (systemServic != null) {
          systemServic.setExact(0, p3, service);
       }
       return;
    }
}
