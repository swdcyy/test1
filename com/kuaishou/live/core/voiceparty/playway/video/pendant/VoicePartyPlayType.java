package com.kuaishou.live.core.voiceparty.playway.video.pendant.VoicePartyPlayType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VoicePartyPlayType extends Enum	// class@0018e1
{
    public static final VoicePartyPlayType[] $VALUES;
    public static final VoicePartyPlayType CrossRoomPK;
    public static final VoicePartyPlayType Grid;
    public static final VoicePartyPlayType KTV;
    public static final VoicePartyPlayType SixSeat;
    public static final VoicePartyPlayType TeamPK;
    public static final VoicePartyPlayType Theater;
    public static final VoicePartyPlayType VideoChat;

    static {
       VoicePartyPlayType voicePartyPl1;
       VoicePartyPlayType[] voicePartyPl = new VoicePartyPlayType[]{voicePartyPl1,voicePartyPl1,voicePartyPl1,voicePartyPl1,voicePartyPl1,voicePartyPl1,voicePartyPl1};
       voicePartyPl1 = new VoicePartyPlayType("VideoChat", 0);
       VoicePartyPlayType.VideoChat = voicePartyPl1;
       voicePartyPl1 = new VoicePartyPlayType("Grid", 1);
       VoicePartyPlayType.Grid = voicePartyPl1;
       voicePartyPl1 = new VoicePartyPlayType("SixSeat", 2);
       VoicePartyPlayType.SixSeat = voicePartyPl1;
       voicePartyPl1 = new VoicePartyPlayType("TeamPK", 3);
       VoicePartyPlayType.TeamPK = voicePartyPl1;
       voicePartyPl1 = new VoicePartyPlayType("KTV", 4);
       VoicePartyPlayType.KTV = voicePartyPl1;
       voicePartyPl1 = new VoicePartyPlayType("Theater", 5);
       VoicePartyPlayType.Theater = voicePartyPl1;
       voicePartyPl1 = new VoicePartyPlayType("CrossRoomPK", 6);
       VoicePartyPlayType.CrossRoomPK = voicePartyPl1;
       VoicePartyPlayType.$VALUES = voicePartyPl;
    }
    public void VoicePartyPlayType(String p0,int p1){
       super(p0, p1);
    }
    public static VoicePartyPlayType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartyPlayType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VoicePartyPlayType.class, p0);
    }
    public static VoicePartyPlayType[] values(){
       Object obj = PatchProxy.apply(null, null, VoicePartyPlayType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VoicePartyPlayType.$VALUES.clone();
    }
}
