package com.kuaishou.live.core.voiceparty.core.shared.teampk.a;
import lf3.g;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$e;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCTeamPkStatisticInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$a;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.statechart.b;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$b;
import com.kuaishou.livestream.message.nano.TeamPkStatisticInfo;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$VoteEnd;
import ut7.e;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager;
import lf3.f;

public final class a implements g	// class@00145c
{
    public final TeamPkManager$e b;

    public void a(TeamPkManager$e p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else if(a.g(p0.pkRoomId, this.b.a().c()) ^ 0x01){
          b.Z(LiveVoicePartyLogTag.TEAM_PK_ANCHOR, "receive SCTeamPkStatisticInfo, invalid PKRoomId");
       }else {
          this.b.h().b(p0.statisticInfo);
          SCTeamPkStatisticInfo statisticInf = p0.statisticInfo;
          a.o(statisticInf, "it.statisticInfo");
          this.b.j(statisticInf);
          if (p0.statisticInfo.voteEnd != null) {
             this.b.g.g(new TeamPkManager$VoteEnd());
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
