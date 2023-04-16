package h71.d;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import sz1.e;
import lp3.c;
import lh3.b;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import h71.d$a;
import f71.a;
import o63.m;
import o63.m$a;

public final class d extends AbstractLiveJsCommand	// class@002631
{

    public void d(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p0 = this.g(e.class).gc();
       a.o(p0, "getService\(LiveMultiInte¡­a\).liveInteractRtcManager");
       p0 = p0.b();
       d$a uoa = (p0 != null)? new d$a(a.a(p0)): null;
       return m$a.g(m.g, uoa, false, 2, null);
    }
}
