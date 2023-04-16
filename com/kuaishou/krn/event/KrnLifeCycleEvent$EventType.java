package com.kuaishou.krn.event.KrnLifeCycleEvent$EventType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KrnLifeCycleEvent$EventType extends Enum	// class@000868
{
    public static final KrnLifeCycleEvent$EventType[] $VALUES;
    public static final KrnLifeCycleEvent$EventType Create;
    public static final KrnLifeCycleEvent$EventType Destroy;
    public static final KrnLifeCycleEvent$EventType Enter;
    public static final KrnLifeCycleEvent$EventType Leave;
    public static final KrnLifeCycleEvent$EventType LoadFail;
    public static final KrnLifeCycleEvent$EventType LoadSuccess;

    static {
       KrnLifeCycleEvent$EventType uEventType = new KrnLifeCycleEvent$EventType("Create", 0);
       KrnLifeCycleEvent$EventType.Create = uEventType;
       KrnLifeCycleEvent$EventType uEventType1 = new KrnLifeCycleEvent$EventType("Enter", 1);
       KrnLifeCycleEvent$EventType.Enter = uEventType1;
       KrnLifeCycleEvent$EventType uEventType2 = new KrnLifeCycleEvent$EventType("LoadSuccess", 2);
       KrnLifeCycleEvent$EventType.LoadSuccess = uEventType2;
       KrnLifeCycleEvent$EventType uEventType3 = new KrnLifeCycleEvent$EventType("LoadFail", 3);
       KrnLifeCycleEvent$EventType.LoadFail = uEventType3;
       KrnLifeCycleEvent$EventType uEventType4 = new KrnLifeCycleEvent$EventType("Leave", 4);
       KrnLifeCycleEvent$EventType.Leave = uEventType4;
       KrnLifeCycleEvent$EventType uEventType5 = new KrnLifeCycleEvent$EventType("Destroy", 5);
       KrnLifeCycleEvent$EventType.Destroy = uEventType5;
       KrnLifeCycleEvent$EventType[] uEventTypeAr = new KrnLifeCycleEvent$EventType[]{uEventType,uEventType1,uEventType2,uEventType3,uEventType4,uEventType5};
       KrnLifeCycleEvent$EventType.$VALUES = uEventTypeAr;
    }
    public void KrnLifeCycleEvent$EventType(String p0,int p1){
       super(p0, p1);
    }
    public static KrnLifeCycleEvent$EventType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KrnLifeCycleEvent$EventType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KrnLifeCycleEvent$EventType.class, p0);
    }
    public static KrnLifeCycleEvent$EventType[] values(){
       Object obj = PatchProxy.apply(null, null, KrnLifeCycleEvent$EventType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KrnLifeCycleEvent$EventType.$VALUES.clone();
    }
}
