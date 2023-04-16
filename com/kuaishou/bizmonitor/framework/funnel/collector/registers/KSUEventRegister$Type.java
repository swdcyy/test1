package com.kuaishou.bizmonitor.framework.funnel.collector.registers.KSUEventRegister$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSUEventRegister$Type extends Enum	// class@001185
{
    public static final KSUEventRegister$Type[] $VALUES;
    public static final KSUEventRegister$Type clickEvent;
    public static final KSUEventRegister$Type customEvent;
    public static final KSUEventRegister$Type shareEvent;
    public static final KSUEventRegister$Type showEvent;
    public static final KSUEventRegister$Type taskEvent;
    public static final KSUEventRegister$Type unknown;

    static {
       KSUEventRegister$Type type = new KSUEventRegister$Type("clickEvent", 0);
       KSUEventRegister$Type.clickEvent = type;
       KSUEventRegister$Type type1 = new KSUEventRegister$Type("showEvent", 1);
       KSUEventRegister$Type.showEvent = type1;
       KSUEventRegister$Type type2 = new KSUEventRegister$Type("taskEvent", 2);
       KSUEventRegister$Type.taskEvent = type2;
       KSUEventRegister$Type type3 = new KSUEventRegister$Type("customEvent", 3);
       KSUEventRegister$Type.customEvent = type3;
       KSUEventRegister$Type type4 = new KSUEventRegister$Type("shareEvent", 4);
       KSUEventRegister$Type.shareEvent = type4;
       KSUEventRegister$Type type5 = new KSUEventRegister$Type("unknown", 5);
       KSUEventRegister$Type.unknown = type5;
       KSUEventRegister$Type[] typeArray = new KSUEventRegister$Type[]{type,type1,type2,type3,type4,type5};
       KSUEventRegister$Type.$VALUES = typeArray;
    }
    public void KSUEventRegister$Type(String p0,int p1){
       super(p0, p1);
    }
    public static KSUEventRegister$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSUEventRegister$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSUEventRegister$Type.class, p0);
    }
    public static KSUEventRegister$Type[] values(){
       Object obj = PatchProxy.apply(null, null, KSUEventRegister$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSUEventRegister$Type.$VALUES.clone();
    }
}
