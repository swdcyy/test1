package com.kwai.sdk.eve.internal.task.EveTaskManager$c$a;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.task.EveTaskManager$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.task.EveTaskManager$c$a$a;
import zn7.a;

public final class EveTaskManager$c$a implements Runnable	// class@0015c4
{
    public final EveTaskManager$c b;

    public void EveTaskManager$c$a(EveTaskManager$c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EveTaskManager$c$a.class, "1")) {
          return;
       }
       this.b.c.o(new EveTaskManager$c$a$a(this));
       return;
    }
}
