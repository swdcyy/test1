package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleGuessState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiLinePuzzleGuessState extends Enum	// class@0015a8
{
    public static final LiveMultiLinePuzzleGuessState[] $VALUES;
    public static final LiveMultiLinePuzzleGuessState NOT_SET;
    public static final LiveMultiLinePuzzleGuessState NOT_WIN;
    public static final LiveMultiLinePuzzleGuessState PUBLISHED_OR_WIN;
    public static final LiveMultiLinePuzzleGuessState UNKNOWN;

    static {
       LiveMultiLinePuzzleGuessState liveMultiLin1;
       LiveMultiLinePuzzleGuessState[] liveMultiLin = new LiveMultiLinePuzzleGuessState[]{liveMultiLin1,liveMultiLin1,liveMultiLin1,liveMultiLin1};
       liveMultiLin1 = new LiveMultiLinePuzzleGuessState("UNKNOWN", 0);
       LiveMultiLinePuzzleGuessState.UNKNOWN = liveMultiLin1;
       liveMultiLin1 = new LiveMultiLinePuzzleGuessState("NOT_SET", 1);
       LiveMultiLinePuzzleGuessState.NOT_SET = liveMultiLin1;
       liveMultiLin1 = new LiveMultiLinePuzzleGuessState("NOT_WIN", 2);
       LiveMultiLinePuzzleGuessState.NOT_WIN = liveMultiLin1;
       liveMultiLin1 = new LiveMultiLinePuzzleGuessState("PUBLISHED_OR_WIN", 3);
       LiveMultiLinePuzzleGuessState.PUBLISHED_OR_WIN = liveMultiLin1;
       LiveMultiLinePuzzleGuessState.$VALUES = liveMultiLin;
    }
    public void LiveMultiLinePuzzleGuessState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMultiLinePuzzleGuessState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiLinePuzzleGuessState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMultiLinePuzzleGuessState.class, p0);
    }
    public static LiveMultiLinePuzzleGuessState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMultiLinePuzzleGuessState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiLinePuzzleGuessState.$VALUES.clone();
    }
}
