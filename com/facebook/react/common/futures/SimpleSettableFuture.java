package com.facebook.react.common.futures.SimpleSettableFuture;
import java.util.concurrent.Future;
import java.lang.Object;
import java.util.concurrent.CountDownLatch;
import java.lang.UnsupportedOperationException;
import java.util.concurrent.ExecutionException;
import java.lang.Throwable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.lang.String;
import java.lang.RuntimeException;

public class SimpleSettableFuture implements Future	// class@00125b
{
    public final CountDownLatch b;
    public Object c;
    public Exception d;

    public void SimpleSettableFuture(){
       super();
       this.b = new CountDownLatch(1);
    }
    public boolean cancel(boolean p0){
       throw new UnsupportedOperationException();
    }
    public Object get(){
       this.b.await();
       if (this.d == null) {
          return this.c;
       }
       throw new ExecutionException(this.d);
    }
    public Object get(long p0,TimeUnit p1){
       if (!this.b.await(p0, p1)) {
          throw new TimeoutException("Timed out waiting for result");
       }
       if (this.d == null) {
          return this.c;
       }
       throw new ExecutionException(this.d);
    }
    public boolean isCancelled(){
       return false;
    }
    public boolean isDone(){
       boolean b = (!this.b.getCount())? true: false;
       return b;
    }
    public final void m(){
       if (this.b.getCount()) {
          return;
       }
       throw new RuntimeException("Result has already been set!");
    }
    public void q(Object p0){
       this.m();
       this.c = p0;
       this.b.countDown();
    }
}
