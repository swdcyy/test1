package com.google.common.util.concurrent.e;
import xk.a;
import java.lang.String;
import java.lang.Class;
import java.util.logging.Logger;
import java.lang.Object;
import java.util.concurrent.TimeUnit;
import ok.n;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.lang.StringBuilder;
import java.lang.Throwable;

public abstract class e extends a	// class@001939
{
    public static final Logger b;

    static {
       e.b = Logger.getLogger(e.class.getName());
    }
    public void e(){
       super();
    }
    public boolean cancel(boolean p0){
       return false;
    }
    public abstract Object get();
    public Object get(long p0,TimeUnit p1){
       n.j(p1);
       return this.get();
    }
    public boolean isCancelled(){
       return false;
    }
    public boolean isDone(){
       return true;
    }
    public void u(Runnable p0,Executor p1){
       n.k(p0, "Runnable was null.");
       try{
          n.k(p1, "Executor was null.");
          p1.execute(p0);
       }catch(java.lang.RuntimeException e0){
          e.b.log(Level.SEVERE, "RuntimeException while executing runnable "+p0+" with executor "+p1, e0);
       }
       return;
    }
}
