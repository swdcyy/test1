package com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel$d$a;
import java.lang.Runnable;
import com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.LivePlayerController;

public final class LiveLiteMultiChatModel$d$a implements Runnable	// class@001d79
{
    public final LiveLiteMultiChatModel$d b;
    public final byte[] c;

    public void LiveLiteMultiChatModel$d$a(LiveLiteMultiChatModel$d p0,byte[] p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       LiveFlvStream$LiveFlvStreamMessage liveFlvStrea;
       String str = "1";
       if (PatchProxy.applyVoid(null, this, LiveLiteMultiChatModel$d$a.class, str)) {
          return;
       }
       LiveLiteMultiChatModel$d b = this.b.b;
       LiveLiteMultiChatModel$d$a tc = this.c;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(tc, b, LiveLiteMultiChatModel.class, str)) {
          try{
             liveFlvStrea = LiveFlvStream$LiveFlvStreamMessage.parseFrom(tc);
          }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e2){
             b.I(LiveLiteLogTag.LITE_MULTI_CHAT, "onTsptInfo", e2);
          }
          if (liveFlvStrea == null || (liveFlvStrea.messageType == 17 && liveFlvStrea.participantViewPosition != null)) {
             b.Z(LiveLiteLogTag.LITE_MULTI_CHAT, "currentStreamType is : "+b.k.getCurrentLiveStreamType()+", "+"positions:"+liveFlvStrea.participantViewPosition.length);
             if (b.k.getCurrentLiveStreamType() == 1) {
                liveFlvStrea = liveFlvStrea.participantViewPosition;
                if (liveFlvStrea.length >= 2) {
                   b.e = liveFlvStrea;
                   b.c(false);
                }
             }
          }
       }
       return;
    }
}
