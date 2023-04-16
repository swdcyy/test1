package com.yxcorp.gifshow.widget.trimvideo.RangeSeekerV2$MoveTarget;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RangeSeekerV2$MoveTarget extends Enum	// class@0019df
{
    public static final RangeSeekerV2$MoveTarget[] $VALUES;
    public static final RangeSeekerV2$MoveTarget LEFT_HANDLER;
    public static final RangeSeekerV2$MoveTarget NONE;
    public static final RangeSeekerV2$MoveTarget PROGRESS_INDICATOR;
    public static final RangeSeekerV2$MoveTarget RIGHT_HANDLER;

    static {
       RangeSeekerV2$MoveTarget moveTarget = new RangeSeekerV2$MoveTarget("NONE", 0);
       RangeSeekerV2$MoveTarget.NONE = moveTarget;
       RangeSeekerV2$MoveTarget moveTarget1 = new RangeSeekerV2$MoveTarget("LEFT_HANDLER", 1);
       RangeSeekerV2$MoveTarget.LEFT_HANDLER = moveTarget1;
       RangeSeekerV2$MoveTarget moveTarget2 = new RangeSeekerV2$MoveTarget("RIGHT_HANDLER", 2);
       RangeSeekerV2$MoveTarget.RIGHT_HANDLER = moveTarget2;
       RangeSeekerV2$MoveTarget moveTarget3 = new RangeSeekerV2$MoveTarget("PROGRESS_INDICATOR", 3);
       RangeSeekerV2$MoveTarget.PROGRESS_INDICATOR = moveTarget3;
       RangeSeekerV2$MoveTarget[] moveTargetAr = new RangeSeekerV2$MoveTarget[]{moveTarget,moveTarget1,moveTarget2,moveTarget3};
       RangeSeekerV2$MoveTarget.$VALUES = moveTargetAr;
    }
    public void RangeSeekerV2$MoveTarget(String p0,int p1){
       super(p0, p1);
    }
    public static RangeSeekerV2$MoveTarget valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RangeSeekerV2$MoveTarget.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RangeSeekerV2$MoveTarget.class, p0);
    }
    public static RangeSeekerV2$MoveTarget[] values(){
       Object obj = PatchProxy.apply(null, null, RangeSeekerV2$MoveTarget.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RangeSeekerV2$MoveTarget.$VALUES.clone();
    }
}
