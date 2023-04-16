package com.kwai.video.waynelive.wayneplayer.PlayerStateTracker;
import com.kwai.video.waynelive.wayneplayer.PlayerStateTracker$Companion;
import nsd.u;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerState;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuffer;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.debug.DebugLog;

public final class PlayerStateTracker	// class@000e34
{
    public final List mStates;
    public static final PlayerStateTracker$Companion Companion;

    static {
       PlayerStateTracker.Companion = new PlayerStateTracker$Companion(null);
    }
    public void PlayerStateTracker(){
       super();
       LivePlayerState[] livePlayerSt = new LivePlayerState[]{LivePlayerState.IDLE};
       this.mStates = CollectionsKt__CollectionsKt.P(livePlayerSt);
    }
    public final void dump(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerStateTracker.class, "2")) {
          return;
       }
       a.p(p0, "logTag");
       StringBuffer str = "";
       int i = 0;
       Iterator iterator = this.mStates.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          str = str+obj;
          if (i != CollectionsKt__CollectionsKt.G(this.mStates)) {
             str = str+"->";
          }
          i = i1;
       }
       DebugLog.d(PlayerStateTracker.Companion.logTag(p0), "state move path: "+str);
       return;
    }
    public final void track(LivePlayerState p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlayerStateTracker.class, "1")) {
          return;
       }
       a.p(p0, "state");
       a.p(p1, "logTag");
       PlayerStateTracker tmStates = this.mStates;
       DebugLog.d(PlayerStateTracker.Companion.logTag(p1), "state move:"+tmStates.get(CollectionsKt__CollectionsKt.G(tmStates))+" -> "+p0);
       this.mStates.add(p0);
       return;
    }
}
