package com.eclipsesource.v8.debug.mirror.Frame;
import com.eclipsesource.v8.debug.mirror.Mirror;
import com.eclipsesource.v8.V8Object;
import java.lang.String;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Value;
import com.eclipsesource.v8.debug.mirror.ValueMirror;
import java.lang.IllegalStateException;
import com.eclipsesource.v8.debug.mirror.FunctionMirror;
import com.eclipsesource.v8.debug.mirror.Scope;
import com.eclipsesource.v8.debug.mirror.SourceLocation;
import java.lang.Object;

public class Frame extends Mirror	// class@000fff
{

    public void Frame(V8Object p0){
       super(p0);
    }
    public int getArgumentCount(){
       return this.v8Object.executeIntegerFunction("argumentCount", null);
    }
    public String getArgumentName(int p0){
       V8Array v8Array = new V8Array(this.v8Object.getRuntime());
       v8Array.push(p0);
       v8Array.close();
       return this.v8Object.executeStringFunction("argumentName", v8Array);
    }
    public ValueMirror getArgumentValue(int p0){
       V8Array v8Array = new V8Array(this.v8Object.getRuntime());
       v8Array.push(p0);
       V8Object v8Object = this.v8Object.executeObjectFunction("argumentValue", v8Array);
       if (!Mirror.isValue(v8Object)) {
          throw new IllegalStateException("Argument value is not a ValueMirror");
       }
       ValueMirror valueMirror = new ValueMirror(v8Object);
       v8Array.close();
       if (v8Object != null) {
          v8Object.close();
       }
       return valueMirror;
    }
    public FunctionMirror getFunction(){
       V8Object v8Object = this.v8Object.executeObjectFunction("func", null);
       FunctionMirror uFunctionMir = new FunctionMirror(v8Object);
       if (v8Object != null) {
          v8Object.close();
       }
       return uFunctionMir;
    }
    public int getLocalCount(){
       return this.v8Object.executeIntegerFunction("localCount", null);
    }
    public String getLocalName(int p0){
       V8Array v8Array = new V8Array(this.v8Object.getRuntime());
       v8Array.push(p0);
       v8Array.close();
       return this.v8Object.executeStringFunction("localName", v8Array);
    }
    public ValueMirror getLocalValue(int p0){
       V8Array v8Array = new V8Array(this.v8Object.getRuntime());
       v8Array.push(p0);
       V8Object v8Object = this.v8Object.executeObjectFunction("localValue", v8Array);
       if (!Mirror.isValue(v8Object)) {
          throw new IllegalStateException("Local value is not a ValueMirror");
       }
       ValueMirror valueMirror = Mirror.createMirror(v8Object);
       v8Array.close();
       if (v8Object != null) {
          v8Object.close();
       }
       return valueMirror;
    }
    public Scope getScope(int p0){
       Scope scope;
       V8Array v8Array = new V8Array(this.v8Object.getRuntime());
       v8Array.push(p0);
       V8Object v8Object = this.v8Object.executeObjectFunction("scope", v8Array);
       scope = new Scope(v8Object);
       v8Array.close();
       if (v8Object != null) {
          v8Object.close();
       }
       return scope;
    }
    public int getScopeCount(){
       return this.v8Object.executeIntegerFunction("scopeCount", null);
    }
    public SourceLocation getSourceLocation(){
       V8Array v8Array = null;
       V8Object v8Object = this.v8Object.executeObjectFunction("sourceLocation", v8Array);
       FunctionMirror function = this.getFunction();
       String scriptName = function.getScriptName();
       V8Object v8Object1 = v8Object.get("script");
       if (v8Object1 != null) {
          v8Array = v8Object1.getString("name");
          v8Object1.close();
       }
       if (v8Array != null || scriptName == null) {
          scriptName = "undefined";
       }
       SourceLocation sourceLocati = new SourceLocation(scriptName, v8Object.getInteger("position"), v8Object.getInteger("line"), v8Object.getInteger("column"), v8Object.getString("sourceText"));
       function.close();
       v8Object.close();
       return v8Array;
    }
    public boolean isFrame(){
       return true;
    }
}
