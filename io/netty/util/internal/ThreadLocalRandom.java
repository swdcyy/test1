package io.netty.util.internal.ThreadLocalRandom;
import java.util.Random;
import java.lang.Class;
import ard.b;
import ard.c;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.String;
import zqd.x;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.Long;
import java.lang.StringBuilder;
import io.netty.util.internal.ThreadLocalRandom$a;
import java.lang.Thread;
import io.netty.util.internal.ThreadLocalRandom$b;
import java.lang.Thread$UncaughtExceptionHandler;
import java.util.concurrent.LinkedBlockingQueue;
import java.lang.System;
import java.lang.Object;
import java.util.concurrent.TimeUnit;
import zqd.d;
import zqd.z;
import java.util.concurrent.BlockingQueue;
import java.lang.IllegalArgumentException;
import java.lang.UnsupportedOperationException;

public final class ThreadLocalRandom extends Random	// class@001121
{
    public boolean initialized;
    public long pad0;
    public long pad1;
    public long pad2;
    public long pad3;
    public long pad4;
    public long pad5;
    public long pad6;
    public long pad7;
    public long rnd;
    public static final AtomicLong b;
    public static long c;
    public static final Thread d;
    public static final long e;
    public static final b logger;
    public static long seedGeneratorEndTime;
    public static final BlockingQueue seedQueue;
    public static final long serialVersionUID;

    static {
       ThreadLocalRandom.logger = c.a(ThreadLocalRandom.class);
       ThreadLocalRandom.b = new AtomicLong();
       String str = "io.netty.initialSeedUniquifier";
       String str1 = x.a(str);
       if (str1 != null) {
          try{
             str1 = (str1.trim()).toLowerCase();
             if (x.d.matcher(str1).matches()) {
                long l = Long.parseLong(str1);
             label_005e :
                ThreadLocalRandom.c = l;
                if (!ThreadLocalRandom.c) {
                   ThreadLocalRandom$a uoa = new ThreadLocalRandom$a("initialSeedUniquifierGenerator");
                   ThreadLocalRandom.d = uoa;
                   uoa.setDaemon(true);
                   uoa.setUncaughtExceptionHandler(new ThreadLocalRandom$b());
                   ThreadLocalRandom.seedQueue = new LinkedBlockingQueue();
                   ThreadLocalRandom.e = System.nanoTime();
                   uoa.start();
                }else {
                   ThreadLocalRandom.d = null;
                   ThreadLocalRandom.seedQueue = null;
                   ThreadLocalRandom.e = 0;
                }
             }else {
                x.e("Unable to parse the long integer system property \'"+e0+"\':"+str1+" - "+"using the default value: "+0);
             }
          }catch(java.lang.Exception e0){
          }
       }
    }
    public void ThreadLocalRandom(){
       long l2;
       while (true) {
          AtomicLong b = ThreadLocalRandom.b;
          long l = b.get();
          Object[] objArray = null;
          long l1 = (v5 = l - objArray)? l: ThreadLocalRandom.getInitialSeedUniquifier();
          l2 = 0x285d320ad33fdb5 * l1;
          if (b.compareAndSet(l, l2)) {
             if (!v5) {
                b logger = ThreadLocalRandom.logger;
                if (logger.isDebugEnabled()) {
                   int i = 0;
                   if (ThreadLocalRandom.seedGeneratorEndTime - objArray) {
                      objArray = new Object[]{Long.valueOf(l1),Long.valueOf(TimeUnit.NANOSECONDS.toMillis((ThreadLocalRandom.seedGeneratorEndTime - ThreadLocalRandom.e)))};
                      logger.debug(String.format("-Dio.netty.initialSeedUniquifier: 0x%016x \(took %d ms\)", objArray));
                      break ;
                   }else {
                      objArray = new Object[]{Long.valueOf(l1)};
                      logger.debug(String.format("-Dio.netty.initialSeedUniquifier: 0x%016x", objArray));
                      break ;
                   }
                }
             }
             break ;
          }
       }
       super((System.nanoTime() ^ l2));
       this.initialized = true;
       return;
    }
    public static ThreadLocalRandom current(){
       d uod = d.b();
       z f = uod.f;
       if (f == null) {
          f = new ThreadLocalRandom();
          uod.f = f;
       }
       return f;
    }
    public static long getInitialSeedUniquifier(){
       long c = ThreadLocalRandom.c;
       if (c) {
          return c;
       }
       _monitor_enter(ThreadLocalRandom.class);
       long c1 = ThreadLocalRandom.c;
       if (c1) {
          _monitor_exit(ThreadLocalRandom.class);
          return c1;
       }else {
          long l = 3;
          long l1 = ThreadLocalRandom.e + TimeUnit.SECONDS.toNanos(l);
          try{
             while (true) {
                long l2 = l1 - System.nanoTime();
                int i = 1;
                byte[] uobyteArray = ((v13 = l2) <= 0)? ThreadLocalRandom.seedQueue.poll(): ThreadLocalRandom.seedQueue.poll(l2, TimeUnit.NANOSECONDS);
                if (uobyteArray != null) {
                   c1 = ((long)uobyteArray[7] & 255) | (((((((((long)uobyteArray[0] & 255) << 56) | (((long)uobyteArray[i] & 255) << 48)) | (((long)uobyteArray[2] & 255) << 40)) | (((long)uobyteArray[3] & 255) << 32)) | (((long)uobyteArray[4] & 255) << 24)) | (((long)uobyteArray[5] & 255) << 16)) | (((long)uobyteArray[6] & 255) << 8));
                }else {
                   if (v13 <= 0) {
                      ThreadLocalRandom.d.interrupt();
                      ThreadLocalRandom.logger.warn("Failed to generate a seed from SecureRandom within {} seconds. Not enough entropy?", Long.valueOf(l));
                   }
                }
                Thread thread = null;
             }
          }catch(java.lang.InterruptedException e0){
             ThreadLocalRandom.logger.warn("Failed to generate a seed from SecureRandom due to an InterruptedException.");
          }
          c1 = (c1 ^ 0x3255ecdc33bae119) ^ Long.reverse(System.nanoTime());
          ThreadLocalRandom.c = c1;
          if (i) {
             Thread.currentThread().interrupt();
             ThreadLocalRandom.d.interrupt();
          }
          if (!ThreadLocalRandom.seedGeneratorEndTime) {
             ThreadLocalRandom.seedGeneratorEndTime = System.nanoTime();
          }
          _monitor_exit(e0);
          return c1;
       }
    }
    public static void setInitialSeedUniquifier(long p0){
       ThreadLocalRandom.c = p0;
    }
    public int next(int p0){
       long l = ((this.rnd * 0x5deece66d) + 11) & 0xffffffffffff;
       this.rnd = l;
       return (int)(l >> (p0 - 48));
    }
    public double nextDouble(double p0){
       if (p0 > 0) {
          return (this.nextDouble() * p0);
       }
       throw new IllegalArgumentException("n must be positive");
    }
    public double nextDouble(double p0,double p1){
       if (p0 - p1 < 0) {
          return ((this.nextDouble() * (p1 - p0)) + p0);
       }
       throw new IllegalArgumentException();
    }
    public int nextInt(int p0,int p1){
       if (p0 < p1) {
          return (this.nextInt((p1 - p0)) + p0);
       }
       throw new IllegalArgumentException();
    }
    public long nextLong(long p0){
       long l = 0;
       if (p0 - l <= 0) {
       label_002c :
          throw new IllegalArgumentException("n must be positive");
       }
       while (p0 - 0x7fffffff >= 0) {
          int i = this.next(2);
          long l1 = p0 >> 1;
          int i1 = i & 0x02;
          if (i1) {
             l1 = p0 - l1;
          }
          i = i & 0x01;
          if (!i) {
             p0 = p0 - l1;
             l = l + p0;
          }
          p0 = l1;
       }
       return (l + (long)this.nextInt((int)p0));
    }
    public long nextLong(long p0,long p1){
       if (p0 - p1 < 0) {
          return (this.nextLong((p1 - p0)) + p0);
       }
       throw new IllegalArgumentException();
    }
    public void setSeed(long p0){
       if (this.initialized != null) {
          throw new UnsupportedOperationException();
       }
       this.rnd = (p0 ^ 0x5deece66d) & 0xffffffffffff;
       return;
    }
}
