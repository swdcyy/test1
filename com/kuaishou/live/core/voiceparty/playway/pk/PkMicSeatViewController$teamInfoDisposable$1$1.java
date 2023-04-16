package com.kuaishou.live.core.voiceparty.playway.pk.PkMicSeatViewController$teamInfoDisposable$1$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.util.Map;
import com.kuaishou.live.core.voiceparty.micseats.core.data.MicSeatTeam;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class PkMicSeatViewController$teamInfoDisposable$1$1 extends Lambda implements p	// class@001866
{
    public final Map $teamInfo;

    public void PkMicSeatViewController$teamInfoDisposable$1$1(Map p0){
       this.$teamInfo = p0;
       super(2);
    }
    public final MicSeatTeam invoke(int p0,int p1){
       if (PatchProxy.isSupport(PkMicSeatViewController$teamInfoDisposable$1$1.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, PkMicSeatViewController$teamInfoDisposable$1$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.$teamInfo.get(Integer.valueOf(p0));
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0.intValue(), p1.intValue());
    }
}
