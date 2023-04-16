package com.alipay.android.phone.mrpc.core.n;
import java.util.concurrent.ThreadFactory;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Runnable;
import java.lang.Thread;
import java.lang.StringBuilder;
import java.lang.String;

public final class n implements ThreadFactory	// class@000e54
{
    public final AtomicInteger a;

    public void n(){
       this.a = new AtomicInteger(1);
    }
    public final Thread newThread(Runnable p0){
       Thread thread = new Thread(p0, "com.alipay.mobile.common.transport.http.HttpManager.HttpWorker #"+this.a.getAndIncrement());
       thread.setPriority(4);
       return thread;
    }
}
