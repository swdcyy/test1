package com.oplus.ocs.base.task.TaskExecutors;
import com.oplus.ocs.base.task.TaskExecutors$MainExecutor;
import com.oplus.ocs.base.task.r;
import java.lang.Object;

public class TaskExecutors	// class@000b07
{
    public static final Executor CURRENT_THREAD;
    public static final Executor MAIN_THREAD;

    static {
       TaskExecutors.MAIN_THREAD = new TaskExecutors$MainExecutor();
       TaskExecutors.CURRENT_THREAD = new r();
    }
    public void TaskExecutors(){
       super();
    }
}
