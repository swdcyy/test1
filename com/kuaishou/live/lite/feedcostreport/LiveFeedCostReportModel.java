package com.kuaishou.live.lite.feedcostreport.LiveFeedCostReportModel;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveTrafficReportConfig;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.feedcostreport.LiveFeedCostReportModel$lifecycleObserver$1;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.b;
import oh3.j;

public final class LiveFeedCostReportModel	// class@0008fe
{
    public b a;
    public b b;
    public boolean c;
    public boolean d;
    public final LiveFeedCostReportModel$lifecycleObserver$1 e;
    public final int f;
    public final LiveStreamFeed$LiveTrafficReportConfig g;
    public final LifecycleOwner h;

    public void LiveFeedCostReportModel(int p0,LiveStreamFeed$LiveTrafficReportConfig p1,LifecycleOwner p2){
       a.p(p1, "liveTrafficReportConfig");
       a.p(p2, "lifecycleOwner");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       LiveFeedCostReportModel$lifecycleObserver$1 olifecycleOb = new LiveFeedCostReportModel$lifecycleObserver$1(this);
       this.e = olifecycleOb;
       p2.getLifecycle().addObserver(olifecycleOb);
    }
    public final boolean a(){
       boolean b = (this.d == null && this.c == null)? true: false;
       return b;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveFeedCostReportModel.class, "3")) {
          return;
       }
       j.a(this.a);
       j.a(this.b);
       return;
    }
}
