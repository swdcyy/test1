package com.kwai.sdk.eve.internal.inference.EveInferenceManager$b;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager;
import zn7.a;
import ml5.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.task.EveTaskLifecycle;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;

public final class EveInferenceManager$b implements Runnable	// class@001546
{
    public final EveInferenceManager b;
    public final a c;
    public final a d;
    public final String e;

    public void EveInferenceManager$b(EveInferenceManager p0,a p1,a p2,String p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EveInferenceManager$b.class, "1")) {
          return;
       }
       if (this.c.g() == EveTaskLifecycle.ACTIVATED) {
          EveLog.i$default("EveInferenceManager#waitForStart lifecycle "+this.c.g(), false, 2, objArray);
          this.b.e(this.c, this.d, this.e);
       }
       return;
    }
}
