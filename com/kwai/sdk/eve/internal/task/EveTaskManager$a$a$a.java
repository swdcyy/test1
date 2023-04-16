package com.kwai.sdk.eve.internal.task.EveTaskManager$a$a$a;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.task.EveTaskManager$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.task.EveTaskManager$a;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import zn7.a;
import com.kwai.sdk.eve.internal.task.EveTaskManager;
import cn.vimfung.luascriptcore.LuaNativeUtil;

public final class EveTaskManager$a$a$a implements Runnable	// class@0015be
{
    public final EveTaskManager$a$a b;

    public void EveTaskManager$a$a$a(EveTaskManager$a$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EveTaskManager$a$a$a.class, "1")) {
          return;
       }
       EveLog.i$default(this.b.b.d+" terminated, just unload", false, 2, objArray);
       EveTaskManager$a$a b = this.b.b;
       b.b.k(b.c, true);
       LuaNativeUtil.freeMemoryByTaskId(this.b.b.d);
       return;
    }
}
