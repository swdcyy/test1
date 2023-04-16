package com.kwai.feature.api.live.plugin.dva.LivePluginManager$loadIfLaunchFinish$onLoadResult$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Number;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;

public final class LivePluginManager$loadIfLaunchFinish$onLoadResult$1 extends Lambda implements p	// class@000ff6
{
    public final boolean $hasDownloaded;
    public final long $loadStartAt;

    public void LivePluginManager$loadIfLaunchFinish$onLoadResult$1(long p0,boolean p1){
       this.$loadStartAt = p0;
       this.$hasDownloaded = p1;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0.longValue(), p1.booleanValue());
       return l1.a;
    }
    public final void invoke(long p0,boolean p1){
       if (PatchProxy.isSupport(LivePluginManager$loadIfLaunchFinish$onLoadResult$1.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Boolean.valueOf(p1), this, LivePluginManager$loadIfLaunchFinish$onLoadResult$1.class, "1")) {
          return;
       }
       LivePluginManager.d.i("LAUNCH_FINISH", (p0 - this.$loadStartAt), this.$hasDownloaded, p1);
       return;
    }
}
