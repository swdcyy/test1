package com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$b;
import com.kwai.video.waynelive.listeners.LivePlayerBufferListener;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import oj3.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.System;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import s82.o0;
import h91.a;
import o02.e;

public class LiveFloatingWindowManager$b implements LivePlayerBufferListener	// class@000b62
{
    public final LiveFloatingWindowManager b;

    public void LiveFloatingWindowManager$b(LiveFloatingWindowManager p0){
       this.b = p0;
       super();
    }
    public void onBufferEnd(){
    }
    public void onBufferStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveFloatingWindowManager$b.class, "1")) {
          return;
       }
       LiveFloatingWindowManager$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, LiveFloatingWindowManager.class, "39")) {
          if (!a.a()) {
             b.Z(LiveLogTag.FLOATING_WINDOW, "queryLiveStatus, disEnableQueryLiveStatusOnBufferStart, return");
          }else if((System.currentTimeMillis() - tb.u) - tb.t < 0 || tb.x == null){
             b.Z(LiveLogTag.FLOATING_WINDOW, "queryLiveStatus");
             tb.u = System.currentTimeMillis();
             e.c(tb.x.getLiveStreamId(), new o0(tb));
          }
       }
       return;
    }
}
