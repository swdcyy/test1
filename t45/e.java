package t45.e;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.lang.ThreadLocal;
import java.util.concurrent.RejectedExecutionHandler;
import java.lang.Runnable;
import java.lang.Throwable;
import t45.c;
import java.lang.Object;
import t45.h;
import java.lang.System;
import t45.b;
import java.lang.String;
import java.util.concurrent.Executor;
import w1.k;
import java.lang.Thread;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Queue;
import java.lang.Integer;
import java.lang.Class;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;
import brd.y;
import brd.t;
import erd.g;
import erd.a;
import java.lang.IllegalAccessException;
import java.util.Iterator;
import java.lang.reflect.Modifier;

public class e extends ThreadPoolExecutor	// class@002468
{
    public ThreadLocal b;
    public boolean c;

    public void e(int p0,int p1,long p2,TimeUnit p3,BlockingQueue p4,ThreadFactory p5){
       super(p0, p1, p2, p3, p4, p5);
       this.b = new ThreadLocal();
       this.c = false;
    }
    public void e(int p0,int p1,long p2,TimeUnit p3,BlockingQueue p4,ThreadFactory p5,RejectedExecutionHandler p6){
       super(p0, p1, p2, p3, p4, p5, p6);
       this.b = new ThreadLocal();
       this.c = false;
    }
    public void afterExecute(Runnable p0,Throwable p1){
       super.afterExecute(p0, p1);
       if (c.l) {
          h oh = this.b.get();
          if (oh == null) {
             return;
          }else {
             long l = System.currentTimeMillis() - oh.d;
             h oh1 = (this.c != null)? 500: 5000;
             if (l - oh1 >= 0 || oh.c - 200 >= 0) {
                c uoc = c.b();
                b uob = new b(uoc, oh.a, oh.b, (int)oh.c, (int)l);
                uoc.g.execute(oh.c - 200);
             }
             k.b();
          }
       }
       return;
    }
    public void beforeExecute(Thread p0,Runnable p1){
       String name;
       Iterator obj1;
       if (c.l) {
          long l = System.currentTimeMillis();
          StringBuilder str = "";
          ArrayList uArrayList = new ArrayList();
          HashSet hashSet = new HashSet();
          LinkedBlockingQueue linkedBlocki = new LinkedBlockingQueue();
          linkedBlocki.offer(p1);
          boolean b = true;
          while (!linkedBlocki.isEmpty()) {
             Object obj = linkedBlocki.poll();
             hashSet.add(Integer.valueOf(obj.hashCode()));
             name = obj.getClass().getName();
             if (!name.startsWith("java.util") && !name.startsWith("io.reactivex")) {
                uArrayList.add(name);
             }
             ArrayList uArrayList1 = new ArrayList();
             Class uClass = obj.getClass();
             while (uClass != null) {
                Field[] declaredFiel = uClass.getDeclaredFields();
                int len = declaredFiel.length;
                int i = 0;
                while (i < len) {
                   object oobject = declaredFiel[i];
                   try{
                      oobject.setAccessible(b);
                      obj1 = oobject.get(obj);
                      if (!obj1 instanceof Runnable && (!obj1 instanceof Callable && (!obj1 instanceof y && (!obj1 instanceof t && (obj1 instanceof g || obj1 instanceof a))))) {
                         uArrayList1.add(oobject);
                      }
                   }catch(java.lang.IllegalAccessException e0){
                      e0.printStackTrace();
                   }
                   i = i + 1;
                   b = true;
                }
                uClass = uClass.getSuperclass();
                b = true;
             }
             obj1 = uArrayList1.iterator();
             while (obj1.hasNext()) {
                Field uField = obj1.next();
                if (Modifier.isStatic(uField.getModifiers())) {
                   continue ;
                }else {
                   b = true;
                   try{
                      uField.setAccessible(b);
                      Object obj2 = uField.get(obj);
                      if (obj2 != null && !hashSet.contains(Integer.valueOf(obj2.hashCode()))) {
                         hashSet.add(Integer.valueOf(obj2.hashCode()));
                         linkedBlocki.offer(obj2);
                      }
                   }catch(java.lang.IllegalAccessException e0){
                      e0.printStackTrace();
                      goto label_009d ;
                   }
                }
             }
          }
          if (uArrayList.isEmpty()) {
             name = "Unknown";
          }else {
             int i1 = uArrayList.size() - 1;
             while (i1 >= 0) {
                str = str+uArrayList.get(i1)+' ';
                if (str.length() >= 100) {
                   break ;
                }
                i1 = i1 - 1;
             }
             name = str;
          }
          this.b.set(new h(name, p0.getName(), (System.currentTimeMillis() - l)));
          name = "Kwai_"+name;
          if (name.length() > 127) {
             name = name.substring(0, 127);
          }
          k.a(name);
       }else {
          int i2 = p1;
       }
       super.beforeExecute(p0, p1);
       return;
    }
}
