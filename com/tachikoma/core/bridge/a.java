package com.tachikoma.core.bridge.a;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Random;
import java.lang.Object;
import java.lang.String;
import com.tachikoma.core.bridge.a$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import iq8.o;
import java.util.concurrent.ThreadLocalRandom;
import java.lang.Throwable;
import java.lang.StringBuilder;
import com.tachikoma.core.bridge.d;
import wp8.a;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import no8.e;
import oo8.s;

public class a	// class@000d40
{
    public static int a = 3;
    public static final List b;
    public static final Map c;
    public static final Map d;
    public static final List e;
    public static final Random f;
    public static Boolean g;

    static {
       a.b = new CopyOnWriteArrayList();
       a.c = new ConcurrentHashMap();
       a.d = new ConcurrentHashMap();
       a.e = new CopyOnWriteArrayList();
       a.f = new Random();
       a.g = null;
    }
    public void a(){
       super();
    }
    public static a$b a(boolean p0,String p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, null, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       long l = 0;
       if (!p0) {
          return new a$b(l);
       }else {
          List b = a.b;
          _monitor_enter(b);
          a$b uob = a.c(p1);
          if (uob == null) {
             uob = new a$b(l);
             b.add(uob);
          }
          if (!TextUtils.isEmpty(p1)) {
             uob.d.add(p1);
          }
          _monitor_exit(b);
          return uob;
       }
    }
    public static Executor b(boolean p0,a$b p1){
       Map c;
       Executor uExecutor;
       List e;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, null, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 1;
       if (p0) {
          c = a.c;
          _monitor_enter(c);
          uExecutor = c.get(p1);
          if (uExecutor == null && c.size() < a.a) {
             uExecutor = o.c("tk-share-isolate-thread", i);
             c.put(p1, uExecutor);
          }
          _monitor_exit(c);
       }else {
          c = a.d;
          _monitor_enter(c);
          uExecutor = c.get(p1);
          if (uExecutor == null) {
             e = a.e;
             if (e.size() < 3) {
                uExecutor = o.c("tk-unShared-isolate-thread", i);
                e.add(uExecutor);
                c.put(p1, uExecutor);
             }
          }
          _monitor_exit(c);
          if (uExecutor == null) {
             e = a.e;
             uExecutor = e.get(ThreadLocalRandom.current().nextInt(e.size()));
             c.put(p1, uExecutor);
          }
       }
       if (uExecutor == null) {
          uExecutor = o.c("tk-unShared-isolate-thread", i);
          a.d(null, new Throwable("getIsolateExecutor result is null, useSharedIsolate: "+p0));
       }
       return uExecutor;
    }
    public static a$b c(String p0){
       a$b uob;
       a$b uob1;
       Object obj = null;
       List obj1 = PatchProxy.applyOneRefs(p0, obj, a.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (!TextUtils.isEmpty(p0)) {
          obj1 = a.b;
          if (obj1.size() > 0) {
             Iterator iterator = obj1.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   uob = iterator.next();
                   if (uob.d.contains(p0)) {
                      return uob;
                   }
                   continue ;
                }else {
                   iterator = a.b.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         uob = iterator.next();
                         if (uob.e.containsKey(p0)) {
                            return uob;
                         }
                         continue ;
                      }
                   }
                   return uob1;
                }
             }
          }
       }
       Iterator iterator1 = a.b.iterator();
       while (true) {
          if (iterator1.hasNext()) {
             uob1 = iterator1.next();
             if (uob1.d.isEmpty()) {
                return uob1;
             }
             continue ;
          }else {
             List b = a.b;
             if (b.size() < a.a) {
                return obj;
             }else {
                uob1 = b.get(0);
                int i = 1;
                if (b.size() == i) {
                   return uob1;
                }else {
                   b = a.b;
                   while (i < b.size()) {
                      a$b uob2 = b.get(i);
                      if (uob1.c.get() > uob2.c.get()) {
                         uob1 = uob2;
                      }
                      i = i + 1;
                   }
                }
             }
          }
       }
    }
    public static boolean d(){
       Boolean obj = PatchProxy.apply(null, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.g == null && e.b().d() != null) {
          a.g = Boolean.valueOf(e.b().d().d("destroyRepetitionCompileRes", b));
       }
       obj = a.g;
       if (obj != null && obj.booleanValue()) {
          b = true;
       }
       return b;
    }
}
