package com.eclipsesource.v8.debug.mirror.PropertyMirror;
import com.eclipsesource.v8.debug.mirror.Mirror;
import com.eclipsesource.v8.V8Object;
import java.lang.String;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.debug.mirror.ValueMirror;
import com.eclipsesource.v8.V8Value;

public class PropertyMirror extends Mirror	// class@001007
{

    public void PropertyMirror(V8Object p0){
       super(p0);
    }
    public String getName(){
       return this.v8Object.executeStringFunction("name", null);
    }
    public Mirror getValue(){
       V8Object v8Object = this.v8Object.executeObjectFunction("value", null);
       v8Object.close();
       return Mirror.createMirror(v8Object);
    }
    public boolean isProperty(){
       return true;
    }
}
