package com.yxcorp.gifshow.ad.report.monitor.DynamicMonitorFactory$createUiMonitor$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import com.google.gson.JsonObject;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o49.g;

public final class DynamicMonitorFactory$createUiMonitor$1 extends Lambda implements l	// class@0017b7
{
    public final BaseFeed $feed;

    public void DynamicMonitorFactory$createUiMonitor$1(BaseFeed p0){
       this.$feed = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicMonitorFactory$createUiMonitor$1.class, "1")) {
          return;
       }
       a.p(p0, "json");
       g.b(g.a, this.$feed, p0, 0, 0, 12, null);
       return;
    }
}
