package com.kwai.sdk.eve.internal.task.EveTaskManager$a;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.task.EveTaskManager;
import zn7.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.task.EveTaskManager$a$a;

public final class EveTaskManager$a implements Runnable	// class@0015c0
{
    public final EveTaskManager b;
    public final a c;
    public final String d;

    public void EveTaskManager$a(EveTaskManager p0,a p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EveTaskManager$a.class, "1")) {
          return;
       }
       this.c.o(new EveTaskManager$a$a(this));
       return;
    }
}
