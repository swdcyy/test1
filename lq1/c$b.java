package lq1.c$b;
import erd.g;
import lq1.c;
import gq1.l$a;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c$b implements g	// class@002ff8
{
    public final c b;
    public final l$a c;

    public void c$b(c p0,l$a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
       }else {
          this.b.b0(p0, "endChatMode");
          p0 = this.c;
          if (p0 != null) {
             p0.onSuccess();
          }
       }
       return;
    }
}
