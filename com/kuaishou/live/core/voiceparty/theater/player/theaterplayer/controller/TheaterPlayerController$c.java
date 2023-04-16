package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController$c;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import msd.p;

public final class TheaterPlayerController$c implements Runnable	// class@0019d5
{
    public final TheaterPlayerController b;
    public final LiveQualityItem c;
    public final List d;

    public void TheaterPlayerController$c(TheaterPlayerController p0,LiveQualityItem p1,List p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TheaterPlayerController$c.class, "1")) {
          return;
       }
       Iterator iterator = this.b.e.iterator();
       while (iterator.hasNext()) {
          iterator.next().invoke(this.c, this.d);
       }
       return;
    }
}
