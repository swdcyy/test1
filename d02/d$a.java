package d02.d$a;
import erd.g;
import d02.d;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import nh3.b;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import mrd.a;

public final class d$a implements g	// class@001ee7
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
       }else {
          d$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, d.class, "8") && p0 != null) {
             tb.a.onNext(tb.a(tb.b(p0)));
          }
       }
       return;
    }
}
