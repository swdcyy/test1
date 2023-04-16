package com.yxcorp.gifshow.map.MapLogger$ClickState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MapLogger$ClickState extends Enum	// class@001c5d
{
    public static final MapLogger$ClickState[] $VALUES;
    public static final MapLogger$ClickState CLICK;
    public static final MapLogger$ClickState PULL;

    static {
       MapLogger$ClickState uClickState;
       MapLogger$ClickState[] uClickStateA = new MapLogger$ClickState[]{uClickState,uClickState};
       uClickState = new MapLogger$ClickState("PULL", 0);
       MapLogger$ClickState.PULL = uClickState;
       uClickState = new MapLogger$ClickState("CLICK", 1);
       MapLogger$ClickState.CLICK = uClickState;
       MapLogger$ClickState.$VALUES = uClickStateA;
    }
    public void MapLogger$ClickState(String p0,int p1){
       super(p0, p1);
    }
    public static MapLogger$ClickState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MapLogger$ClickState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MapLogger$ClickState.class, p0);
    }
    public static MapLogger$ClickState[] values(){
       Object obj = PatchProxy.apply(null, null, MapLogger$ClickState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MapLogger$ClickState.$VALUES.clone();
    }
}
