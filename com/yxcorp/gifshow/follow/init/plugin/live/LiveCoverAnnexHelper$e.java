package com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$e;
import erd.g;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper;
import com.kuaishou.android.model.feed.LiveCoverAnnex;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveCoverAnnexHelper$e implements g	// class@0010cc
{
    public final LiveCoverAnnexHelper b;
    public final LiveCoverAnnex c;

    public void LiveCoverAnnexHelper$e(LiveCoverAnnexHelper p0,LiveCoverAnnex p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCoverAnnexHelper$e.class, "1")) {
       }else {
          p0 = this.b;
          LiveCoverAnnexHelper$e tc = this.c;
          a.o(tc, "liveCoverAnnex");
          p0.q(p0.o, tc);
       }
       return;
    }
}
