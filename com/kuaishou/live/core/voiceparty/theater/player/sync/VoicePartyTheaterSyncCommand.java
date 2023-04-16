package com.kuaishou.live.core.voiceparty.theater.player.sync.VoicePartyTheaterSyncCommand;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.theater.player.sync.VoicePartyTheaterSyncCommand$PlayerSyncCommand;
import com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastMessage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvSyncTheaterCommandMessage;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import java.lang.StringBuilder;

public class VoicePartyTheaterSyncCommand	// class@0019bc
{
    public final String a;
    public final String b;
    public VoicePartyTheaterSyncCommand$PlayerSyncCommand c;
    public long d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;

    public void VoicePartyTheaterSyncCommand(String p0,String p1){
       super();
       this.c = VoicePartyTheaterSyncCommand$PlayerSyncCommand.UNKNOWN;
       this.e = false;
       this.f = false;
       this.g = 0xbf800000;
       this.h = 0xbf800000;
       this.a = p0;
       this.b = p1;
    }
    public static VoicePartyTheaterSyncCommand a(LiveAryaBroadcastProto$LiveAryaBroadcastMessage p0){
       Object obj = null;
       VoicePartyTheaterSyncCommand obj1 = PatchProxy.applyOneRefs(p0, obj, VoicePartyTheaterSyncCommand.class, "6");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0.type == 11) {
          p0 = p0.voicePartyTheater;
          if (p0 != null) {
             obj1 = new VoicePartyTheaterSyncCommand(p0.theaterId, p0.episodeOrderId);
             obj1.d(VoicePartyTheaterSyncCommand$PlayerSyncCommand.parseFormAryaBroadcastCommand(p0.theaterCommandType), p0.currentPosition);
             obj1.e(p0.hasCaptureVolume, p0.captureVolume);
             obj1.c(p0.hasPlayVolume, p0.playVolume);
             return obj1;
          }
       }
       return obj;
    }
    public static VoicePartyTheaterSyncCommand b(LiveFlvStream$LiveFlvSyncTheaterCommandMessage p0){
       Object obj = null;
       VoicePartyTheaterSyncCommand obj1 = PatchProxy.applyOneRefs(p0, obj, VoicePartyTheaterSyncCommand.class, "4");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new VoicePartyTheaterSyncCommand(p0.theaterId, p0.episodeOrderId);
       obj1.d(VoicePartyTheaterSyncCommand$PlayerSyncCommand.parseFromFlvCommand(p0.theaterCommandType), p0.currentPosition);
       obj1.c(p0.hasPlayVolume, p0.playVolume);
       return obj1;
    }
    public void c(boolean p0,float p1){
       this.f = p0;
       this.h = p1;
    }
    public void d(VoicePartyTheaterSyncCommand$PlayerSyncCommand p0,long p1){
       this.c = p0;
       this.d = p1;
    }
    public void e(boolean p0,float p1){
       this.e = p0;
       this.g = p1;
    }
    public LiveAryaBroadcastProto$LiveAryaBroadcastMessage f(){
       LiveAryaBroadcastProto$LiveAryaBroadcastMessage obj = PatchProxy.apply(null, this, VoicePartyTheaterSyncCommand.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveAryaBroadcastProto$LiveAryaBroadcastMessage();
       obj.type = 11;
       obj.senderId = QCurrentUser.me().getId();
       obj.senderTimestamp = System.currentTimeMillis();
       LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage liveAryaBroa = new LiveAryaBroadcastProto$LiveAryaBroadcastTheaterCommandMessage();
       liveAryaBroa.currentPosition = this.d;
       liveAryaBroa.theaterId = this.a;
       liveAryaBroa.episodeOrderId = this.b;
       liveAryaBroa.theaterCommandType = this.c.mAryaBroadcastCommandType;
       liveAryaBroa.captureVolume = this.g;
       liveAryaBroa.playVolume = this.h;
       liveAryaBroa.hasCaptureVolume = this.e;
       liveAryaBroa.hasPlayVolume = this.f;
       obj.voicePartyTheater = liveAryaBroa;
       return obj;
    }
    public LiveFlvStream$LiveFlvStreamMessage g(){
       LiveFlvStream$LiveFlvStreamMessage obj = PatchProxy.apply(null, this, VoicePartyTheaterSyncCommand.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveFlvStream$LiveFlvStreamMessage();
       obj.messageType = 7;
       LiveFlvStream$LiveFlvSyncTheaterCommandMessage liveFlvSyncT = new LiveFlvStream$LiveFlvSyncTheaterCommandMessage();
       liveFlvSyncT.theaterId = this.a;
       liveFlvSyncT.episodeOrderId = this.b;
       liveFlvSyncT.currentPosition = this.d;
       liveFlvSyncT.theaterCommandType = this.c.mLiveFlvCommandType;
       liveFlvSyncT.playVolume = this.h;
       liveFlvSyncT.hasPlayVolume = this.f;
       obj.voicePartyTheater = liveFlvSyncT;
       return obj;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterSyncCommand.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VoicePartyTheaterSyncCommand{mTheaterId=\'"+this.a+'''+", mEpisodeOrderId=\'"+this.b+'''+", mCommand="+this.c+", mCurrentPosition="+this.d+", mHasVoiceVolume="+this.e+", mHasMovieVolume="+this.f+", mVoiceVolume="+this.g+", mMovieVolume="+this.h+'}';
    }
}
