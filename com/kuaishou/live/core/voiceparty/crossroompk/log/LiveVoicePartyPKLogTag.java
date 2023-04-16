package com.kuaishou.live.core.voiceparty.crossroompk.log.LiveVoicePartyPKLogTag;
import pp.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveVoicePartyPKLogTag extends Enum implements c	// class@001478
{
    public final String mName;
    public static final LiveVoicePartyPKLogTag[] $VALUES;
    public static final LiveVoicePartyPKLogTag BE_INVITED;
    public static final LiveVoicePartyPKLogTag INVITE;
    public static final LiveVoicePartyPKLogTag INVITE_LIST;
    public static final LiveVoicePartyPKLogTag MUTE;
    public static final LiveVoicePartyPKLogTag STATE_MACHINE;
    public static final LiveVoicePartyPKLogTag TAG;

    static {
       LiveVoicePartyPKLogTag liveVoicePar = new LiveVoicePartyPKLogTag("TAG", 0, "VoicePartyCrossRoomPK");
       LiveVoicePartyPKLogTag.TAG = liveVoicePar;
       LiveVoicePartyPKLogTag liveVoicePar1 = new LiveVoicePartyPKLogTag("STATE_MACHINE", 1, "VoicePartyPK_STATE_MACHINE");
       LiveVoicePartyPKLogTag.STATE_MACHINE = liveVoicePar1;
       LiveVoicePartyPKLogTag liveVoicePar2 = new LiveVoicePartyPKLogTag("INVITE", 2, "VoicePartyCrossRoomPK_Invite");
       LiveVoicePartyPKLogTag.INVITE = liveVoicePar2;
       LiveVoicePartyPKLogTag liveVoicePar3 = new LiveVoicePartyPKLogTag("BE_INVITED", 3, "VoicePartyCrossRoomPK_BeInvited");
       LiveVoicePartyPKLogTag.BE_INVITED = liveVoicePar3;
       LiveVoicePartyPKLogTag liveVoicePar4 = new LiveVoicePartyPKLogTag("INVITE_LIST", 4, "VoicePartyCrossRoomPk_InviteList");
       LiveVoicePartyPKLogTag.INVITE_LIST = liveVoicePar4;
       LiveVoicePartyPKLogTag liveVoicePar5 = new LiveVoicePartyPKLogTag("MUTE", 5, "VoicePartyCrossRoomPk_Mute");
       LiveVoicePartyPKLogTag.MUTE = liveVoicePar5;
       LiveVoicePartyPKLogTag[] liveVoicePar6 = new LiveVoicePartyPKLogTag[]{liveVoicePar,liveVoicePar1,liveVoicePar2,liveVoicePar3,liveVoicePar4,liveVoicePar5};
       LiveVoicePartyPKLogTag.$VALUES = liveVoicePar6;
    }
    public void LiveVoicePartyPKLogTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static LiveVoicePartyPKLogTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveVoicePartyPKLogTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveVoicePartyPKLogTag.class, p0);
    }
    public static LiveVoicePartyPKLogTag[] values(){
       Object obj = PatchProxy.apply(null, null, LiveVoicePartyPKLogTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveVoicePartyPKLogTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
