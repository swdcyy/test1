package com.kwai.video.krtc.observers.AryaResultObserver$1;
import java.lang.Runnable;
import com.kwai.video.krtc.observers.AryaResultObserver;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class AryaResultObserver$1 implements Runnable	// class@0007be
{
    public final AryaResultObserver this$0;
    public final int val$errorCode;
    public final String val$msg;

    public void AryaResultObserver$1(AryaResultObserver p0,int p1,String p2){
       this.this$0 = p0;
       this.val$errorCode = p1;
       this.val$msg = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaResultObserver$1.class, "1")) {
          return;
       }
       this.this$0.onResult(this.val$errorCode, this.val$msg);
       return;
    }
}
