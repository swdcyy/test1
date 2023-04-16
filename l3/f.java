package l3.f;
import java.lang.String;
import k3.h;
import android.content.Context;
import l3.i;
import l3.e;
import android.os.Build$VERSION;
import p3.b;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.lang.Class;
import v3.e;
import java.lang.Throwable;
import androidx.work.impl.background.systemalarm.SystemAlarmScheduler;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import k3.a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import u3.s;
import androidx.room.RoomDatabase;
import java.lang.System;
import java.util.Iterator;
import java.lang.Object;
import u3.r;
import java.lang.reflect.Constructor;

public class f	// class@002503
{
    public static final String a;

    static {
       f.a = h.f("Schedulers");
    }
    public static e a(Context p0,i p1){
       b uob;
       Throwable[] throwableArr;
       int i = 0;
       boolean b = true;
       if (Build$VERSION.SDK_INT >= 23) {
          uob = new b(p0, p1);
          e.a(p0, SystemJobService.class, b);
          throwableArr = new Throwable[i];
          h.c().a(f.a, "Created SystemJobScheduler and enabled SystemJobService", throwableArr);
       }else {
          uob = f.c(p0);
          if (uob == null) {
             uob = new SystemAlarmScheduler(p0);
             e.a(p0, SystemAlarmService.class, b);
             throwableArr = new Throwable[i];
             h.c().a(f.a, "Created SystemAlarmScheduler", throwableArr);
          }
       }
       return uob;
    }
    public static void b(a p0,WorkDatabase p1,List p2){
       r[] orArray1;
       Iterator iterator1;
       if (p2 == null || !p2.size()) {
          return;
       }
       s os = p1.O();
       p1.e();
       List list = os.D(p0.e());
       List list1 = os.B();
       if (list != null && list.size() > 0) {
          long l = System.currentTimeMillis();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             os.l(iterator.next().a, l);
          }
       }
       p1.C();
       p1.k();
       if (list != null && list.size() > 0) {
          r[] orArray = new r[list.size()];
          orArray1 = list.toArray(orArray);
          iterator1 = p2.iterator();
          while (iterator1.hasNext()) {
             e uoe = iterator1.next();
             if (uoe.b()) {
                uoe.a(orArray1);
             }
          }
       }
       if (list1 != null && list1.size() > 0) {
          orArray1 = new r[list1.size()];
          orArray1 = list1.toArray(orArray1);
          iterator1 = p2.iterator();
          while (iterator1.hasNext()) {
             e uoe1 = iterator1.next();
             if (!uoe1.b()) {
                uoe1.a(orArray1);
             }
          }
       }
       return;
    }
    public static e c(Context p0){
       Class[] uClassArray = new Class[]{Context.class};
       Object[] objArray = new Object[]{p0};
       Object[] objArray1 = new Object[]{"androidx.work.impl.background.gcm.GcmScheduler"};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(f.a, String.format("Created %s", objArray1), throwableArr);
       return Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(uClassArray).newInstance(objArray);
    }
}
