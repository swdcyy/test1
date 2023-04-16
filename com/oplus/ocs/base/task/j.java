package com.oplus.ocs.base.task.j;
import com.oplus.ocs.base.task.b;
import java.util.concurrent.Executor;
import com.oplus.ocs.base.task.OnSuccessListener;
import java.lang.Object;
import com.oplus.ocs.base.utils.d;
import com.oplus.ocs.base.task.Task;
import com.oplus.ocs.base.task.k;
import java.lang.Runnable;

public final class j implements b	// class@000b16
{
    public Executor a;
    public final Object b;
    public OnSuccessListener c;

    public void j(Executor p0,OnSuccessListener p1){
       super();
       this.b = new Object();
       d.a(p0, "Executor is not null");
       d.a(p1, "OnSuccessListener is not null");
       this.a = p0;
       this.c = p1;
    }
    public final OnSuccessListener a(){
       j tb = this.b;
       _monitor_enter(tb);
       _monitor_exit(tb);
       return this.c;
    }
    public final void a(Task p0){
       d.a(p0, "task is not null");
       if (p0.isSuccessful()) {
          j tb = this.b;
          _monitor_enter(tb);
          if (this.c == null) {
             _monitor_exit(tb);
             return;
          }else {
             _monitor_exit(tb);
             this.a.execute(new k(this, p0));
          }
       }
       return;
    }
}
