package com.yxcorp.gifshow.growth.vfc.model.VfcAction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VfcAction extends Enum	// class@0015c3
{
    public static final VfcAction[] $VALUES;
    public static final VfcAction AWARD_ACTION;
    public static final VfcAction OPEN_ACTIVITY_ACTION;
    public static final VfcAction UNKNOWN_ACTION;

    static {
       VfcAction vfcAction;
       VfcAction[] vfcActionArr = new VfcAction[]{vfcAction,vfcAction,vfcAction};
       vfcAction = new VfcAction("UNKNOWN_ACTION", 0);
       VfcAction.UNKNOWN_ACTION = vfcAction;
       vfcAction = new VfcAction("AWARD_ACTION", 1);
       VfcAction.AWARD_ACTION = vfcAction;
       vfcAction = new VfcAction("OPEN_ACTIVITY_ACTION", 2);
       VfcAction.OPEN_ACTIVITY_ACTION = vfcAction;
       VfcAction.$VALUES = vfcActionArr;
    }
    public void VfcAction(String p0,int p1){
       super(p0, p1);
    }
    public static VfcAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VfcAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VfcAction.class, p0);
    }
    public static VfcAction[] values(){
       Object obj = PatchProxy.apply(null, null, VfcAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VfcAction.$VALUES.clone();
    }
}
