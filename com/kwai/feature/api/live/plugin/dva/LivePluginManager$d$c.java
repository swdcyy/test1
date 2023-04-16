package com.kwai.feature.api.live.plugin.dva.LivePluginManager$d$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LivePluginManager$d$c implements g	// class@000ff4
{
    public static final LivePluginManager$d$c b;

    static {
       LivePluginManager$d$c.b = new LivePluginManager$d$c();
    }
    public void LivePluginManager$d$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePluginManager$d$c.class, "1")) {
       }else {
          b.y(LiveLogTag.LIVE_PLUGIN.appendTag("LivePluginManager"), "live audience plugin loaded, workerThreads fails", p0);
       }
       return;
    }
}
