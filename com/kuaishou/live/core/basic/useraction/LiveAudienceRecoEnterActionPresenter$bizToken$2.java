package com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter$bizToken$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;

public final class LiveAudienceRecoEnterActionPresenter$bizToken$2 extends Lambda implements a	// class@0008d3
{
    public final LiveAudienceRecoEnterActionPresenter this$0;

    public void LiveAudienceRecoEnterActionPresenter$bizToken$2(LiveAudienceRecoEnterActionPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       StringBuilder obj = PatchProxy.apply(null, this, LiveAudienceRecoEnterActionPresenter$bizToken$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "Detail-";
       LiveAudienceRecoEnterActionPresenter u = this.this$0.u;
       if (u == null) {
          a.S("liveStreamFeedWrapper");
       }
       return obj+u.getLiveStreamId();
    }
}
