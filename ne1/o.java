package ne1.o;
import ok.o;
import com.kuaishou.live.common.core.component.comments.e;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextFeed;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qx1.a;
import com.kuaishou.android.live.log.LiveLogTag;
import com.google.protobuf.nano.MessageNano;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class o implements o	// class@0032f7
{
    public final e b;

    public void o(e p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = false;
       if (p0 == null) {
       }else {
          Object obj = PatchProxy.applyOneRefs(p0, tb, e.class, "6");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             e t = tb.t;
             if (t != null) {
                b = t.g6(3, String.valueOf(p0.type));
                if (b) {
                   b.c0(LiveLogTag.LIVE_SERVER_SIGNAL_BLOCK, "LiveRichTextFeedPushPresenter ServerSignalBlocked", "data", p0.toString());
                }
             }
          }
          b = b ^ 0x01;
       }
       return b;
    }
}
