package com.kwai.sdk.eve.internal.task.EveTaskManager$b;
import java.lang.Runnable;
import zn7.a;
import com.kwai.sdk.eve.internal.task.EveTaskManager;
import tn7.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.task.EveTaskManager$b$a;

public final class EveTaskManager$b implements Runnable	// class@0015c2
{
    public final a b;
    public final EveTaskManager c;
    public final b d;

    public void EveTaskManager$b(a p0,EveTaskManager p1,b p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, EveTaskManager$b.class, "1")) {
          return;
       }
       this.b.o(new EveTaskManager$b$a(this));
       PatchProxy.onMethodExit(EveTaskManager$b.class, "1");
       return;
    }
}
