package com.eclipsesource.v8.debug.ScriptBreakPoint;
import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8Object;
import java.lang.Object;
import com.eclipsesource.v8.V8Value;
import java.lang.String;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8;

public class ScriptBreakPoint implements Releasable	// class@000ff7
{
    public V8Object v8Object;

    public void ScriptBreakPoint(V8Object p0){
       super();
       this.v8Object = p0.twin();
    }
    public void close(){
       ScriptBreakPoint tv8Object = this.v8Object;
       if (tv8Object != null && !tv8Object.isReleased()) {
          this.v8Object.close();
          this.v8Object = null;
       }
       return;
    }
    public int getBreakPointNumber(){
       return this.v8Object.executeIntegerFunction("number", null);
    }
    public String getCondition(){
       try{
          return this.v8Object.executeStringFunction("condition", null);
       }catch(com.eclipsesource.v8.V8ResultUndefined e0){
          return "undefined";
       }
    }
    public int getLine(){
       return this.v8Object.executeIntegerFunction("line", null);
    }
    public void release(){
       this.close();
    }
    public void setCondition(String p0){
       V8Array v8Array = new V8Array(this.v8Object.getRuntime());
       v8Array.push(p0);
       this.v8Object.executeVoidFunction("setCondition", v8Array);
       v8Array.close();
    }
}
