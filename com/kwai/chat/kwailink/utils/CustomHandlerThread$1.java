package com.kwai.chat.kwailink.utils.CustomHandlerThread$1;
import android.os.Handler;
import com.kwai.chat.kwailink.utils.CustomHandlerThread;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class CustomHandlerThread$1 extends Handler	// class@000a71
{
    public final CustomHandlerThread this$0;

    public void CustomHandlerThread$1(CustomHandlerThread p0,Looper p1){
       this.this$0 = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomHandlerThread$1.class, "1")) {
          return;
       }
       this.this$0.processMessage(p0);
       return;
    }
}
