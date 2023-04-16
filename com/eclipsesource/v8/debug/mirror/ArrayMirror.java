package com.eclipsesource.v8.debug.mirror.ArrayMirror;
import com.eclipsesource.v8.debug.mirror.ObjectMirror;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.debug.mirror.Mirror;
import java.lang.String;
import com.eclipsesource.v8.V8Array;

public class ArrayMirror extends ObjectMirror	// class@000ffd
{

    public void ArrayMirror(V8Object p0){
       super(p0);
    }
    public boolean isArray(){
       return true;
    }
    public int length(){
       return this.v8Object.executeIntegerFunction("length", null);
    }
}
