package mq1.c$b;
import lq1.f;
import mq1.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lq1.e;
import mq1.d;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.multiinteract.biz.adapter.BizEndReason;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;
import mq1.c$a;
import java.lang.StringBuilder;
import java.lang.Boolean;
import mq1.c$b$a;
import z1.a;
import oh3.a;

public final class c$b implements f	// class@0031e2
{
    public final c a;

    public void c$b(c p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "1")) {
          return;
       }
       e.b(this);
       b.S(d.a, "onLineStart", "currentInfo", this.a.b);
       return;
    }
    public void b(BizEndReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "3")) {
          return;
       }
       a.p(p0, "bizEndReason");
       b.S(d.a, "onLineEnd", "currentChatInfo", String.valueOf(this.a.b));
       p0.b = null;
       return;
    }
    public void c(SCLiveMultiLineChatOpened p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "2")) {
          return;
       }
       a.p(p0, "scLineOpened");
       SCLiveMultiLineChatOpened chatMode = p0.chatMode;
       boolean b = false;
       List list = 1;
       if (chatMode == list) {
          c b1 = this.a.b;
          if (b1 == null || chatMode != b1.a()) {
             b = true;
          }
       }else {
          c b2 = this.a.b;
          if (b2 != null) {
             String str = b2.b();
             if (str != null) {
                b = str.equals(p0.subModeId);
             }
          }
          b = b ^ list;
       }
       b.U(d.a, "onSubBizUpdate", "currentChatModeInfo", this.a.b, "server ModeInfo", " [chatMode:"+p0.chatMode+", "+"chatModeId:"+p0.subModeId+']', "modeChanged", Boolean.valueOf(b));
       if (b) {
          c$b ta = this.a;
          ta.b = new c$a(p0.chatMode, p0.subModeId);
          ta.Q(new c$b$a(p0));
       }
       return;
    }
}
