package com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController$setupBottomBarItem$qualitySelectLauncher$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import vw2.c;
import java.lang.Object;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import z61.f;
import androidx.lifecycle.MutableLiveData;

public final class TheaterFullScreenPlayControlsViewController$setupBottomBarItem$qualitySelectLauncher$1 extends Lambda implements l	// class@001993
{
    public final c $bottomBarItem;

    public void TheaterFullScreenPlayControlsViewController$setupBottomBarItem$qualitySelectLauncher$1(c p0){
       this.$bottomBarItem = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveQualityItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterFullScreenPlayControlsViewController$setupBottomBarItem$qualitySelectLauncher$1.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.$bottomBarItem.setVisible(true);
          TheaterFullScreenPlayControlsViewController$setupBottomBarItem$qualitySelectLauncher$1 t$bottomBarI = this.$bottomBarItem;
          String shortName = p0.getShortName();
          a.o(shortName, "it.shortName");
          Objects.requireNonNull(t$bottomBarI);
          if (!PatchProxy.applyVoidOneRefs(shortName, t$bottomBarI, c.class, "2")) {
             a.p(shortName, "value");
             t$bottomBarI.e = shortName;
             c b = t$bottomBarI.b;
             b.c = shortName;
             t$bottomBarI.a.setValue(b);
          }
       }else {
          this.$bottomBarItem.setVisible(false);
       }
       return;
    }
}
