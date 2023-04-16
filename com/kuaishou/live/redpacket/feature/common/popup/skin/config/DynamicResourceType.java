package com.kuaishou.live.redpacket.feature.common.popup.skin.config.DynamicResourceType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DynamicResourceType extends Enum	// class@000f41
{
    public static final DynamicResourceType[] $VALUES;
    public static final DynamicResourceType IMAGE;
    public static final DynamicResourceType WEBP_ANIM;

    static {
       DynamicResourceType uDynamicReso = new DynamicResourceType("IMAGE", 0);
       DynamicResourceType.IMAGE = uDynamicReso;
       DynamicResourceType uDynamicReso1 = new DynamicResourceType("WEBP_ANIM", 1);
       DynamicResourceType.WEBP_ANIM = uDynamicReso1;
       DynamicResourceType[] uDynamicReso2 = new DynamicResourceType[]{uDynamicReso,uDynamicReso1};
       DynamicResourceType.$VALUES = uDynamicReso2;
    }
    public void DynamicResourceType(String p0,int p1){
       super(p0, p1);
    }
    public static DynamicResourceType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DynamicResourceType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DynamicResourceType.class, p0);
    }
    public static DynamicResourceType[] values(){
       Object obj = PatchProxy.apply(null, null, DynamicResourceType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DynamicResourceType.$VALUES.clone();
    }
}
