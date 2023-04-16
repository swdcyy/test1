package com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$buildStateChart$$inlined$apply$lambda$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager;
import java.lang.Object;
import com.kwai.statechart.StateChart$SubChartBuilder;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$buildStateChart$1$3$1;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$buildStateChart$1$3$2;
import com.kwai.statechart.a;
import msd.p;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$VoteEnd;
import np2.b;
import ut7.o;

public final class TeamPkManager$buildStateChart$$inlined$apply$lambda$2 extends Lambda implements l	// class@00144d
{
    public final TeamPkManager this$0;

    public void TeamPkManager$buildStateChart$$inlined$apply$lambda$2(TeamPkManager p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(StateChart$SubChartBuilder p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, TeamPkManager$buildStateChart$$inlined$apply$lambda$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.a(TeamPkManager$buildStateChart$1$3$1.INSTANCE);
       p0.b(this.this$0.g, TeamPkManager$buildStateChart$1$3$2.INSTANCE);
       p0.c(this.this$0.g);
       p0.c(this.this$0.h);
       TeamPkManager$buildStateChart$$inlined$apply$lambda$2 tthis$0 = this.this$0;
       p0.d("pk_voteEnd", tthis$0.g, tthis$0.h, TeamPkManager$VoteEnd.class, b.a);
       PatchProxy.onMethodExit(TeamPkManager$buildStateChart$$inlined$apply$lambda$2.class, "1");
       return;
    }
}
