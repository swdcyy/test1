package io.netty.util.internal.chmv8.ForkJoinPool$a;
import java.security.PrivilegedAction;
import java.lang.Object;
import io.netty.util.internal.chmv8.ForkJoinPool;
import java.lang.String;
import java.lang.System;
import java.lang.Integer;
import java.lang.ClassLoader;
import java.lang.Class;
import io.netty.util.internal.chmv8.ForkJoinPool$d;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.Runtime;

public final class ForkJoinPool$a implements PrivilegedAction	// class@00116c
{

    public void ForkJoinPool$a(){
       super();
    }
    public Object run(){
       ForkJoinPool$d uod;
       Thread$UncaughtExceptionHandler uncaughtExce;
       int i1;
       ForkJoinPool$d f = ForkJoinPool.F;
       int i = -1;
       try{
          String property = System.getProperty("java.util.concurrent.ForkJoinPool.common.parallelism");
          String property1 = System.getProperty("java.util.concurrent.ForkJoinPool.common.threadFactory");
          String property2 = System.getProperty("java.util.concurrent.ForkJoinPool.common.exceptionHandler");
          if (property != null) {
             i1 = Integer.parseInt(property);
             try{
             label_001e :
                if (property1 != null) {
                   f = ClassLoader.getSystemClassLoader().loadClass(property1).newInstance();
                }
                if (property2 != null) {
                   uod = f;
                   uncaughtExce = ClassLoader.getSystemClassLoader().loadClass(property2).newInstance();
                }else {
                   uod = e0;
                   uncaughtExce = null;
                }
             }catch(java.lang.Exception e0){
             }
          }else {
             i1 = -1;
             goto label_001e ;
          }
       }catch(java.lang.Exception e0){
          uod = e0;
          uncaughtExce = null;
          i1 = -1;
       }
       if (i1 < 0) {
          i1 = Runtime.getRuntime().availableProcessors() - 1;
          if (i1 < 0) {
             i1 = 0;
          }
       }
       int i2 = (i1 > 0x7fff)? 0x7fff: i1;
       ForkJoinPool uForkJoinPoo = new ForkJoinPool(i2, uod, uncaughtExce, 0, "ForkJoinPool.commonPool-worker-");
       return f;
    }
}
