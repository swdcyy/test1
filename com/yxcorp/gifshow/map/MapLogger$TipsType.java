package com.yxcorp.gifshow.map.MapLogger$TipsType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MapLogger$TipsType extends Enum	// class@001c60
{
    public static final MapLogger$TipsType[] $VALUES;
    public static final MapLogger$TipsType NET_WRONG;
    public static final MapLogger$TipsType REQUEST_FAILED;

    static {
       MapLogger$TipsType tipsType;
       MapLogger$TipsType[] tipsTypeArra = new MapLogger$TipsType[]{tipsType,tipsType};
       tipsType = new MapLogger$TipsType("NET_WRONG", 0);
       MapLogger$TipsType.NET_WRONG = tipsType;
       tipsType = new MapLogger$TipsType("REQUEST_FAILED", 1);
       MapLogger$TipsType.REQUEST_FAILED = tipsType;
       MapLogger$TipsType.$VALUES = tipsTypeArra;
    }
    public void MapLogger$TipsType(String p0,int p1){
       super(p0, p1);
    }
    public static MapLogger$TipsType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MapLogger$TipsType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MapLogger$TipsType.class, p0);
    }
    public static MapLogger$TipsType[] values(){
       Object obj = PatchProxy.apply(null, null, MapLogger$TipsType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MapLogger$TipsType.$VALUES.clone();
    }
}
