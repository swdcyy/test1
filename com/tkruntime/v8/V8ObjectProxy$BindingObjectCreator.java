package com.tkruntime.v8.V8ObjectProxy$BindingObjectCreator;
import java.lang.String;
import java.lang.Object;
import com.tkruntime.v8.V8ObjectProxy;

public interface abstract V8ObjectProxy$BindingObjectCreator	// class@000fc2
{

    Object constructRealObject(String p0,String p1,Object[] p2);
    Object onPropCall(V8ObjectProxy p0,Object p1,boolean p2,String p3,Object p4);
    String[] onPropEnumerator(V8ObjectProxy p0);
}
