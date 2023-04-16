package com.oplus.ocs.base.task.q;
import java.lang.Object;
import com.oplus.ocs.base.task.Task;
import com.oplus.ocs.base.utils.d;
import java.util.Queue;
import com.oplus.ocs.base.task.b;
import java.util.ArrayDeque;

public final class q	// class@000b1d
{
    public Object a;
    public Queue b;
    public boolean c;

    public void q(){
       super();
       this.a = new Object();
    }
    public final void a(Task p0){
       d.a(p0, "Task is not be null");
       q ta = this.a;
       _monitor_enter(ta);
       if (this.b == null || this.c != null) {
          _monitor_exit(ta);
          return;
       }else {
          this.c = true;
          _monitor_exit(ta);
          q ta1 = this.a;
          _monitor_enter(ta1);
          b uob = this.b.poll();
          while (uob != null) {
             _monitor_exit(ta1);
             uob.a(p0);
          }
          this.c = false;
          _monitor_exit(ta1);
          return;
       }
    }
    public final void a(b p0){
       d.a(p0, "Cancellable is not be null");
       q ta = this.a;
       _monitor_enter(ta);
       if (this.b == null) {
          this.b = new ArrayDeque();
       }
       this.b.add(p0);
       _monitor_exit(ta);
       return;
    }
}
