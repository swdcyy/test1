package ai2.a;
import io.reactivex.g;
import ai2.b$a;
import java.util.List;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.redpacket.richcard.http.RecoRoomInfo;
import ai2.b;
import java.lang.Throwable;
import brd.g;

public final class a implements g	// class@0000d6
{
    public final b$a b;
    public final List c;

    public void a(b$a p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       List list;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "it");
       a tc = this.c;
       a.o(tc, "list");
       a tb = this.b;
       RecoRoomInfo recoRoomInfo = this.b.b.a(tc, tb.c, tb.d);
       if (recoRoomInfo == null) {
          p0.onError(new Throwable("cannot find valid room"));
       }else {
          p0.onNext(recoRoomInfo);
          list = this.b.b.b();
          if (list != null) {
             list.remove(recoRoomInfo);
          }
       }
       return;
    }
}
