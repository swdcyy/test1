package ai2.e;
import erd.o;
import ai2.b;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.richcard.http.RecoRoomResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import ai2.d;
import io.reactivex.g;
import brd.t;

public final class e implements o	// class@0000db
{
    public final b b;

    public void e(b p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = t.create(new d(this));
       }
       return ot;
    }
}
