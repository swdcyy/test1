package com.kwai.locallife.api.live.kswitch.LiveLocalLifeSwitchKeys$From;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLocalLifeSwitchKeys$From extends Enum	// class@000e9d
{
    public int from;
    public static final LiveLocalLifeSwitchKeys$From[] $VALUES;
    public static final LiveLocalLifeSwitchKeys$From AB;
    public static final LiveLocalLifeSwitchKeys$From DEV;
    public static final LiveLocalLifeSwitchKeys$From SWITCH;

    static {
       LiveLocalLifeSwitchKeys$From uFrom = new LiveLocalLifeSwitchKeys$From("AB", 0, 1);
       LiveLocalLifeSwitchKeys$From.AB = uFrom;
       LiveLocalLifeSwitchKeys$From uFrom1 = new LiveLocalLifeSwitchKeys$From("SWITCH", 1, 2);
       LiveLocalLifeSwitchKeys$From.SWITCH = uFrom1;
       LiveLocalLifeSwitchKeys$From uFrom2 = new LiveLocalLifeSwitchKeys$From("DEV", 2, 3);
       LiveLocalLifeSwitchKeys$From.DEV = uFrom2;
       LiveLocalLifeSwitchKeys$From[] uFromArray = new LiveLocalLifeSwitchKeys$From[]{uFrom,uFrom1,uFrom2};
       LiveLocalLifeSwitchKeys$From.$VALUES = uFromArray;
    }
    public void LiveLocalLifeSwitchKeys$From(String p0,int p1,int p2){
       super(p0, p1);
       this.from = p2;
    }
    public static LiveLocalLifeSwitchKeys$From valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLocalLifeSwitchKeys$From.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLocalLifeSwitchKeys$From.class, p0);
    }
    public static LiveLocalLifeSwitchKeys$From[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLocalLifeSwitchKeys$From.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLocalLifeSwitchKeys$From.$VALUES.clone();
    }
}
