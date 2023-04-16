package com.oplus.ocs.base.task.d;
import com.oplus.ocs.base.task.b;
import java.util.concurrent.Executor;
import com.oplus.ocs.base.task.OnCanceledListener;
import java.lang.Object;
import com.oplus.ocs.base.utils.d;
import com.oplus.ocs.base.task.Task;
import com.oplus.ocs.base.task.e;
import java.lang.Runnable;

public final class d implements b	// class@000b10
{
    public Executor a;
    public final Object b;
    public OnCanceledListener c;

    public void d(Executor p0,OnCanceledListener p1){
       super();
       this.b = new Object();
       d.a(p0, "Executor is not null");
       d.a(p1, "OnCanceledListener is not null");
       this.a = p0;
       this.c = p1;
    }
    public final OnCanceledListener a(){
       d tb = this.b;
       _monitor_enter(tb);
       _monitor_exit(tb);
       return this.c;
    }
    public final void a(Task p0){
       d.a(p0, "Task is not null");
       if (p0.isCanceled()) {
          d tb = this.b;
          _monitor_enter(tb);
          if (this.c == null) {
             _monitor_exit(tb);
             return;
          }else {
             _monitor_exit(tb);
             this.a.execute(new e(this));
          }
       }
       return;
    }
}
