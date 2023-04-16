package com.facebook.react.bridge.ReactContext$1;
import java.lang.Runnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.LifecycleEventListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.CopyOnWriteArraySet;
import java.lang.Exception;

public class ReactContext$1 implements Runnable	// class@00121c
{
    public final ReactContext this$0;
    public final LifecycleEventListener val$listener;

    public void ReactContext$1(ReactContext p0,LifecycleEventListener p1){
       this.this$0 = p0;
       this.val$listener = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ReactContext$1.class, "1")) {
          return;
       }
       if (!this.this$0.mLifecycleEventListeners.contains(this.val$listener)) {
          return;
       }
       try{
          this.val$listener.onHostResume();
       }catch(java.lang.RuntimeException e0){
          this.this$0.handleException(e0);
       }
       return;
    }
}
