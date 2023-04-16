package com.kuaishou.live.preview.item.useraction.LivePreviewRecoEnterActionPresenter$c;
import z1.k;
import com.kuaishou.live.preview.item.useraction.LivePreviewRecoEnterActionPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import rl3.a;

public final class LivePreviewRecoEnterActionPresenter$c implements k	// class@000e4d
{
    public final LivePreviewRecoEnterActionPresenter b;

    public void LivePreviewRecoEnterActionPresenter$c(LivePreviewRecoEnterActionPresenter p0){
       this.b = p0;
       super();
    }
    public Object get(){
       ClientContent$LiveStreamPackage liveStreamPa = PatchProxy.apply(null, this, LivePreviewRecoEnterActionPresenter$c.class, "1");
       if (liveStreamPa != PatchProxyResult.class) {
       }else {
          liveStreamPa = a.a(LivePreviewRecoEnterActionPresenter.W8(this.b).mEntity, 1);
       }
       return liveStreamPa;
    }
}
