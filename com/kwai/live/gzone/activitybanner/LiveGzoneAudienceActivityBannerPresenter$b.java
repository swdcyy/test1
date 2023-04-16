package com.kwai.live.gzone.activitybanner.LiveGzoneAudienceActivityBannerPresenter$b;
import oq5.c;
import com.kwai.live.gzone.activitybanner.LiveGzoneAudienceActivityBannerPresenter;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveGzoneAudienceActivityBannerPresenter$b implements c	// class@000c53
{
    public final LiveGzoneAudienceActivityBannerPresenter b;

    public void LiveGzoneAudienceActivityBannerPresenter$b(LiveGzoneAudienceActivityBannerPresenter p0){
       this.b = p0;
       super();
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAudienceActivityBannerPresenter$b.class, "1")) {
          return;
       }
       LiveGzoneAudienceActivityBannerPresenter$b tb = this.b;
       if (tb.x == null) {
          return;
       }
       if (p0.orientation == 2 && tb.S == 2) {
          tb.R8(1);
       }
       tb = this.b;
       boolean b = (p0.orientation == 2)? true: false;
       tb.e9(1, b);
       return;
    }
}
