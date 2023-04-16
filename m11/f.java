package m11.f;
import lf3.g;
import m11.l;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatInfoUpdate;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import m11.b;
import java.lang.Iterable;
import z1.a;
import qo1.a;
import lf3.f;

public final class f implements g	// class@0030ff
{
    public final l b;

    public void f(l p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       b.c0(LiveLogTag.LIVE_LINE, "registerMessages SCLiveLineChatInfoUpdate", "info", p0);
       if (!tb.b(p0.liveStreamId)) {
       }else {
          a.b(tb.a, new b(p0));
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
