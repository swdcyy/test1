package com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil$logPublisher$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import io.reactivex.subjects.ReplaySubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TaskCenterLogUtil$logPublisher$2 extends Lambda implements a	// class@00075d
{
    public static final TaskCenterLogUtil$logPublisher$2 INSTANCE;

    static {
       TaskCenterLogUtil$logPublisher$2.INSTANCE = new TaskCenterLogUtil$logPublisher$2();
    }
    public void TaskCenterLogUtil$logPublisher$2(){
       super(0);
    }
    public final ReplaySubject invoke(){
       Object obj = PatchProxy.apply(null, this, TaskCenterLogUtil$logPublisher$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ReplaySubject.i(100);
    }
    public Object invoke(){
       return this.invoke();
    }
}
