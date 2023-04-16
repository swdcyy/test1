package ai2.f;
import io.reactivex.g;
import com.kuaishou.live.core.show.redpacket.richcard.http.RecoRoomInfo;
import java.util.List;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import brd.g;

public final class f implements g	// class@0000dc
{
    public final RecoRoomInfo b;
    public final List c;

    public void f(RecoRoomInfo p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       a.p(p0, "it");
       p0.onNext(this.b);
       this.c.remove(this.b);
       return;
    }
}
