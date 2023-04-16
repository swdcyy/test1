package com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$s;
import erd.g;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.data.LiveCoverAnnexResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveCoverAnnexHelper$s implements g	// class@0010dc
{
    public final LiveCoverAnnexHelper b;

    public void LiveCoverAnnexHelper$s(LiveCoverAnnexHelper p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCoverAnnexHelper$s.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.h(p0);
       }
       return;
    }
}
