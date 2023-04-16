package com.eclipsesource.v8.debug.mirror.UndefinedMirror;
import com.eclipsesource.v8.debug.mirror.ValueMirror;
import com.eclipsesource.v8.V8Object;
import java.lang.String;

public class UndefinedMirror extends ValueMirror	// class@00100c
{

    public void UndefinedMirror(V8Object p0){
       super(p0);
    }
    public boolean isUndefined(){
       return true;
    }
    public String toString(){
       return "undefined";
    }
}
