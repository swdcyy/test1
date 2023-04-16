package com.yxcorp.gifshow.events.growth.GrowthInterestTagEvent$EditResult;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GrowthInterestTagEvent$EditResult extends Enum	// class@000e86
{
    public static final GrowthInterestTagEvent$EditResult[] $VALUES;
    public static final GrowthInterestTagEvent$EditResult CANCEL;
    public static final GrowthInterestTagEvent$EditResult FAILURE;
    public static final GrowthInterestTagEvent$EditResult SUCCESS;

    static {
       GrowthInterestTagEvent$EditResult uEditResult;
       GrowthInterestTagEvent$EditResult[] uEditResultA = new GrowthInterestTagEvent$EditResult[]{uEditResult,uEditResult,uEditResult};
       uEditResult = new GrowthInterestTagEvent$EditResult("CANCEL", 0);
       GrowthInterestTagEvent$EditResult.CANCEL = uEditResult;
       uEditResult = new GrowthInterestTagEvent$EditResult("SUCCESS", 1);
       GrowthInterestTagEvent$EditResult.SUCCESS = uEditResult;
       uEditResult = new GrowthInterestTagEvent$EditResult("FAILURE", 2);
       GrowthInterestTagEvent$EditResult.FAILURE = uEditResult;
       GrowthInterestTagEvent$EditResult.$VALUES = uEditResultA;
    }
    public void GrowthInterestTagEvent$EditResult(String p0,int p1){
       super(p0, p1);
    }
    public static GrowthInterestTagEvent$EditResult valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GrowthInterestTagEvent$EditResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GrowthInterestTagEvent$EditResult.class, p0);
    }
    public static GrowthInterestTagEvent$EditResult[] values(){
       Object obj = PatchProxy.apply(null, null, GrowthInterestTagEvent$EditResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GrowthInterestTagEvent$EditResult.$VALUES.clone();
    }
}
