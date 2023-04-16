package com.oplus.ocs.base.task.TaskExecutors$MainExecutor;
import java.util.concurrent.Executor;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.lang.Runnable;
import com.oplus.ocs.base.utils.d;

public class TaskExecutors$MainExecutor implements Executor	// class@000b06
{
    public Handler a;

    public void TaskExecutors$MainExecutor(){
       super();
       this.a = new Handler(Looper.getMainLooper());
    }
    public void execute(Runnable p0){
       d.a(p0);
       this.a.post(p0);
    }
}
