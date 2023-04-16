package com.loc.an;
import java.lang.Thread$UncaughtExceptionHandler;
import com.loc.ak;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import com.loc.an$2;
import android.content.Context;
import java.lang.Thread;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import com.loc.w;
import java.lang.Integer;
import com.loc.k;
import java.lang.StringBuilder;
import java.util.concurrent.ExecutorService;
import com.loc.bd;
import java.lang.ref.WeakReference;
import com.loc.al;
import com.loc.ao;
import com.loc.cj;
import com.loc.an$1;
import com.loc.ck;
import com.loc.cl;

public final class an extends ak implements Thread$UncaughtExceptionHandler	// class@001371
{
    public Context d;
    public static ExecutorService e;
    public static Set f;
    public static WeakReference g;
    public static final ThreadFactory h;

    static {
       an.f = Collections.synchronizedSet(new HashSet());
       an.h = new an$2();
    }
    public void an(Context p0){
       super();
       this.d = p0;
       Thread$UncaughtExceptionHandler defaultUncau = Thread.getDefaultUncaughtExceptionHandler();
       this.b = defaultUncau;
       if (defaultUncau == null) {
          Thread.setDefaultUncaughtExceptionHandler(this);
          this.c = true;
          return;
       }else {
          String str = defaultUncau.toString();
          if (!str.startsWith("com.amap.apis.utils.core.dynamiccore") && (str.indexOf("com.amap.api") != -1 || str.indexOf("com.loc") != -1)) {
             this.c = false;
             return;
          }else {
             Thread.setDefaultUncaughtExceptionHandler(this);
             this.c = true;
             return;
          }
       }
    }
    public static Context a(an p0){
       return p0.d;
    }
    public static synchronized an a(Context p0,w p1){
       _monitor_enter(an.class);
       if (p1 == null) {
          throw new k("sdk info is null");
       }
       if (p1.a() == null || ("").equals(p1.a())) {
          throw new k("sdk name is invalid");
       }
       if (!an.f.add(Integer.valueOf(p1.hashCode()))) {
          _monitor_exit(an.class);
          return ak.a;
       }else {
          ak a = ak.a;
          if (a == null) {
             ak.a = new an(p0);
          }else {
             a.c = false;
          }
          ak a1 = ak.a;
          a1.a(p1, a1.c);
          _monitor_exit(an.class);
          return ak.a;
       }
    }
    public static void a(w p0,String p1,k p2){
       if (p2 != null) {
          an.a(p0, p1, p2.c(), p2.d(), p2.e(), p2.b());
       }
       return;
    }
    public static void a(w p0,String p1,String p2,String p3,String p4){
       an.a(p0, p1, p2, p3, "", p4);
    }
    public static void a(w p0,String p1,String p2,String p3,String p4,String p5){
       if (ak.a != null) {
          ak.a.a(p0, "path:"+p1+",type:"+p2+",gsid:"+p3+",csid:"+p4+",code:"+p5, "networkError");
       }
       return;
    }
    public static synchronized void b(){
       _monitor_enter(an.class);
       ExecutorService e = an.e;
       if (e != null) {
          e.shutdown();
       }
       bd.a();
       if (ak.a != null) {
          ak a = ak.a;
          if (Thread.getDefaultUncaughtExceptionHandler() == a) {
             ak b = a.b;
             if (b != null) {
                Thread.setDefaultUncaughtExceptionHandler(b);
             }
          }
       }
       ak.a = null;
       _monitor_exit(an.class);
       return;
    }
    public static void b(w p0,String p1,String p2){
       ak a = ak.a;
       if (a != null) {
          a.a(p0, p1, p2);
       }
       return;
    }
    public static void b(Throwable p0,String p1,String p2){
       ak a = ak.a;
       if (a != null) {
          a.a(p0, 1, p1, p2);
       }
       return;
    }
    public static void c(){
       WeakReference g = an.g;
       if (g != null && g.get() != null) {
          al.a(an.g.get());
          return;
       }else {
          ak a = ak.a;
          if (a != null) {
             a.a();
          }
          return;
       }
    }
    public final void a(){
       al.a(this.d);
    }
    public final void a(w p0,String p1,String p2){
       ao.a(p0, this.d, p2, p1);
    }
    public final void a(w p0,boolean p1){
       try{
          cj.a().b(new an$1(this, p0, p1));
          return;
       }catch(java.util.concurrent.RejectedExecutionException e0){
          return;
       }
    }
    public final void a(Throwable p0,int p1,String p2,String p3){
       ao.a(this.d, p0, p1, p2, p3);
    }
    public final void uncaughtException(Thread p0,Throwable p1){
       if (p1 == null) {
          return;
       }
       this.a(p1, 0, null, null);
       ak tb = this.b;
       if (tb != null) {
          Thread.setDefaultUncaughtExceptionHandler(tb);
          this.b.uncaughtException(p0, p1);
       }
       return;
    }
}
