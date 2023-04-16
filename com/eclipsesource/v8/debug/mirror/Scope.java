package com.eclipsesource.v8.debug.mirror.Scope;
import com.eclipsesource.v8.debug.mirror.Mirror;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.debug.mirror.ObjectMirror;
import java.lang.String;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.debug.mirror.ValueMirror;
import com.eclipsesource.v8.V8Value;
import com.eclipsesource.v8.debug.mirror.Scope$ScopeType;
import com.eclipsesource.v8.V8;

public class Scope extends Mirror	// class@001009
{

    public void Scope(V8Object p0){
       super(p0);
    }
    public ObjectMirror getScopeObject(){
       V8Object v8Object = this.v8Object.executeObjectFunction("scopeObject", null);
       ObjectMirror objectMirror = Mirror.createMirror(v8Object);
       if (v8Object != null) {
          v8Object.close();
       }
       return objectMirror;
    }
    public Scope$ScopeType getType(){
       return Scope$ScopeType.values()[this.v8Object.executeIntegerFunction("scopeType", null)];
    }
    public void setVariableValue(String p0,double p1){
       V8Array v8Array = new V8Array(this.v8Object.getRuntime());
       v8Array.push(p0);
       v8Array.push(p1);
       this.v8Object.executeVoidFunction("setVariableValue", v8Array);
       v8Array.close();
    }
    public void setVariableValue(String p0,int p1){
       V8Array v8Array = new V8Array(this.v8Object.getRuntime());
       v8Array.push(p0);
       v8Array.push(p1);
       this.v8Object.executeVoidFunction("setVariableValue", v8Array);
       v8Array.close();
    }
    public void setVariableValue(String p0,V8Value p1){
       V8Array v8Array = new V8Array(this.v8Object.getRuntime());
       v8Array.push(p0);
       v8Array.push(p1);
       this.v8Object.executeVoidFunction("setVariableValue", v8Array);
       v8Array.close();
    }
    public void setVariableValue(String p0,String p1){
       V8Array v8Array = new V8Array(this.v8Object.getRuntime());
       v8Array.push(p0);
       v8Array.push(p1);
       this.v8Object.executeVoidFunction("setVariableValue", v8Array);
       v8Array.close();
    }
    public void setVariableValue(String p0,boolean p1){
       V8Array v8Array = new V8Array(this.v8Object.getRuntime());
       v8Array.push(p0);
       v8Array.push(p1);
       this.v8Object.executeVoidFunction("setVariableValue", v8Array);
       v8Array.close();
    }
}
