package com.facebook.react.bridge.DefaultNativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.RuntimeException;
import java.lang.Throwable;

public class DefaultNativeModuleCallExceptionHandler implements NativeModuleCallExceptionHandler	// class@0011ba
{

    public void DefaultNativeModuleCallExceptionHandler(){
       super();
    }
    public void handleCaughtException(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultNativeModuleCallExceptionHandler.class, "2")) {
          return;
       }
       p0.printStackTrace();
       return;
    }
    public void handleException(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultNativeModuleCallExceptionHandler.class, "1")) {
          return;
       }
       if (p0 instanceof RuntimeException) {
          throw p0;
       }
       throw new RuntimeException(p0);
    }
}
