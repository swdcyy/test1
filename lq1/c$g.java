package lq1.c$g;
import erd.g;
import lq1.c;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c$g implements g	// class@002ffd
{
    public final c b;

    public void c$g(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$g.class, "1")) {
       }else {
          this.b.b0(p0, "switchChatMode");
       }
       return;
    }
}
