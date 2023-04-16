package com.kuaishou.live.core.voiceparty.micseats.VoicePartyMicSeatLogger$InvitationDialogButtonType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VoicePartyMicSeatLogger$InvitationDialogButtonType extends Enum	// class@001560
{
    public static final VoicePartyMicSeatLogger$InvitationDialogButtonType[] $VALUES;
    public static final VoicePartyMicSeatLogger$InvitationDialogButtonType ACCEPT;
    public static final VoicePartyMicSeatLogger$InvitationDialogButtonType CLOSE;
    public static final VoicePartyMicSeatLogger$InvitationDialogButtonType CONSIDER;

    static {
       VoicePartyMicSeatLogger$InvitationDialogButtonType invitationDi = new VoicePartyMicSeatLogger$InvitationDialogButtonType("ACCEPT", 0);
       VoicePartyMicSeatLogger$InvitationDialogButtonType.ACCEPT = invitationDi;
       VoicePartyMicSeatLogger$InvitationDialogButtonType invitationDi1 = new VoicePartyMicSeatLogger$InvitationDialogButtonType("CONSIDER", 1);
       VoicePartyMicSeatLogger$InvitationDialogButtonType.CONSIDER = invitationDi1;
       VoicePartyMicSeatLogger$InvitationDialogButtonType invitationDi2 = new VoicePartyMicSeatLogger$InvitationDialogButtonType("CLOSE", 2);
       VoicePartyMicSeatLogger$InvitationDialogButtonType.CLOSE = invitationDi2;
       VoicePartyMicSeatLogger$InvitationDialogButtonType[] invitationDi3 = new VoicePartyMicSeatLogger$InvitationDialogButtonType[]{invitationDi,invitationDi1,invitationDi2};
       VoicePartyMicSeatLogger$InvitationDialogButtonType.$VALUES = invitationDi3;
    }
    public void VoicePartyMicSeatLogger$InvitationDialogButtonType(String p0,int p1){
       super(p0, p1);
    }
    public static VoicePartyMicSeatLogger$InvitationDialogButtonType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartyMicSeatLogger$InvitationDialogButtonType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VoicePartyMicSeatLogger$InvitationDialogButtonType.class, p0);
    }
    public static VoicePartyMicSeatLogger$InvitationDialogButtonType[] values(){
       Object obj = PatchProxy.apply(null, null, VoicePartyMicSeatLogger$InvitationDialogButtonType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VoicePartyMicSeatLogger$InvitationDialogButtonType.$VALUES.clone();
    }
}
