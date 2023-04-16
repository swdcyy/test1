package com.kwai.live.gzone.tab.bean.LiveGzoneTabState$State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGzoneTabState$State extends Enum	// class@000e0c
{
    public int mIndex;
    public static final LiveGzoneTabState$State[] $VALUES;
    public static final LiveGzoneTabState$State BIND;
    public static final LiveGzoneTabState$State CREATE;
    public static final LiveGzoneTabState$State DESTROY;
    public static final LiveGzoneTabState$State INIT;
    public static final LiveGzoneTabState$State UNBIND;

    static {
       LiveGzoneTabState$State state = new LiveGzoneTabState$State("INIT", 0, 0);
       LiveGzoneTabState$State.INIT = state;
       LiveGzoneTabState$State state1 = new LiveGzoneTabState$State("CREATE", 1, 1);
       LiveGzoneTabState$State.CREATE = state1;
       LiveGzoneTabState$State state2 = new LiveGzoneTabState$State("BIND", 2, 2);
       LiveGzoneTabState$State.BIND = state2;
       LiveGzoneTabState$State state3 = new LiveGzoneTabState$State("UNBIND", 3, 3);
       LiveGzoneTabState$State.UNBIND = state3;
       LiveGzoneTabState$State state4 = new LiveGzoneTabState$State("DESTROY", 4, 4);
       LiveGzoneTabState$State.DESTROY = state4;
       LiveGzoneTabState$State[] stateArray = new LiveGzoneTabState$State[]{state,state1,state2,state3,state4};
       LiveGzoneTabState$State.$VALUES = stateArray;
    }
    public void LiveGzoneTabState$State(String p0,int p1,int p2){
       super(p0, p1);
       this.mIndex = p2;
    }
    public static LiveGzoneTabState$State valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneTabState$State.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGzoneTabState$State.class, p0);
    }
    public static LiveGzoneTabState$State[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGzoneTabState$State.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGzoneTabState$State.$VALUES.clone();
    }
    public int index(){
       return this.mIndex;
    }
}
