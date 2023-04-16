package com.oplus.ocs.base.task.f;
import com.oplus.ocs.base.task.b;
import java.util.concurrent.Executor;
import com.oplus.ocs.base.task.OnCompleteListener;
import java.lang.Object;
import com.oplus.ocs.base.utils.d;
import com.oplus.ocs.base.task.Task;
import com.oplus.ocs.base.task.g;
import java.lang.Runnable;

public final class f implements b	// class@000b12
{
    public final Object a;
    public Executor b;
    public OnCompleteListener c;

    public void f(Executor p0,OnCompleteListener p1){
       super();
       this.a = new Object();
       d.a(p0, "Executor is not null");
       d.a(p1, "OnCompleteListener is not null");
       this.b = p0;
       this.c = p1;
    }
    public final OnCompleteListener a(){
       f ta = this.a;
       _monitor_enter(ta);
       _monitor_exit(ta);
       return this.c;
    }
    public final void a(Task p0){
       d.a(p0, "Task is not null");
       f ta = this.a;
       _monitor_enter(ta);
       if (this.c == null) {
          _monitor_exit(ta);
          return;
       }else {
          _monitor_exit(ta);
          this.b.execute(new g(this, p0));
          return;
       }
    }
}
