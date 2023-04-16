package com.kuaishou.live.core.voiceparty.micseats.dialog.matchroom.CancelMatchType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CancelMatchType extends Enum	// class@0015a5
{
    public static final CancelMatchType[] $VALUES;
    public static final CancelMatchType CANCEL_BUTTON;
    public static final CancelMatchType OUTSIDE_DIALOG;

    static {
       CancelMatchType uCancelMatch1;
       CancelMatchType[] uCancelMatch = new CancelMatchType[]{uCancelMatch1,uCancelMatch1};
       uCancelMatch1 = new CancelMatchType("OUTSIDE_DIALOG", 0);
       CancelMatchType.OUTSIDE_DIALOG = uCancelMatch1;
       uCancelMatch1 = new CancelMatchType("CANCEL_BUTTON", 1);
       CancelMatchType.CANCEL_BUTTON = uCancelMatch1;
       CancelMatchType.$VALUES = uCancelMatch;
    }
    public void CancelMatchType(String p0,int p1){
       super(p0, p1);
    }
    public static CancelMatchType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CancelMatchType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CancelMatchType.class, p0);
    }
    public static CancelMatchType[] values(){
       Object obj = PatchProxy.apply(null, null, CancelMatchType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CancelMatchType.$VALUES.clone();
    }
}
