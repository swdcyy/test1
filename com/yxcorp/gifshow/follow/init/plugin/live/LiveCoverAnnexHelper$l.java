package com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$l;
import erd.g;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.utility.Log;

public final class LiveCoverAnnexHelper$l implements g	// class@0010d3
{
    public final LiveCoverAnnexHelper b;

    public void LiveCoverAnnexHelper$l(LiveCoverAnnexHelper p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCoverAnnexHelper$l.class, "1")) {
       }else {
          LiveCoverAnnexHelper$l tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, LiveCoverAnnexHelper.class, "17") && tb.v != -1) {
             tb.v = -1;
             tb.s();
          }
          tb = this.b;
          tb.t = false;
          tb.l("requestCoverAnnexInterval load live cover annex error");
          Log.e("LiveCoverAnnex", "requestCoverAnnexInterval load live cover annex error", p0);
       }
       return;
    }
}
