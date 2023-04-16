package kotlinx.coroutines.debug.internal.DebugProbesImpl$d;
import dsd.c;
import java.lang.StackTraceElement;
import java.lang.Object;

public final class DebugProbesImpl$d implements c	// class@0019ad
{
    public final c b;
    public final StackTraceElement c;
    public final c d;

    public void DebugProbesImpl$d(StackTraceElement p0,c p1){
       this.c = p0;
       this.d = p1;
       super();
       this.b = p1;
    }
    public c getCallerFrame(){
       return this.b;
    }
    public StackTraceElement getStackTraceElement(){
       return this.c;
    }
}
