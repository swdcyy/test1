package com.kuaishou.live.common.core.component.pk.LivePkResult;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePkResult extends Enum	// class@00172a
{
    public static final LivePkResult[] $VALUES;
    public static final LivePkResult LINE;
    public static final LivePkResult LOSE;
    public static final LivePkResult TIE;
    public static final LivePkResult WIN;

    static {
       LivePkResult livePkResult = new LivePkResult("WIN", 0);
       LivePkResult.WIN = livePkResult;
       LivePkResult livePkResult1 = new LivePkResult("LOSE", 1);
       LivePkResult.LOSE = livePkResult1;
       LivePkResult livePkResult2 = new LivePkResult("TIE", 2);
       LivePkResult.TIE = livePkResult2;
       LivePkResult livePkResult3 = new LivePkResult("LINE", 3);
       LivePkResult.LINE = livePkResult3;
       LivePkResult[] livePkResult4 = new LivePkResult[]{livePkResult,livePkResult1,livePkResult2,livePkResult3};
       LivePkResult.$VALUES = livePkResult4;
    }
    public void LivePkResult(String p0,int p1){
       super(p0, p1);
    }
    public static LivePkResult valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePkResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePkResult.class, p0);
    }
    public static LivePkResult[] values(){
       Object obj = PatchProxy.apply(null, null, LivePkResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePkResult.$VALUES.clone();
    }
}
