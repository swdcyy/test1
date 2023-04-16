package com.yxcorp.gifshow.map.MapLogger$CardStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MapLogger$CardStatus extends Enum	// class@001c5c
{
    public static final MapLogger$CardStatus[] $VALUES;
    public static final MapLogger$CardStatus LIVING;
    public static final MapLogger$CardStatus OFFLINE;
    public static final MapLogger$CardStatus ONLINE;
    public static final MapLogger$CardStatus VIRTUAL_IMAGE;

    static {
       MapLogger$CardStatus uCardStatus;
       MapLogger$CardStatus[] uCardStatusA = new MapLogger$CardStatus[]{uCardStatus,uCardStatus,uCardStatus,uCardStatus};
       uCardStatus = new MapLogger$CardStatus("LIVING", 0);
       MapLogger$CardStatus.LIVING = uCardStatus;
       uCardStatus = new MapLogger$CardStatus("VIRTUAL_IMAGE", 1);
       MapLogger$CardStatus.VIRTUAL_IMAGE = uCardStatus;
       uCardStatus = new MapLogger$CardStatus("OFFLINE", 2);
       MapLogger$CardStatus.OFFLINE = uCardStatus;
       uCardStatus = new MapLogger$CardStatus("ONLINE", 3);
       MapLogger$CardStatus.ONLINE = uCardStatus;
       MapLogger$CardStatus.$VALUES = uCardStatusA;
    }
    public void MapLogger$CardStatus(String p0,int p1){
       super(p0, p1);
    }
    public static MapLogger$CardStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MapLogger$CardStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MapLogger$CardStatus.class, p0);
    }
    public static MapLogger$CardStatus[] values(){
       Object obj = PatchProxy.apply(null, null, MapLogger$CardStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MapLogger$CardStatus.$VALUES.clone();
    }
}
