package com.eclipsesource.v8.debug.mirror.FunctionMirror;
import com.eclipsesource.v8.debug.mirror.ObjectMirror;
import com.eclipsesource.v8.V8Object;
import java.lang.String;
import com.eclipsesource.v8.debug.mirror.Mirror;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Value;

public class FunctionMirror extends ObjectMirror	// class@001000
{

    public void FunctionMirror(V8Object p0){
       super(p0);
    }
    public String getName(){
       return this.v8Object.executeStringFunction("name", null);
    }
    public String getScriptName(){
       V8Object v8Object = this.v8Object.executeObjectFunction("script", null);
       v8Object.close();
       return v8Object.executeStringFunction("name", null);
    }
    public boolean isFunction(){
       return true;
    }
}
