package com.kuaishou.live.lite.player.biz.controller.LiveLiteRecoEnterActionLogController$e;
import z1.k;
import com.kuaishou.live.lite.player.biz.controller.LiveLiteRecoEnterActionLogController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteRecoEnterActionLogController$e implements k	// class@000aa1
{
    public final LiveLiteRecoEnterActionLogController b;

    public void LiveLiteRecoEnterActionLogController$e(LiveLiteRecoEnterActionLogController p0){
       this.b = p0;
       super();
    }
    public Object get(){
       String str = PatchProxy.apply(null, this, LiveLiteRecoEnterActionLogController$e.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          str = this.b.b();
       }
       return str;
    }
}
