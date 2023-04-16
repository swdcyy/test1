package com.facebook.react.bridge.CatalystInstanceImpl$4;
import java.lang.Runnable;
import com.facebook.react.bridge.CatalystInstanceImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.NativeModuleRegistry;

public class CatalystInstanceImpl$4 implements Runnable	// class@0011aa
{
    public final CatalystInstanceImpl this$0;

    public void CatalystInstanceImpl$4(CatalystInstanceImpl p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, CatalystInstanceImpl$4.class, "1")) {
          return;
       }
       CatalystInstanceImpl$4 tthis$0 = this.this$0;
       tthis$0.mNativeModuleRegistry.notifyJSInstanceInitialized(tthis$0.mUniqueId);
       return;
    }
}
