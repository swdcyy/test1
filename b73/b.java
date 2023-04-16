package b73.b;
import b73.a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel;

public final class b implements a	// class@000362
{
    public LiveLiteMultiChatModel a;

    public void b(){
       super();
    }
    public ChatInfo p(){
       b obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          a.S("multiChatModel");
       }
       return obj.p();
    }
}
