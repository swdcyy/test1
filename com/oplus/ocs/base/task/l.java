package com.oplus.ocs.base.task.l;
import java.lang.Runnable;
import com.oplus.ocs.base.task.c;
import com.oplus.ocs.base.task.Task;
import java.lang.Object;
import com.oplus.ocs.base.task.TaskImpl;
import com.oplus.ocs.base.task.Continuation;
import java.lang.Exception;
import java.lang.Throwable;
import java.lang.RuntimeException;

public final class l implements Runnable	// class@000b18
{
    public Task a;
    public c b;

    public void l(c p0,Task p1){
       super();
       this.b = p0;
       this.a = p1;
    }
    public final void run(){
       if (this.a.isCanceled()) {
          this.b.b.tryCancel();
          return;
       }else {
          Object obj = null;
          try{
             obj = this.b.a.then(this.a);
          }catch(java.lang.RuntimeException e1){
             if (e1.getCause() instanceof Exception) {
                this.b.b.setException(e1.getCause());
             }else {
                this.b.b.setException(e1);
             }
          }catch(java.lang.Exception e1){
             this.b.b.setException(e1);
          }
          this.b.b.setResult(obj);
          return;
       }
    }
}
