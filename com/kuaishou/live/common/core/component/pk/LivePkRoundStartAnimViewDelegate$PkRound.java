package com.kuaishou.live.common.core.component.pk.LivePkRoundStartAnimViewDelegate$PkRound;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePkRoundStartAnimViewDelegate$PkRound extends Enum	// class@00172b
{
    public static final LivePkRoundStartAnimViewDelegate$PkRound[] $VALUES;
    public static final LivePkRoundStartAnimViewDelegate$PkRound THREE_OUT_OF_FIVE_1;
    public static final LivePkRoundStartAnimViewDelegate$PkRound THREE_OUT_OF_FIVE_2;
    public static final LivePkRoundStartAnimViewDelegate$PkRound THREE_OUT_OF_FIVE_3;
    public static final LivePkRoundStartAnimViewDelegate$PkRound THREE_OUT_OF_FIVE_4;
    public static final LivePkRoundStartAnimViewDelegate$PkRound THREE_OUT_OF_FIVE_5;
    public static final LivePkRoundStartAnimViewDelegate$PkRound TWO_OUT_OF_THREE_1;
    public static final LivePkRoundStartAnimViewDelegate$PkRound TWO_OUT_OF_THREE_2;
    public static final LivePkRoundStartAnimViewDelegate$PkRound TWO_OUT_OF_THREE_3;
    public static final LivePkRoundStartAnimViewDelegate$PkRound UNKNOWN;

    static {
       LivePkRoundStartAnimViewDelegate$PkRound pkRound = new LivePkRoundStartAnimViewDelegate$PkRound("UNKNOWN", 0);
       LivePkRoundStartAnimViewDelegate$PkRound.UNKNOWN = pkRound;
       LivePkRoundStartAnimViewDelegate$PkRound pkRound1 = new LivePkRoundStartAnimViewDelegate$PkRound("TWO_OUT_OF_THREE_1", 1);
       LivePkRoundStartAnimViewDelegate$PkRound.TWO_OUT_OF_THREE_1 = pkRound1;
       LivePkRoundStartAnimViewDelegate$PkRound pkRound2 = new LivePkRoundStartAnimViewDelegate$PkRound("TWO_OUT_OF_THREE_2", 2);
       LivePkRoundStartAnimViewDelegate$PkRound.TWO_OUT_OF_THREE_2 = pkRound2;
       LivePkRoundStartAnimViewDelegate$PkRound pkRound3 = new LivePkRoundStartAnimViewDelegate$PkRound("TWO_OUT_OF_THREE_3", 3);
       LivePkRoundStartAnimViewDelegate$PkRound.TWO_OUT_OF_THREE_3 = pkRound3;
       LivePkRoundStartAnimViewDelegate$PkRound pkRound4 = new LivePkRoundStartAnimViewDelegate$PkRound("THREE_OUT_OF_FIVE_1", 4);
       LivePkRoundStartAnimViewDelegate$PkRound.THREE_OUT_OF_FIVE_1 = pkRound4;
       LivePkRoundStartAnimViewDelegate$PkRound pkRound5 = new LivePkRoundStartAnimViewDelegate$PkRound("THREE_OUT_OF_FIVE_2", 5);
       LivePkRoundStartAnimViewDelegate$PkRound.THREE_OUT_OF_FIVE_2 = pkRound5;
       LivePkRoundStartAnimViewDelegate$PkRound pkRound6 = new LivePkRoundStartAnimViewDelegate$PkRound("THREE_OUT_OF_FIVE_3", 6);
       LivePkRoundStartAnimViewDelegate$PkRound.THREE_OUT_OF_FIVE_3 = pkRound6;
       LivePkRoundStartAnimViewDelegate$PkRound pkRound7 = new LivePkRoundStartAnimViewDelegate$PkRound("THREE_OUT_OF_FIVE_4", 7);
       LivePkRoundStartAnimViewDelegate$PkRound.THREE_OUT_OF_FIVE_4 = pkRound7;
       LivePkRoundStartAnimViewDelegate$PkRound pkRound8 = new LivePkRoundStartAnimViewDelegate$PkRound("THREE_OUT_OF_FIVE_5", 8);
       LivePkRoundStartAnimViewDelegate$PkRound.THREE_OUT_OF_FIVE_5 = pkRound8;
       LivePkRoundStartAnimViewDelegate$PkRound[] pkRoundArray = new LivePkRoundStartAnimViewDelegate$PkRound[9];
       pkRoundArray[0] = pkRound;
       pkRoundArray[1] = pkRound1;
       pkRoundArray[2] = pkRound2;
       pkRoundArray[3] = pkRound3;
       pkRoundArray[4] = pkRound4;
       pkRoundArray[5] = pkRound5;
       pkRoundArray[6] = pkRound6;
       pkRoundArray[7] = pkRound7;
       pkRoundArray[8] = pkRound8;
       LivePkRoundStartAnimViewDelegate$PkRound.$VALUES = pkRoundArray;
    }
    public void LivePkRoundStartAnimViewDelegate$PkRound(String p0,int p1){
       super(p0, p1);
    }
    public static LivePkRoundStartAnimViewDelegate$PkRound valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePkRoundStartAnimViewDelegate$PkRound.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePkRoundStartAnimViewDelegate$PkRound.class, p0);
    }
    public static LivePkRoundStartAnimViewDelegate$PkRound[] values(){
       Object obj = PatchProxy.apply(null, null, LivePkRoundStartAnimViewDelegate$PkRound.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePkRoundStartAnimViewDelegate$PkRound.$VALUES.clone();
    }
}
