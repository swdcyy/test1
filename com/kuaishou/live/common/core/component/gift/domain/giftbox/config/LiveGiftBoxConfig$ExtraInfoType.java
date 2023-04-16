package com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$ExtraInfoType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGiftBoxConfig$ExtraInfoType extends Enum	// class@0011d1
{
    public static final LiveGiftBoxConfig$ExtraInfoType[] $VALUES;
    public static final LiveGiftBoxConfig$ExtraInfoType FANS_GROUP_INTIMACY;

    static {
       LiveGiftBoxConfig$ExtraInfoType uExtraInfoTy1;
       LiveGiftBoxConfig$ExtraInfoType[] uExtraInfoTy = new LiveGiftBoxConfig$ExtraInfoType[]{uExtraInfoTy1};
       uExtraInfoTy1 = new LiveGiftBoxConfig$ExtraInfoType("FANS_GROUP_INTIMACY", 0);
       LiveGiftBoxConfig$ExtraInfoType.FANS_GROUP_INTIMACY = uExtraInfoTy1;
       LiveGiftBoxConfig$ExtraInfoType.$VALUES = uExtraInfoTy;
    }
    public void LiveGiftBoxConfig$ExtraInfoType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveGiftBoxConfig$ExtraInfoType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGiftBoxConfig$ExtraInfoType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGiftBoxConfig$ExtraInfoType.class, p0);
    }
    public static LiveGiftBoxConfig$ExtraInfoType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGiftBoxConfig$ExtraInfoType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGiftBoxConfig$ExtraInfoType.$VALUES.clone();
    }
}
