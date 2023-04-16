package kotlinx.coroutines.debug.a;
import java.lang.String;
import java.lang.System;
import java.lang.Boolean;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import java.lang.Object;
import java.lang.instrument.Instrumentation;
import kotlinx.coroutines.debug.a$a;
import java.lang.instrument.ClassFileTransformer;
import sun.misc.Signal;
import kotlinx.coroutines.debug.a$b;
import sun.misc.SignalHandler;
import java.lang.StringBuilder;
import java.io.PrintStream;

public final class a	// class@0019a6
{
    public static boolean a;
    public static final boolean b;
    public static final a c;

    static {
       a.c = new a();
       String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
       boolean b = (property != null)? Boolean.parseBoolean(property): DebugProbesImpl.j.m();
       a.b = b;
    }
    public void a(){
       super();
    }
    public static final void c(String p0,Instrumentation p1){
       a.a = true;
       p1.addTransformer(a$a.a);
       DebugProbesImpl j = DebugProbesImpl.j;
       j.B(a.b);
       j.p();
       a.c.a();
    }
    public final void a(){
       Signal.handle(new Signal("TRAP"), a$b.a);
       return;
    }
    public final boolean b(){
       return a.a;
    }
    public final void d(boolean p0){
       a.a = p0;
    }
}
