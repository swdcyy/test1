package com.kuaishou.live.lite.player.biz.controller.LiveLiteRecoEnterActionLogController$c;
import z1.k;
import com.kuaishou.live.lite.player.biz.controller.LiveLiteRecoEnterActionLogController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;

public final class LiveLiteRecoEnterActionLogController$c implements k	// class@000a9f
{
    public final LiveLiteRecoEnterActionLogController b;

    public void LiveLiteRecoEnterActionLogController$c(LiveLiteRecoEnterActionLogController p0){
       this.b = p0;
       super();
    }
    public Object get(){
       ClientContent$LiveStreamPackage liveStreamPa = PatchProxy.apply(null, this, LiveLiteRecoEnterActionLogController$c.class, "1");
       if (liveStreamPa != PatchProxyResult.class) {
       }else {
          liveStreamPa = this.b.g.a();
       }
       return liveStreamPa;
    }
}
