package com.kuaishou.live.core.voiceparty.micseats.VoicePartyMicSeatLogger$InvitationDialogRelationshipType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VoicePartyMicSeatLogger$InvitationDialogRelationshipType extends Enum	// class@001561
{
    public static final VoicePartyMicSeatLogger$InvitationDialogRelationshipType[] $VALUES;
    public static final VoicePartyMicSeatLogger$InvitationDialogRelationshipType AUDIENCE;
    public static final VoicePartyMicSeatLogger$InvitationDialogRelationshipType FRIEND;
    public static final VoicePartyMicSeatLogger$InvitationDialogRelationshipType FUNS;

    static {
       VoicePartyMicSeatLogger$InvitationDialogRelationshipType invitationDi = new VoicePartyMicSeatLogger$InvitationDialogRelationshipType("FUNS", 0);
       VoicePartyMicSeatLogger$InvitationDialogRelationshipType.FUNS = invitationDi;
       VoicePartyMicSeatLogger$InvitationDialogRelationshipType invitationDi1 = new VoicePartyMicSeatLogger$InvitationDialogRelationshipType("FRIEND", 1);
       VoicePartyMicSeatLogger$InvitationDialogRelationshipType.FRIEND = invitationDi1;
       VoicePartyMicSeatLogger$InvitationDialogRelationshipType invitationDi2 = new VoicePartyMicSeatLogger$InvitationDialogRelationshipType("AUDIENCE", 2);
       VoicePartyMicSeatLogger$InvitationDialogRelationshipType.AUDIENCE = invitationDi2;
       VoicePartyMicSeatLogger$InvitationDialogRelationshipType[] invitationDi3 = new VoicePartyMicSeatLogger$InvitationDialogRelationshipType[]{invitationDi,invitationDi1,invitationDi2};
       VoicePartyMicSeatLogger$InvitationDialogRelationshipType.$VALUES = invitationDi3;
    }
    public void VoicePartyMicSeatLogger$InvitationDialogRelationshipType(String p0,int p1){
       super(p0, p1);
    }
    public static VoicePartyMicSeatLogger$InvitationDialogRelationshipType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartyMicSeatLogger$InvitationDialogRelationshipType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VoicePartyMicSeatLogger$InvitationDialogRelationshipType.class, p0);
    }
    public static VoicePartyMicSeatLogger$InvitationDialogRelationshipType[] values(){
       Object obj = PatchProxy.apply(null, null, VoicePartyMicSeatLogger$InvitationDialogRelationshipType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VoicePartyMicSeatLogger$InvitationDialogRelationshipType.$VALUES.clone();
    }
}
