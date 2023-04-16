package com.eclipsesource.v8.debug.mirror.BooleanMirror;
import com.eclipsesource.v8.debug.mirror.ValueMirror;
import com.eclipsesource.v8.V8Object;
import java.lang.String;
import com.eclipsesource.v8.debug.mirror.Mirror;
import com.eclipsesource.v8.V8Array;

public class BooleanMirror extends ValueMirror	// class@000ffe
{

    public void BooleanMirror(V8Object p0){
       super(p0);
    }
    public boolean isBoolean(){
       return true;
    }
    public String toString(){
       return this.v8Object.executeStringFunction("toText", null);
    }
}
