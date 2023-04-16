package com.kuaishou.bizmonitor.framework.funnel.collector.registers.AppEventRegister$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AppEventRegister$Type extends Enum	// class@001181
{
    public static final AppEventRegister$Type[] $VALUES;
    public static final AppEventRegister$Type onActivityCreate;
    public static final AppEventRegister$Type onActivityDestroy;
    public static final AppEventRegister$Type onActivityPause;
    public static final AppEventRegister$Type onActivityResume;
    public static final AppEventRegister$Type onActivityStart;
    public static final AppEventRegister$Type onActivityStop;
    public static final AppEventRegister$Type onApplicationBackground;
    public static final AppEventRegister$Type onApplicationForeground;
    public static final AppEventRegister$Type unknown;

    static {
       AppEventRegister$Type type = new AppEventRegister$Type("onApplicationForeground", 0);
       AppEventRegister$Type.onApplicationForeground = type;
       AppEventRegister$Type type1 = new AppEventRegister$Type("onApplicationBackground", 1);
       AppEventRegister$Type.onApplicationBackground = type1;
       AppEventRegister$Type type2 = new AppEventRegister$Type("onActivityCreate", 2);
       AppEventRegister$Type.onActivityCreate = type2;
       AppEventRegister$Type type3 = new AppEventRegister$Type("onActivityStart", 3);
       AppEventRegister$Type.onActivityStart = type3;
       AppEventRegister$Type type4 = new AppEventRegister$Type("onActivityResume", 4);
       AppEventRegister$Type.onActivityResume = type4;
       AppEventRegister$Type type5 = new AppEventRegister$Type("onActivityPause", 5);
       AppEventRegister$Type.onActivityPause = type5;
       AppEventRegister$Type type6 = new AppEventRegister$Type("onActivityStop", 6);
       AppEventRegister$Type.onActivityStop = type6;
       AppEventRegister$Type type7 = new AppEventRegister$Type("onActivityDestroy", 7);
       AppEventRegister$Type.onActivityDestroy = type7;
       AppEventRegister$Type type8 = new AppEventRegister$Type("unknown", 8);
       AppEventRegister$Type.unknown = type8;
       AppEventRegister$Type[] typeArray = new AppEventRegister$Type[9];
       typeArray[0] = type;
       typeArray[1] = type1;
       typeArray[2] = type2;
       typeArray[3] = type3;
       typeArray[4] = type4;
       typeArray[5] = type5;
       typeArray[6] = type6;
       typeArray[7] = type7;
       typeArray[8] = type8;
       AppEventRegister$Type.$VALUES = typeArray;
    }
    public void AppEventRegister$Type(String p0,int p1){
       super(p0, p1);
    }
    public static AppEventRegister$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AppEventRegister$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AppEventRegister$Type.class, p0);
    }
    public static AppEventRegister$Type[] values(){
       Object obj = PatchProxy.apply(null, null, AppEventRegister$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AppEventRegister$Type.$VALUES.clone();
    }
}
