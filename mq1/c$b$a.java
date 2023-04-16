package mq1.c$b$a;
import z1.a;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;
import java.lang.Object;
import mq1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c$b$a implements a	// class@0031e1
{
    public final SCLiveMultiLineChatOpened a;

    public void c$b$a(SCLiveMultiLineChatOpened p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b$a.class, "1")) {
       }else {
          c$b$a ta = this.a;
          p0.a(ta.chatMode, ta);
       }
       return;
    }
}
