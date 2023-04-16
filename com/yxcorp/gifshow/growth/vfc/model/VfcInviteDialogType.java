package com.yxcorp.gifshow.growth.vfc.model.VfcInviteDialogType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VfcInviteDialogType extends Enum	// class@0015c7
{
    public static final VfcInviteDialogType[] $VALUES;
    public static final VfcInviteDialogType ERROR_SHARE_DIALOG;
    public static final VfcInviteDialogType NON_DIALOG;
    public static final VfcInviteDialogType SHARE_AWARD_DIALOG;
    public static final VfcInviteDialogType SHARE_DIALOG;

    static {
       VfcInviteDialogType vfcInviteDia1;
       VfcInviteDialogType[] vfcInviteDia = new VfcInviteDialogType[]{vfcInviteDia1,vfcInviteDia1,vfcInviteDia1,vfcInviteDia1};
       vfcInviteDia1 = new VfcInviteDialogType("NON_DIALOG", 0);
       VfcInviteDialogType.NON_DIALOG = vfcInviteDia1;
       vfcInviteDia1 = new VfcInviteDialogType("SHARE_DIALOG", 1);
       VfcInviteDialogType.SHARE_DIALOG = vfcInviteDia1;
       vfcInviteDia1 = new VfcInviteDialogType("SHARE_AWARD_DIALOG", 2);
       VfcInviteDialogType.SHARE_AWARD_DIALOG = vfcInviteDia1;
       vfcInviteDia1 = new VfcInviteDialogType("ERROR_SHARE_DIALOG", 3);
       VfcInviteDialogType.ERROR_SHARE_DIALOG = vfcInviteDia1;
       VfcInviteDialogType.$VALUES = vfcInviteDia;
    }
    public void VfcInviteDialogType(String p0,int p1){
       super(p0, p1);
    }
    public static VfcInviteDialogType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VfcInviteDialogType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VfcInviteDialogType.class, p0);
    }
    public static VfcInviteDialogType[] values(){
       Object obj = PatchProxy.apply(null, null, VfcInviteDialogType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VfcInviteDialogType.$VALUES.clone();
    }
}
