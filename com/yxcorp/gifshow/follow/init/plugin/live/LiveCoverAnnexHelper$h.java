package com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$h;
import erd.a;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.CommonMeta;

public final class LiveCoverAnnexHelper$h implements a	// class@0010cf
{
    public final LiveCoverAnnexHelper b;

    public void LiveCoverAnnexHelper$h(LiveCoverAnnexHelper p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveCoverAnnexHelper$h.class, "1")) {
          return;
       }
       LiveCoverAnnexHelper$h tb = this.b;
       LiveCoverAnnexHelper f = tb.F;
       if (f != null && f.mTransientShowedCommodity == 1) {
          tb.l("resumeCoverAnnex");
       }
       return;
    }
}
