package com.kuaishou.live.core.show.luckystar.util.LiveLuckyStarLogger$StatusValue;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLuckyStarLogger$StatusValue extends Enum	// class@000cf6
{
    public final int mValue;
    public static final LiveLuckyStarLogger$StatusValue[] $VALUES;
    public static final LiveLuckyStarLogger$StatusValue FALSE;
    public static final LiveLuckyStarLogger$StatusValue TRUE;
    public static final LiveLuckyStarLogger$StatusValue UNKNOWN;

    static {
       LiveLuckyStarLogger$StatusValue statusValue = new LiveLuckyStarLogger$StatusValue("TRUE", 0, 1);
       LiveLuckyStarLogger$StatusValue.TRUE = statusValue;
       LiveLuckyStarLogger$StatusValue statusValue1 = new LiveLuckyStarLogger$StatusValue("FALSE", 1, 0);
       LiveLuckyStarLogger$StatusValue.FALSE = statusValue1;
       LiveLuckyStarLogger$StatusValue statusValue2 = new LiveLuckyStarLogger$StatusValue("UNKNOWN", 2, -1);
       LiveLuckyStarLogger$StatusValue.UNKNOWN = statusValue2;
       LiveLuckyStarLogger$StatusValue[] statusValueA = new LiveLuckyStarLogger$StatusValue[]{statusValue,statusValue1,statusValue2};
       LiveLuckyStarLogger$StatusValue.$VALUES = statusValueA;
    }
    public void LiveLuckyStarLogger$StatusValue(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static LiveLuckyStarLogger$StatusValue valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLuckyStarLogger$StatusValue.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLuckyStarLogger$StatusValue.class, p0);
    }
    public static LiveLuckyStarLogger$StatusValue[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLuckyStarLogger$StatusValue.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLuckyStarLogger$StatusValue.$VALUES.clone();
    }
    public int getValue(){
       return this.mValue;
    }
}
