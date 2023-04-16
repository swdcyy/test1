package com.yxcorp.gifshow.growth.vfc.model.VfcBtnActionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VfcBtnActionType extends Enum	// class@0015c6
{
    public static final VfcBtnActionType[] $VALUES;
    public static final VfcBtnActionType CLOSE_DIALOG;
    public static final VfcBtnActionType JUMP_LINK_URL;
    public static final VfcBtnActionType OPEN_LIVE_CAR;
    public static final VfcBtnActionType UNKNOWN_JUMP_ACTION_TYPE;

    static {
       VfcBtnActionType vfcBtnAction1;
       VfcBtnActionType[] vfcBtnAction = new VfcBtnActionType[]{vfcBtnAction1,vfcBtnAction1,vfcBtnAction1,vfcBtnAction1};
       vfcBtnAction1 = new VfcBtnActionType("UNKNOWN_JUMP_ACTION_TYPE", 0);
       VfcBtnActionType.UNKNOWN_JUMP_ACTION_TYPE = vfcBtnAction1;
       vfcBtnAction1 = new VfcBtnActionType("OPEN_LIVE_CAR", 1);
       VfcBtnActionType.OPEN_LIVE_CAR = vfcBtnAction1;
       vfcBtnAction1 = new VfcBtnActionType("CLOSE_DIALOG", 2);
       VfcBtnActionType.CLOSE_DIALOG = vfcBtnAction1;
       vfcBtnAction1 = new VfcBtnActionType("JUMP_LINK_URL", 3);
       VfcBtnActionType.JUMP_LINK_URL = vfcBtnAction1;
       VfcBtnActionType.$VALUES = vfcBtnAction;
    }
    public void VfcBtnActionType(String p0,int p1){
       super(p0, p1);
    }
    public static VfcBtnActionType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VfcBtnActionType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VfcBtnActionType.class, p0);
    }
    public static VfcBtnActionType[] values(){
       Object obj = PatchProxy.apply(null, null, VfcBtnActionType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VfcBtnActionType.$VALUES.clone();
    }
}
