package com.eclipsesource.v8.debug.mirror.NullMirror;
import com.eclipsesource.v8.debug.mirror.ValueMirror;
import com.eclipsesource.v8.V8Object;
import java.lang.String;

public class NullMirror extends ValueMirror	// class@001002
{

    public void NullMirror(V8Object p0){
       super(p0);
    }
    public boolean isNull(){
       return true;
    }
    public String toString(){
       return "null";
    }
}
