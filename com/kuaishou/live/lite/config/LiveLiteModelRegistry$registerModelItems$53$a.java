package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$53$a;
import z1.k;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;

public final class LiveLiteModelRegistry$registerModelItems$53$a implements k	// class@0008a6
{
    public final LiveLiteModelManager b;

    public void LiveLiteModelRegistry$registerModelItems$53$a(LiveLiteModelManager p0){
       this.b = p0;
       super();
    }
    public Object get(){
       ClientContent$LiveStreamPackage liveStreamPa = PatchProxy.apply(null, this, LiveLiteModelRegistry$registerModelItems$53$a.class, "1");
       if (liveStreamPa != PatchProxyResult.class) {
       }else {
          liveStreamPa = this.b.c(i.class, "获取直播埋点package").a();
       }
       return liveStreamPa;
    }
}
