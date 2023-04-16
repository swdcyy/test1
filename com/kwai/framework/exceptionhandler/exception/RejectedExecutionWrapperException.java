package com.kwai.framework.exceptionhandler.exception.RejectedExecutionWrapperException;
import java.lang.RuntimeException;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.Exception;
import java.lang.Throwable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.concurrent.BlockingQueue;
import java.util.Iterator;
import java.lang.Runnable;

public class RejectedExecutionWrapperException extends RuntimeException	// class@00153f
{
    public ThreadPoolExecutor mExecutor;

    public void RejectedExecutionWrapperException(ThreadPoolExecutor p0,Exception p1){
       super(p1);
       this.mExecutor = p0;
    }
    public String dumpBlockingQueueInfo(){
       StringBuilder obj = PatchProxy.apply(null, this, RejectedExecutionWrapperException.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       BlockingQueue queue = this.mExecutor.getQueue();
       if (queue != null) {
          Iterator iterator = queue.iterator();
          while (iterator.hasNext()) {
             obj = obj+10+iterator.next().toString();
          }
          obj = obj+10;
       }
       return obj;
    }
}
