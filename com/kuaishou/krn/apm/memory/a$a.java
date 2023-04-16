package com.kuaishou.krn.apm.memory.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import com.kuaishou.krn.apm.memory.a;
import java.util.ArrayList;
import java.lang.Runnable;
import java.lang.ref.WeakReference;

public final class a$a	// class@0007ed
{

    public void a$a(){
       super();
    }
    public void finalize(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       a.d = SystemClock.uptimeMillis();
       ArrayList b = a.b;
       _monitor_enter(b);
       Runnable[] runnableArra = b.toArray(a.c);
       a.c = runnableArra;
       _monitor_exit(b);
       int len = runnableArra.length;
       int i = 0;
       while (i < len) {
          object oobject = runnableArra[i];
          if (oobject != null) {
             oobject.run();
          }
          i = i + 1;
       }
       a.a = new WeakReference(new a$a());
       return;
    }
}
