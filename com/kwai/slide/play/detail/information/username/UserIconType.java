package com.kwai.slide.play.detail.information.username.UserIconType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class UserIconType extends Enum	// class@001806
{
    public static final UserIconType[] $VALUES;
    public static final UserIconType ICON_TYPE_BLUE;
    public static final UserIconType ICON_TYPE_MUSIC;
    public static final UserIconType ICON_TYPE_YELLOW;

    static {
       UserIconType userIconType1;
       UserIconType[] userIconType = new UserIconType[]{userIconType1,userIconType1,userIconType1};
       userIconType1 = new UserIconType("ICON_TYPE_YELLOW", 0);
       UserIconType.ICON_TYPE_YELLOW = userIconType1;
       userIconType1 = new UserIconType("ICON_TYPE_BLUE", 1);
       UserIconType.ICON_TYPE_BLUE = userIconType1;
       userIconType1 = new UserIconType("ICON_TYPE_MUSIC", 2);
       UserIconType.ICON_TYPE_MUSIC = userIconType1;
       UserIconType.$VALUES = userIconType;
    }
    public void UserIconType(String p0,int p1){
       super(p0, p1);
    }
    public static UserIconType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UserIconType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(UserIconType.class, p0);
    }
    public static UserIconType[] values(){
       Object obj = PatchProxy.apply(null, null, UserIconType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UserIconType.$VALUES.clone();
    }
}
