package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiLinePuzzleState extends Enum	// class@0015b0
{
    public static final LiveMultiLinePuzzleState[] $VALUES;
    public static final LiveMultiLinePuzzleState ANSWER;
    public static final LiveMultiLinePuzzleState IDLE;
    public static final LiveMultiLinePuzzleState QUESTION;

    static {
       LiveMultiLinePuzzleState liveMultiLin1;
       LiveMultiLinePuzzleState[] liveMultiLin = new LiveMultiLinePuzzleState[]{liveMultiLin1,liveMultiLin1,liveMultiLin1};
       liveMultiLin1 = new LiveMultiLinePuzzleState("IDLE", 0);
       LiveMultiLinePuzzleState.IDLE = liveMultiLin1;
       liveMultiLin1 = new LiveMultiLinePuzzleState("QUESTION", 1);
       LiveMultiLinePuzzleState.QUESTION = liveMultiLin1;
       liveMultiLin1 = new LiveMultiLinePuzzleState("ANSWER", 2);
       LiveMultiLinePuzzleState.ANSWER = liveMultiLin1;
       LiveMultiLinePuzzleState.$VALUES = liveMultiLin;
    }
    public void LiveMultiLinePuzzleState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMultiLinePuzzleState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiLinePuzzleState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMultiLinePuzzleState.class, p0);
    }
    public static LiveMultiLinePuzzleState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMultiLinePuzzleState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiLinePuzzleState.$VALUES.clone();
    }
}
