package com.kuaishou.live.common.core.component.gift.util.LiveUserRightsInfoHelper$UserRightsType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveUserRightsInfoHelper$UserRightsType extends Enum	// class@00132b
{
    public final int mType;
    public static final LiveUserRightsInfoHelper$UserRightsType[] $VALUES;
    public static final LiveUserRightsInfoHelper$UserRightsType VipGrade;
    public static final LiveUserRightsInfoHelper$UserRightsType WealthGrade;

    static {
       LiveUserRightsInfoHelper$UserRightsType userRightsTy = new LiveUserRightsInfoHelper$UserRightsType("VipGrade", 0, 1);
       LiveUserRightsInfoHelper$UserRightsType.VipGrade = userRightsTy;
       LiveUserRightsInfoHelper$UserRightsType userRightsTy1 = new LiveUserRightsInfoHelper$UserRightsType("WealthGrade", 1, 2);
       LiveUserRightsInfoHelper$UserRightsType.WealthGrade = userRightsTy1;
       LiveUserRightsInfoHelper$UserRightsType[] userRightsTy2 = new LiveUserRightsInfoHelper$UserRightsType[]{userRightsTy,userRightsTy1};
       LiveUserRightsInfoHelper$UserRightsType.$VALUES = userRightsTy2;
    }
    public void LiveUserRightsInfoHelper$UserRightsType(String p0,int p1,int p2){
       super(p0, p1);
       this.mType = p2;
    }
    public static LiveUserRightsInfoHelper$UserRightsType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveUserRightsInfoHelper$UserRightsType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveUserRightsInfoHelper$UserRightsType.class, p0);
    }
    public static LiveUserRightsInfoHelper$UserRightsType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveUserRightsInfoHelper$UserRightsType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveUserRightsInfoHelper$UserRightsType.$VALUES.clone();
    }
    public int getType(){
       return this.mType;
    }
}
