package com.oplus.ocs.base.task.a;
import java.lang.Runnable;
import com.oplus.ocs.base.task.TaskImpl;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.lang.Exception;

public final class a implements Runnable	// class@000b0d
{
    public Callable a;
    public TaskImpl b;

    public void a(TaskImpl p0,Callable p1){
       super();
       this.b = p0;
       this.a = p1;
    }
    public final void run(){
       try{
          this.b.setResult(this.a.call());
          return;
       }catch(java.lang.Exception e0){
          this.b.setException(e0);
          return;
       }
    }
}
