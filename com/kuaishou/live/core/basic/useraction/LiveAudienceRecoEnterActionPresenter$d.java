package com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter$d;
import z1.k;
import com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import xp5.i;

public final class LiveAudienceRecoEnterActionPresenter$d implements k	// class@0008d5
{
    public final LiveAudienceRecoEnterActionPresenter b;

    public void LiveAudienceRecoEnterActionPresenter$d(LiveAudienceRecoEnterActionPresenter p0){
       this.b = p0;
       super();
    }
    public Object get(){
       FeedLogCtx uFeedLogCtx = PatchProxy.apply(null, this, LiveAudienceRecoEnterActionPresenter$d.class, "1");
       if (uFeedLogCtx != PatchProxyResult.class) {
       }else {
          uFeedLogCtx = LiveAudienceRecoEnterActionPresenter.P8(this.b).c0();
       }
       return uFeedLogCtx;
    }
}
