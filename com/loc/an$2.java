package com.loc.an$2;
import java.util.concurrent.ThreadFactory;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Runnable;
import java.lang.Thread;
import com.loc.an$2$1;
import java.lang.StringBuilder;
import java.lang.String;

public final class an$2 implements ThreadFactory	// class@001370
{
    public final AtomicInteger a;

    public void an$2(){
       this.a = new AtomicInteger(1);
    }
    public final Thread newThread(Runnable p0){
       return new an$2$1(this, p0, "pama#"+this.a.getAndIncrement());
    }
}
