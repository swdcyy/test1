package ai2.b$a;
import erd.o;
import ai2.b;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import com.kuaishou.android.live.log.b;
import ai2.a;
import io.reactivex.g;
import brd.t;

public final class b$a implements o	// class@0000d7
{
    public final b b;
    public final long c;
    public final String d;

    public void b$a(b p0,long p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, b$a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "list");
          b.S(LiveRichCardStateManager.h.f().appendTag("LiveFetchRecoRoomListHandler"), "[httpFindRechRoomInfo]¡¾flatMap¡¿", "list", p0);
          ot = t.create(new a(this, p0));
       }
       return ot;
    }
}
