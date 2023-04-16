package com.kwai.sdk.eve.internal.task.EveTaskManager$a$a;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.task.EveTaskManager$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.task.EveTaskLifecycle;
import zn7.a;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.task.EveTaskManager;
import fn7.b;
import vm7.a;
import zn7.c;
import java.lang.Enum;
import java.util.List;
import trd.t;
import com.kwai.sdk.eve.internal.task.EveTaskManager$a$a$a;
import cn.vimfung.luascriptcore.LuaNativeUtil;

public final class EveTaskManager$a$a implements Runnable	// class@0015bf
{
    public final EveTaskManager$a b;

    public void EveTaskManager$a$a(EveTaskManager$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EveTaskManager$a$a.class, "1")) {
          return;
       }
       char c = ' ';
       EveLog.i$default("EveTaskManager#deactivate lifecycle "+this.b.d+c+this.b.c.g(), false, 2, objArray);
       this.b.b.d.d().d(this.b.c);
       switch (c.b[this.b.c.g().ordinal()]){
           case 1:
           case 2:
             EveTaskManager$a$a tb = this.b;
             tb.b.k(tb.c, true);
             LuaNativeUtil.freeMemoryByTaskId(this.b.d);
             break;
           case 3:
           case 5:
           case 6:
           case 4:
             this.b.c.s(EveTaskLifecycle.TERMINATING);
             EveLog.i$default(this.b.d+c+this.b.c.g()+": wait releaseTask for terminated", false, 2, objArray);
             this.b.c.v(t.k(EveTaskLifecycle.TERMINATED), new EveTaskManager$a$a$a(this));
             break;
           default:
       }
       return;
    }
}
