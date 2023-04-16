package com.oplus.ocs.base.task.m;
import com.oplus.ocs.base.task.OnCanceledListener;
import com.oplus.ocs.base.task.OnFailureListener;
import com.oplus.ocs.base.task.OnSuccessListener;
import com.oplus.ocs.base.task.b;
import java.util.concurrent.Executor;
import com.oplus.ocs.base.task.SuccessContinuation;
import com.oplus.ocs.base.task.TaskImpl;
import java.lang.Object;
import com.oplus.ocs.base.utils.d;
import com.oplus.ocs.base.task.Task;
import com.oplus.ocs.base.task.n;
import java.lang.Runnable;
import java.lang.Exception;

public final class m implements OnCanceledListener, OnFailureListener, OnSuccessListener, b	// class@000b19
{
    public SuccessContinuation a;
    public Executor b;
    public TaskImpl c;

    public void m(Executor p0,SuccessContinuation p1,TaskImpl p2){
       super();
       d.a(p0, "executor is not null");
       d.a(p1, "successContinuation is not null");
       d.a(p2, "task is not null");
       this.b = p0;
       this.a = p1;
       this.c = p2;
    }
    public final void a(Task p0){
       d.a(p0, "task is not null");
       this.b.execute(new n(this, p0));
    }
    public final void onCanceled(){
       this.c.tryCancel();
    }
    public final void onFailure(Exception p0){
       d.a(p0, "param exception is not null");
       this.c.setException(p0);
    }
    public final void onSuccess(Object p0){
       this.c.setResult(p0);
    }
}
