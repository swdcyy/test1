package com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkPunishBangsVC$c;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkPunishBangsVC;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkPunishBangsVC$a;
import kotlin.jvm.internal.a;
import ws1.e;
import ws1.c;

public final class LiveMultiPkPunishBangsVC$c implements Observer	// class@001607
{
    public final LiveMultiPkPunishBangsVC b;

    public void LiveMultiPkPunishBangsVC$c(LiveMultiPkPunishBangsVC p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkPunishBangsVC$c.class, "1")) {
       }else {
          LiveMultiPkPunishBangsVC$c tb = this.b;
          if (tb.m == null) {
             a.o(p0, "title");
             tb.m = new LiveMultiPkPunishBangsVC$a(tb, p0);
          }
          p0 = this.b;
          LiveMultiPkPunishBangsVC m = p0.m;
          if (m != null) {
             p0.r.w(m);
          }
       }
       return;
    }
}
