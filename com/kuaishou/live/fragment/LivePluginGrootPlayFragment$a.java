package com.kuaishou.live.fragment.LivePluginGrootPlayFragment$a;
import com.kuaishou.live.fragment.LivePluginLoadingFragment$a;
import com.kuaishou.live.fragment.LivePluginGrootPlayFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import qs5.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public class LivePluginGrootPlayFragment$a implements LivePluginLoadingFragment$a	// class@001bc7
{
    public final LivePluginGrootPlayFragment a;

    public void LivePluginGrootPlayFragment$a(LivePluginGrootPlayFragment p0){
       this.a = p0;
       super();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LivePluginGrootPlayFragment$a.class, "1")) {
          return;
       }
       LivePluginGrootPlayFragment$a ta = this.a;
       LivePluginGrootPlayFragment r = ta.r;
       long l = System.currentTimeMillis() - r;
       if (r > 0 && l > 0) {
          a.c(a.a(ta.p), l, this.a.s, true);
       }
       b.S(LiveLogTag.LIVE_PLUGIN.appendTag("LivePluginGrootPlayFragment"), "onLoadSuccess", "page2", this.a.p);
       LivePluginGrootPlayFragment$a ta1 = this.a;
       if (ta1.q == null) {
          ta1.hh();
       }
       return;
    }
    public void y1(){
       if (PatchProxy.applyVoid(null, this, LivePluginGrootPlayFragment$a.class, "2")) {
          return;
       }
       LivePluginGrootPlayFragment$a ta = this.a;
       LivePluginGrootPlayFragment r = ta.r;
       long l = System.currentTimeMillis() - r;
       if (r > 0 && l > 0) {
          a.c(a.a(ta.p), l, this.a.s, false);
       }
       b.S(LiveLogTag.LIVE_PLUGIN.appendTag("LivePluginGrootPlayFragment"), "onLoadFail", "page2", this.a.p);
       return;
    }
}
