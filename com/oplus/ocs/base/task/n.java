package com.oplus.ocs.base.task.n;
import java.lang.Runnable;
import com.oplus.ocs.base.task.m;
import com.oplus.ocs.base.task.Task;
import java.lang.Object;
import com.oplus.ocs.base.task.SuccessContinuation;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Exception;
import com.oplus.ocs.base.task.TaskExecutors;
import java.util.concurrent.Executor;
import com.oplus.ocs.base.task.OnSuccessListener;
import com.oplus.ocs.base.task.OnFailureListener;
import com.oplus.ocs.base.task.OnCanceledListener;
import java.lang.Throwable;
import java.lang.RuntimeException;

public final class n implements Runnable	// class@000b1a
{
    public m a;
    public Task b;

    public void n(m p0,Task p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void run(){
       try{
          Task task = this.a.a.then(this.b.getResult());
          if (task == null) {
             this.a.onFailure(new NullPointerException("Continuation returned null"));
             return;
          }else {
             Executor cURRENT_THRE = TaskExecutors.CURRENT_THREAD;
             task.addOnSuccessListener(cURRENT_THRE, this.a);
             task.addOnFailureListener(cURRENT_THRE, this.a);
             task.addOnCanceledListener(cURRENT_THRE, this.a);
             return;
          }
       }catch(java.lang.RuntimeException e0){
          if (e0.getCause() instanceof Exception) {
             this.a.onFailure(e0.getCause());
             return;
          }else {
             this.a.onFailure(e0);
             return;
          }
       }catch(java.lang.Exception e0){
          this.a.onFailure(e0);
          return;
       }
    }
}
