package com.kuaishou.live.core.voiceparty.micseats.pendant.PKFireAnimationPendantViewModel$myTeam$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.util.Map;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.micseats.core.data.MicSeatTeam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class PKFireAnimationPendantViewModel$myTeam$1 extends Lambda implements p	// class@001739
{
    public static final PKFireAnimationPendantViewModel$myTeam$1 INSTANCE;

    static {
       PKFireAnimationPendantViewModel$myTeam$1.INSTANCE = new PKFireAnimationPendantViewModel$myTeam$1();
    }
    public void PKFireAnimationPendantViewModel$myTeam$1(){
       super(2);
    }
    public final MicSeatTeam invoke(Map p0,Integer p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PKFireAnimationPendantViewModel$myTeam$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "teamInfo");
       return p0.get(p1);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
