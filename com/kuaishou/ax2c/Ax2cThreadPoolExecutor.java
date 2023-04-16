package com.kuaishou.ax2c.Ax2cThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Callable;
import java.lang.String;
import java.util.concurrent.RunnableFuture;
import com.kuaishou.ax2c.TagFuture;
import java.util.concurrent.Future;
import java.lang.Object;
import java.util.Objects;
import java.lang.Runnable;

public class Ax2cThreadPoolExecutor extends ThreadPoolExecutor	// class@000fb2
{

    public void Ax2cThreadPoolExecutor(int p0,int p1,long p2,TimeUnit p3,BlockingQueue p4){
       super(p0, p1, p2, p3, p4);
    }
    public void Ax2cThreadPoolExecutor(int p0,int p1,long p2,TimeUnit p3,BlockingQueue p4,RejectedExecutionHandler p5){
       super(p0, p1, p2, p3, p4, p5);
    }
    public void Ax2cThreadPoolExecutor(int p0,int p1,long p2,TimeUnit p3,BlockingQueue p4,ThreadFactory p5){
       super(p0, p1, p2, p3, p4, p5);
    }
    public void Ax2cThreadPoolExecutor(int p0,int p1,long p2,TimeUnit p3,BlockingQueue p4,ThreadFactory p5,RejectedExecutionHandler p6){
       super(p0, p1, p2, p3, p4, p5, p6);
    }
    public RunnableFuture newTaskFor(Callable p0,String p1){
       TagFuture tagFuture = new TagFuture(p0);
       tagFuture.mTag = p1;
       return tagFuture;
    }
    public Future submit(Callable p0,String p1){
       if (p1 == null || p1.equals("")) {
          return this.submit(p0);
       }
       Objects.requireNonNull(p0);
       RunnableFuture runnableFutu = this.newTaskFor(p0, p1);
       this.execute(runnableFutu);
       return runnableFutu;
    }
}
