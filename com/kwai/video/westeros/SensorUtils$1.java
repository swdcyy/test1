package com.kwai.video.westeros.SensorUtils$1;
import java.lang.Runnable;
import com.kwai.video.westeros.SensorUtils;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Looper;
import android.os.Handler;

public class SensorUtils$1 implements Runnable	// class@000e61
{
    public final SensorUtils this$0;

    public void SensorUtils$1(SensorUtils p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, SensorUtils$1.class, "1")) {
          return;
       }
       this.this$0.unregisterListener();
       this.this$0.handler.getLooper().quitSafely();
       return;
    }
}
