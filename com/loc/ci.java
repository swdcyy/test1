package com.loc.ci;
import java.util.concurrent.ThreadFactory;
import java.lang.Runtime;
import java.lang.Math;
import com.loc.ci$a;
import java.lang.Object;
import java.util.concurrent.Executors;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Thread$UncaughtExceptionHandler;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.NullPointerException;
import java.lang.Runnable;
import java.lang.Thread;
import com.loc.ci$1;
import java.lang.Long;
import java.lang.StringBuilder;

public final class ci implements ThreadFactory	// class@0013bc
{
    public final AtomicLong a;
    public final ThreadFactory b;
    public final Thread$UncaughtExceptionHandler c;
    public final String d;
    public final Integer e;
    public final Boolean f;
    public final int g;
    public final int h;
    public final BlockingQueue i;
    public final int j;
    public static final int k;
    public static final int l;
    public static final int m;

    static {
       int i = Runtime.getRuntime().availableProcessors();
       ci.k = i;
       ci.l = Math.max(2, Math.min((i - 1), 4));
       ci.m = (i * 2) + 1;
    }
    public void ci(ci$a p0){
       super();
       ThreadFactory threadFactor = (ci$a.a(p0) == null)? Executors.defaultThreadFactory(): ci$a.a(p0);
       this.b = threadFactor;
       int i = ci$a.b(p0);
       this.g = i;
       int m = ci.m;
       this.h = m;
       if (m >= i) {
          this.j = ci$a.c(p0);
          LinkedBlockingQueue linkedBlocki = (ci$a.d(p0) == null)? new LinkedBlockingQueue(256): ci$a.d(p0);
          this.i = linkedBlocki;
          String str = (TextUtils.isEmpty(ci$a.e(p0)))? "amap-threadpool": ci$a.e(p0);
          this.d = str;
          this.e = ci$a.f(p0);
          this.f = ci$a.g(p0);
          this.c = ci$a.h(p0);
          this.a = new AtomicLong();
          return;
       }else {
          throw new NullPointerException("maxPoolSize must > corePoolSize!");
       }
    }
    public void ci(ci$a p0,byte p1){
       super(p0);
    }
    public static int e(){
       return ci.l;
    }
    public static int f(){
       return ci.m;
    }
    public final int a(){
       return this.g;
    }
    public final int b(){
       return this.h;
    }
    public final BlockingQueue c(){
       return this.i;
    }
    public final int d(){
       return this.j;
    }
    public final ThreadFactory g(){
       return this.b;
    }
    public final String h(){
       return this.d;
    }
    public final Boolean i(){
       return this.f;
    }
    public final Integer j(){
       return this.e;
    }
    public final Thread$UncaughtExceptionHandler k(){
       return this.c;
    }
    public final Thread newThread(Runnable p0){
       ci$1 u1 = new ci$1(this, p0);
       Thread thread = this.g().newThread(p0);
       if (this.h() != null) {
          Object[] objArray = new Object[]{Long.valueOf(this.a.incrementAndGet())};
          thread.setName(String.format(this.h()+"-%d", objArray));
       }
       if (this.k() != null) {
          thread.setUncaughtExceptionHandler(this.k());
       }
       if (this.j() != null) {
          thread.setPriority(this.j().intValue());
       }
       if (this.i() != null) {
          thread.setDaemon(this.i().booleanValue());
       }
       return thread;
    }
}
