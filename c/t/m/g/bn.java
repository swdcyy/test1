package c.t.m.g.bn;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import android.os.HandlerThread;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Long;
import java.lang.System;
import java.lang.Math;
import android.os.Handler;
import c.t.m.g.bo;
import java.lang.Runnable;
import android.os.Looper;
import c.t.m.g.bp;

public class bn	// class@000bec
{
    public static ConcurrentHashMap a;
    public static ConcurrentHashMap b;
    public static ConcurrentHashMap c;

    static {
       bn.a = new ConcurrentHashMap();
       bn.b = new ConcurrentHashMap();
       bn.c = new ConcurrentHashMap();
    }
    public static synchronized HandlerThread a(String p0){
       _monitor_enter(bn.class);
       _monitor_exit(bn.class);
       return bn.a(p0, 0);
    }
    public static synchronized HandlerThread a(String p0,int p1){
       _monitor_enter(bn.class);
       HandlerThread handlerThrea = bn.a.get(p0);
       int i = 1;
       if (handlerThrea == null) {
          handlerThrea = new HandlerThread(p0, p1);
          handlerThrea.start();
          bn.a.put(p0, handlerThrea);
          bn.b.put(p0, Integer.valueOf(i));
       }else {
          ConcurrentHashMap b = bn.b;
          b.put(p0, Integer.valueOf((b.get(p0).intValue() + i)));
       }
       _monitor_exit(bn.class);
       return handlerThrea;
    }
    public static synchronized void a(String p0,long p1){
       _monitor_enter(bn.class);
       if (!bn.b.containsKey(p0)) {
          _monitor_exit(bn.class);
          return;
       }else {
          int i = bn.b.get(p0).intValue() - 1;
          if (!i) {
             bn.b.remove(p0);
             HandlerThread handlerThrea = bn.a.remove(p0);
             if (bn.c.containsKey(p0)) {
                p1 = Math.max(p1, (bn.c.remove(p0).longValue() - System.currentTimeMillis()));
             }
             bo.a(handlerThrea, null, p1, false);
          }else {
             bn.b.put(p0, Integer.valueOf(i));
             ConcurrentHashMap uConcurrentH = null;
             if (p1 - uConcurrentH) {
                if (bn.c.containsKey(p0)) {
                   uConcurrentH = bn.c.get(p0).longValue();
                }
                bn.c.put(p0, Long.valueOf(Math.max((System.currentTimeMillis() + p1), uConcurrentH)));
             }
          }
          _monitor_exit(bn.class);
          return;
       }
    }
    public static synchronized void a(String p0,Runnable p1){
       _monitor_enter(bn.class);
       bp.a(new Handler(bn.a(p0).getLooper()), p1);
       bn.b(p0);
       _monitor_exit(bn.class);
    }
    public static void b(String p0){
       bn.a(p0, 0);
    }
}
