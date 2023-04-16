package com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$buildStateChart$1$3$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$a;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class TeamPkManager$buildStateChart$1$3$1 extends Lambda implements l	// class@00144f
{
    public static final TeamPkManager$buildStateChart$1$3$1 INSTANCE;

    static {
       TeamPkManager$buildStateChart$1$3$1.INSTANCE = new TeamPkManager$buildStateChart$1$3$1();
    }
    public void TeamPkManager$buildStateChart$1$3$1(){
       super(1);
    }
    public final TeamPkManager$b invoke(TeamPkManager$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TeamPkManager$buildStateChart$1$3$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new TeamPkManager$b();
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
