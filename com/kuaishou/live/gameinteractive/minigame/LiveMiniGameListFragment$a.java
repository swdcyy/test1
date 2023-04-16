package com.kuaishou.live.gameinteractive.minigame.LiveMiniGameListFragment$a;
import mq5.h;
import com.kuaishou.live.gameinteractive.minigame.LiveMiniGameListFragment;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public class LiveMiniGameListFragment$a implements h	// class@001bd2
{
    public final LiveMiniGameListFragment b;

    public void LiveMiniGameListFragment$a(LiveMiniGameListFragment p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, LiveMiniGameListFragment$a.class, "1")) {
          return;
       }
       LiveMiniGameListFragment i = this.b.I;
       if (i != null && i.K()) {
          this.b.I.o();
          this.b.I = null;
       }
       this.b.dismissAllowingStateLoss();
       return;
    }
}
