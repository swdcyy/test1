package com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$mEnableDanmuFrameVertical$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveCoverAnnexHelper$mEnableDanmuFrameVertical$2 extends Lambda implements a	// class@0010d5
{
    public final LiveCoverAnnexHelper this$0;

    public void LiveCoverAnnexHelper$mEnableDanmuFrameVertical$2(LiveCoverAnnexHelper p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       LiveCoverAnnexHelper$mEnableDanmuFrameVertical$2 obj = PatchProxy.apply(null, this, LiveCoverAnnexHelper$mEnableDanmuFrameVertical$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.this$0;
       boolean b = true;
       if (obj.f != b && !obj.j()) {
          b = false;
       }
       return b;
    }
}
