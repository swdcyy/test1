package com.kwai.framework.init.c$a;
import t45.e;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.lang.Runnable;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import ekd.e0;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.lang.RuntimeException;

public class c$a extends e	// class@000b66
{

    public void c$a(int p0,int p1,long p2,TimeUnit p3,BlockingQueue p4,ThreadFactory p5){
       super(p0, p1, p2, p3, p4, p5);
    }
    public void afterExecute(Runnable p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$a.class, "1")) {
          return;
       }
       super.afterExecute(p0, p1);
       if (e0.a) {
          try{
             if (p1 == null && (p0 instanceof Future && p0.isDone())) {
                p0.get();
             }
          }catch(java.lang.RuntimeException e3){
             p1 = e3;
          }catch(java.util.concurrent.ExecutionException e3){
             p1 = e3.getCause();
          }catch(java.lang.InterruptedException e0){
          }
          if (p1 instanceof RuntimeException) {
             throw new RuntimeException(p1);
          }
       }
       return;
    }
}
