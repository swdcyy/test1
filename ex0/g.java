package ex0.g;
import com.kwai.video.waynelive.listeners.LivePlayerEventListener;
import ex0.i;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import ex0.h;
import java.lang.String;
import java.lang.Runnable;
import e93.f;

public final class g implements LivePlayerEventListener	// class@002211
{
    public final i b;

    public void g(i p0){
       this.b = p0;
    }
    public final void onLiveEventChange(byte[] p0){
       g tb = this.b;
       try{
          Objects.requireNonNull(tb);
          f.i("consumingFlvStreamMessage", new h(tb, LiveFlvStream$LiveFlvStreamMessage.parseFrom(p0)), tb);
          return;
       }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e0){
       }
    }
}
