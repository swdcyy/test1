package m11.d;
import lf3.g;
import m11.l;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatReady;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import no1.j;
import java.lang.CharSequence;
import android.text.TextUtils;
import lf3.f;

public final class d implements g	// class@0030fd
{
    public final l b;

    public void d(l p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       j b;
       d tb = this.b;
       Objects.requireNonNull(tb);
       b.c0(LiveLogTag.LIVE_LINE, "registerMessages SCLiveLineChatReady", "info", p0);
       if (!tb.b(p0.liveStreamId)) {
       }else {
          l c = tb.c;
          b = c.b;
          c.b = p0.lineChatId;
          c.f = p0;
          if (!TextUtils.isEmpty(b) && !TextUtils.equals(b, p0.lineChatId)) {
             tb.a("SCLiveLineChatReady lineChatId mismatch");
          }else {
             tb.c();
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
