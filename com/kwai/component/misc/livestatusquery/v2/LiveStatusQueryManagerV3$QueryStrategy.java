package com.kwai.component.misc.livestatusquery.v2.LiveStatusQueryManagerV3$QueryStrategy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveStatusQueryManagerV3$QueryStrategy extends Enum	// class@0009d0
{
    public static final LiveStatusQueryManagerV3$QueryStrategy[] $VALUES;
    public static final LiveStatusQueryManagerV3$QueryStrategy BACKGROUND_ACTIVE;
    public static final LiveStatusQueryManagerV3$QueryStrategy BACKGROUND_NON_ACTIVE;
    public static final LiveStatusQueryManagerV3$QueryStrategy FOREGROUND_ACTIVE;
    public static final LiveStatusQueryManagerV3$QueryStrategy FOREGROUND_NON_ACTIVE;

    static {
       LiveStatusQueryManagerV3$QueryStrategy queryStrateg = new LiveStatusQueryManagerV3$QueryStrategy("FOREGROUND_ACTIVE", 0);
       LiveStatusQueryManagerV3$QueryStrategy.FOREGROUND_ACTIVE = queryStrateg;
       LiveStatusQueryManagerV3$QueryStrategy queryStrateg1 = new LiveStatusQueryManagerV3$QueryStrategy("FOREGROUND_NON_ACTIVE", 1);
       LiveStatusQueryManagerV3$QueryStrategy.FOREGROUND_NON_ACTIVE = queryStrateg1;
       LiveStatusQueryManagerV3$QueryStrategy queryStrateg2 = new LiveStatusQueryManagerV3$QueryStrategy("BACKGROUND_ACTIVE", 2);
       LiveStatusQueryManagerV3$QueryStrategy.BACKGROUND_ACTIVE = queryStrateg2;
       LiveStatusQueryManagerV3$QueryStrategy queryStrateg3 = new LiveStatusQueryManagerV3$QueryStrategy("BACKGROUND_NON_ACTIVE", 3);
       LiveStatusQueryManagerV3$QueryStrategy.BACKGROUND_NON_ACTIVE = queryStrateg3;
       LiveStatusQueryManagerV3$QueryStrategy[] queryStrateg4 = new LiveStatusQueryManagerV3$QueryStrategy[]{queryStrateg,queryStrateg1,queryStrateg2,queryStrateg3};
       LiveStatusQueryManagerV3$QueryStrategy.$VALUES = queryStrateg4;
    }
    public void LiveStatusQueryManagerV3$QueryStrategy(String p0,int p1){
       super(p0, p1);
    }
    public static LiveStatusQueryManagerV3$QueryStrategy valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveStatusQueryManagerV3$QueryStrategy.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveStatusQueryManagerV3$QueryStrategy.class, p0);
    }
    public static LiveStatusQueryManagerV3$QueryStrategy[] values(){
       Object obj = PatchProxy.apply(null, null, LiveStatusQueryManagerV3$QueryStrategy.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveStatusQueryManagerV3$QueryStrategy.$VALUES.clone();
    }
}
