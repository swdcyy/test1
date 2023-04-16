package com.kuaishou.live.core.voiceparty.playway.pk.PkMicSeatViewController$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.core.data.MicSeatTeam;
import java.lang.Object;
import java.lang.Number;

public final class PkMicSeatViewController$1 extends Lambda implements p	// class@001864
{
    public static final PkMicSeatViewController$1 INSTANCE;

    static {
       PkMicSeatViewController$1.INSTANCE = new PkMicSeatViewController$1();
    }
    public void PkMicSeatViewController$1(){
       super(2);
    }
    public final MicSeatTeam invoke(int p0,int p1){
       MicSeatTeam yELLOW = (!(p1 % 2))? MicSeatTeam.YELLOW: MicSeatTeam.BLUE;
       return yELLOW;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0.intValue(), p1.intValue());
    }
}
