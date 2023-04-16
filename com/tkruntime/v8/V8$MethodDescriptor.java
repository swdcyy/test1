package com.tkruntime.v8.V8$MethodDescriptor;
import com.tkruntime.v8.V8;
import java.lang.Object;
import com.tkruntime.v8.V8$1;

public class V8$MethodDescriptor	// class@000fa9
{
    public JavaCallback callback;
    public V8Function function;
    public String functionName;
    public boolean includeReceiver;
    public Method method;
    public Object object;
    public final V8 this$0;
    public JavaVoidCallback voidCallback;

    public void V8$MethodDescriptor(V8 p0){
       this.this$0 = p0;
       super();
    }
    public void V8$MethodDescriptor(V8 p0,V8$1 p1){
       super(p0);
    }
}
