package com.yxcorp.gifshow.map.MapLogger$CardState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MapLogger$CardState extends Enum	// class@001c5b
{
    public static final MapLogger$CardState[] $VALUES;
    public static final MapLogger$CardState GUEST_STATE;
    public static final MapLogger$CardState MAIN_STATE;

    static {
       MapLogger$CardState uCardState;
       MapLogger$CardState[] uCardStateAr = new MapLogger$CardState[]{uCardState,uCardState};
       uCardState = new MapLogger$CardState("MAIN_STATE", 0);
       MapLogger$CardState.MAIN_STATE = uCardState;
       uCardState = new MapLogger$CardState("GUEST_STATE", 1);
       MapLogger$CardState.GUEST_STATE = uCardState;
       MapLogger$CardState.$VALUES = uCardStateAr;
    }
    public void MapLogger$CardState(String p0,int p1){
       super(p0, p1);
    }
    public static MapLogger$CardState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MapLogger$CardState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MapLogger$CardState.class, p0);
    }
    public static MapLogger$CardState[] values(){
       Object obj = PatchProxy.apply(null, null, MapLogger$CardState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MapLogger$CardState.$VALUES.clone();
    }
}
