package com.eclipsesource.v8.debug.DebugHandler$BreakpointHandler;
import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.debug.DebugHandler;
import java.lang.Object;
import com.eclipsesource.v8.debug.DebugHandler$1;
import com.eclipsesource.v8.debug.DebugHandler$DebugEvent;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.debug.EventData;
import java.lang.Enum;
import com.eclipsesource.v8.debug.ExceptionEvent;
import com.eclipsesource.v8.debug.CompileEvent;
import com.eclipsesource.v8.debug.BreakEvent;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Value;
import java.util.Iterator;
import java.util.List;
import com.eclipsesource.v8.debug.BreakHandler;
import com.eclipsesource.v8.debug.ExecutionState;
import com.eclipsesource.v8.Releasable;

public class DebugHandler$BreakpointHandler implements JavaVoidCallback	// class@000ff1
{
    public final DebugHandler this$0;

    public void DebugHandler$BreakpointHandler(DebugHandler p0){
       this.this$0 = p0;
       super();
    }
    public void DebugHandler$BreakpointHandler(DebugHandler p0,DebugHandler$1 p1){
       super(p0);
    }
    public final EventData createDebugEvent(DebugHandler$DebugEvent p0,V8Object p1){
       int i = DebugHandler$1.$SwitchMap$com$eclipsesource$v8$debug$DebugHandler$DebugEvent[p0.ordinal()];
       if (i == 1) {
          return new BreakEvent(p1);
       }
       if (i == 2) {
          return new CompileEvent(p1);
       }
       if (i == 3) {
          return new CompileEvent(p1);
       }
       if (i != 4) {
          return new EventData(p1);
       }
       return new ExceptionEvent(p1);
    }
    public void invoke(V8Object p0,V8Array p1){
       if (p1 != null && !p1.isUndefined()) {
          int integer = p1.getInteger(0);
          Iterator iterator = this.this$0.breakHandlers.iterator();
          while (iterator.hasNext()) {
             this.invokeHandler(p1, integer, iterator.next());
          }
       }
       return;
    }
    public final void invokeHandler(V8Array p0,int p1,BreakHandler p2){
       V8Object object = p0.getObject(1);
       V8Object object1 = p0.getObject(2);
       V8Object object2 = p0.getObject(3);
       ExecutionState uExecutionSt = new ExecutionState(object);
       object oobject = DebugHandler$DebugEvent.values()[p1];
       EventData uEventData = this.createDebugEvent(oobject, object1);
       p2.onBreak(oobject, uExecutionSt, uEventData, object2);
       this.safeRelease(object);
       this.safeRelease(object1);
       this.safeRelease(object2);
       this.safeRelease(uExecutionSt);
       this.safeRelease(uEventData);
    }
    public final void safeRelease(Releasable p0){
       if (p0 != null) {
          p0.release();
       }
       return;
    }
}
