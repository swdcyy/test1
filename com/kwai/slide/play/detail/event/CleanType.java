package com.kwai.slide.play.detail.event.CleanType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CleanType extends Enum	// class@0017bd
{
    public static final CleanType[] $VALUES;
    public static final CleanType TYPE_ALL;
    public static final CleanType TYPE_NASA;
    public static final CleanType TYPE_NASA_PANEL;
    public static final CleanType TYPE_PRESS_SPEED;

    static {
       CleanType uCleanType;
       CleanType[] uCleanTypeAr = new CleanType[]{uCleanType,uCleanType,uCleanType,uCleanType};
       uCleanType = new CleanType("TYPE_ALL", 0);
       CleanType.TYPE_ALL = uCleanType;
       uCleanType = new CleanType("TYPE_NASA", 1);
       CleanType.TYPE_NASA = uCleanType;
       uCleanType = new CleanType("TYPE_NASA_PANEL", 2);
       CleanType.TYPE_NASA_PANEL = uCleanType;
       uCleanType = new CleanType("TYPE_PRESS_SPEED", 3);
       CleanType.TYPE_PRESS_SPEED = uCleanType;
       CleanType.$VALUES = uCleanTypeAr;
    }
    public void CleanType(String p0,int p1){
       super(p0, p1);
    }
    public static CleanType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CleanType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CleanType.class, p0);
    }
    public static CleanType[] values(){
       Object obj = PatchProxy.apply(null, null, CleanType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CleanType.$VALUES.clone();
    }
}
