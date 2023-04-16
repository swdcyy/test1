package com.yxcorp.gifshow.model.PoiBriefInfo$RecommendPoiType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;

public final class PoiBriefInfo$RecommendPoiType extends Enum	// class@001e6f
{
    public int mValue;
    public static final PoiBriefInfo$RecommendPoiType[] $VALUES;
    public static final PoiBriefInfo$RecommendPoiType LABEL;
    public static final PoiBriefInfo$RecommendPoiType POI;
    public static final PoiBriefInfo$RecommendPoiType UNKNOWN;

    static {
       PoiBriefInfo$RecommendPoiType recommendPoi = new PoiBriefInfo$RecommendPoiType("UNKNOWN", 0, 0);
       PoiBriefInfo$RecommendPoiType.UNKNOWN = recommendPoi;
       PoiBriefInfo$RecommendPoiType recommendPoi1 = new PoiBriefInfo$RecommendPoiType("POI", 1, 1);
       PoiBriefInfo$RecommendPoiType.POI = recommendPoi1;
       PoiBriefInfo$RecommendPoiType recommendPoi2 = new PoiBriefInfo$RecommendPoiType("LABEL", 2, 2);
       PoiBriefInfo$RecommendPoiType.LABEL = recommendPoi2;
       PoiBriefInfo$RecommendPoiType[] recommendPoi3 = new PoiBriefInfo$RecommendPoiType[]{recommendPoi,recommendPoi1,recommendPoi2};
       PoiBriefInfo$RecommendPoiType.$VALUES = recommendPoi3;
    }
    public void PoiBriefInfo$RecommendPoiType(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static PoiBriefInfo$RecommendPoiType valueOf(int p0){
       PoiBriefInfo$RecommendPoiType[] obj;
       object oobject;
       PoiBriefInfo$RecommendPoiType recommendPoi = PoiBriefInfo$RecommendPoiType.class;
       if (PatchProxy.isSupport(recommendPoi)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, recommendPoi, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = PoiBriefInfo$RecommendPoiType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return PoiBriefInfo$RecommendPoiType.UNKNOWN;
          }
          oobject = obj[i];
          if (oobject.mValue == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static PoiBriefInfo$RecommendPoiType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PoiBriefInfo$RecommendPoiType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PoiBriefInfo$RecommendPoiType.class, p0);
    }
    public static PoiBriefInfo$RecommendPoiType[] values(){
       Object obj = PatchProxy.apply(null, null, PoiBriefInfo$RecommendPoiType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PoiBriefInfo$RecommendPoiType.$VALUES.clone();
    }
    public int value(){
       return this.mValue;
    }
}
