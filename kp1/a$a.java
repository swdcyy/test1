package kp1.a$a;
import w12.a$b;
import kp1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import msd.a;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.multichat.core.statemachine.MultiChatState;
import android.os.Message;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class a$a extends a$b	// class@002dc3
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       b.c0(LiveCommonLogTag.NEW_MULTI_CHAT, "ChatStateMachine enter ChatWatchingState", "commonLog", this.a.k.invoke());
       this.a.v(MultiChatState.WATCHING);
       return;
    }
    public boolean d(Message p0){
       a$a ta;
       Message obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "msg");
       b.d0(LiveCommonLogTag.NEW_MULTI_CHAT, "ChatStateMachine process ChatWatchingState", "msg", Integer.valueOf(p0.what), "commonLog", this.a.k.invoke());
       obj = p0.what;
       if (obj != null) {
          if (obj != 4) {
             return false;
          }
          ta = this.a;
          ta.w(ta.h, MultiChatState.WATCHING, MultiChatState.CHATTING, p0.obj);
          return true;
       }else {
          ta = this.a;
          ta.w(ta.f, MultiChatState.WATCHING, MultiChatState.IDLE, p0.obj);
          return true;
       }
    }
}
