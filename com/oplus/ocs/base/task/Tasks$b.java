package com.oplus.ocs.base.task.Tasks$b;
import com.oplus.ocs.base.task.Tasks$c;
import java.lang.Object;
import java.util.concurrent.CountDownLatch;
import java.lang.Exception;

public final class Tasks$b implements Tasks$c	// class@000b0a
{
    public CountDownLatch a;

    public void Tasks$b(){
       super();
       this.a = new CountDownLatch(1);
    }
    public void Tasks$b(byte p0){
       super();
    }
    public final void onCanceled(){
       this.a.countDown();
    }
    public final void onFailure(Exception p0){
       this.a.countDown();
    }
    public final void onSuccess(Object p0){
       this.a.countDown();
    }
}
