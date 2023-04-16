package io.reactivex.internal.schedulers.i;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Properties;
import java.lang.System;
import io.reactivex.internal.schedulers.i$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.concurrent.ScheduledExecutorService;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import io.reactivex.internal.schedulers.i$b;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import java.util.concurrent.ScheduledFuture;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.Map;

public final class i	// class@001945
{
    public static final boolean a;
    public static final int b;
    public static final AtomicReference c;
    public static final Map d;

    static {
       i$a a;
       AtomicReference c;
       ScheduledExecutorService scheduledExe;
       ScheduledExecutorService scheduledExe1;
       long l;
       i.c = new AtomicReference();
       i.d = new ConcurrentHashMap();
       Properties properties = System.getProperties();
       i$a uoa = new i$a();
       String str = "rx2.purge-enabled";
       uoa.a = (properties.containsKey(str))? Boolean.parseBoolean(properties.getProperty(str)): true;
       if (uoa.a != null) {
          str = "rx2.purge-period-seconds";
          if (properties.containsKey(str)) {
             try{
                uoa.b = Integer.parseInt(properties.getProperty(str));
             }catch(java.lang.NumberFormatException e0){
                uoa.b = 1;
             }
          }else {
          label_0047 :
             uoa.b = 1;
          }
       }else {
          goto label_0047 ;
       }
    }
    public static ScheduledExecutorService a(ThreadFactory p0){
       ScheduledExecutorService scheduledExe = Executors.newScheduledThreadPool(1, p0);
       if (i.a && scheduledExe instanceof ScheduledThreadPoolExecutor) {
          i.d.put(scheduledExe, scheduledExe);
       }
       return scheduledExe;
    }
}
