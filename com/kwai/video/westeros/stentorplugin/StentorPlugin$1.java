package com.kwai.video.westeros.stentorplugin.StentorPlugin$1;
import java.lang.Runnable;
import com.kwai.video.westeros.stentorplugin.StentorPlugin;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Looper;
import android.os.Handler;

public class StentorPlugin$1 implements Runnable	// class@0010ba
{
    public final StentorPlugin this$0;

    public void StentorPlugin$1(StentorPlugin p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StentorPlugin$1.class, "1")) {
          return;
       }
       this.this$0.handler.getLooper().quit();
       return;
    }
}
