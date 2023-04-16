package com.kuaishou.live.core.show.luckystar.LiveLuckyStarStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLuckyStarStyle extends Enum	// class@000cb7
{
    public static final LiveLuckyStarStyle[] $VALUES;
    public static final LiveLuckyStarStyle LUCKY_STAR;
    public static final LiveLuckyStarStyle LUCKY_STAR_V2;
    public static final LiveLuckyStarStyle UNKNOWN;

    static {
       LiveLuckyStarStyle liveLuckySta = new LiveLuckyStarStyle("UNKNOWN", 0);
       LiveLuckyStarStyle.UNKNOWN = liveLuckySta;
       LiveLuckyStarStyle liveLuckySta1 = new LiveLuckyStarStyle("LUCKY_STAR", 1);
       LiveLuckyStarStyle.LUCKY_STAR = liveLuckySta1;
       LiveLuckyStarStyle liveLuckySta2 = new LiveLuckyStarStyle("LUCKY_STAR_V2", 2);
       LiveLuckyStarStyle.LUCKY_STAR_V2 = liveLuckySta2;
       LiveLuckyStarStyle[] liveLuckySta3 = new LiveLuckyStarStyle[]{liveLuckySta,liveLuckySta1,liveLuckySta2};
       LiveLuckyStarStyle.$VALUES = liveLuckySta3;
    }
    public void LiveLuckyStarStyle(String p0,int p1){
       super(p0, p1);
    }
    public static LiveLuckyStarStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLuckyStarStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLuckyStarStyle.class, p0);
    }
    public static LiveLuckyStarStyle[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLuckyStarStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLuckyStarStyle.$VALUES.clone();
    }
}
