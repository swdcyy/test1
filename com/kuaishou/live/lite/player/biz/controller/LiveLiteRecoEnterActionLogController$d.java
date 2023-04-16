package com.kuaishou.live.lite.player.biz.controller.LiveLiteRecoEnterActionLogController$d;
import z1.k;
import com.kuaishou.live.lite.player.biz.controller.LiveLiteRecoEnterActionLogController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import xp5.i;

public final class LiveLiteRecoEnterActionLogController$d implements k	// class@000aa0
{
    public final LiveLiteRecoEnterActionLogController b;

    public void LiveLiteRecoEnterActionLogController$d(LiveLiteRecoEnterActionLogController p0){
       this.b = p0;
       super();
    }
    public Object get(){
       FeedLogCtx uFeedLogCtx = PatchProxy.apply(null, this, LiveLiteRecoEnterActionLogController$d.class, "1");
       if (uFeedLogCtx != PatchProxyResult.class) {
       }else {
          uFeedLogCtx = this.b.g.c0();
       }
       return uFeedLogCtx;
    }
}
