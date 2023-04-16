package com.tkruntime.v8.V8$BindingObjectCreator;
import com.tkruntime.v8.V8ObjectProxy;
import java.lang.String;
import java.lang.Object;
import com.tkruntime.v8.V8$SeqCommandRunner;
import com.tkruntime.v8.V8;
import com.tkruntime.v8.V8Object;

public interface abstract V8$BindingObjectCreator	// class@000fa7
{

    Object constructRealObject(V8ObjectProxy p0,String p1,Object[] p2);
    Object onFlushCmd(V8$SeqCommandRunner p0,V8 p1);
    void onJsRefDestroy(Object p0,boolean p1);
    Object onPropCall(V8Object p0,Object p1,String p2,boolean p3,String p4,Object p5);
    String[] onPropEnumerator(V8ObjectProxy p0);
}
