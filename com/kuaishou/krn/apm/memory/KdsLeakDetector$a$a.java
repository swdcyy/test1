package com.kuaishou.krn.apm.memory.KdsLeakDetector$a$a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.apm.memory.a;
import java.lang.Runtime;
import java.lang.System;

public final class KdsLeakDetector$a$a implements Runnable	// class@0007db
{
    public static final KdsLeakDetector$a$a b;

    static {
       KdsLeakDetector$a$a.b = new KdsLeakDetector$a$a();
    }
    public void KdsLeakDetector$a$a(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KdsLeakDetector$a$a.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, a.class, "1")) {
          Runtime.getRuntime().gc();
          System.runFinalization();
       }
       return;
    }
}
