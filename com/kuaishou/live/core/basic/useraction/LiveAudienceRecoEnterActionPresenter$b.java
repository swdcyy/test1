package com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter$b;
import z1.k;
import com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k2b.e0;
import xp5.i;

public final class LiveAudienceRecoEnterActionPresenter$b implements k	// class@0008d2
{
    public final LiveAudienceRecoEnterActionPresenter b;

    public void LiveAudienceRecoEnterActionPresenter$b(LiveAudienceRecoEnterActionPresenter p0){
       this.b = p0;
       super();
    }
    public Object get(){
       e0 uoe0 = PatchProxy.apply(null, this, LiveAudienceRecoEnterActionPresenter$b.class, "1");
       if (uoe0 != PatchProxyResult.class) {
       }else {
          uoe0 = LiveAudienceRecoEnterActionPresenter.P8(this.b).getPage();
       }
       return uoe0;
    }
}
