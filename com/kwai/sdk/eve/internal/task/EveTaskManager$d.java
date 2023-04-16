package com.kwai.sdk.eve.internal.task.EveTaskManager$d;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.task.EveTaskManager;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import qrd.l1;

public final class EveTaskManager$d implements Runnable	// class@0015c6
{
    public final EveTaskManager b;
    public final String c;

    public void EveTaskManager$d(EveTaskManager p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EveTaskManager$d.class, "1")) {
          return;
       }
       EveTaskManager c = this.b.c;
       _monitor_enter(c);
       this.b.c.remove(this.c);
       _monitor_exit(c);
       return;
    }
}
