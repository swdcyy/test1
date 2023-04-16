package com.eclipsesource.v8.inspector.V8Inspector;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.inspector.V8InspectorDelegate;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import com.eclipsesource.v8.inspector.DebuggerConnectionListener;
import java.util.List;
import java.lang.Exception;
import java.lang.StringBuilder;
import com.eclipsesource.v8.V8Object;
import java.util.Iterator;
import com.eclipsesource.v8.V8Value;

public class V8Inspector	// class@00100f
{
    public List debuggerConnectionListeners;
    public long inspectorPtr;
    public V8 runtime;
    public boolean waitingForConnection;

    public void V8Inspector(V8 p0,V8InspectorDelegate p1,String p2){
       super();
       this.inspectorPtr = 0;
       this.waitingForConnection = true;
       this.runtime = p0;
       this.inspectorPtr = p0.createInspector(p1, p2);
       this.debuggerConnectionListeners = new ArrayList();
    }
    public static V8Inspector createV8Inspector(V8 p0,V8InspectorDelegate p1){
       return new V8Inspector(p0, p1, null);
    }
    public static V8Inspector createV8Inspector(V8 p0,V8InspectorDelegate p1,String p2){
       return new V8Inspector(p0, p1, p2);
    }
    public void addDebuggerConnectionListener(DebuggerConnectionListener p0){
       this.debuggerConnectionListeners.add(p0);
    }
    public void dispatchProtocolMessage(String p0){
       try{
          this.runtime.dispatchProtocolMessage(this.inspectorPtr, p0);
          if (this.waitingForConnection != null) {
             this.verifyDebuggerConnection(p0);
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       return;
    }
    public void removeDebuggerConnectionListener(DebuggerConnectionListener p0){
       this.debuggerConnectionListeners.remove(p0);
    }
    public final void verifyDebuggerConnection(String p0){
       V8Object v8Object = this.runtime.executeObjectScript("JSON.parse\(JSON.stringify\("+p0+"\)\)");
       if ((v8Object.getString("method")).equals("Runtime.runIfWaitingForDebugger")) {
          this.waitingForConnection = false;
          this.runtime.schedulePauseOnNextStatement(this.inspectorPtr, "");
          Iterator iterator = this.debuggerConnectionListeners.iterator();
          while (iterator.hasNext()) {
             iterator.next().onDebuggerConnected();
          }
       }
       v8Object.close();
       return;
    }
}
