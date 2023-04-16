package com.yxcorp.gifshow.map.MapLogger$MoveMapType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MapLogger$MoveMapType extends Enum	// class@001c5f
{
    public static final MapLogger$MoveMapType[] $VALUES;
    public static final MapLogger$MoveMapType MOVE;
    public static final MapLogger$MoveMapType REFRESH;

    static {
       MapLogger$MoveMapType moveMapType;
       MapLogger$MoveMapType[] moveMapTypeA = new MapLogger$MoveMapType[]{moveMapType,moveMapType};
       moveMapType = new MapLogger$MoveMapType("MOVE", 0);
       MapLogger$MoveMapType.MOVE = moveMapType;
       moveMapType = new MapLogger$MoveMapType("REFRESH", 1);
       MapLogger$MoveMapType.REFRESH = moveMapType;
       MapLogger$MoveMapType.$VALUES = moveMapTypeA;
    }
    public void MapLogger$MoveMapType(String p0,int p1){
       super(p0, p1);
    }
    public static MapLogger$MoveMapType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MapLogger$MoveMapType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MapLogger$MoveMapType.class, p0);
    }
    public static MapLogger$MoveMapType[] values(){
       Object obj = PatchProxy.apply(null, null, MapLogger$MoveMapType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MapLogger$MoveMapType.$VALUES.clone();
    }
}
