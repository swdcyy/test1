package com.eclipsesource.v8.debug.V8DebugServer$EventHandler;
import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.debug.V8DebugServer;
import java.lang.Object;
import com.eclipsesource.v8.debug.V8DebugServer$1;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Value;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.String;
import java.io.PrintStream;
import com.eclipsesource.v8.Releasable;
import java.lang.Throwable;

public class V8DebugServer$EventHandler implements JavaVoidCallback	// class@000ffb
{
    public final V8DebugServer this$0;

    public void V8DebugServer$EventHandler(V8DebugServer p0){
       this.this$0 = p0;
       super();
    }
    public void V8DebugServer$EventHandler(V8DebugServer p0,V8DebugServer$1 p1){
       super(p0);
    }
    public void invoke(V8Object p0,V8Array p1){
       Releasable releasable;
       if (p1 == null || p1.isUndefined()) {
          return;
       }
       int i = 0;
       V8Object v8Object = null;
       try{
          i = p1.getInteger(i);
          V8Object object = p1.getObject(1);
          try{
             int i1 = 2;
             v8Object = p1.getObject(i1);
             if (this.this$0.traceCommunication != null) {
                String str = "unknown";
                switch (i){
                    case 1:
                      str = "Break";
                      break;
                    case 2:
                      str = "Exception";
                      break;
                    case 3:
                      str = "NewFunction";
                      break;
                    case 4:
                      str = "BeforeCompile";
                      break;
                    case 5:
                      str = "AfterCompile";
                      break;
                    case 6:
                      str = "CompileError";
                      break;
                    case 7:
                      str = "PromiseEvent";
                      break;
                    case 8:
                      str = "AsyncTaskEvent";
                      break;
                    default:
                }
                System.out.println("V8 has emmitted an event of type "+str);
             }
             if (!this.this$0.isConnected()) {
                this.safeRelease(object);
                this.safeRelease(v8Object);
                return;
             }else if(i != 1){
                if (i == 5 || i == 6) {
                   this.this$0.sendCompileEvent(v8Object);
                }
             }else {
                this.this$0.enterBreakLoop(object, v8Object);
             }
             this.safeRelease(object);
             this.safeRelease(v8Object);
          label_0095 :
             return;
          }catch(java.lang.Exception e7){
             releasable = v8Object;
             Releasable releasable1 = object;
          }
          this.this$0.logError(e7);
          this.safeRelease(v8Object);
          this.safeRelease(releasable);
          goto label_0095 ;
       }catch(java.lang.Exception e7){
          releasable = v8Object;
          goto label_008a ;
       }
    }
    public final void safeRelease(Releasable p0){
       if (p0 != null) {
          p0.release();
       }
       return;
    }
}
