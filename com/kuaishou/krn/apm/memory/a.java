package com.kuaishou.krn.apm.memory.a;
import java.util.ArrayList;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.ref.WeakReference;
import com.kuaishou.krn.apm.memory.a$a;

public class a	// class@0007ee
{
    public static WeakReference a;
    public static final ArrayList b;
    public static Runnable[] c;
    public static long d;

    static {
       a.b = new ArrayList();
       Runnable[] runnableArra = new Runnable[1];
       a.c = runnableArra;
    }
    public void a(){
       super();
    }
    public static void a(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "2")) {
          return;
       }
       ArrayList b = a.b;
       _monitor_enter(b);
       b.add(p0);
       _monitor_exit(b);
       if (a.a == null) {
          a.a = new WeakReference(new a$a());
       }
       return;
    }
}
