package com.oplus.ocs.base.task.h;
import com.oplus.ocs.base.task.b;
import java.util.concurrent.Executor;
import com.oplus.ocs.base.task.OnFailureListener;
import java.lang.Object;
import com.oplus.ocs.base.utils.d;
import com.oplus.ocs.base.task.Task;
import com.oplus.ocs.base.task.i;
import java.lang.Runnable;

public final class h implements b	// class@000b14
{
    public Executor a;
    public final Object b;
    public OnFailureListener c;

    public void h(Executor p0,OnFailureListener p1){
       super();
       this.b = new Object();
       d.a(p0, "Executor is not null");
       d.a(p1, "OnFailureListener is not null");
       this.a = p0;
       this.c = p1;
    }
    public final OnFailureListener a(){
       h tb = this.b;
       _monitor_enter(tb);
       _monitor_exit(tb);
       return this.c;
    }
    public final void a(Task p0){
       d.a(p0, "Task is not null");
       if (!p0.isSuccessful() && !p0.isCanceled()) {
          h tb = this.b;
          _monitor_enter(tb);
          if (this.c == null) {
             _monitor_exit(tb);
             return;
          }else {
             _monitor_exit(tb);
             this.a.execute(new i(this, p0));
          }
       }
       return;
    }
}
