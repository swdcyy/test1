package com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$buildStateChart$1$3$2;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.SCTeamPkStart;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$a;
import ut7.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut7.h;
import nsd.u;

public final class TeamPkManager$buildStateChart$1$3$2 extends Lambda implements p	// class@001450
{
    public static final TeamPkManager$buildStateChart$1$3$2 INSTANCE;

    static {
       TeamPkManager$buildStateChart$1$3$2.INSTANCE = new TeamPkManager$buildStateChart$1$3$2();
    }
    public void TeamPkManager$buildStateChart$1$3$2(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final l invoke(SCTeamPkStart p0,TeamPkManager$a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, TeamPkManager$buildStateChart$1$3$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "param");
       a.p(p1, "<anonymous parameter 1>");
       return new l(p0, null, 2, null);
    }
}
