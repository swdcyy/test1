package com.yxcorp.utility.AsyncTask$a;
import java.util.concurrent.ThreadFactory;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Runnable;
import java.lang.Thread;
import java.lang.StringBuilder;
import java.lang.String;

public class AsyncTask$a implements ThreadFactory	// class@00099d
{
    public final AtomicInteger b;

    public void AsyncTask$a(){
       super();
       this.b = new AtomicInteger(1);
    }
    public Thread newThread(Runnable p0){
       return new Thread(p0, "AsyncTask #"+this.b.getAndIncrement());
    }
}
