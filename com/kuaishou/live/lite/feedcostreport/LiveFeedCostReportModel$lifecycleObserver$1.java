package com.kuaishou.live.lite.feedcostreport.LiveFeedCostReportModel$lifecycleObserver$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.live.lite.feedcostreport.LiveFeedCostReportModel;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import java.lang.Boolean;
import crd.b;
import oh3.j;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveTrafficReportConfig;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import ya3.d;
import erd.g;

public final class LiveFeedCostReportModel$lifecycleObserver$1 implements DefaultLifecycleObserver	// class@0008fd
{
    public final LiveFeedCostReportModel b;

    public void LiveFeedCostReportModel$lifecycleObserver$1(LiveFeedCostReportModel p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFeedCostReportModel$lifecycleObserver$1.class, "3")) {
          return;
       }
       a.p(p0, "owner");
       a.b(this, p0);
       this.b.b();
       this.b.h.getLifecycle().removeObserver(this);
       return;
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFeedCostReportModel$lifecycleObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       a.d(this, p0);
       LiveLogTag lIVE_LITE = LiveLogTag.LIVE_LITE;
       String str = "LiveFeedCostReportModel";
       lIVE_LITE.appendTag(str);
       b.P(lIVE_LITE, "onResume");
       LiveFeedCostReportModel$lifecycleObserver$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, LiveFeedCostReportModel.class, "2")) {
          lIVE_LITE.appendTag(str);
          b.T(lIVE_LITE, "startExposureTimerIfCan", "isCostReport", Boolean.valueOf(tb.c), "isLiveEnd", Boolean.valueOf(tb.d));
          if (tb.a()) {
             j.a(tb.a);
             tb.a = t.timer(tb.g.mLiteReportIntervalMillis, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new d(tb));
          }
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFeedCostReportModel$lifecycleObserver$1.class, "2")) {
          return;
       }
       a.p(p0, "owner");
       a.f(this, p0);
       b.P(LiveLogTag.LIVE_LITE.appendTag("LiveFeedCostReportModel"), "onStop");
       LiveFeedCostReportModel$lifecycleObserver$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, LiveFeedCostReportModel.class, "4")) {
          j.a(tb.a);
       }
       return;
    }
}
