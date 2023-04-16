package com.kwai.framework.network.access.util.LocationParamsPrivacyHandler$LocationPrivacyType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LocationParamsPrivacyHandler$LocationPrivacyType extends Enum	// class@00179b
{
    public static final LocationParamsPrivacyHandler$LocationPrivacyType[] $VALUES;
    public static final LocationParamsPrivacyHandler$LocationPrivacyType LatLon;
    public static final LocationParamsPrivacyHandler$LocationPrivacyType LlLkvr;

    static {
       LocationParamsPrivacyHandler$LocationPrivacyType locationPriv1;
       LocationParamsPrivacyHandler$LocationPrivacyType[] locationPriv = new LocationParamsPrivacyHandler$LocationPrivacyType[]{locationPriv1,locationPriv1};
       locationPriv1 = new LocationParamsPrivacyHandler$LocationPrivacyType("LatLon", 0);
       LocationParamsPrivacyHandler$LocationPrivacyType.LatLon = locationPriv1;
       locationPriv1 = new LocationParamsPrivacyHandler$LocationPrivacyType("LlLkvr", 1);
       LocationParamsPrivacyHandler$LocationPrivacyType.LlLkvr = locationPriv1;
       LocationParamsPrivacyHandler$LocationPrivacyType.$VALUES = locationPriv;
    }
    public void LocationParamsPrivacyHandler$LocationPrivacyType(String p0,int p1){
       super(p0, p1);
    }
    public static LocationParamsPrivacyHandler$LocationPrivacyType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocationParamsPrivacyHandler$LocationPrivacyType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LocationParamsPrivacyHandler$LocationPrivacyType.class, p0);
    }
    public static LocationParamsPrivacyHandler$LocationPrivacyType[] values(){
       Object obj = PatchProxy.apply(null, null, LocationParamsPrivacyHandler$LocationPrivacyType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LocationParamsPrivacyHandler$LocationPrivacyType.$VALUES.clone();
    }
}
