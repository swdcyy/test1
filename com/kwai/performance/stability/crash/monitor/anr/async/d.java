package com.kwai.performance.stability.crash.monitor.anr.async.d;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.d;
import java.lang.Class;
import android.content.Context;
import java.lang.reflect.Constructor;
import java.lang.Object;
import java.lang.reflect.Field;
import com.kwai.performance.stability.crash.monitor.anr.async.d$a;
import java.lang.RuntimeException;
import java.lang.Throwable;

public class d	// class@0011b1
{
    public static d$a a;
    public static Constructor b;
    public static Field c;

    public static void a(SystemAlarmService p0){
       d uod = d.class;
       int i = 0;
       if (d.b == null) {
          Class[] uClassArray = new Class[]{Context.class};
          Constructor declaredCons = uod.getDeclaredConstructor(uClassArray);
          d.b = declaredCons;
          declaredCons.setAccessible(1);
       }
       Object[] objArray = new Object[]{p0};
       d uod1 = d.b.newInstance(objArray);
       if (d.c == null) {
          Field[] declaredFiel = SystemAlarmService.class.getDeclaredFields();
          int len = declaredFiel.length;
          while (i < len) {
             object oobject = declaredFiel[i];
             if (oobject.getType() == uod) {
                d.c = oobject;
                oobject.setAccessible(1);
                break ;
             }
             i = i + 1;
          }
       }
       d.c.set(p0, uod1);
       if (d.a != null) {
          d.a.a(uod1);
       }
       return;
    }
}
