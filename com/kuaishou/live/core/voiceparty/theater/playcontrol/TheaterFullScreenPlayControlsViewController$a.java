package com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController$a;
import oq5.c;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class TheaterFullScreenPlayControlsViewController$a implements c	// class@00198a
{
    public final TheaterFullScreenPlayControlsViewController b;

    public void TheaterFullScreenPlayControlsViewController$a(TheaterFullScreenPlayControlsViewController p0){
       this.b = p0;
       super();
    }
    public final void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterFullScreenPlayControlsViewController$a.class, "1")) {
          return;
       }
       if (p0.orientation == 1) {
          this.b.W2();
       }
       return;
    }
}
