package com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent$Operation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ChangeScreenVisibleEvent$Operation extends Enum	// class@000a1e
{
    public static final ChangeScreenVisibleEvent$Operation[] $VALUES;
    public static final ChangeScreenVisibleEvent$Operation CLEAR;
    public static final ChangeScreenVisibleEvent$Operation TOGGLE;
    public static final ChangeScreenVisibleEvent$Operation UNCLEAR;

    static {
       ChangeScreenVisibleEvent$Operation operation = new ChangeScreenVisibleEvent$Operation("UNCLEAR", 0);
       ChangeScreenVisibleEvent$Operation.UNCLEAR = operation;
       ChangeScreenVisibleEvent$Operation operation1 = new ChangeScreenVisibleEvent$Operation("CLEAR", 1);
       ChangeScreenVisibleEvent$Operation.CLEAR = operation1;
       ChangeScreenVisibleEvent$Operation operation2 = new ChangeScreenVisibleEvent$Operation("TOGGLE", 2);
       ChangeScreenVisibleEvent$Operation.TOGGLE = operation2;
       ChangeScreenVisibleEvent$Operation[] operationArr = new ChangeScreenVisibleEvent$Operation[]{operation,operation1,operation2};
       ChangeScreenVisibleEvent$Operation.$VALUES = operationArr;
    }
    public void ChangeScreenVisibleEvent$Operation(String p0,int p1){
       super(p0, p1);
    }
    public static ChangeScreenVisibleEvent$Operation valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ChangeScreenVisibleEvent$Operation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ChangeScreenVisibleEvent$Operation.class, p0);
    }
    public static ChangeScreenVisibleEvent$Operation[] values(){
       Object obj = PatchProxy.apply(null, null, ChangeScreenVisibleEvent$Operation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ChangeScreenVisibleEvent$Operation.$VALUES.clone();
    }
}
