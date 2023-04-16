package com.kuaishou.live.core.voiceparty.theater.player.sync.VoicePartyTheaterSyncCommand$PlayerSyncCommand;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;

public final class VoicePartyTheaterSyncCommand$PlayerSyncCommand extends Enum	// class@0019bb
{
    public final int mAryaBroadcastCommandType;
    public final int mLiveFlvCommandType;
    public static final VoicePartyTheaterSyncCommand$PlayerSyncCommand[] $VALUES;
    public static final VoicePartyTheaterSyncCommand$PlayerSyncCommand PAUSE;
    public static final VoicePartyTheaterSyncCommand$PlayerSyncCommand PLAY;
    public static final VoicePartyTheaterSyncCommand$PlayerSyncCommand SEEK;
    public static final VoicePartyTheaterSyncCommand$PlayerSyncCommand UNKNOWN;

    static {
       VoicePartyTheaterSyncCommand$PlayerSyncCommand playerSyncCo = new VoicePartyTheaterSyncCommand$PlayerSyncCommand("PAUSE", 0, 2, 2);
       VoicePartyTheaterSyncCommand$PlayerSyncCommand.PAUSE = playerSyncCo;
       VoicePartyTheaterSyncCommand$PlayerSyncCommand playerSyncCo1 = new VoicePartyTheaterSyncCommand$PlayerSyncCommand("PLAY", 1, 1, 1);
       VoicePartyTheaterSyncCommand$PlayerSyncCommand.PLAY = playerSyncCo1;
       VoicePartyTheaterSyncCommand$PlayerSyncCommand playerSyncCo2 = new VoicePartyTheaterSyncCommand$PlayerSyncCommand("SEEK", 2, 3, 3);
       VoicePartyTheaterSyncCommand$PlayerSyncCommand.SEEK = playerSyncCo2;
       VoicePartyTheaterSyncCommand$PlayerSyncCommand playerSyncCo3 = new VoicePartyTheaterSyncCommand$PlayerSyncCommand("UNKNOWN", 3, 0, 0);
       VoicePartyTheaterSyncCommand$PlayerSyncCommand.UNKNOWN = playerSyncCo3;
       VoicePartyTheaterSyncCommand$PlayerSyncCommand[] playerSyncCo4 = new VoicePartyTheaterSyncCommand$PlayerSyncCommand[]{playerSyncCo,playerSyncCo1,playerSyncCo2,playerSyncCo3};
       VoicePartyTheaterSyncCommand$PlayerSyncCommand.$VALUES = playerSyncCo4;
    }
    public void VoicePartyTheaterSyncCommand$PlayerSyncCommand(String p0,int p1,int p2,int p3){
       super(p0, p1);
       this.mLiveFlvCommandType = p2;
       this.mAryaBroadcastCommandType = p3;
    }
    public static VoicePartyTheaterSyncCommand$PlayerSyncCommand parseFormAryaBroadcastCommand(int p0){
       VoicePartyTheaterSyncCommand$PlayerSyncCommand[] obj;
       object oobject;
       VoicePartyTheaterSyncCommand$PlayerSyncCommand playerSyncCo = VoicePartyTheaterSyncCommand$PlayerSyncCommand.class;
       if (PatchProxy.isSupport(playerSyncCo)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, playerSyncCo, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = VoicePartyTheaterSyncCommand$PlayerSyncCommand.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return VoicePartyTheaterSyncCommand$PlayerSyncCommand.UNKNOWN;
          }
          oobject = obj[i];
          if (oobject.mAryaBroadcastCommandType == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static VoicePartyTheaterSyncCommand$PlayerSyncCommand parseFromFlvCommand(int p0){
       VoicePartyTheaterSyncCommand$PlayerSyncCommand[] obj;
       object oobject;
       VoicePartyTheaterSyncCommand$PlayerSyncCommand playerSyncCo = VoicePartyTheaterSyncCommand$PlayerSyncCommand.class;
       if (PatchProxy.isSupport(playerSyncCo)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, playerSyncCo, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = VoicePartyTheaterSyncCommand$PlayerSyncCommand.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return VoicePartyTheaterSyncCommand$PlayerSyncCommand.UNKNOWN;
          }
          oobject = obj[i];
          if (oobject.mLiveFlvCommandType == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static VoicePartyTheaterSyncCommand$PlayerSyncCommand valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartyTheaterSyncCommand$PlayerSyncCommand.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VoicePartyTheaterSyncCommand$PlayerSyncCommand.class, p0);
    }
    public static VoicePartyTheaterSyncCommand$PlayerSyncCommand[] values(){
       Object obj = PatchProxy.apply(null, null, VoicePartyTheaterSyncCommand$PlayerSyncCommand.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VoicePartyTheaterSyncCommand$PlayerSyncCommand.$VALUES.clone();
    }
}
