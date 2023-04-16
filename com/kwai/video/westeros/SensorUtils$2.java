package com.kwai.video.westeros.SensorUtils$2;
import java.lang.Runnable;
import com.kwai.video.westeros.SensorUtils;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class SensorUtils$2 implements Runnable	// class@000e62
{
    public final SensorUtils this$0;

    public void SensorUtils$2(SensorUtils p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, SensorUtils$2.class, "1")) {
          return;
       }
       this.this$0.unregisterListener();
       return;
    }
}
