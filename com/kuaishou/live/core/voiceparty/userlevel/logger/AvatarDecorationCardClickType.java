package com.kuaishou.live.core.voiceparty.userlevel.logger.AvatarDecorationCardClickType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AvatarDecorationCardClickType extends Enum	// class@001aba
{
    public static final AvatarDecorationCardClickType[] $VALUES;
    public static final AvatarDecorationCardClickType GIFT;
    public static final AvatarDecorationCardClickType MIC;
    public static final AvatarDecorationCardClickType NONE;

    static {
       AvatarDecorationCardClickType uAvatarDecor1;
       AvatarDecorationCardClickType[] uAvatarDecor = new AvatarDecorationCardClickType[]{uAvatarDecor1,uAvatarDecor1,uAvatarDecor1};
       uAvatarDecor1 = new AvatarDecorationCardClickType("GIFT", 0);
       AvatarDecorationCardClickType.GIFT = uAvatarDecor1;
       uAvatarDecor1 = new AvatarDecorationCardClickType("MIC", 1);
       AvatarDecorationCardClickType.MIC = uAvatarDecor1;
       uAvatarDecor1 = new AvatarDecorationCardClickType("NONE", 2);
       AvatarDecorationCardClickType.NONE = uAvatarDecor1;
       AvatarDecorationCardClickType.$VALUES = uAvatarDecor;
    }
    public void AvatarDecorationCardClickType(String p0,int p1){
       super(p0, p1);
    }
    public static AvatarDecorationCardClickType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AvatarDecorationCardClickType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AvatarDecorationCardClickType.class, p0);
    }
    public static AvatarDecorationCardClickType[] values(){
       Object obj = PatchProxy.apply(null, null, AvatarDecorationCardClickType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AvatarDecorationCardClickType.$VALUES.clone();
    }
}
