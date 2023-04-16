package com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController$f;
import java.lang.Runnable;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveLitePlayConfigController$f implements Runnable	// class@000a89
{
    public final LiveLitePlayConfigController b;

    public void LiveLitePlayConfigController$f(LiveLitePlayConfigController p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveLitePlayConfigController$f.class, "1")) {
          return;
       }
       LiveLitePlayConfigController$f tb = this.b;
       tb.e = tb.e + 1;
       tb.e();
       return;
    }
}
