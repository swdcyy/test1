package com.facebook.react.bridge.CatalystInstanceImpl$7;
import java.lang.Runnable;
import com.facebook.react.bridge.CatalystInstanceImpl;
import java.lang.Object;
import com.facebook.react.bridge.CatalystInstance$DestroyFinishedCallback;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import td.j;

public class CatalystInstanceImpl$7 implements Runnable	// class@0011ad
{
    public final CatalystInstanceImpl this$0;

    public void CatalystInstanceImpl$7(CatalystInstanceImpl p0){
       this.this$0 = p0;
       super();
    }
    public static void a(CatalystInstanceImpl$7 p0){
       p0.lambda$run$0();
    }
    private void lambda$run$0(){
       CatalystInstanceImpl mDestroyFini = this.this$0.mDestroyFinishedCallback;
       if (mDestroyFini != null) {
          mDestroyFini.onDestroyFinished();
          this.this$0.mDestroyFinishedCallback = null;
       }
       return;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, CatalystInstanceImpl$7.class, "1")) {
          return;
       }
       this.this$0.destroy(new j(this));
       return;
    }
}
