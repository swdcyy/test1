package com.eclipsesource.v8.debug.mirror.ValueMirror;
import com.eclipsesource.v8.debug.mirror.Mirror;
import com.eclipsesource.v8.V8Object;
import java.lang.Object;
import java.lang.String;
import com.eclipsesource.v8.V8Array;

public class ValueMirror extends Mirror	// class@00100d
{

    public void ValueMirror(V8Object p0){
       super(p0);
    }
    public Object getValue(){
       return this.v8Object.executeFunction("value", null);
    }
    public boolean isValue(){
       return true;
    }
}
