package lq1.c$e;
import z1.a;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;
import java.lang.Object;
import lq1.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c$e implements a	// class@002ffb
{
    public final SCLiveMultiLineChatOpened a;

    public void c$e(SCLiveMultiLineChatOpened p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$e.class, "1")) {
       }else {
          p0.c(this.a);
       }
       return;
    }
}
