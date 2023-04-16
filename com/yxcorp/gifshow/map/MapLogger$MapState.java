package com.yxcorp.gifshow.map.MapLogger$MapState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MapLogger$MapState extends Enum	// class@001c5e
{
    public static final MapLogger$MapState[] $VALUES;
    public static final MapLogger$MapState LIST;
    public static final MapLogger$MapState MAP;
    public static final MapLogger$MapState MAP_MY_HUMANOID;
    public static final MapLogger$MapState MAP_MY_HUMANOID_UNSET;

    static {
       MapLogger$MapState mapState;
       MapLogger$MapState[] mapStateArra = new MapLogger$MapState[]{mapState,mapState,mapState,mapState};
       mapState = new MapLogger$MapState("MAP", 0);
       MapLogger$MapState.MAP = mapState;
       mapState = new MapLogger$MapState("LIST", 1);
       MapLogger$MapState.LIST = mapState;
       mapState = new MapLogger$MapState("MAP_MY_HUMANOID", 2);
       MapLogger$MapState.MAP_MY_HUMANOID = mapState;
       mapState = new MapLogger$MapState("MAP_MY_HUMANOID_UNSET", 3);
       MapLogger$MapState.MAP_MY_HUMANOID_UNSET = mapState;
       MapLogger$MapState.$VALUES = mapStateArra;
    }
    public void MapLogger$MapState(String p0,int p1){
       super(p0, p1);
    }
    public static MapLogger$MapState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MapLogger$MapState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MapLogger$MapState.class, p0);
    }
    public static MapLogger$MapState[] values(){
       Object obj = PatchProxy.apply(null, null, MapLogger$MapState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MapLogger$MapState.$VALUES.clone();
    }
}
