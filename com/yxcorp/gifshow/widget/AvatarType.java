package com.yxcorp.gifshow.widget.AvatarType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AvatarType extends Enum	// class@0017ef
{
    public static final AvatarType[] $VALUES;
    public static final AvatarType DYNAMIC_PENDANT;
    public static final AvatarType NORMAL;
    public static final AvatarType STATIC_PENDANT;

    static {
       AvatarType uAvatarType;
       AvatarType[] uAvatarTypeA = new AvatarType[]{uAvatarType,uAvatarType,uAvatarType};
       uAvatarType = new AvatarType("DYNAMIC_PENDANT", 0);
       AvatarType.DYNAMIC_PENDANT = uAvatarType;
       uAvatarType = new AvatarType("STATIC_PENDANT", 1);
       AvatarType.STATIC_PENDANT = uAvatarType;
       uAvatarType = new AvatarType("NORMAL", 2);
       AvatarType.NORMAL = uAvatarType;
       AvatarType.$VALUES = uAvatarTypeA;
    }
    public void AvatarType(String p0,int p1){
       super(p0, p1);
    }
    public static AvatarType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AvatarType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AvatarType.class, p0);
    }
    public static AvatarType[] values(){
       Object obj = PatchProxy.apply(null, null, AvatarType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AvatarType.$VALUES.clone();
    }
}
