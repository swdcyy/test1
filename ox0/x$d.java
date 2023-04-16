package ox0.x$d;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo$RoleType;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class x$d extends ChatInfo	// class@0035d6
{
    public x$d n;

    public void x$d(ChatInfo$RoleType p0){
       super(p0);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, x$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveAudienceMultiChatInfo{"+super.toString()+", mSelfChatInfo="+this.n+'}';
    }
}
