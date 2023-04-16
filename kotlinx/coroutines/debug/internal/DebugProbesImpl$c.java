package kotlinx.coroutines.debug.internal.DebugProbesImpl$c;
import asd.c;
import dsd.c;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfo;
import java.lang.Object;
import kotlin.coroutines.CoroutineContext;
import java.lang.StackTraceElement;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import java.lang.String;

public final class DebugProbesImpl$c implements c, c	// class@0019ac
{
    public final c b;
    public final DebugCoroutineInfo c;
    public final c d;

    public void DebugProbesImpl$c(c p0,DebugCoroutineInfo p1,c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public c getCallerFrame(){
       DebugProbesImpl$c td = this.d;
       c callerFrame = (td != null)? td.getCallerFrame(): null;
       return callerFrame;
    }
    public CoroutineContext getContext(){
       return this.b.getContext();
    }
    public StackTraceElement getStackTraceElement(){
       DebugProbesImpl$c td = this.d;
       StackTraceElement stackTraceEl = (td != null)? td.getStackTraceElement(): null;
       return stackTraceEl;
    }
    public void resumeWith(Object p0){
       DebugProbesImpl.j.v(this);
       this.b.resumeWith(p0);
    }
    public String toString(){
       return this.b.toString();
    }
}
