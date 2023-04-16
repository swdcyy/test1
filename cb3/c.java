package cb3.c;
import vb3.f;
import mrd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import brd.y;

public final class c implements f	// class@0004dd
{
    public final c a;

    public void c(c p0){
       a.p(p0, "bottomBubbleHeightNotifier");
       super();
       this.a = p0;
    }
    public void a(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.a.onNext(Integer.valueOf(p0));
       return;
    }
}
