package com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkPunishBangsVC$d;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkPunishBangsVC;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ws1.e;
import ws1.c;

public final class LiveMultiPkPunishBangsVC$d implements Observer	// class@00160c
{
    public final LiveMultiPkPunishBangsVC b;

    public void LiveMultiPkPunishBangsVC$d(LiveMultiPkPunishBangsVC p0){
       this.b = p0;
       super();
    }
    public final void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkPunishBangsVC$d.class, "1")) {
          return;
       }
       p0 = this.b;
       LiveMultiPkPunishBangsVC m = p0.m;
       if (m != null) {
          p0.r.n(m);
       }
       return;
    }
}
