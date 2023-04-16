package com.kuaishou.live.lite.player.biz.controller.LiveLiteRecoEnterActionLogController$bizToken$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import e93.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kuaishou.live.lite.LiveLiteParam;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public final class LiveLiteRecoEnterActionLogController$bizToken$2 extends Lambda implements a	// class@000a9e
{
    public final a $liveAudienceInfoManager;

    public void LiveLiteRecoEnterActionLogController$bizToken$2(a p0){
       this.$liveAudienceInfoManager = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRecoEnterActionLogController$bizToken$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveLiteParam liveLitePara = this.$liveAudienceInfoManager.ok();
       a.o(liveLitePara, "liveAudienceInfoManager.liveLiteParam");
       return "Lite-"+r1.n1(liveLitePara.getLiveStreamFeed());
    }
}
