package com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$mEnableNearbyDanmuFrameVertical$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import vw5.a;

public final class LiveCoverAnnexHelper$mEnableNearbyDanmuFrameVertical$2 extends Lambda implements a	// class@0010d6
{
    public final LiveCoverAnnexHelper this$0;

    public void LiveCoverAnnexHelper$mEnableNearbyDanmuFrameVertical$2(LiveCoverAnnexHelper p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LiveCoverAnnexHelper$mEnableNearbyDanmuFrameVertical$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.this$0.f == 5 && d.a(-680793205).Ci())? true: false;
       return b;
    }
}
