package com.eclipsesource.v8.debug.mirror.StringMirror;
import com.eclipsesource.v8.debug.mirror.ValueMirror;
import com.eclipsesource.v8.V8Object;
import java.lang.String;
import com.eclipsesource.v8.debug.mirror.Mirror;
import com.eclipsesource.v8.V8Array;

public class StringMirror extends ValueMirror	// class@00100b
{

    public void StringMirror(V8Object p0){
       super(p0);
    }
    public boolean isString(){
       return true;
    }
    public String toString(){
       return this.v8Object.executeStringFunction("toText", null);
    }
}
