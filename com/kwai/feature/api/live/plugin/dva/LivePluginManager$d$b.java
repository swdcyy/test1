package com.kwai.feature.api.live.plugin.dva.LivePluginManager$d$b;
import erd.g;
import java.util.List;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LivePluginManager$d$b implements g	// class@000ff3
{
    public final List b;

    public void LivePluginManager$d$b(List p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePluginManager$d$b.class, "1")) {
       }else {
          b.S(LiveLogTag.LIVE_PLUGIN.appendTag("LivePluginManager"), "live audience plugin loaded, workerThreads finish ", "workerThreads", this.b);
       }
       return;
    }
}
