package kotlinx.coroutines.debug.a$b;
import sun.misc.SignalHandler;
import java.lang.Object;
import sun.misc.Signal;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import java.lang.System;
import java.io.PrintStream;

public final class a$b implements SignalHandler	// class@0019a5
{
    public static final a$b a;

    static {
       a$b.a = new a$b();
    }
    public void a$b(){
       super();
    }
    public final void a(Signal p0){
       DebugProbesImpl j = DebugProbesImpl.j;
       if (j.q()) {
          j.d(System.out);
       }else {
          System.out.println("Cannot perform coroutines dump, debug probes are disabled");
       }
       return;
    }
}
