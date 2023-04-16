package com.loc.bd$1;
import java.util.concurrent.ThreadFactory;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Runnable;
import java.lang.Thread;
import java.lang.StringBuilder;
import java.lang.String;

public final class bd$1 implements ThreadFactory	// class@001383
{
    public final AtomicInteger a;

    public void bd$1(){
       this.a = new AtomicInteger(1);
    }
    public final Thread newThread(Runnable p0){
       return new Thread(p0, "disklrucache#"+this.a.getAndIncrement());
    }
}
