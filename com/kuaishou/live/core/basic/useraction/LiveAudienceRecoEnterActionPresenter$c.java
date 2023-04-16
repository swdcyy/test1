package com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter$c;
import z1.k;
import com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;

public final class LiveAudienceRecoEnterActionPresenter$c implements k	// class@0008d4
{
    public final LiveAudienceRecoEnterActionPresenter b;

    public void LiveAudienceRecoEnterActionPresenter$c(LiveAudienceRecoEnterActionPresenter p0){
       this.b = p0;
       super();
    }
    public Object get(){
       ClientContent$LiveStreamPackage liveStreamPa = PatchProxy.apply(null, this, LiveAudienceRecoEnterActionPresenter$c.class, "1");
       if (liveStreamPa != PatchProxyResult.class) {
       }else {
          liveStreamPa = LiveAudienceRecoEnterActionPresenter.P8(this.b).a();
       }
       return liveStreamPa;
    }
}
