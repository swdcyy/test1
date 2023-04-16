package com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$u;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper;
import com.kuaishou.android.model.feed.LiveCoverAnnex;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$a;

public final class LiveCoverAnnexHelper$u implements View$OnClickListener	// class@0010de
{
    public final LiveCoverAnnexHelper b;
    public final LiveCoverAnnex c;

    public void LiveCoverAnnexHelper$u(LiveCoverAnnexHelper p0,LiveCoverAnnex p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCoverAnnexHelper$u.class, "1")) {
          return;
       }
       LiveCoverAnnexHelper r = this.b.r;
       if (r != null) {
          r.b(this.c);
       }
       return;
    }
}
