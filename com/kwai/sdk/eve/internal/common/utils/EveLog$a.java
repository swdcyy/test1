package com.kwai.sdk.eve.internal.common.utils.EveLog$a;
import java.lang.Runnable;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.common.utils.EveLog;

public final class EveLog$a implements Runnable	// class@0014a2
{
    public final a b;

    public void EveLog$a(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EveLog$a.class, "1")) {
          return;
       }
       EveLog.i$default(this.b.invoke(), false, 2, null);
       return;
    }
}
