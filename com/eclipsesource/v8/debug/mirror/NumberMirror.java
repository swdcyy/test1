package com.eclipsesource.v8.debug.mirror.NumberMirror;
import com.eclipsesource.v8.debug.mirror.ValueMirror;
import com.eclipsesource.v8.V8Object;
import java.lang.String;
import com.eclipsesource.v8.debug.mirror.Mirror;
import com.eclipsesource.v8.V8Array;

public class NumberMirror extends ValueMirror	// class@001003
{

    public void NumberMirror(V8Object p0){
       super(p0);
    }
    public boolean isNumber(){
       return true;
    }
    public String toString(){
       return this.v8Object.executeStringFunction("toText", null);
    }
}
