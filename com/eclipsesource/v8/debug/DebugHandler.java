package com.eclipsesource.v8.debug.DebugHandler;
import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8;
import java.lang.Object;
import java.util.ArrayList;
import com.eclipsesource.v8.debug.BreakHandler;
import com.eclipsesource.v8.V8Locker;
import java.util.List;
import java.lang.String;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.V8Value;
import com.eclipsesource.v8.debug.ScriptBreakPoint;
import com.eclipsesource.v8.V8Function;
import com.eclipsesource.v8.debug.DebugHandler$BreakpointHandler;
import com.eclipsesource.v8.debug.DebugHandler$1;
import com.eclipsesource.v8.JavaVoidCallback;

public class DebugHandler implements Releasable	// class@000ff3
{
    public List breakHandlers;
    public V8Object debugObject;
    public V8 runtime;
    public static String DEBUG_OBJECT_NAME = "__j2v8_Debug";

    public void DebugHandler(V8 p0){
       super();
       this.breakHandlers = new ArrayList();
       this.runtime = p0;
       this.setupDebugObject(p0);
       this.setupBreakpointHandler();
    }
    public void addBreakHandler(BreakHandler p0){
       this.runtime.getLocker().checkThread();
       this.breakHandlers.add(p0);
    }
    public void changeBreakPointCondition(int p0,String p1){
       V8Array v8Array = new V8Array(this.runtime);
       v8Array.push(p0);
       v8Array.push(p1);
       this.debugObject.executeVoidFunction("changeBreakPointCondition", v8Array);
       v8Array.close();
    }
    public void clearBreakPoint(int p0){
       V8Array v8Array = new V8Array(this.runtime);
       v8Array.push(p0);
       this.debugObject.executeVoidFunction("clearBreakPoint", v8Array);
       v8Array.close();
    }
    public void close(){
       this.debugObject.close();
    }
    public void disableAllBreakPoints(){
       this.debugObject.executeVoidFunction("disableAllBreakPoints", null);
    }
    public void disableScriptBreakPoint(int p0){
       V8Array v8Array = new V8Array(this.runtime);
       v8Array.push(p0);
       this.debugObject.executeVoidFunction("disableScriptBreakPoint", v8Array);
       v8Array.close();
    }
    public void enableScriptBreakPoint(int p0){
       V8Array v8Array = new V8Array(this.runtime);
       v8Array.push(p0);
       this.debugObject.executeVoidFunction("enableScriptBreakPoint", v8Array);
       v8Array.close();
    }
    public ScriptBreakPoint getScriptBreakPoint(int p0){
       V8Array v8Array = new V8Array(this.runtime);
       v8Array.push(p0);
       v8Array.push(false);
       V8Object v8Object = this.debugObject.executeObjectFunction("findScriptBreakPoint", v8Array);
       ScriptBreakPoint scriptBreakP = new ScriptBreakPoint(v8Object);
       v8Array.close();
       if (v8Object != null) {
          v8Object.close();
       }
       return scriptBreakP;
    }
    public int getScriptBreakPointCount(){
       V8Array v8Array = this.debugObject.executeArrayFunction("scriptBreakPoints", null);
       v8Array.close();
       return v8Array.length();
    }
    public int[] getScriptBreakPointIDs(){
       V8Array v8Array = this.debugObject.executeArrayFunction("scriptBreakPoints", null);
       int[] ointArray = new int[v8Array.length()];
       for (int i = 0; i < v8Array.length(); i = i + 1) {
          V8Object object = v8Array.getObject(i);
          ointArray[i] = object.executeIntegerFunction("number", null);
          object.close();
       }
       v8Array.close();
       return ointArray;
    }
    public void release(){
       this.close();
    }
    public void removeBreakHandler(BreakHandler p0){
       this.runtime.getLocker().checkThread();
       this.breakHandlers.remove(p0);
    }
    public int setBreakpoint(V8Function p0){
       V8Array v8Array = new V8Array(this.runtime);
       v8Array.push(p0);
       v8Array.close();
       return this.debugObject.executeIntegerFunction("setBreakPoint", v8Array);
    }
    public int setScriptBreakpoint(String p0,int p1){
       V8Array v8Array = new V8Array(this.runtime);
       v8Array.push(p0);
       v8Array.push(p1);
       v8Array.close();
       return this.debugObject.executeIntegerFunction("setScriptBreakPointByName", v8Array);
    }
    public final void setupBreakpointHandler(){
       this.debugObject.registerJavaMethod(new DebugHandler$BreakpointHandler(this, null), "__j2v8_debug_handler");
       V8Function object = this.debugObject.getObject("__j2v8_debug_handler");
       V8Array v8Array = new V8Array(this.runtime);
       v8Array.push(object);
       this.debugObject.executeFunction("setListener", v8Array);
       if (object != null && !object.isReleased()) {
          object.close();
       }
       if (!v8Array.isReleased()) {
          v8Array.close();
       }
       return;
    }
    public final void setupDebugObject(V8 p0){
       V8Object object = p0.getObject(DebugHandler.DEBUG_OBJECT_NAME);
       this.debugObject = object.getObject("Debug");
       object.close();
    }
}
