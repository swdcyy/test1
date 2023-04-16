package com.kuaishou.merchant.live.bubble.pinocchio.widget.PinocchioBubble$LEVEL;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PinocchioBubble$LEVEL extends Enum	// class@0018e7
{
    public static final PinocchioBubble$LEVEL[] $VALUES;
    public static final PinocchioBubble$LEVEL LEVEL_ONE;
    public static final PinocchioBubble$LEVEL LEVEL_THREE;
    public static final PinocchioBubble$LEVEL LEVEL_TWO;

    static {
       PinocchioBubble$LEVEL lEVEL;
       PinocchioBubble$LEVEL[] lEVELArray = new PinocchioBubble$LEVEL[]{lEVEL,lEVEL,lEVEL};
       lEVEL = new PinocchioBubble$LEVEL("LEVEL_ONE", 0);
       PinocchioBubble$LEVEL.LEVEL_ONE = lEVEL;
       lEVEL = new PinocchioBubble$LEVEL("LEVEL_TWO", 1);
       PinocchioBubble$LEVEL.LEVEL_TWO = lEVEL;
       lEVEL = new PinocchioBubble$LEVEL("LEVEL_THREE", 2);
       PinocchioBubble$LEVEL.LEVEL_THREE = lEVEL;
       PinocchioBubble$LEVEL.$VALUES = lEVELArray;
    }
    public void PinocchioBubble$LEVEL(String p0,int p1){
       super(p0, p1);
    }
    public static PinocchioBubble$LEVEL valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PinocchioBubble$LEVEL.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PinocchioBubble$LEVEL.class, p0);
    }
    public static PinocchioBubble$LEVEL[] values(){
       Object obj = PatchProxy.apply(null, null, PinocchioBubble$LEVEL.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PinocchioBubble$LEVEL.$VALUES.clone();
    }
}
