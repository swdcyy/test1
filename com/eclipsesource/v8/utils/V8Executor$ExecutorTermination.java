package com.eclipsesource.v8.utils.V8Executor$ExecutorTermination;
import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.utils.V8Executor;
import java.lang.Object;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.V8Array;
import java.lang.RuntimeException;
import java.lang.String;

public class V8Executor$ExecutorTermination implements JavaVoidCallback	// class@00101a
{
    public final V8Executor this$0;

    public void V8Executor$ExecutorTermination(V8Executor p0){
       this.this$0 = p0;
       super();
    }
    public void invoke(V8Object p0,V8Array p1){
       if (this.this$0.forceTerminating == null) {
          return;
       }
       throw new RuntimeException("V8Thread Termination");
    }
}
