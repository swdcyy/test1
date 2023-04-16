package com.kwai.feature.api.corona.util.CoronaLiveStyle;
import java.lang.Enum;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CoronaLiveStyle extends Enum	// class@000e37
{
    public final int value;
    public static final CoronaLiveStyle[] $VALUES;
    public static final CoronaLiveStyle DEFALUT;
    public static final CoronaLiveStyle EXPERIMENT_V1;
    public static final CoronaLiveStyle EXPERIMENT_V2;
    public static final CoronaLiveStyle EXPERIMENT_V3;
    public static final CoronaLiveStyle EXPERIMENT_V4;
    public static final CoronaLiveStyle EXPERIMENT_V5;
    public static final CoronaLiveStyle EXPERIMENT_V6;

    static {
       CoronaLiveStyle uCoronaLiveS1;
       CoronaLiveStyle[] uCoronaLiveS = new CoronaLiveStyle[]{uCoronaLiveS1,uCoronaLiveS1,uCoronaLiveS1,uCoronaLiveS1,uCoronaLiveS1,uCoronaLiveS1,uCoronaLiveS1};
       uCoronaLiveS1 = new CoronaLiveStyle("DEFALUT", 0, 0);
       CoronaLiveStyle.DEFALUT = uCoronaLiveS1;
       uCoronaLiveS1 = new CoronaLiveStyle("EXPERIMENT_V1", 1, 1);
       CoronaLiveStyle.EXPERIMENT_V1 = uCoronaLiveS1;
       uCoronaLiveS1 = new CoronaLiveStyle("EXPERIMENT_V2", 2, 2);
       CoronaLiveStyle.EXPERIMENT_V2 = uCoronaLiveS1;
       uCoronaLiveS1 = new CoronaLiveStyle("EXPERIMENT_V3", 3, 3);
       CoronaLiveStyle.EXPERIMENT_V3 = uCoronaLiveS1;
       uCoronaLiveS1 = new CoronaLiveStyle("EXPERIMENT_V4", 4, 4);
       CoronaLiveStyle.EXPERIMENT_V4 = uCoronaLiveS1;
       uCoronaLiveS1 = new CoronaLiveStyle("EXPERIMENT_V5", 5, 5);
       CoronaLiveStyle.EXPERIMENT_V5 = uCoronaLiveS1;
       uCoronaLiveS1 = new CoronaLiveStyle("EXPERIMENT_V6", 6, 6);
       CoronaLiveStyle.EXPERIMENT_V6 = uCoronaLiveS1;
       CoronaLiveStyle.$VALUES = uCoronaLiveS;
    }
    public void CoronaLiveStyle(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public void CoronaLiveStyle(String p0,int p1,int p2,int p3,u p4){
       if (p3 & 0x01) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static CoronaLiveStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CoronaLiveStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CoronaLiveStyle.class, p0);
    }
    public static CoronaLiveStyle[] values(){
       Object obj = PatchProxy.apply(null, null, CoronaLiveStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CoronaLiveStyle.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
}
