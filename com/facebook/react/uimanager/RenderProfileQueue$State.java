package com.facebook.react.uimanager.RenderProfileQueue$State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RenderProfileQueue$State extends Enum	// class@001324
{
    public static final RenderProfileQueue$State[] $VALUES;
    public static final RenderProfileQueue$State PLAY;
    public static final RenderProfileQueue$State STEP;
    public static final RenderProfileQueue$State STOP;

    static {
       RenderProfileQueue$State state = new RenderProfileQueue$State("STOP", 0);
       RenderProfileQueue$State.STOP = state;
       RenderProfileQueue$State state1 = new RenderProfileQueue$State("PLAY", 1);
       RenderProfileQueue$State.PLAY = state1;
       RenderProfileQueue$State state2 = new RenderProfileQueue$State("STEP", 2);
       RenderProfileQueue$State.STEP = state2;
       RenderProfileQueue$State[] stateArray = new RenderProfileQueue$State[]{state,state1,state2};
       RenderProfileQueue$State.$VALUES = stateArray;
    }
    public void RenderProfileQueue$State(String p0,int p1){
       super(p0, p1);
    }
    public static RenderProfileQueue$State valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RenderProfileQueue$State.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RenderProfileQueue$State.class, p0);
    }
    public static RenderProfileQueue$State[] values(){
       Object obj = PatchProxy.apply(null, null, RenderProfileQueue$State.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RenderProfileQueue$State.$VALUES.clone();
    }
}
