package com.yxcorp.gifshow.growth.vfc.model.VfcInviteSelectorType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VfcInviteSelectorType extends Enum	// class@0015c8
{
    public static final VfcInviteSelectorType[] $VALUES;
    public static final VfcInviteSelectorType ERROR_INVITE_TYPE;
    public static final VfcInviteSelectorType NORMAL_INVITE_TYPE;
    public static final VfcInviteSelectorType UNKNOWN_INVITE_TYPE;

    static {
       VfcInviteSelectorType vfcInviteSel1;
       VfcInviteSelectorType[] vfcInviteSel = new VfcInviteSelectorType[]{vfcInviteSel1,vfcInviteSel1,vfcInviteSel1};
       vfcInviteSel1 = new VfcInviteSelectorType("UNKNOWN_INVITE_TYPE", 0);
       VfcInviteSelectorType.UNKNOWN_INVITE_TYPE = vfcInviteSel1;
       vfcInviteSel1 = new VfcInviteSelectorType("NORMAL_INVITE_TYPE", 1);
       VfcInviteSelectorType.NORMAL_INVITE_TYPE = vfcInviteSel1;
       vfcInviteSel1 = new VfcInviteSelectorType("ERROR_INVITE_TYPE", 2);
       VfcInviteSelectorType.ERROR_INVITE_TYPE = vfcInviteSel1;
       VfcInviteSelectorType.$VALUES = vfcInviteSel;
    }
    public void VfcInviteSelectorType(String p0,int p1){
       super(p0, p1);
    }
    public static VfcInviteSelectorType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VfcInviteSelectorType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VfcInviteSelectorType.class, p0);
    }
    public static VfcInviteSelectorType[] values(){
       Object obj = PatchProxy.apply(null, null, VfcInviteSelectorType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VfcInviteSelectorType.$VALUES.clone();
    }
}
