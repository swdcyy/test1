package lq1.c$i;
import erd.g;
import lq1.c;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c$i implements g	// class@002fff
{
    public final c b;

    public void c$i(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$i.class, "1")) {
       }else {
          this.b.b0(p0, "updateMultiLineState");
       }
       return;
    }
}
