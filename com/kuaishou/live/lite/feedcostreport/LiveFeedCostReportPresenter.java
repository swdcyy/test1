package com.kuaishou.live.lite.feedcostreport.LiveFeedCostReportPresenter;
import b93.d;
import com.kuaishou.live.lite.feedcostreport.LiveFeedCostReportPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveTrafficReportConfig;
import com.kuaishou.live.lite.feedcostreport.LiveFeedCostReportModel;
import com.kuaishou.live.lite.LiveLiteParam;
import e93.a;
import androidx.lifecycle.LifecycleOwner;
import mq5.h;
import mq5.b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Long;
import com.kuaishou.android.live.log.b;
import c93.b;

public final class LiveFeedCostReportPresenter extends d	// class@000900
{
    public a v;
    public b w;
    public LiveFeedCostReportModel x;
    public final h y;

    public void LiveFeedCostReportPresenter(){
       super();
       this.y = new LiveFeedCostReportPresenter$a(this);
    }
    public void F8(){
       LiveStreamFeed$LiveTrafficReportConfig mLiteReportI;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveFeedCostReportPresenter.class, "2")) {
          return;
       }
       super.F8();
       LiveFeedCostReportPresenter tv = this.v;
       String str = "liveLiteAudienceInfoManager";
       if (tv == null) {
          a.S(str);
       }
       LiveStreamFeed liveStreamFe = tv.j0();
       if (liveStreamFe != null) {
          objArray = liveStreamFe.mLiveTrafficReportConfig;
       }
       tv = this.v;
       if (tv == null) {
          a.S(str);
       }
       liveStreamFe = tv.j0();
       String str1 = null;
       if (liveStreamFe != null) {
          liveStreamFe = liveStreamFe.mLiveTrafficReportConfig;
          if (liveStreamFe != null) {
             mLiteReportI = liveStreamFe.mLiteReportIntervalMillis;
          label_0037 :
             if (objArray == null || mLiteReportI - str1 <= 0) {
                b.S(LiveLogTag.LIVE_LITE.appendTag("LiveFeedCostReportModel"), "onCreate: not create LiveFeedCostReportModel", "liteReportIntervalMillis", Long.valueOf(mLiteReportI));
                return;
             }else {
                LiveFeedCostReportPresenter tv1 = this.v;
                if (tv1 == null) {
                   a.S(str);
                }
                LiveLiteParam liveLitePara = tv1.ok();
                a.o(liveLitePara, "liveLiteAudienceInfoManager.liveLiteParam");
                this.x = new LiveFeedCostReportModel(liveLitePara.getStartPlaySourceType(), objArray, this);
                tv = this.w;
                if (tv == null) {
                   a.S("mLiveAudienceEndManager");
                }
                tv.Km(this.y);
                return;
             }
          }
       }
       mLiteReportI = str1;
       goto label_0037 ;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveFeedCostReportPresenter.class, "3")) {
          return;
       }
       LiveFeedCostReportPresenter tw = this.w;
       if (tw == null) {
          a.S("mLiveAudienceEndManager");
       }
       tw.le(this.y);
       this.x = null;
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFeedCostReportPresenter.class, "1")) {
          return;
       }
       a.p(p0, "provider");
       this.v = p0.a(a.class);
       this.w = p0.a(b.class);
       return;
    }
}
