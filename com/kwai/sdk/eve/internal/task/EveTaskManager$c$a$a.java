package com.kwai.sdk.eve.internal.task.EveTaskManager$c$a$a;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.task.EveTaskManager$c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.task.EveTaskManager$c;
import zn7.a;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.task.EveTaskLifecycle;
import com.kwai.sdk.eve.internal.task.EveTaskManager;

public final class EveTaskManager$c$a$a implements Runnable	// class@0015c3
{
    public final EveTaskManager$c$a b;

    public void EveTaskManager$c$a$a(EveTaskManager$c$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EveTaskManager$c$a$a.class, "1")) {
          return;
       }
       EveLog.i$default("EveTaskManager#pendActive installed "+this.b.b.c.n(), false, 2, objArray);
       if (this.b.b.c.g() == EveTaskLifecycle.INSTALLED) {
          EveTaskManager$c$a b = this.b.b;
          b.b.c(b.c);
       }
       return;
    }
}
