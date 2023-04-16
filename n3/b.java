package n3.b;
import l3.e;
import q3.c;
import l3.b;
import java.lang.String;
import k3.h;
import android.content.Context;
import k3.a;
import x3.a;
import l3.i;
import java.lang.Object;
import java.util.HashSet;
import q3.d;
import n3.a;
import k3.k;
import u3.r;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import java.lang.Throwable;
import java.lang.System;
import androidx.work.WorkInfo$State;
import android.os.Build$VERSION;
import k3.b;
import java.lang.Iterable;
import java.util.Collection;
import java.util.Set;
import java.util.List;
import java.util.Iterator;
import android.app.Application;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.reflect.Method;
import android.os.Process;
import android.app.ActivityManager;
import android.app.ActivityManager$RunningAppProcessInfo;
import l3.d;

public class b implements e, c, b	// class@0026b4
{
    public final Context b;
    public final i c;
    public final d d;
    public final Set e;
    public a f;
    public boolean g;
    public final Object h;
    public Boolean i;
    public static final String j;

    static {
       b.j = h.f("GreedyScheduler");
    }
    public void b(Context p0,a p1,a p2,i p3){
       super();
       this.e = new HashSet();
       this.b = p0;
       this.c = p3;
       this.d = new d(p0, p2, this);
       this.f = new a(this, p1.h());
       this.h = new Object();
    }
    public void a(r[] p0){
       Throwable[] throwableArr;
       Object[] objArray;
       Throwable[] throwableArr1;
       if (this.i == null) {
          this.i = Boolean.valueOf(TextUtils.equals(this.b.getPackageName(), this.f()));
       }
       int i = 0;
       if (!this.i.booleanValue()) {
          throwableArr = new Throwable[i];
          h.c().d(b.j, "Ignoring schedule request in non-main process", throwableArr);
          return;
       }else {
          this.g();
          HashSet hashSet = new HashSet();
          HashSet hashSet1 = new HashSet();
          int len = p0.length;
          int i1 = 0;
          b uob = 1;
          while (i1 < len) {
             object oobject = p0[i1];
             long l = oobject.a();
             long l1 = System.currentTimeMillis();
             if (oobject.b == WorkInfo$State.ENQUEUED) {
                if (l1 - l < 0) {
                   uob = this.f;
                   if (uob != null) {
                      uob.a(oobject);
                   }
                }else if(oobject.b()){
                   int sDK_INT = Build$VERSION.SDK_INT;
                   if (sDK_INT >= 23 && oobject.j.h()) {
                      objArray = new Object[uob];
                      objArray[i] = oobject;
                      throwableArr1 = new Throwable[i];
                      h.c().a(b.j, String.format("Ignoring WorkSpec %s, Requires device idle.", objArray), throwableArr1);
                   }else if(sDK_INT >= 24 && oobject.j.e()){
                      objArray = new Object[uob];
                      objArray[i] = oobject;
                      throwableArr1 = new Throwable[i];
                      h.c().a(b.j, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", objArray), throwableArr1);
                   }else {
                      hashSet.add(oobject);
                      hashSet1.add(oobject.a);
                   }
                }else {
                   objArray = new Object[uob];
                   objArray[i] = oobject.a;
                   Throwable[] throwableArr2 = new Throwable[i];
                   h.c().a(b.j, String.format("Starting work for %s", objArray), throwableArr2);
                   this.c.O(oobject.a);
                }
             }
             i1 = i1 + 1;
          }
          b th = this.h;
          _monitor_enter(th);
          if (!hashSet.isEmpty()) {
             objArray = new Object[uob];
             objArray[i] = TextUtils.join(",", hashSet1);
             throwableArr = new Throwable[i];
             h.c().a(b.j, String.format("Starting tracking for [%s]", objArray), throwableArr);
             this.e.addAll(hashSet);
             this.d.d(this.e);
          }
          _monitor_exit(th);
          return;
       }
    }
    public boolean b(){
       return false;
    }
    public void c(List p0){
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          Object[] objArray = new Object[]{str};
          Throwable[] throwableArr = new Throwable[0];
          h.c().a(b.j, String.format("Constraints not met: Cancelling work ID %s", objArray), throwableArr);
          this.c.R(str);
       }
       return;
    }
    public void cancel(String p0){
       Throwable[] throwableArr;
       if (this.i == null) {
          this.i = Boolean.valueOf(TextUtils.equals(this.b.getPackageName(), this.f()));
       }
       int i = 0;
       if (!this.i.booleanValue()) {
          throwableArr = new Throwable[i];
          h.c().d(b.j, "Ignoring schedule request in non-main process", throwableArr);
          return;
       }else {
          this.g();
          Object[] objArray = new Object[]{p0};
          throwableArr = new Throwable[i];
          h.c().a(b.j, String.format("Cancelling work ID %s", objArray), throwableArr);
          b tf = this.f;
          if (tf != null) {
             tf.b(p0);
          }
          this.c.R(p0);
          return;
       }
    }
    public void d(String p0,boolean p1){
       this.h(p0);
    }
    public void e(List p0){
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          Object[] objArray = new Object[]{str};
          Throwable[] throwableArr = new Throwable[0];
          h.c().a(b.j, String.format("Constraints met: Scheduling work ID %s", objArray), throwableArr);
          this.c.O(str);
       }
       return;
    }
    public final String f(){
       if (Build$VERSION.SDK_INT >= 28) {
          return Application.getProcessName();
       }
       ActivityManager$RunningAppProcessInfo runningAppPr = null;
       boolean b = false;
       Class[] uClassArray = new Class[b];
       Method declaredMeth = Class.forName("android.app.ActivityThread", b, b.class.getClassLoader()).getDeclaredMethod("currentProcessName", uClassArray);
       declaredMeth.setAccessible(true);
       Object[] objArray = new Object[b];
       ActivityManager$RunningAppProcessInfo obj = declaredMeth.invoke(runningAppPr, objArray);
       if (obj instanceof String) {
          return obj;
       }
       int i = Process.myPid();
       ActivityManager systemServic = this.b.getSystemService("activity");
       if (systemServic != null) {
          List runningAppPr1 = systemServic.getRunningAppProcesses();
          if (runningAppPr1 != null && !runningAppPr1.isEmpty()) {
             Iterator iterator = runningAppPr1.iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                if (obj.pid == i) {
                   runningAppPr = obj.processName;
                   break ;
                }
             }
          }
       }
       return runningAppPr;
    }
    public final void g(){
       if (this.g == null) {
          this.c.F().c(this);
          this.g = true;
       }
       return;
    }
    public final void h(String p0){
       b th = this.h;
       _monitor_enter(th);
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          r or = iterator.next();
          if ((or.a).equals(p0)) {
             Object[] objArray = new Object[]{p0};
             Throwable[] throwableArr = new Throwable[0];
             h.c().a(b.j, String.format("Stopping tracking for %s", objArray), throwableArr);
             this.e.remove(or);
             this.d.d(this.e);
             break ;
          }
       }
       _monitor_exit(th);
       return;
    }
}
