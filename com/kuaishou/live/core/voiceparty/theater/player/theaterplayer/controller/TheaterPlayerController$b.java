package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController$b;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import msd.p;
import java.lang.Long;

public final class TheaterPlayerController$b implements Runnable	// class@0019d4
{
    public final TheaterPlayerController b;
    public final long c;
    public final long d;

    public void TheaterPlayerController$b(TheaterPlayerController p0,long p1,long p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TheaterPlayerController$b.class, "1")) {
          return;
       }
       Iterator iterator = this.b.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().invoke(Long.valueOf(this.c), Long.valueOf(this.d));
       }
       return;
    }
}
