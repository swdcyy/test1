package com.facebook.react.bridge.CatalystInstanceImpl$3;
import java.lang.Runnable;
import com.facebook.react.bridge.CatalystInstanceImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.JSIModule;

public class CatalystInstanceImpl$3 implements Runnable	// class@0011a9
{
    public final CatalystInstanceImpl this$0;

    public void CatalystInstanceImpl$3(CatalystInstanceImpl p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, CatalystInstanceImpl$3.class, "1")) {
          return;
       }
       CatalystInstanceImpl mTurboModule = this.this$0.mTurboModuleManagerJSIModule;
       if (mTurboModule != null) {
          mTurboModule.onCatalystInstanceDestroy();
       }
       this.this$0.mJSThreadDestructionComplete = true;
       return;
    }
}
