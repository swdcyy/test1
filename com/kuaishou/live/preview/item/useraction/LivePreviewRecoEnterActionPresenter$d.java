package com.kuaishou.live.preview.item.useraction.LivePreviewRecoEnterActionPresenter$d;
import z1.k;
import com.kuaishou.live.preview.item.useraction.LivePreviewRecoEnterActionPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public final class LivePreviewRecoEnterActionPresenter$d implements k	// class@000e4e
{
    public final LivePreviewRecoEnterActionPresenter b;

    public void LivePreviewRecoEnterActionPresenter$d(LivePreviewRecoEnterActionPresenter p0){
       this.b = p0;
       super();
    }
    public Object get(){
       FeedLogCtx uFeedLogCtx = PatchProxy.apply(null, this, LivePreviewRecoEnterActionPresenter$d.class, "1");
       if (uFeedLogCtx != PatchProxyResult.class) {
       }else {
          uFeedLogCtx = r1.O0(LivePreviewRecoEnterActionPresenter.W8(this.b).getEntity());
       }
       return uFeedLogCtx;
    }
}
