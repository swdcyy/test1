package an6.b;
import erd.o;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.BasePostEntranceBubble;
import an6.i;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import brd.t;

public final class b implements o	// class@0000e4
{
    public final BasePostEntranceBubble b;
    public final i c;
    public final Object d;

    public void b(BasePostEntranceBubble p0,i p1,Object p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "result");
          if (p0.booleanValue()) {
             p0.k = this.c;
          }
          ot = t.just(this.d);
       }
       return ot;
    }
}
