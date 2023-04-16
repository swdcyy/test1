package com.kwai.sdk.eve.internal.task.TaskLifecycleException;
import java.lang.Exception;
import com.kwai.sdk.eve.internal.task.EveTaskLifecycle;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class TaskLifecycleException extends Exception	// class@0015d0
{

    public void TaskLifecycleException(EveTaskLifecycle p0,EveTaskLifecycle p1){
       a.p(p1, "to");
       super("Can\'t move from "+p0+" to "+p1);
    }
}
