package com.kwai.video.wayne.player.main.WaynePlayer$Companion;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.wayne.player.main.WaynePlayer;
import java.util.concurrent.atomic.AtomicInteger;

public final class WaynePlayer$Companion	// class@000d9a
{

    public void WaynePlayer$Companion(){
       super();
    }
    public void WaynePlayer$Companion(u p0){
       super();
    }
    public final int generatePlayerId(){
       int i;
       int i1;
       AtomicInteger obj = PatchProxy.apply(null, this, WaynePlayer$Companion.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       do {
          obj = WaynePlayer.sNextGeneratedId;
          i = obj.get();
          i1 = i + 1;
          if (i1 > 0xffffff) {
             i1 = 1;
          }
       } while (obj.compareAndSet(i, i1));
       return i;
    }
}
