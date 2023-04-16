package g71.b$b;
import mq1.b;
import g71.b;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import fg6.a;
import g71.b$a;
import com.google.gson.Gson;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel;

public final class b$b implements b	// class@002430
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void a(int p0,SCLiveMultiLineChatOpened p1){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "1")) {
          return;
       }
       a.p(p1, "scLineOpened");
       this.a.a(a.a.q(new b$a(p0, p1.chatModeStartExtra)));
       return;
    }
}
