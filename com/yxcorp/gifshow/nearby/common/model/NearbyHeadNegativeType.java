package com.yxcorp.gifshow.nearby.common.model.NearbyHeadNegativeType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class NearbyHeadNegativeType extends Enum	// class@002125
{
    public final int type;
    public static final NearbyHeadNegativeType[] $VALUES;
    public static final NearbyHeadNegativeType HIDE_LOCATION;
    public static final NearbyHeadNegativeType HIDE_LOCATION_WITH_CITY_PICK;
    public static final NearbyHeadNegativeType HIDE_SIZER_VIEW;
    public static final NearbyHeadNegativeType HIDE_SIZER_VIEW_WITH_CITY_PICK;

    static {
       NearbyHeadNegativeType nearbyHeadNe = new NearbyHeadNegativeType("HIDE_LOCATION", 0, 1);
       NearbyHeadNegativeType.HIDE_LOCATION = nearbyHeadNe;
       NearbyHeadNegativeType nearbyHeadNe1 = new NearbyHeadNegativeType("HIDE_LOCATION_WITH_CITY_PICK", 1, 2);
       NearbyHeadNegativeType.HIDE_LOCATION_WITH_CITY_PICK = nearbyHeadNe1;
       NearbyHeadNegativeType nearbyHeadNe2 = new NearbyHeadNegativeType("HIDE_SIZER_VIEW", 2, 3);
       NearbyHeadNegativeType.HIDE_SIZER_VIEW = nearbyHeadNe2;
       NearbyHeadNegativeType nearbyHeadNe3 = new NearbyHeadNegativeType("HIDE_SIZER_VIEW_WITH_CITY_PICK", 3, 4);
       NearbyHeadNegativeType.HIDE_SIZER_VIEW_WITH_CITY_PICK = nearbyHeadNe3;
       NearbyHeadNegativeType[] nearbyHeadNe4 = new NearbyHeadNegativeType[]{nearbyHeadNe,nearbyHeadNe1,nearbyHeadNe2,nearbyHeadNe3};
       NearbyHeadNegativeType.$VALUES = nearbyHeadNe4;
    }
    public void NearbyHeadNegativeType(String p0,int p1,int p2){
       super(p0, p1);
       this.type = p2;
    }
    public static NearbyHeadNegativeType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NearbyHeadNegativeType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(NearbyHeadNegativeType.class, p0);
    }
    public static NearbyHeadNegativeType[] values(){
       Object obj = PatchProxy.apply(null, null, NearbyHeadNegativeType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NearbyHeadNegativeType.$VALUES.clone();
    }
    public int getType(){
       return this.type;
    }
}
