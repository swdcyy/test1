package m11.e;
import lf3.g;
import m11.l;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatEnd;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import lf3.f;

public final class e implements g	// class@0030fe
{
    public final l b;

    public void e(l p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       b.c0(LiveLogTag.LIVE_LINE, "registerMessages SCLiveLineChatEnd", "info", p0);
       if (!tb.b(p0.liveStreamId)) {
       }else {
          tb.a("receive SCLiveLineChatEnd");
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
