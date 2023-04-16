package com.kuaishou.krn.apm.memory.KdsLeakDetector$a$b;
import java.lang.Runnable;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class KdsLeakDetector$a$b implements Runnable	// class@0007dc
{
    public final KdsLeakDetector$a b;

    public void KdsLeakDetector$a$b(KdsLeakDetector$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KdsLeakDetector$a$b.class, "1")) {
          return;
       }
       this.b.b.run();
       return;
    }
}
