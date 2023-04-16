package com.kuaishou.live.lite.pk.MultiPkGameState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MultiPkGameState extends Enum	// class@000a5c
{
    public static final MultiPkGameState[] $VALUES;
    public static final MultiPkGameState IDLE;
    public static final MultiPkGameState POST_PUNISH;
    public static final MultiPkGameState PUNISH;
    public static final MultiPkGameState VOTE;

    static {
       MultiPkGameState multiPkGameS1;
       MultiPkGameState[] multiPkGameS = new MultiPkGameState[]{multiPkGameS1,multiPkGameS1,multiPkGameS1,multiPkGameS1};
       multiPkGameS1 = new MultiPkGameState("IDLE", 0);
       MultiPkGameState.IDLE = multiPkGameS1;
       multiPkGameS1 = new MultiPkGameState("VOTE", 1);
       MultiPkGameState.VOTE = multiPkGameS1;
       multiPkGameS1 = new MultiPkGameState("PUNISH", 2);
       MultiPkGameState.PUNISH = multiPkGameS1;
       multiPkGameS1 = new MultiPkGameState("POST_PUNISH", 3);
       MultiPkGameState.POST_PUNISH = multiPkGameS1;
       MultiPkGameState.$VALUES = multiPkGameS;
    }
    public void MultiPkGameState(String p0,int p1){
       super(p0, p1);
    }
    public static MultiPkGameState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MultiPkGameState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MultiPkGameState.class, p0);
    }
    public static MultiPkGameState[] values(){
       Object obj = PatchProxy.apply(null, null, MultiPkGameState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MultiPkGameState.$VALUES.clone();
    }
}
