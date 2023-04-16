package com.yxcorp.gifshow.plugin.impl.growth.reddot.RedDotProtectionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RedDotProtectionType extends Enum	// class@000fc6
{
    public static final RedDotProtectionType[] $VALUES;
    public static final RedDotProtectionType HOME_MENU;
    public static final RedDotProtectionType REMINDER_TAB;
    public static final RedDotProtectionType UNKNOWN;

    static {
       RedDotProtectionType redDotProtec = new RedDotProtectionType("UNKNOWN", 0);
       RedDotProtectionType.UNKNOWN = redDotProtec;
       RedDotProtectionType redDotProtec1 = new RedDotProtectionType("HOME_MENU", 1);
       RedDotProtectionType.HOME_MENU = redDotProtec1;
       RedDotProtectionType redDotProtec2 = new RedDotProtectionType("REMINDER_TAB", 2);
       RedDotProtectionType.REMINDER_TAB = redDotProtec2;
       RedDotProtectionType[] redDotProtec3 = new RedDotProtectionType[]{redDotProtec,redDotProtec1,redDotProtec2};
       RedDotProtectionType.$VALUES = redDotProtec3;
    }
    public void RedDotProtectionType(String p0,int p1){
       super(p0, p1);
    }
    public static RedDotProtectionType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RedDotProtectionType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RedDotProtectionType.class, p0);
    }
    public static RedDotProtectionType[] values(){
       Object obj = PatchProxy.apply(null, null, RedDotProtectionType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RedDotProtectionType.$VALUES.clone();
    }
}
