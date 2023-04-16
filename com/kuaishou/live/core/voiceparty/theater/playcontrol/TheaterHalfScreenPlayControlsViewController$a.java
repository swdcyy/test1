package com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterHalfScreenPlayControlsViewController$a;
import oq5.c;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterHalfScreenPlayControlsViewController;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;

public final class TheaterHalfScreenPlayControlsViewController$a implements c	// class@00199a
{
    public final TheaterHalfScreenPlayControlsViewController b;

    public void TheaterHalfScreenPlayControlsViewController$a(TheaterHalfScreenPlayControlsViewController p0){
       this.b = p0;
       super();
    }
    public final void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterHalfScreenPlayControlsViewController$a.class, "1")) {
          return;
       }
       if (p0.orientation == 2) {
          this.b.n.s(TheaterDisplayMode.FULL_SCREEN_LANDSCAPE);
       }
       return;
    }
}
