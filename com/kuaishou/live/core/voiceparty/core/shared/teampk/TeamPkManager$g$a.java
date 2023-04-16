package com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$g$a;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$StopPk;
import nsd.u;
import ut7.e;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class TeamPkManager$g$a implements Runnable	// class@001457
{
    public final TeamPkManager$g b;

    public void TeamPkManager$g$a(TeamPkManager$g p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TeamPkManager$g$a.class, "1")) {
          return;
       }
       this.b.g.g(new TeamPkManager$StopPk(objArray, 1, objArray));
       b.Z(this.b.g.d(), "TeamPk stop by punish timeout");
       return;
    }
}
