package com.yxcorp.gifshow.init.module.c;
import java.util.concurrent.RejectedExecutionHandler;
import java.lang.Object;
import java.lang.Runnable;
import java.util.concurrent.ThreadPoolExecutor;
import com.yxcorp.gifshow.init.module.AsyncLogDelegateInitModule;
import com.kwai.framework.exceptionhandler.exception.RejectedExecutionWrapperException;
import java.util.concurrent.RejectedExecutionException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Exception;

public final class c implements RejectedExecutionHandler	// class@0019b7
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final void rejectedExecution(Runnable p0,ThreadPoolExecutor p1){
       throw new RejectedExecutionWrapperException(p1, new RejectedExecutionException("Task "+p0.toString()+" rejected from "+p1.toString()));
    }
}
