package com.kuaishou.live.common.core.component.multipk.game.vc.bangs.cohesion.LiveMultiPkCohesionVoteBangsVC$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.cohesion.LiveMultiPkCohesionVoteBangsVC;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ws1.e;
import ws1.c;

public final class LiveMultiPkCohesionVoteBangsVC$a implements Observer	// class@001623
{
    public final LiveMultiPkCohesionVoteBangsVC b;

    public void LiveMultiPkCohesionVoteBangsVC$a(LiveMultiPkCohesionVoteBangsVC p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkCohesionVoteBangsVC$a.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             p0 = this.b;
             p0.u.w(p0);
          }else {
             p0 = this.b;
             p0.u.n(p0);
          }
       }
       return;
    }
}
