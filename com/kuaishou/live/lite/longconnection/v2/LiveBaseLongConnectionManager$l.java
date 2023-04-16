package com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$l;
import erd.g;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager;
import msd.l;
import java.lang.Object;
import com.kuaishou.live.core.show.race.HorseRaceInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.live.model.Race;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.Collection;

public final class LiveBaseLongConnectionManager$l implements g	// class@000a1e
{
    public final LiveBaseLongConnectionManager b;
    public final l c;

    public void LiveBaseLongConnectionManager$l(LiveBaseLongConnectionManager p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseLongConnectionManager$l.class, "1")) {
       }else {
          QLivePlayConfig livePlayConf = this.b.g.getLivePlayConfig();
          if (livePlayConf != null) {
             livePlayConf.mAttach = p0.mAttach;
             livePlayConf.getHorseRace().mRounds.clear();
             livePlayConf.getHorseRace().clearState();
             Race mRounds = p0.mRace.mRounds;
             a.o(mRounds, "it.mRace.mRounds");
             livePlayConf.getHorseRace().mRounds.addAll(mRounds);
          }
          a.o(p0, "it");
          this.c.invoke(p0);
       }
       return;
    }
}
