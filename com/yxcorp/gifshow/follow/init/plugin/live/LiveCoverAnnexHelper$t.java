package com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$t;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;

public final class LiveCoverAnnexHelper$t implements g	// class@0010dd
{
    public static final LiveCoverAnnexHelper$t b;

    static {
       LiveCoverAnnexHelper$t.b = new LiveCoverAnnexHelper$t();
    }
    public void LiveCoverAnnexHelper$t(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCoverAnnexHelper$t.class, "1")) {
       }else {
          Log.e("LiveCoverAnnex", "load live cover annex error", p0);
       }
       return;
    }
}
