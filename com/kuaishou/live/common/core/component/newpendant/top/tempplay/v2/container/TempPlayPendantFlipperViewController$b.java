package com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantFlipperViewController$b;
import ks5.h;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantFlipperViewController;
import java.lang.Object;
import ks5.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantViewFlipper;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import ls5.a;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.List;
import android.widget.ViewFlipper;
import android.view.animation.Animation;
import java.util.Set;

public final class TempPlayPendantFlipperViewController$b implements h	// class@0016d6
{
    public final TempPlayPendantFlipperViewController a;

    public void TempPlayPendantFlipperViewController$b(TempPlayPendantFlipperViewController p0){
       this.a = p0;
       super();
    }
    public void a(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TempPlayPendantFlipperViewController$b.class, "1")) {
          return;
       }
       String str = "topPendantItem";
       a.p(p0, str);
       TempPlayPendantViewFlipper tempPlayPend = TempPlayPendantFlipperViewController.V2(this.a);
       Objects.requireNonNull(tempPlayPend);
       if (!PatchProxy.applyVoidOneRefs(p0, tempPlayPend, TempPlayPendantViewFlipper.class, "4")) {
          a.p(p0, str);
          b.c0(LiveLogTag.LIVE_TOP_PENDANT, "LiveTempPlayPendantController.onAnimationStart", "bizType", p0.getId());
          int i = tempPlayPend.g.indexOf(p0);
          if (i >= 0) {
             tempPlayPend.stopFlipping();
             tempPlayPend.setClipChildren(false);
             tempPlayPend.setInAnimation(null);
             tempPlayPend.setOutAnimation(null);
             tempPlayPend.setDisplayedChild(i);
          }else {
             tempPlayPend.i.add(p0.getId());
          }
       }
       return;
    }
    public void b(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TempPlayPendantFlipperViewController$b.class, "2")) {
          return;
       }
       String str = "topPendantItem";
       a.p(p0, str);
       TempPlayPendantViewFlipper tempPlayPend = TempPlayPendantFlipperViewController.V2(this.a);
       Objects.requireNonNull(tempPlayPend);
       if (!PatchProxy.applyVoidOneRefs(p0, tempPlayPend, TempPlayPendantViewFlipper.class, "5")) {
          a.p(p0, str);
          tempPlayPend.i.remove(p0.getId());
          if (tempPlayPend.g.size() > 1) {
             tempPlayPend.startFlipping();
          }
       }
       return;
    }
}
