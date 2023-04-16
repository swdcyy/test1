package com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$c;
import erd.g;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.LivePlayerController;

public class LiveFloatingWindowManager$c implements g	// class@000b63
{
    public final LiveFloatingWindowManager b;

    public void LiveFloatingWindowManager$c(LiveFloatingWindowManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingWindowManager$c.class, "1")) {
       }else {
          LiveFloatingWindowManager c = this.b.c;
          if (c != null && c.isPlaying()) {
             if (p0.booleanValue()) {
                this.b.c.mute();
             }else {
                this.b.c.unMute();
             }
          }
       }
       return;
    }
}
