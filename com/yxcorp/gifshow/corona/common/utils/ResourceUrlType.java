package com.yxcorp.gifshow.corona.common.utils.ResourceUrlType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ResourceUrlType extends Enum	// class@00126e
{
    public static final ResourceUrlType[] $VALUES;
    public static final ResourceUrlType ANIMATION_JSON;
    public static final ResourceUrlType IMAGE;
    public static final ResourceUrlType INVALID;

    static {
       ResourceUrlType resourceUrlT = new ResourceUrlType("INVALID", 0);
       ResourceUrlType.INVALID = resourceUrlT;
       ResourceUrlType resourceUrlT1 = new ResourceUrlType("ANIMATION_JSON", 1);
       ResourceUrlType.ANIMATION_JSON = resourceUrlT1;
       ResourceUrlType resourceUrlT2 = new ResourceUrlType("IMAGE", 2);
       ResourceUrlType.IMAGE = resourceUrlT2;
       ResourceUrlType[] resourceUrlT3 = new ResourceUrlType[]{resourceUrlT,resourceUrlT1,resourceUrlT2};
       ResourceUrlType.$VALUES = resourceUrlT3;
    }
    public void ResourceUrlType(String p0,int p1){
       super(p0, p1);
    }
    public static ResourceUrlType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ResourceUrlType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ResourceUrlType.class, p0);
    }
    public static ResourceUrlType[] values(){
       Object obj = PatchProxy.apply(null, null, ResourceUrlType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ResourceUrlType.$VALUES.clone();
    }
}
