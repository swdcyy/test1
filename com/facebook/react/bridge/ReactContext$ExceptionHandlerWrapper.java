package com.facebook.react.bridge.ReactContext$ExceptionHandlerWrapper;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class ReactContext$ExceptionHandlerWrapper implements NativeModuleCallExceptionHandler	// class@00121f
{
    public final ReactContext this$0;

    public void ReactContext$ExceptionHandlerWrapper(ReactContext p0){
       this.this$0 = p0;
       super();
    }
    public void handleCaughtException(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext$ExceptionHandlerWrapper.class, "2")) {
          return;
       }
       this.this$0.handleCaughtException(p0);
       return;
    }
    public void handleException(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext$ExceptionHandlerWrapper.class, "1")) {
          return;
       }
       this.this$0.handleException(p0);
       return;
    }
}
