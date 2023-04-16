package com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$v;
import android.view.View$OnLongClickListener;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$a;

public final class LiveCoverAnnexHelper$v implements View$OnLongClickListener	// class@0010df
{
    public final LiveCoverAnnexHelper b;

    public void LiveCoverAnnexHelper$v(LiveCoverAnnexHelper p0){
       this.b = p0;
       super();
    }
    public final boolean onLongClick(View p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LiveCoverAnnexHelper$v.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       LiveCoverAnnexHelper r = this.b.r;
       if (r != null) {
          r.a();
       }
       return true;
    }
}
