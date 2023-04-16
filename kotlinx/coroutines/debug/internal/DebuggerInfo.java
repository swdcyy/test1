package kotlinx.coroutines.debug.internal.DebuggerInfo;
import java.io.Serializable;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfo;
import java.lang.Object;
import kotlin.coroutines.CoroutineContext;
import ftd.i0;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import java.lang.Long;
import asd.d;
import java.lang.String;
import ftd.j0;
import java.lang.Thread$State;
import java.lang.Thread;
import java.util.List;

public final class DebuggerInfo implements Serializable	// class@0019b0
{
    public final Long coroutineId;
    public final String dispatcher;
    public final List lastObservedStackTrace;
    public final String lastObservedThreadName;
    public final String lastObservedThreadState;
    public final String name;
    public final long sequenceNumber;
    public final String state;

    public void DebuggerInfo(DebugCoroutineInfo p0){
       super();
       i0 oi0 = p0.c().get(i0.c);
       String str = null;
       Long longx = (oi0 != null)? Long.valueOf(oi0.getId()): str;
       this.coroutineId = longx;
       this.dispatcher = String.valueOf(p0.c().get(d.b0));
       j0 oj0 = p0.c().get(j0.c);
       String str1 = (oj0 != null)? oj0.y(): str;
       this.name = str1;
       this.state = p0.f();
       DebugCoroutineInfo b = p0.b;
       if (b != null) {
          Thread$State state = b.getState();
          if (state != null) {
             str1 = state.toString();
          label_005a :
             this.lastObservedThreadState = str1;
             b = p0.b;
             if (b != null) {
                str = b.getName();
             }
             this.lastObservedThreadName = str;
             this.lastObservedStackTrace = p0.g();
             this.sequenceNumber = p0.f;
             return;
          }
       }
       str1 = str;
       goto label_005a ;
    }
    public final Long getCoroutineId(){
       return this.coroutineId;
    }
    public final String getDispatcher(){
       return this.dispatcher;
    }
    public final List getLastObservedStackTrace(){
       return this.lastObservedStackTrace;
    }
    public final String getLastObservedThreadName(){
       return this.lastObservedThreadName;
    }
    public final String getLastObservedThreadState(){
       return this.lastObservedThreadState;
    }
    public final String getName(){
       return this.name;
    }
    public final long getSequenceNumber(){
       return this.sequenceNumber;
    }
    public final String getState(){
       return this.state;
    }
}
