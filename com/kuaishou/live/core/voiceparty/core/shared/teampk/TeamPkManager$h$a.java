package com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$h$a;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$VoteEnd;
import ut7.e;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class TeamPkManager$h$a implements Runnable	// class@001459
{
    public final TeamPkManager$h b;

    public void TeamPkManager$h$a(TeamPkManager$h p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TeamPkManager$h$a.class, "1")) {
          return;
       }
       this.b.g.g(new TeamPkManager$VoteEnd());
       b.Z(this.b.g.d(), "TeamPk vote end by timeout");
       return;
    }
}
