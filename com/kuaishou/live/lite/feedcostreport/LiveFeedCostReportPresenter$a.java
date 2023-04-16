package com.kuaishou.live.lite.feedcostreport.LiveFeedCostReportPresenter$a;
import mq5.h;
import com.kuaishou.live.lite.feedcostreport.LiveFeedCostReportPresenter;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.feedcostreport.LiveFeedCostReportModel;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveFeedCostReportPresenter$a implements h	// class@0008ff
{
    public final LiveFeedCostReportPresenter b;

    public void LiveFeedCostReportPresenter$a(LiveFeedCostReportPresenter p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveFeedCostReportPresenter$a.class, "1")) {
          return;
       }
       LiveFeedCostReportPresenter x = this.b.x;
       if (x != null && !PatchProxy.applyVoid(objArray, x, LiveFeedCostReportModel.class, "1")) {
          x.d = true;
          x.b();
          b.P(LiveLogTag.LIVE_LITE.appendTag("LiveFeedCostReportModel"), "live close");
       }
       return;
    }
}
