package com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$f;
import erd.g;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper;
import java.lang.Object;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;

public final class LiveCoverAnnexHelper$f implements g	// class@0010cd
{
    public final LiveCoverAnnexHelper b;

    public void LiveCoverAnnexHelper$f(LiveCoverAnnexHelper p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCoverAnnexHelper$f.class, "1")) {
       }else {
          p0.m = SystemClock.elapsedRealtime();
       }
       return;
    }
}
