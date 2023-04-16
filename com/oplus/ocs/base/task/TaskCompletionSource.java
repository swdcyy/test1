package com.oplus.ocs.base.task.TaskCompletionSource;
import java.lang.Object;
import com.oplus.ocs.base.task.TaskImpl;
import com.oplus.ocs.base.task.Task;
import java.lang.Exception;
import com.oplus.ocs.base.utils.d;

public class TaskCompletionSource	// class@000b05
{
    public TaskImpl a;

    public void TaskCompletionSource(){
       super();
       this.a = new TaskImpl();
    }
    public Task getTask(){
       return this.a;
    }
    public void setException(Exception p0){
       d.a(p0);
       this.a.setException(p0);
    }
    public void setResult(Object p0){
       this.a.setResult(p0);
    }
    public boolean trySetException(Exception p0){
       d.a(p0);
       return this.a.trySetException(p0);
    }
    public boolean trySetResult(Object p0){
       return this.a.trySetResult(p0);
    }
}
