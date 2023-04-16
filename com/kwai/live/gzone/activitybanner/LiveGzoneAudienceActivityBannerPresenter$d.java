package com.kwai.live.gzone.activitybanner.LiveGzoneAudienceActivityBannerPresenter$d;
import mq5.h;
import com.kwai.live.gzone.activitybanner.LiveGzoneAudienceActivityBannerPresenter;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveGzoneAudienceActivityBannerPresenter$d implements h	// class@000c55
{
    public final LiveGzoneAudienceActivityBannerPresenter b;

    public void LiveGzoneAudienceActivityBannerPresenter$d(LiveGzoneAudienceActivityBannerPresenter p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceActivityBannerPresenter$d.class, "1")) {
          return;
       }
       this.b.V8();
       return;
    }
}
