package dx0.c;
import com.kwai.video.waynelive.listeners.LivePlayerEventListener;
import dx0.f;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveActiveSpeakersMessage;
import dx0.d;
import java.lang.String;
import java.lang.Runnable;
import e93.f;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public final class c implements LivePlayerEventListener	// class@002051
{
    public final f b;

    public void c(f p0){
       this.b = p0;
    }
    public final void onLiveEventChange(byte[] p0){
       c tb = this.b;
       try{
          Objects.requireNonNull(tb);
          LiveFlvStream$LiveFlvStreamMessage liveFlvStrea = LiveFlvStream$LiveFlvStreamMessage.parseFrom(p0);
          if (liveFlvStrea == null || (liveFlvStrea.messageType == 15 && liveFlvStrea.speakersInfo.activeSpeakers != null)) {
             f.i("updateAvatarAnimator", new d(tb, liveFlvStrea), tb);
          }
       }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e4){
          b.I(LiveLogTag.LIVE_AUDIO_AVATAR_ANIMATION, "message parse failed", e4);
       }
       return;
    }
}
