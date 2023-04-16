package com.kwai.sdk.eve.internal.task.EveTaskManager$c;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.task.EveTaskManager;
import zn7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.task.EveTaskManager$c$a;

public final class EveTaskManager$c implements Runnable	// class@0015c5
{
    public final EveTaskManager b;
    public final a c;

    public void EveTaskManager$c(EveTaskManager p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EveTaskManager$c.class, "1")) {
          return;
       }
       this.b.j(this.c, new EveTaskManager$c$a(this));
       return;
    }
}
