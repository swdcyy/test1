package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController$d;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer$State;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import msd.l;

public final class TheaterPlayerController$d implements Runnable	// class@0019d6
{
    public final TheaterPlayerController b;
    public final TheaterPlayer$State c;

    public void TheaterPlayerController$d(TheaterPlayerController p0,TheaterPlayer$State p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TheaterPlayerController$d.class, "1")) {
          return;
       }
       Iterator iterator = this.b.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().invoke(this.c);
       }
       return;
    }
}
