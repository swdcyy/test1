package com.kwai.framework.init.d;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.init.e;
import java.util.concurrent.CountDownLatch;
import java.lang.InterruptedException;

public final class d implements Runnable	// class@000b6a
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void run(){
       List a = e.a;
       try{
          e.f.await();
       }catch(java.lang.InterruptedException e0){
          e0.printStackTrace();
       }
       return;
    }
}
