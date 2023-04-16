package com.yxcorp.gifshow.map.map.utils.MapUtils$ZoomType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MapUtils$ZoomType extends Enum	// class@001cc7
{
    public static final MapUtils$ZoomType[] $VALUES;
    public static final MapUtils$ZoomType CONTRACT;
    public static final MapUtils$ZoomType DEFAULT;
    public static final MapUtils$ZoomType SPAN;
    public static final MapUtils$ZoomType ZOOM_OUT;

    static {
       MapUtils$ZoomType zoomType;
       MapUtils$ZoomType[] zoomTypeArra = new MapUtils$ZoomType[]{zoomType,zoomType,zoomType,zoomType};
       zoomType = new MapUtils$ZoomType("SPAN", 0);
       MapUtils$ZoomType.SPAN = zoomType;
       zoomType = new MapUtils$ZoomType("CONTRACT", 1);
       MapUtils$ZoomType.CONTRACT = zoomType;
       zoomType = new MapUtils$ZoomType("ZOOM_OUT", 2);
       MapUtils$ZoomType.ZOOM_OUT = zoomType;
       zoomType = new MapUtils$ZoomType("DEFAULT", 3);
       MapUtils$ZoomType.DEFAULT = zoomType;
       MapUtils$ZoomType.$VALUES = zoomTypeArra;
    }
    public void MapUtils$ZoomType(String p0,int p1){
       super(p0, p1);
    }
    public static MapUtils$ZoomType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MapUtils$ZoomType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MapUtils$ZoomType.class, p0);
    }
    public static MapUtils$ZoomType[] values(){
       Object obj = PatchProxy.apply(null, null, MapUtils$ZoomType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MapUtils$ZoomType.$VALUES.clone();
    }
}
