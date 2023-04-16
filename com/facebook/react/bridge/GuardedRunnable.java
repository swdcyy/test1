package com.facebook.react.bridge.GuardedRunnable;
import java.lang.Runnable;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import java.lang.Object;
import com.facebook.react.bridge.ReactContext;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Exception;

public abstract class GuardedRunnable implements Runnable	// class@0011c5
{
    public final NativeModuleCallExceptionHandler mExceptionHandler;

    public void GuardedRunnable(NativeModuleCallExceptionHandler p0){
       super();
       this.mExceptionHandler = p0;
    }
    public void GuardedRunnable(ReactContext p0){
       super(p0.getExceptionHandler());
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, GuardedRunnable.class, "1")) {
          return;
       }
       try{
          this.runGuarded();
       }catch(java.lang.RuntimeException e0){
          this.mExceptionHandler.handleException(e0);
       }
       return;
    }
    public abstract void runGuarded();
}
