package com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController$setupBottomBarItem$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectDialog;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gq5.f;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController$setupBottomBarItem$1$1;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController$setupBottomBarItem$1$2;
import msd.l;

public final class TheaterFullScreenPlayControlsViewController$setupBottomBarItem$1 extends Lambda implements a	// class@001990
{
    public final QualitySelectDialog $qualitySelectLauncher;
    public final TheaterFullScreenPlayControlsViewController this$0;

    public void TheaterFullScreenPlayControlsViewController$setupBottomBarItem$1(TheaterFullScreenPlayControlsViewController p0,QualitySelectDialog p1){
       this.this$0 = p0;
       this.$qualitySelectLauncher = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, TheaterFullScreenPlayControlsViewController$setupBottomBarItem$1.class, "1")) {
          return;
       }
       TheaterFullScreenPlayControlsViewController s = this.this$0.s;
       if (s != null) {
          s.j();
       }
       this.$qualitySelectLauncher.b(new TheaterFullScreenPlayControlsViewController$setupBottomBarItem$1$1(this), new TheaterFullScreenPlayControlsViewController$setupBottomBarItem$1$2(this));
       return;
    }
}
