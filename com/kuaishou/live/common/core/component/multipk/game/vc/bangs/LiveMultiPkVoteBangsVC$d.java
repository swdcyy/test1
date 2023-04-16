package com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkVoteBangsVC$d;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkVoteBangsVC;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ws1.e;
import ws1.c;

public final class LiveMultiPkVoteBangsVC$d implements Observer	// class@00161d
{
    public final LiveMultiPkVoteBangsVC b;

    public void LiveMultiPkVoteBangsVC$d(LiveMultiPkVoteBangsVC p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkVoteBangsVC$d.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             p0 = this.b;
             p0.q.w(p0);
          }else {
             p0 = this.b;
             p0.q.n(p0);
          }
       }
       return;
    }
}
