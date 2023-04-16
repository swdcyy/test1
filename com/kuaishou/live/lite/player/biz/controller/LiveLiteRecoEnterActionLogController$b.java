package com.kuaishou.live.lite.player.biz.controller.LiveLiteRecoEnterActionLogController$b;
import z1.k;
import com.kuaishou.live.lite.player.biz.controller.LiveLiteRecoEnterActionLogController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k2b.e0;
import xp5.i;

public final class LiveLiteRecoEnterActionLogController$b implements k	// class@000a9d
{
    public final LiveLiteRecoEnterActionLogController b;

    public void LiveLiteRecoEnterActionLogController$b(LiveLiteRecoEnterActionLogController p0){
       this.b = p0;
       super();
    }
    public Object get(){
       e0 uoe0 = PatchProxy.apply(null, this, LiveLiteRecoEnterActionLogController$b.class, "1");
       if (uoe0 != PatchProxyResult.class) {
       }else {
          uoe0 = this.b.g.getPage();
       }
       return uoe0;
    }
}
