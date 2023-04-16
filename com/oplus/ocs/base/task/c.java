package com.oplus.ocs.base.task.c;
import com.oplus.ocs.base.task.b;
import java.util.concurrent.Executor;
import com.oplus.ocs.base.task.Continuation;
import com.oplus.ocs.base.task.TaskImpl;
import java.lang.Object;
import com.oplus.ocs.base.utils.d;
import com.oplus.ocs.base.task.Task;
import com.oplus.ocs.base.task.l;
import java.lang.Runnable;

public final class c implements b	// class@000b0f
{
    public Continuation a;
    public TaskImpl b;
    public Executor c;

    public void c(Executor p0,Continuation p1,TaskImpl p2){
       super();
       d.a(p0, "Executor is not null");
       d.a(p1, "Continuation is not null");
       d.a(p2, "TaskImpl is not null");
       this.c = p0;
       this.a = p1;
       this.b = p2;
    }
    public final void a(Task p0){
       d.a(p0, "Task is not null");
       this.c.execute(new l(this, p0));
    }
}
