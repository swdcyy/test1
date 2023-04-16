package com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkVoteBangsVC$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkVoteBangsVC;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.plugin.live.widget.LiveNoShrinkTextView;

public final class LiveMultiPkVoteBangsVC$a implements Observer	// class@001616
{
    public final LiveMultiPkVoteBangsVC b;

    public void LiveMultiPkVoteBangsVC$a(LiveMultiPkVoteBangsVC p0){
       this.b = p0;
       super();
    }
    public final void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkVoteBangsVC$a.class, "1")) {
          return;
       }
       b.Z(LiveCommonLogTag.MULTI_PK, "resetCountDownTexView");
       p0 = this.b.k;
       if (p0 != null) {
          p0.b();
       }
       return;
    }
}
